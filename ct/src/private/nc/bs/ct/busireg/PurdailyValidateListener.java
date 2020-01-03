package nc.bs.ct.busireg;

import java.util.ArrayList;
import java.util.List;

import nc.bs.businessevent.BusinessEvent;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.businessevent.IBusinessListener;
import nc.bs.framework.common.NCLocator;
import nc.itf.ct.purdaily.ICtPayPlanQuery;
import nc.itf.ct.purdaily.update.IRewritePayPlan;
import nc.vo.ct.purdaily.entity.AggCtPuVO;
import nc.vo.ct.purdaily.entity.AggPayPlanVO;
import nc.vo.ct.purdaily.entity.CtPuVO;
import nc.vo.ct.purdaily.entity.PayPlanVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;

public class PurdailyValidateListener implements IBusinessListener {

	@Override
	public void doAction(IBusinessEvent event) throws BusinessException {
		BusinessEvent be = (BusinessEvent) event;
		AggCtPuVO aggCtPuVO = ((AggCtPuVO[]) be.getObject())[0];
		// 1, 获取付款计划
		// 2, 判断总金额是否有变更
		// 3, 根据平均分配规则修改付款计划
		ICtPayPlanQuery payPlanQueryService = NCLocator.getInstance().lookup(ICtPayPlanQuery.class);
		String hid = aggCtPuVO.getParentVO().getPrimaryKey();
		AggPayPlanVO[] aggVOs = payPlanQueryService.queryPayPlanVOs(new String[] { hid });
		if (aggVOs == null || aggVOs.length == 0)
			return;
		AggPayPlanVO aggVO = aggVOs[0];
		PayPlanVO[] payPlanVOs = (PayPlanVO[]) aggVO.getChildrenVO();
		UFDouble payPlanTotal = UFDouble.ZERO_DBL;
		for(int i = 0;i<payPlanVOs.length;i++) {
			PayPlanVO payPlanVO = payPlanVOs[i];
			UFDouble nmny = payPlanVO.getNmny();
			payPlanTotal = payPlanTotal.add(nmny);
		}
		CtPuVO ctPuVO = aggCtPuVO.getParentVO();
		UFDouble ctMny = ctPuVO.getNtotaltaxmny();
		if(payPlanTotal.sub(ctMny).doubleValue() == 0) return;
		UFDouble d = ctMny.sub(payPlanTotal);
		PayPlanVO last = payPlanVOs[payPlanVOs.length-1];
		UFDouble lastR = last.getNrate();
		
		List<String> sqls = new ArrayList<>(16);
		UFDouble preTotal = UFDouble.ZERO_DBL;
		for(int i = 0;i<payPlanVOs.length;i++) {
			if(i == payPlanVOs.length-1) break;
			PayPlanVO payPlanVO = payPlanVOs[i];
			payPlanVO.setNtotalorigmny(ctMny);
			UFDouble nmny = payPlanVO.getNmny();
			UFDouble naccumpaymny = payPlanVO.getNaccumpaymny();
			UFDouble s = nmny.sub(naccumpaymny == null ? UFDouble.ZERO_DBL : naccumpaymny);
			UFDouble r = payPlanVO.getNrate();
			if(s.doubleValue()==0) {
				preTotal = preTotal.add(nmny);
				lastR = lastR.add(r);
				sqls.add("update CT_PAYPLAN set NTOTALORIGMNY="+payPlanVO.getNtotalorigmny()+" where PK_CT_PAYPLAN='"+payPlanVO.getPk_ct_payplan()+"'");
				continue;
			}
			// a = s + d * r
			UFDouble a = s.add(d.multiply(r).div(100));
			if(a.doubleValue() < 0) {
				preTotal = preTotal.add(nmny);
				lastR = lastR.add(r);
				sqls.add("update CT_PAYPLAN set NTOTALORIGMNY="+payPlanVO.getNtotalorigmny()+" where PK_CT_PAYPLAN='"+payPlanVO.getPk_ct_payplan()+"'");
				continue;
			}
			preTotal = preTotal.add(a);
			payPlanVO.setNmny(a);
			payPlanVO.setNorigmny(a);
			sqls.add("update CT_PAYPLAN set NMNY="+payPlanVO.getNmny()+",NORIGMNY="+payPlanVO.getNorigmny()+",NTOTALORIGMNY="+payPlanVO.getNtotalorigmny()+" where PK_CT_PAYPLAN='"+payPlanVO.getPk_ct_payplan()+"'");
		}
//		UFDouble lastS = last.getNmny().sub(last.getNaccumpaymny() == null ? UFDouble.ZERO_DBL : last.getNaccumpaymny());
//		UFDouble lastA = lastS.add(d.multiply(lastR).div(100));
		UFDouble lastA = ctMny.sub(preTotal);
		if(lastA.doubleValue() < 0) {
			throw new BusinessException("付款计划金额调整失败，请检查。");
		}
		last.setNtotalorigmny(ctMny);
		last.setNmny(lastA);
		last.setNorigmny(lastA);
		sqls.add("update CT_PAYPLAN set NMNY="+last.getNmny()+",NORIGMNY="+last.getNorigmny()+",NTOTALORIGMNY="+last.getNtotalorigmny()+" where PK_CT_PAYPLAN='"+last.getPk_ct_payplan()+"'");
		IRewritePayPlan payPlanRewriteService = NCLocator.getInstance().lookup(IRewritePayPlan.class);
		for(int i = 0;i<sqls.size();i++) {
			payPlanRewriteService.updatePayPlanBySql(sqls.get(i));
		}
	}

}
