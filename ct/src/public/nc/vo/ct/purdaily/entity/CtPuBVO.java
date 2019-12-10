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
 * <b> �ڴ˴���Ҫ��������Ĺ��� </b>
 * <p>
 * �ɹ���ͬ��ͬ����VO
 * </p>
 * ��������:2010-03-18 19:27:48
 * 
 * @author
 * @version lizhengb
 */

public class CtPuBVO extends CtAbstractBVO {
  /** �̶��������ԡ��ͻ��� */
  public static final String CASSCUSTID = "casscustid";

  /** �̶��������ԡ���Ŀ�� */
  public static final String CBPROJECTID = "cbprojectid";

  /** �������񵥾���ϸ */
  public static final String CECBILLBID = "cecbillbid";

  /** �������񵥾� */
  public static final String CECBILLID = "cecbillid";

  /** �������񵥾����� */
  public static final String CECTYPECODE = "cectypecode";

  /** �빺���к� */
  public static final String CPRAYBILLROWNO = "cpraybillrowno";

  /** �����ż۷��� */
  public static final String CQPBASESCHEMEID = "cqpbaseschemeid";

  // �ۼ��ų�������
  public static final String NSCHEDULERNUM = "nschedulernum";

  // �ջ������֯���°汾
  public static final String PK_ARRVSTOCK = "pk_arrvstock";

  // �ջ������֯
  public static final String PK_ARRVSTOCK_V = "pk_arrvstock_v";

  // ��ͬ�۸���Ϣ
  public static final String PK_CT_PRICE = "pk_ct_price";

  /** �ɹ���ͬ_���� */
  public static final String PK_CT_PU = "pk_ct_pu";

  /** ��ͬ����id */
  public static final String PK_CT_PU_B = "pk_ct_pu_b";

  // ������ͬ��ͷ����
  public static final String PK_CTRELATING = "pk_ctrelating";

  // ������ͬ��������
  public static final String PK_CTRELATING_B = "pk_ctrelating_b";

  /** Эͬ��ͬ���� */
  public static final String PK_ECMCT = "pk_ecmct";

  /** Эͬ��ͬ�������� */
  public static final String PK_ECMCT_B = "pk_ecmct_b";

  // modify by liangchen1 �ۻ���ͬ�����Ч�Լ���������������
  /** ԭʼ��ͬ����id */
  public static final String PK_ORIGCTB = "pk_origctb";

  /** �빺������ */
  public static final String PK_PRAYBILL = "pk_praybill";

  /** �빺�������� */
  public static final String PK_PRAYBILL_B = "pk_praybill_b";

  // ��ͬ��
  public static final String VCTBILLCODE = "vctbillcode";

  // ��ͬ����,��������������ͬʱʹ��
  public static final String VCTBILLTYPE = "vctbilltype";

  /** �������񵥾ݺ� */
  public static final String VECBILLCODE = "vecbillcode";

  /** Эͬ��ͬ�� */
  public static final String VECMCTBILLCODE = "vecmctbillcode";

  /** �빺���� */
  public static final String VPRAYBILLCODE = "vpraybillcode";
  
  // �Զ�����21
  public static final String VBDEF21 = "vbdef21";
  // �Զ�����22
  public static final String VBDEF22 = "vbdef22";
  // �Զ�����23
  public static final String VBDEF23 = "vbdef23";
  // �Զ�����24
  public static final String VBDEF24 = "vbdef24";
  // �Զ�����25
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

  /** ����ó�� getter ���� */
  public UFBoolean getBtriatradeflag() {
    return (UFBoolean) this.getAttributeValue(CTVatNameConst.BTRIATRADEFLAG);
  }

  /** �ͻ� getter ���� */
  public String getCasscustid() {
    return (String) this.getAttributeValue(CtPuBVO.CASSCUSTID);
  }

  /** ��Ŀ getter ���� */
  public String getCbprojectid() {
    return (String) this.getAttributeValue(CtPuBVO.CBPROJECTID);
  }

  /** �������񵥾���ϸ getter ���� */
  public String getCecbillbid() {
    return (String) this.getAttributeValue(CtPuBVO.CECBILLBID);
  }

  /** �������񵥾� getter ���� */
  public String getCecbillid() {
    return (String) this.getAttributeValue(CtPuBVO.CECBILLID);
  }

  /** �������񵥾����� getter ���� */
  public String getCectypecode() {
    return (String) this.getAttributeValue(CtPuBVO.CECTYPECODE);
  }

  /** �빺���к� */
  public String getCpraybillrowno() {
    return (String) this.getAttributeValue(CtPuBVO.CPRAYBILLROWNO);
  }

