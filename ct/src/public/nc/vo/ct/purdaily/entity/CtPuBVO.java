package nc.vo.ct.purdaily.entity;

import nc.vo.ct.entity.CtAbstractBVO;
import nc.vo.ct.enumeration.CtEntity;
import nc.vo.ct.pub.CTVatNameConst;
import nc.vo.pub.IVOMeta;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;
import nc.vo.pubapp.res.NCModule;

/**
 * <b> 在此处简要描述此类的功能 </b>
 * <p>
 * 采购合同合同基本VO
 * </p>
 * 创建日期:2010-03-18 19:27:48
 * 
 * @author
 * @version lizhengb
 */

public class CtPuBVO extends CtAbstractBVO {
  /** 固定辅助属性“客户” */
  public static final String CASSCUSTID = "casscustid";

  /** 固定辅助属性“项目” */
  public static final String CBPROJECTID = "cbprojectid";

  /** 电子商务单据明细 */
  public static final String CECBILLBID = "cecbillbid";

  /** 电子商务单据 */
  public static final String CECBILLID = "cecbillid";

  /** 电子商务单据类型 */
  public static final String CECTYPECODE = "cectypecode";

  /** 请购单行号 */
  public static final String CPRAYBILLROWNO = "cpraybillrowno";

  /** 优质优价方案 */
  public static final String CQPBASESCHEMEID = "cqpbaseschemeid";

  // 累计排程主数量
  public static final String NSCHEDULERNUM = "nschedulernum";

  // 收货库存组织最新版本
  public static final String PK_ARRVSTOCK = "pk_arrvstock";

  // 收货库存组织
  public static final String PK_ARRVSTOCK_V = "pk_arrvstock_v";

  // 合同价格信息
  public static final String PK_CT_PRICE = "pk_ct_price";

  /** 采购合同_主键 */
  public static final String PK_CT_PU = "pk_ct_pu";

  /** 合同基本id */
  public static final String PK_CT_PU_B = "pk_ct_pu_b";

  // 关联合同表头主键
  public static final String PK_CTRELATING = "pk_ctrelating";

  // 关联合同表体主键
  public static final String PK_CTRELATING_B = "pk_ctrelating_b";

  /** 协同合同主键 */
  public static final String PK_ECMCT = "pk_ecmct";

  /** 协同合同表体主键 */
  public static final String PK_ECMCT_B = "pk_ecmct_b";

  // modify by liangchen1 港华合同变更生效以及重走审批流需求
  /** 原始合同基本id */
  public static final String PK_ORIGCTB = "pk_origctb";

  /** 请购单主键 */
  public static final String PK_PRAYBILL = "pk_praybill";

  /** 请购单行主键 */
  public static final String PK_PRAYBILL_B = "pk_praybill_b";

  // 合同号
  public static final String VCTBILLCODE = "vctbillcode";

  // 合同类型,总括订单关联合同时使用
  public static final String VCTBILLTYPE = "vctbilltype";

  /** 电子商务单据号 */
  public static final String VECBILLCODE = "vecbillcode";

  /** 协同合同号 */
  public static final String VECMCTBILLCODE = "vecmctbillcode";

  /** 请购单号 */
  public static final String VPRAYBILLCODE = "vpraybillcode";
  
  // 自定义项21
  public static final String VBDEF21 = "vbdef21";
  // 自定义项22
  public static final String VBDEF22 = "vbdef22";
  // 自定义项23
  public static final String VBDEF23 = "vbdef23";
  // 自定义项24
  public static final String VBDEF24 = "vbdef24";
  // 自定义项25
  public static final String VBDEF25 = "vbdef25";
  

  public String getVbdef21() {
	    return (String) this.getAttributeValue(CtPuBVO.VBDEF21);
  }
  
  public void setVbdef21(String vbdef21) {
	    this.setAttributeValue(CtPuBVO.VBDEF21, vbdef21);
	}

  
  public String getVbdef22() {
	    return (String) this.getAttributeValue(CtPuBVO.VBDEF22);
}
  public String getVbdef23() {
	    return (String) this.getAttributeValue(CtPuBVO.VBDEF23);
}
  public String getVbdef24() {
	    return (String) this.getAttributeValue(CtPuBVO.VBDEF24);
}
  public String getVbdef25() {
	    return (String) this.getAttributeValue(CtPuBVO.VBDEF25);
}


