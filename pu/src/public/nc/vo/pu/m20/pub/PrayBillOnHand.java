package nc.vo.pu.m20.pub;

import java.util.List;
import java.util.Map;

import nc.bs.framework.common.NCLocator;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.MapProcessor;
import nc.pubitf.ic.onhand.IOnhandQry;
import nc.vo.ic.onhand.entity.OnhandVO;
import nc.vo.ic.onhand.pub.OnhandQryCond;
import nc.vo.pub.BusinessException;
import nc.vo.pub.formulaset.core.ParseException;
import nc.vo.pub.formulaset.function.NcInnerFunction;
import nc.vo.pub.lang.UFDouble;

public class PrayBillOnHand extends NcInnerFunction {
	
	public PrayBillOnHand(){
		this.numberOfParameters=2;
		this.functionType = 9;
	}
	
	@Override
	public Object function(List param) throws ParseException {
		// TODO �Զ����ɵķ������
		if ((param == null) || (param.size() < 2)) {
			return "-1";
		}
		IUAPQueryBS bs = NCLocator.getInstance().lookup(IUAPQueryBS.class);
		Map<String,Object>  map =null;
		try {
			String materialCode = (String) param.get(0);
			String pk_org=(String) param.get(1);
			String sql =" select  a.pk_stordoc,b.pk_material from  bd_materialstock a ,bd_material b where a.pk_material=b.pk_material and b.code='"+materialCode+"' and a.pk_org='"+pk_org+"'";
			map=(Map<String, Object>) bs.executeQuery(sql, new MapProcessor());
			String pk_stordoc=String.valueOf(map.get("pk_stordoc"));
			String pk_material=String.valueOf(map.get("pk_material"));
			IOnhandQry onhandQuery = NCLocator.getInstance().lookup(IOnhandQry.class);
//			String dims[] = { "pk_org", "cwarehouseid", "cmaterialvid" };
			String dims[] = { "pk_org", "cmaterialvid" };
			OnhandQryCond cond = new OnhandQryCond();
			cond.addSelectFields(dims);
			cond.setISSum(true);
//			cond.addFilterDimConditon(dims, new Object[] { pk_org, pk_stordoc, pk_material });
			cond.addFilterDimConditon(dims, new Object[] { pk_org, pk_material });
			OnhandVO[] vos = onhandQuery.queryOnhand(cond);
			if(vos.length<1){
				return "��";
			}else{
				UFDouble natpnum=vos[0].getNonhandnum();
				if(natpnum.toDouble()>0){
					return "��";
				}
			}
			return "��";
		} catch (BusinessException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			return "-1";
		}
	}
	
	@Override
	public String getFunctionDesc() {
		// TODO �Զ����ɵķ������
		return "getOnlHand(pk_material,pk_org)";
	}
}