  /** �����ż۷��� getter ���� */
  public String getCqpbaseschemeid() {
    return (String) this.getAttributeValue(CtPuBVO.CQPBASESCHEMEID);
  }

  /** �ջ�����/���� getter ���� */
  public String getCrececountryid() {
    return (String) this.getAttributeValue(CTVatNameConst.CRECECOUNTRYID);
  }

  /** ������/���� getter ���� */
  public String getCsendcountryid() {
    return (String) this.getAttributeValue(CTVatNameConst.CSENDCOUNTRYID);
  }

  /** ��˰��/���� getter ���� */
  public String getCtaxcountryid() {
    return (String) this.getAttributeValue(CTVatNameConst.CTAXCOUNTRYID);
  }

  /** �������� getter ���� */
  public Integer getFbuysellflag() {
    return (Integer) this.getAttributeValue(CTVatNameConst.FBUYSELLFLAG);
  }

  /**
   * ����Ҫ�� ������Ҳ���Ԫ���� ���³�����ѭ�� ���෽����д
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

  /** �Ƴɱ���� getter ���� */
  public UFDouble getNcalcostmny() {
    return (UFDouble) this.getAttributeValue(CTVatNameConst.NCALCOSTMNY);
  }

  /** ���ɵֿ�˰�� getter ���� */
  public UFDouble getNnosubtax() {
    return (UFDouble) this.getAttributeValue(CTVatNameConst.NNOSUBTAX);
  }

  /** ���ɵֿ�˰�� getter ���� */
  public UFDouble getNnosubtaxrate() {
    return (UFDouble) this.getAttributeValue(CTVatNameConst.NNOSUBTAXRATE);
  }

  public UFDouble getNschedulernum() {
    return (UFDouble) this.getAttributeValue(CtPuBVO.NSCHEDULERNUM);
  }

  /** ���������֯���°汾 */
  public String getPk_arrvstock() {
    return (String) this.getAttributeValue(CtPuBVO.PK_ARRVSTOCK);
  }

  /** ���������֯ */
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

  /** Эͬ��ͬ���� getter ���� */
  public String getPk_ecmct() {
    return (String) this.getAttributeValue(CtPuBVO.PK_ECMCT);
  }

  /** Эͬ��ͬ�������� getter ���� */
  public String getPk_ecmct_b() {
    return (String) this.getAttributeValue(CtPuBVO.PK_ECMCT_B);
  }

  // modify by liangchen1 �ۻ���ͬ�����Ч�Լ���������������
  /** ԭʼ��ͬ����id getter ���� */
  public String getPk_origctb() {
    return (String) this.getAttributeValue(CtPuBVO.PK_ORIGCTB);
  }

  /** �빺������ */
  public String getPk_praybill() {
    return (String) this.getAttributeValue(CtPuBVO.PK_PRAYBILL);
  }

  /** �빺�������� */
  public String getPk_praybill_b() {
    return (String) this.getAttributeValue(CtPuBVO.PK_PRAYBILL_B);
  }

  public String getVctbillcode() {
    return (String) this.getAttributeValue(CtPuBVO.VCTBILLCODE);
  }

  public String getVctbilltype() {
    return (String) this.getAttributeValue(CtPuBVO.VCTBILLTYPE);
  }

  /** �������񵥾ݺ� getter ���� */
  public String getVecbillcode() {
    return (String) this.getAttributeValue(CtPuBVO.VECBILLCODE);
  }

  /** Эͬ��ͬ�� getter ���� */
  public String getVecmctbillcode() {
    return (String) this.getAttributeValue(CtPuBVO.VECMCTBILLCODE);
  }

  /** �빺���� */
  public String getVpraybillcode() {
    return (String) this.getAttributeValue(CtPuBVO.VPRAYBILLCODE);
  }

  /** ����ó�� setter ���� */
  public void setBtriatradeflag(UFBoolean btriatradeflag) {
    this.setAttributeValue(CTVatNameConst.BTRIATRADEFLAG, btriatradeflag);
  }

  /** �ͻ� setter ���� */
  public void setCasscustid(String casscustid) {
    this.setAttributeValue(CtPuBVO.CASSCUSTID, casscustid);
  }

  /** ��Ŀ setter ���� */
  public void setCbprojectid(String cbprojectid) {
    this.setAttributeValue(CtPuBVO.CBPROJECTID, cbprojectid);
  }

  /** �������񵥾���ϸ setter ���� */
  public void setCecbillbid(String cecbillbid) {
    this.setAttributeValue(CtPuBVO.CECBILLBID, cecbillbid);
  }

  /** �������񵥾� setter ���� */
  public void setCecbillid(String cecbillid) {
    this.setAttributeValue(CtPuBVO.CECBILLID, cecbillid);
  }

