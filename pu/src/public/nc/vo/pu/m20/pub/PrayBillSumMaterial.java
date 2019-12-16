package nc.vo.pu.m20.pub;

import java.util.List;
import java.util.Map;

import nc.bs.framework.common.NCLocator;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.MapProcessor;
import nc.vo.pub.BusinessException;
import nc.vo.pub.formulaset.core.ParseException;
import nc.vo.pub.formulaset.function.NcInnerFunction;

public class PrayBillSumMaterial extends NcInnerFunction {
	
	public PrayBillSumMaterial(){
		this.numberOfParameters=2;
		this.functionType = 9;
	}
	
	@Override
	public Object function(List param) throws ParseException {
		// TODO �Զ����ɵķ������
		if ((param == null) || (param.size() < 2)) {
			return "0";
		}
		IUAPQueryBS bs = NCLocator.getInstance().lookup(IUAPQueryBS.class);
		String pk_material = (String) param.get(0);
		String pk_org=(String) param.get(1);
		String sql ="select sum(nastnum) as num from  po_praybill a,po_praybill_b b,bd_material c  where a.pk_praybill=b.pk_praybill and c. pk_material = b.pk_material and c.code='"+pk_material+"' and a.fbillstatus in (1,3) and a.pk_org='"+pk_org+"'";
		Map<String,Object>  map =null;
		try {
			map=(Map<String, Object>) bs.executeQuery(sql, new MapProcessor());
			return map.get("num");
		} catch (BusinessException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			return "0";
		}
	}
	
	@Override
	public String getFunctionDesc() {
		// TODO �Զ����ɵķ������
		return "getMaterialSum(pk_material,pk_org)";
	}
}