  private static final long serialVersionUID = -1011715213772642474L;

  /** 三角贸易 getter 方法 */
  public UFBoolean getBtriatradeflag() {
    return (UFBoolean) this.getAttributeValue(CTVatNameConst.BTRIATRADEFLAG);
  }

  /** 客户 getter 方法 */
  public String getCasscustid() {
    return (String) this.getAttributeValue(CtPuBVO.CASSCUSTID);
  }

  /** 项目 getter 方法 */
  public String getCbprojectid() {
    return (String) this.getAttributeValue(CtPuBVO.CBPROJECTID);
  }

  /** 电子商务单据明细 getter 方法 */
  public String getCecbillbid() {
    return (String) this.getAttributeValue(CtPuBVO.CECBILLBID);
  }

  /** 电子商务单据 getter 方法 */
  public String getCecbillid() {
    return (String) this.getAttributeValue(CtPuBVO.CECBILLID);
  }

  /** 电子商务单据类型 getter 方法 */
  public String getCectypecode() {
    return (String) this.getAttributeValue(CtPuBVO.CECTYPECODE);
  }

  /** 请购单行号 */
  public String getCpraybillrowno() {
    return (String) this.getAttributeValue(CtPuBVO.CPRAYBILLROWNO);
  }

  /** 优质优价方案 getter 方法 */
  public String getCqpbaseschemeid() {
    return (String) this.getAttributeValue(CtPuBVO.CQPBASESCHEMEID);
  }

  /** 收货国家/地区 getter 方法 */
  public String getCrececountryid() {
    return (String) this.getAttributeValue(CTVatNameConst.CRECECOUNTRYID);
  }

  /** 发货国/地区 getter 方法 */
  public String getCsendcountryid() {
    return (String) this.getAttributeValue(CTVatNameConst.CSENDCOUNTRYID);
  }

  /** 报税国/地区 getter 方法 */
  public String getCtaxcountryid() {
    return (String) this.getAttributeValue(CTVatNameConst.CTAXCOUNTRYID);
  }

  /** 购销类型 getter 方法 */
  public Integer getFbuysellflag() {
    return (Integer) this.getAttributeValue(CTVatNameConst.FBUYSELLFLAG);
  }

  /**
   * 必须要有 否则会找不到元数据 导致程序死循环 父类方法重写
   * 
   * @see nc.vo.pub.SuperVO#getMetaData()
   */
  @Override
  public IVOMeta getMetaData() {
    IVOMeta meta =
        VOMetaFactory.getInstance()
            .getVOMeta(
                NCModule.CT.getName().toLowerCase() + "."
                    + CtEntity.ct_pu_b.name());
    return meta;
  }

  /** 计成本金额 getter 方法 */
  public UFDouble getNcalcostmny() {
    return (UFDouble) this.getAttributeValue(CTVatNameConst.NCALCOSTMNY);
  }

  /** 不可抵扣税额 getter 方法 */
  public UFDouble getNnosubtax() {
    return (UFDouble) this.getAttributeValue(CTVatNameConst.NNOSUBTAX);
  }

  /** 不可抵扣税率 getter 方法 */
  public UFDouble getNnosubtaxrate() {
    return (UFDouble) this.getAttributeValue(CTVatNameConst.NNOSUBTAXRATE);
  }

  public UFDouble getNschedulernum() {
    return (UFDouble) this.getAttributeValue(CtPuBVO.NSCHEDULERNUM);
  }

  /** 到货库存组织最新版本 */
  public String getPk_arrvstock() {
    return (String) this.getAttributeValue(CtPuBVO.PK_ARRVSTOCK);
  }

  /** 到货库存组织 */
  public String getPk_arrvstock_v() {
    return (String) this.getAttributeValue(CtPuBVO.PK_ARRVSTOCK_V);
  }

  public String getPk_ct_price() {
    return (String) this.getAttributeValue(CtPuBVO.PK_CT_PRICE);
  }

  public String getPk_ct_pu() {
    return (String) this.getAttributeValue(CtPuBVO.PK_CT_PU);
  }

  public String getPk_ct_pu_b() {
    return (String) this.getAttributeValue(CtPuBVO.PK_CT_PU_B);
  }