  /** �������񵥾����� setter ���� */
  public void setCectypecode(String cectypecode) {
    this.setAttributeValue(CtPuBVO.CECTYPECODE, cectypecode);
  }

  /** �빺���к� setter ���� */
  public void setCpraybillrowno(String cpraybillrowno) {
    this.setAttributeValue(CtPuBVO.CPRAYBILLROWNO, cpraybillrowno);
  }

  /** �����ż۷��� setter ���� */
  public void setCqpbaseschemeid(String cqpbaseschemeid) {
    this.setAttributeValue(CtPuBVO.CQPBASESCHEMEID, cqpbaseschemeid);
  }

  /** �ջ�����/���� setter ���� */
  public void setCrececountryid(String crececountryid) {
    this.setAttributeValue(CTVatNameConst.CRECECOUNTRYID, crececountryid);
  }

  /** ������/���� setter ���� */
  public void setCsendcountryid(String csendcountryid) {
    this.setAttributeValue(CTVatNameConst.CSENDCOUNTRYID, csendcountryid);
  }

  /** ��˰��/���� setter ���� */
  public void setCtaxcountryid(String ctaxcountryid) {
    this.setAttributeValue(CTVatNameConst.CTAXCOUNTRYID, ctaxcountryid);
  }

  /** �������� setter ���� */
  public void setFbuysellflag(Integer fbuysellflag) {
    this.setAttributeValue(CTVatNameConst.FBUYSELLFLAG, fbuysellflag);
  }

  /** �Ƴɱ���� setter ���� */
  public void setNcalcostmny(UFDouble ncalcostmny) {
    this.setAttributeValue(CTVatNameConst.NCALCOSTMNY, ncalcostmny);
  }

  /** ���ɵֿ�˰�� setter ���� */
  public void setNnosubtax(UFDouble nnosubtax) {
    this.setAttributeValue(CTVatNameConst.NNOSUBTAX, nnosubtax);
  }

  /** ���ɵֿ�˰�� setter ���� */
  public void setNnosubtaxrate(UFDouble nnosubtaxrate) {
    this.setAttributeValue(CTVatNameConst.NNOSUBTAXRATE, nnosubtaxrate);
  }

  public void setNschedulernum(UFDouble nschedulernum) {
    this.setAttributeValue(CtPuBVO.NSCHEDULERNUM, nschedulernum);
  }

  /** ���������֯���°汾 */
  public void setPk_arrvstock(String pk_arrvstock) {
    this.setAttributeValue(CtPuBVO.PK_ARRVSTOCK, pk_arrvstock);
  }

  /** ���������֯ */
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

  /** Эͬ��ͬ���� setter ���� */
  public void setPk_ecmct(String pk_ecmct) {
    this.setAttributeValue(CtPuBVO.PK_ECMCT, pk_ecmct);
  }

  /** Эͬ��ͬ�������� setter ���� */
  public void setPk_ecmct_b(String pk_ecmct_b) {
    this.setAttributeValue(CtPuBVO.PK_ECMCT_B, pk_ecmct_b);
  }

  /** ԭʼ��ͬ����id setter ���� */
  public void setPk_origctb(String pk_origctb) {
    this.setAttributeValue(CtPuBVO.PK_ORIGCTB, pk_origctb);
  }

  /** �빺������ setter ���� */
  public void setPk_praybill(String pk_praybill) {
    this.setAttributeValue(CtPuBVO.PK_PRAYBILL, pk_praybill);
  }

  /** �빺�������� setter ���� */
  public void setPk_praybill_b(String pk_praybill_b) {
    this.setAttributeValue(CtPuBVO.PK_PRAYBILL_B, pk_praybill_b);
  }

  public void setVctbillcode(String vctbillcode) {
    this.setAttributeValue(CtPuBVO.VCTBILLCODE, vctbillcode);
  }

  public void setVctbilltype(String vctbilltype) {
    this.setAttributeValue(CtPuBVO.VCTBILLTYPE, vctbilltype);
  }

  /** �������񵥾ݺ� setter ���� */
  public void setVecbillcode(String vecbillcode) {
    this.setAttributeValue(CtPuBVO.VECBILLCODE, vecbillcode);
  }

  /** Эͬ��ͬ�� setter ���� */
  public void setVecmctbillcode(String vecmctbillcode) {
    this.setAttributeValue(CtPuBVO.VECMCTBILLCODE, vecmctbillcode);
  }

  /** �빺���� setter ���� */
  public void setVpraybillcode(String vpraybillcode) {
    this.setAttributeValue(CtPuBVO.VPRAYBILLCODE, vpraybillcode);
  }
}
