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
		// TODO 自动生成的方法存根
		if ((param == null) || (param.size() < 2)) {
			return "0";
		}
		IUAPQueryBS bs = NCLocator.getInstance().lookup(IUAPQueryBS.class);
		String pk_material = (String) param.get(0);
		if(pk_material == null || "".equals(pk_material.trim())) return null;
		String pk_org=(String) param.get(1);
		String sql ="select sum(b.nnum) as num from  po_praybill a,po_praybill_b b,bd_material c  where a.dr=0 and b.dr=0 and b.nnum>0 and a.pk_praybill=b.pk_praybill and c. pk_material = b.pk_material and c.code='"+pk_material+"' and a.fbillstatus<>0 and a.pk_org='"+pk_org+"'";
		Map<String,Object>  map =null;
		try {
			map=(Map<String, Object>) bs.executeQuery(sql, new MapProcessor());
			return map.get("num");
		} catch (BusinessException e) {
			return "0";
		}
	}
	
	@Override
	public String getFunctionDesc() {
		// TODO 自动生成的方法存根
		return "getMaterialSum(pk_material,pk_org) 已提交的历史请购数量，第一个参数：物料编码，第二个参数：pk_org";
	}
}