  public String getPk_ctrelating() {
    return (String) this.getAttributeValue(CtPuBVO.PK_CTRELATING);
  }

  public String getPk_ctrelating_b() {
    return (String) this.getAttributeValue(CtPuBVO.PK_CTRELATING_B);
  }

  /** 协同合同主键 getter 方法 */
  public String getPk_ecmct() {
    return (String) this.getAttributeValue(CtPuBVO.PK_ECMCT);
  }

  /** 协同合同表体主键 getter 方法 */
  public String getPk_ecmct_b() {
    return (String) this.getAttributeValue(CtPuBVO.PK_ECMCT_B);
  }

  // modify by liangchen1 港华合同变更生效以及重走审批流需求
  /** 原始合同基本id getter 方法 */
  public String getPk_origctb() {
    return (String) this.getAttributeValue(CtPuBVO.PK_ORIGCTB);
  }

  /** 请购单主键 */
  public String getPk_praybill() {
    return (String) this.getAttributeValue(CtPuBVO.PK_PRAYBILL);
  }

  /** 请购单行主键 */
  public String getPk_praybill_b() {
    return (String) this.getAttributeValue(CtPuBVO.PK_PRAYBILL_B);
  }

  public String getVctbillcode() {
    return (String) this.getAttributeValue(CtPuBVO.VCTBILLCODE);
  }

  public String getVctbilltype() {
    return (String) this.getAttributeValue(CtPuBVO.VCTBILLTYPE);
  }

  /** 电子商务单据号 getter 方法 */
  public String getVecbillcode() {
    return (String) this.getAttributeValue(CtPuBVO.VECBILLCODE);
  }

  /** 协同合同号 getter 方法 */
  public String getVecmctbillcode() {
    return (String) this.getAttributeValue(CtPuBVO.VECMCTBILLCODE);
  }

  /** 请购单号 */
  public String getVpraybillcode() {
    return (String) this.getAttributeValue(CtPuBVO.VPRAYBILLCODE);
  }

  /** 三角贸易 setter 方法 */
  public void setBtriatradeflag(UFBoolean btriatradeflag) {
    this.setAttributeValue(CTVatNameConst.BTRIATRADEFLAG, btriatradeflag);
  }

  /** 客户 setter 方法 */
  public void setCasscustid(String casscustid) {
    this.setAttributeValue(CtPuBVO.CASSCUSTID, casscustid);
  }

  /** 项目 setter 方法 */
  public void setCbprojectid(String cbprojectid) {
    this.setAttributeValue(CtPuBVO.CBPROJECTID, cbprojectid);
  }

  /** 电子商务单据明细 setter 方法 */
  public void setCecbillbid(String cecbillbid) {
    this.setAttributeValue(CtPuBVO.CECBILLBID, cecbillbid);
  }

  /** 电子商务单据 setter 方法 */
  public void setCecbillid(String cecbillid) {
    this.setAttributeValue(CtPuBVO.CECBILLID, cecbillid);
  }

  /** 电子商务单据类型 setter 方法 */
  public void setCectypecode(String cectypecode) {
    this.setAttributeValue(CtPuBVO.CECTYPECODE, cectypecode);
  }

  /** 请购单行号 setter 方法 */
  public void setCpraybillrowno(String cpraybillrowno) {
    this.setAttributeValue(CtPuBVO.CPRAYBILLROWNO, cpraybillrowno);
  }

  /** 优质优价方案 setter 方法 */
  public void setCqpbaseschemeid(String cqpbaseschemeid) {
    this.setAttributeValue(CtPuBVO.CQPBASESCHEMEID, cqpbaseschemeid);
  }

  /** 收货国家/地区 setter 方法 */
  public void setCrececountryid(String crececountryid) {
    this.setAttributeValue(CTVatNameConst.CRECECOUNTRYID, crececountryid);
  }

  /** 发货国/地区 setter 方法 */
  public void setCsendcountryid(String csendcountryid) {
    this.setAttributeValue(CTVatNameConst.CSENDCOUNTRYID, csendcountryid);
  }

  /** 报税国/地区 setter 方法 */
  public void setCtaxcountryid(String ctaxcountryid) {
    this.setAttributeValue(CTVatNameConst.CTAXCOUNTRYID, ctaxcountryid);
  }

  /** 购销类型 setter 方法 */
  public void setFbuysellflag(Integer fbuysellflag) {
    this.setAttributeValue(CTVatNameConst.FBUYSELLFLAG, fbuysellflag);
  }

  /** 计成本金额 setter 方法 */
  public void setNcalcostmny(UFDouble ncalcostmny) {
    this.setAttributeValue(CTVatNameConst.NCALCOSTMNY, ncalcostmny);
  }

  /** 不可抵扣税额 setter 方法 */
  public void setNnosubtax(UFDouble nnosubtax) {
    this.setAttributeValue(CTVatNameConst.NNOSUBTAX, nnosubtax);
  }

  /** 不可抵扣税率 setter 方法 */
  public void setNnosubtaxrate(UFDouble nnosubtaxrate) {
    this.setAttributeValue(CTVatNameConst.NNOSUBTAXRATE, nnosubtaxrate);
  }

  public void setNschedulernum(UFDouble nschedulernum) {
    this.setAttributeValue(CtPuBVO.NSCHEDULERNUM, nschedulernum);
  }

  /** 到货库存组织最新版本 */
  public void setPk_arrvstock(String pk_arrvstock) {
    this.setAttributeValue(CtPuBVO.PK_ARRVSTOCK, pk_arrvstock);
  }

  /** 到货库存组织 */
  public void setPk_arrvstock_v(String pk_arrvstock_v) {
    this.setAttributeValue(CtPuBVO.PK_ARRVSTOCK_V, pk_arrvstock_v);
  }

  public void setPk_ct_price(String pk_ct_price) {
    this.setAttributeValue(CtPuBVO.PK_CT_PRICE, pk_ct_price);
  }

  public void setPk_ct_pu(String pk_ct_pu) {
    this.setAttributeValue(CtPuBVO.PK_CT_PU, pk_ct_pu);
  }

  public void setPk_ct_pu_b(String pk_ct_pu_b) {
    this.setAttributeValue(CtPuBVO.PK_CT_PU_B, pk_ct_pu_b);
  }

  public void setPk_ctrelating(String pk_ctrelating) {
    this.setAttributeValue(CtPuBVO.PK_CTRELATING, pk_ctrelating);
  }

  public void setPk_ctrelating_b(String pk_ctrelating_b) {
    this.setAttributeValue(CtPuBVO.PK_CTRELATING_B, pk_ctrelating_b);
  }

  /** 协同合同主键 setter 方法 */
  public void setPk_ecmct(String pk_ecmct) {
    this.setAttributeValue(CtPuBVO.PK_ECMCT, pk_ecmct);
  }

  /** 协同合同表体主键 setter 方法 */
  public void setPk_ecmct_b(String pk_ecmct_b) {
    this.setAttributeValue(CtPuBVO.PK_ECMCT_B, pk_ecmct_b);
  }

  /** 原始合同基本id setter 方法 */
  public void setPk_origctb(String pk_origctb) {
    this.setAttributeValue(CtPuBVO.PK_ORIGCTB, pk_origctb);
  }

  /** 请购单主键 setter 方法 */
  public void setPk_praybill(String pk_praybill) {
    this.setAttributeValue(CtPuBVO.PK_PRAYBILL, pk_praybill);
  }

  /** 请购单行主键 setter 方法 */
  public void setPk_praybill_b(String pk_praybill_b) {
    this.setAttributeValue(CtPuBVO.PK_PRAYBILL_B, pk_praybill_b);
  }

  public void setVctbillcode(String vctbillcode) {
    this.setAttributeValue(CtPuBVO.VCTBILLCODE, vctbillcode);
  }

  public void setVctbilltype(String vctbilltype) {
    this.setAttributeValue(CtPuBVO.VCTBILLTYPE, vctbilltype);
  }

  /** 电子商务单据号 setter 方法 */
  public void setVecbillcode(String vecbillcode) {
    this.setAttributeValue(CtPuBVO.VECBILLCODE, vecbillcode);
  }

  /** 协同合同号 setter 方法 */
  public void setVecmctbillcode(String vecmctbillcode) {
    this.setAttributeValue(CtPuBVO.VECMCTBILLCODE, vecmctbillcode);
  }

  /** 请购单号 setter 方法 */
  public void setVpraybillcode(String vpraybillcode) {
    this.setAttributeValue(CtPuBVO.VPRAYBILLCODE, vpraybillcode);
  }
}
