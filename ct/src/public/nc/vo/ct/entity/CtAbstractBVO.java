package nc.vo.ct.entity;

import nc.vo.ct.pub.CTVatNameConst;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;

/**
 * ��ͬ��������VO
 * 
 * @since 6.0
 * @version 2011-1-4 ����10:42:03
 * @author lizhengb
 */
public abstract class CtAbstractBVO extends SuperVO {

  // ��ԴEC
  public static final String BSOURCEEC = "bsourceec";

  // ��λ
  public static final String CASTUNITID = "castunitid";

  // �ջ��ص�
  public static final String CDEVADDRID = "cdevaddrid";

  // �ջ�����
  public static final String CDEVAREAID = "cdevareaid";

  // ������
  public static final String CFFILEID = "cffileid";

  // ��������
  public static final String CPRODUCTORID = "cproductorid";

  // ���۵�λ
  public static final String CQTUNITID = "cqtunitid";

  // �����ȼ�
  public static final String CQUALITYLEVELID = "cqualitylevelid";

  // �к�
  public static final String CROWNO = "crowno";

  // ��Դ�������ӱ�ID
  public static final String CSRCBBID = "csrcbbid";

  // ��Դ�����ӱ���ID
  public static final String CSRCBID = "csrcbid";

  // ��Դ��������ID
  public static final String CSRCID = "csrcid";

  // ���䷽ʽ
  public static final String CTRANSPMODEID = "ctranspmodeid";

  // ����λ
  public static final String CUNITID = "cunitid";

  // �ƻ��շ�������
  public static final String DELIVDATE = "delivdate";

  // dr
  public static final String DR = "dr";

  // ��˰���
  public static final String FTAXTYPEFLAG = "ftaxtypeflag";

  // ����
  public static final String NASTNUM = "nastnum";

  // ȫ�ֱ�����˰���
  public static final String NGLOBALMNY = "nglobalmny";

  // ȫ�ֱ��Ҽ�˰�ϼ�
  public static final String NGLOBALTAXMNY = "nglobaltaxmny";

  // ��������˰����
  public static final String NGPRICE = "ngprice";

  // ���ű�����˰���
  public static final String NGROUPMNY = "ngroupmny";

  // ���ű��Ҽ�˰�ϼ�
  public static final String NGROUPTAXMNY = "ngrouptaxmny";

  // �����Һ�˰����
  public static final String NGTAXPRICE = "ngtaxprice";

  // ������˰���
  public static final String NMNY = "nmny";

  // ������
  public static final String NNUM = "nnum";

  // ����ִ���ۼ�����
  public static final String NORDNUM = "nordnum";

  // ����ִ���ۼ�ԭ�Ҽ�˰�ϼ�
  public static final String NORDSUM = "nordsum";

  // ԭ����˰���
  public static final String NORIGMNY = "norigmny";

  // ��ԭ����˰����
  public static final String NORIGPRICE = "norigprice";

  // ԭ�Ҽ�˰�ϼ�
  public static final String NORIGTAXMNY = "norigtaxmny";

  // ��ԭ�Һ�˰����
  public static final String NORIGTAXPRICE = "norigtaxprice";

  // �ۼ�ԭ�Ҹ�����
  public static final String NORITOTALGPMNY = "noritotalgpmny";

  // ����ԭ����˰����
  public static final String NQTORIGPRICE = "nqtorigprice";

  // ����ԭ�Һ�˰����
  public static final String NQTORIGTAXPRICE = "nqtorigtaxprice";

  // ���۱�����˰����
  public static final String NQTPRICE = "nqtprice";

  // ���۱��Һ�˰����
  public static final String NQTTAXPRICE = "nqttaxprice";

  // ��������
  public static final String NQTUNITNUM = "nqtunitnum";

  // ˰��
  public static final String NTAX = "ntax";

  // ���Ҽ�˰�ϼ�
  public static final String NTAXMNY = "ntaxmny";

  // ˰��
  public static final String NTAXRATE = "ntaxrate";

  // �ۼƱ��Ҹ�����
  public static final String NTOTALGPMNY = "ntotalgpmny";

  // �ջ���λ
  public static final String PK_ARRVSTOORG = "pk_arrvstoorg";

  // �ջ���֯�汾
  public static final String PK_ARRVSTOORG_V = "pk_arrvstoorg_v";

  // ������֯ԭʼ�汾
  public static final String PK_FINANCEORG = "pk_financeorg";

  // ������֯
  public static final String PK_FINANCEORG_V = "pk_financeorg_v";

  // ����
  public static final String PK_GROUP = "pk_group";

  // ���ϻ�������
  public static final String PK_MARBASCLASS = "pk_marbasclass";

  // ����
  public static final String PK_MATERIAL = "pk_material";

  // �ɹ���֯���°汾
  public static final String PK_ORG = "pk_org";

  // �ɹ���֯
  public static final String PK_ORG_V = "pk_org_v";

  // �ջ���ַ
  public static final String PK_RECEIVEADDRESS = "pk_receiveaddress";

  // ����OID
  public static final String PK_SRCMATERIAL = "pk_srcmaterial";

  // sourcebts
  public static final String SOURCEBTS = "sourcebts";

  // sourcets
  public static final String SOURCETS = "sourcets";

  // ʱ���
  public static final String TS = "ts";

  // �Զ�����1
  public static final String VBDEF1 = "vbdef1";

  // �Զ�����10
  public static final String VBDEF10 = "vbdef10";

  // �Զ�����11
  public static final String VBDEF11 = "vbdef11";

  // �Զ�����12
  public static final String VBDEF12 = "vbdef12";

  // �Զ�����13
  public static final String VBDEF13 = "vbdef13";

  // �Զ�����14
  public static final String VBDEF14 = "vbdef14";

  // �Զ�����15
  public static final String VBDEF15 = "vbdef15";

  // �Զ�����16
  public static final String VBDEF16 = "vbdef16";

  // �Զ�����17
  public static final String VBDEF17 = "vbdef17";

  // �Զ�����18
  public static final String VBDEF18 = "vbdef18";

  // �Զ�����19
  public static final String VBDEF19 = "vbdef19";

  // �Զ�����2
  public static final String VBDEF2 = "vbdef2";

  // �Զ�����20
  public static final String VBDEF20 = "vbdef20";

  // �Զ�����3
  public static final String VBDEF3 = "vbdef3";

  // �Զ�����4
  public static final String VBDEF4 = "vbdef4";

  // �Զ�����5
  public static final String VBDEF5 = "vbdef5";

  // �Զ�����6
  public static final String VBDEF6 = "vbdef6";

  // �Զ�����7
  public static final String VBDEF7 = "vbdef7";

  // �Զ�����8
  public static final String VBDEF8 = "vbdef8";

  // �Զ�����9
  public static final String VBDEF9 = "vbdef9";

  // ������
  public static final String VCHANGERATE = "vchangerate";

  // ���ɸ�������1
  public static final String VFREE1 = "vfree1";

  // ���ɸ�������10
  public static final String VFREE10 = "vfree10";

  // ���ɸ�������2
  public static final String VFREE2 = "vfree2";

  // ���ɸ�������3
  public static final String VFREE3 = "vfree3";

  // ���ɸ�������4
  public static final String VFREE4 = "vfree4";

  // ���ɸ�������5
  public static final String VFREE5 = "vfree5";

  // ���ɸ�������6
  public static final String VFREE6 = "vfree6";

  // ���ɸ�������7
  public static final String VFREE7 = "vfree7";

  // ���ɸ�������8
  public static final String VFREE8 = "vfree8";

  // ���ɸ�������9
  public static final String VFREE9 = "vfree9";

  // ��ע
  public static final String VMEMO = "vmemo";

  // ���۵�λ������
  public static final String VQTUNITRATE = "vqtunitrate";

  // ��Դ��������
  public static final String VRSTRANTYPECODE = "vrstrantypecode";

  // ��Դ���ݺ�
  public static final String VSRCCODE = "vsrccode";

  // ��Դ�����к�
  public static final String VSRCROWNO = "vsrcrowno";

  // ��Դ��������
  public static final String VSRCTYPE = "vsrctype";
  
private static final long serialVersionUID = 7808932040303741164L;

  public CtAbstractBVO() {
    super();
  }

  public UFBoolean getBsourceec() {
    return (UFBoolean) this.getAttributeValue(CtAbstractBVO.BSOURCEEC);
  }

  public String getCastunitid() {
    return (String) this.getAttributeValue(CtAbstractBVO.CASTUNITID);
  }

  public String getCdevaddrid() {
    return (String) this.getAttributeValue(CtAbstractBVO.CDEVADDRID);
  }

  public String getCdevareaid() {
    return (String) this.getAttributeValue(CtAbstractBVO.CDEVAREAID);
  }

  public String getCffileid() {
    return (String) this.getAttributeValue(CtAbstractBVO.CFFILEID);
  }

  public String getCproductorid() {
    return (String) this.getAttributeValue(CtAbstractBVO.CPRODUCTORID);
  }

  public String getCqtunitid() {
    return (String) this.getAttributeValue(CtAbstractBVO.CQTUNITID);
  }

  public String getCqualitylevelid() {
    return (String) this.getAttributeValue(CtAbstractBVO.CQUALITYLEVELID);
  }

  public String getCrowno() {
    return (String) this.getAttributeValue(CtAbstractBVO.CROWNO);
  }

  public String getCsrcbbid() {
    return (String) this.getAttributeValue(CtAbstractBVO.CSRCBBID);
  }

  public String getCsrcbid() {
    return (String) this.getAttributeValue(CtAbstractBVO.CSRCBID);
  }

  public String getCsrcid() {
    return (String) this.getAttributeValue(CtAbstractBVO.CSRCID);
  }

  /** ˰�� getter ���� */
  public String getCtaxcodeid() {
    return (String) this.getAttributeValue(CTVatNameConst.CTAXCODEID);
  }

  public String getCtranspmodeid() {
    return (String) this.getAttributeValue(CtAbstractBVO.CTRANSPMODEID);
  }

  public String getCunitid() {
    return (String) this.getAttributeValue(CtAbstractBVO.CUNITID);
  }

  public UFDate getDelivdate() {
    return (UFDate) this.getAttributeValue(CtAbstractBVO.DELIVDATE);
  }

  public Integer getDr() {
    return (Integer) this.getAttributeValue(CtAbstractBVO.DR);
  }

  public Integer getFtaxtypeflag() {
    return (Integer) this.getAttributeValue(CtAbstractBVO.FTAXTYPEFLAG);
  }

  public UFDouble getNastnum() {
    return (UFDouble) this.getAttributeValue(CtAbstractBVO.NASTNUM);
  }

  /** ��˰��� getter ���� */
  public UFDouble getNcaltaxmny() {
    return (UFDouble) this.getAttributeValue(CTVatNameConst.NCALTAXMNY);
  }

  public UFDouble getNglobalmny() {
    return (UFDouble) this.getAttributeValue(CtAbstractBVO.NGLOBALMNY);
  }

  public UFDouble getNglobaltaxmny() {
    return (UFDouble) this.getAttributeValue(CtAbstractBVO.NGLOBALTAXMNY);
  }

  public UFDouble getNgprice() {
    return (UFDouble) this.getAttributeValue(CtAbstractBVO.NGPRICE);
  }

  public UFDouble getNgroupmny() {
    return (UFDouble) this.getAttributeValue(CtAbstractBVO.NGROUPMNY);
  }

  public UFDouble getNgrouptaxmny() {
    return (UFDouble) this.getAttributeValue(CtAbstractBVO.NGROUPTAXMNY);
  }

  public UFDouble getNgtaxprice() {
    return (UFDouble) this.getAttributeValue(CtAbstractBVO.NGTAXPRICE);
  }

  public UFDouble getNmny() {
    return (UFDouble) this.getAttributeValue(CtAbstractBVO.NMNY);
  }

  public UFDouble getNnum() {
    return (UFDouble) this.getAttributeValue(CtAbstractBVO.NNUM);
  }

  public UFDouble getNordnum() {
    return (UFDouble) this.getAttributeValue(CtAbstractBVO.NORDNUM);
  }

  public UFDouble getNordsum() {
    return (UFDouble) this.getAttributeValue(CtAbstractBVO.NORDSUM);
  }

  public UFDouble getNorigmny() {
    return (UFDouble) this.getAttributeValue(CtAbstractBVO.NORIGMNY);
  }

  public UFDouble getNorigprice() {
    return (UFDouble) this.getAttributeValue(CtAbstractBVO.NORIGPRICE);
  }

  public UFDouble getNorigtaxmny() {
    return (UFDouble) this.getAttributeValue(CtAbstractBVO.NORIGTAXMNY);
  }

  public UFDouble getNorigtaxprice() {
    return (UFDouble) this.getAttributeValue(CtAbstractBVO.NORIGTAXPRICE);
  }

  public UFDouble getNoritotalgpmny() {
    return (UFDouble) this.getAttributeValue(CtAbstractBVO.NORITOTALGPMNY);
  }

  public UFDouble getNqtorigprice() {
    return (UFDouble) this.getAttributeValue(CtAbstractBVO.NQTORIGPRICE);
  }

  public UFDouble getNqtorigtaxprice() {
    return (UFDouble) this.getAttributeValue(CtAbstractBVO.NQTORIGTAXPRICE);
  }

  public UFDouble getNqtprice() {
    return (UFDouble) this.getAttributeValue(CtAbstractBVO.NQTPRICE);
  }

  public UFDouble getNqttaxprice() {
    return (UFDouble) this.getAttributeValue(CtAbstractBVO.NQTTAXPRICE);
  }

  public UFDouble getNqtunitnum() {
    return (UFDouble) this.getAttributeValue(CtAbstractBVO.NQTUNITNUM);
  }

  public UFDouble getNtax() {
    return (UFDouble) this.getAttributeValue(CtAbstractBVO.NTAX);
  }

  public UFDouble getNtaxmny() {
    return (UFDouble) this.getAttributeValue(CtAbstractBVO.NTAXMNY);
  }

  public UFDouble getNtaxrate() {
    return (UFDouble) this.getAttributeValue(CtAbstractBVO.NTAXRATE);
  }

  public UFDouble getNtotalgpmny() {
    return (UFDouble) this.getAttributeValue(CtAbstractBVO.NTOTALGPMNY);
  }

  public String getPk_arrvstoorg() {
    return (String) this.getAttributeValue(CtAbstractBVO.PK_ARRVSTOORG);
  }

  public String getPk_arrvstoorg_v() {
    return (String) this.getAttributeValue(CtAbstractBVO.PK_ARRVSTOORG_V);
  }

  public String getPk_financeorg() {
    return (String) this.getAttributeValue(CtAbstractBVO.PK_FINANCEORG);
  }

  public String getPk_financeorg_v() {
    return (String) this.getAttributeValue(CtAbstractBVO.PK_FINANCEORG_V);
  }

  public String getPk_group() {
    return (String) this.getAttributeValue(CtAbstractBVO.PK_GROUP);
  }

  public String getPk_marbasclass() {
    return (String) this.getAttributeValue(CtAbstractBVO.PK_MARBASCLASS);
  }

  public String getPk_material() {
    return (String) this.getAttributeValue(CtAbstractBVO.PK_MATERIAL);
  }

  public String getPk_org() {
    return (String) this.getAttributeValue(CtAbstractBVO.PK_ORG);
  }

  public String getPk_org_v() {
    return (String) this.getAttributeValue(CtAbstractBVO.PK_ORG_V);
  }

  public String getPk_receiveaddress() {
    return (String) this.getAttributeValue(CtAbstractBVO.PK_RECEIVEADDRESS);
  }

  public String getPk_srcmaterial() {
    return (String) this.getAttributeValue(CtAbstractBVO.PK_SRCMATERIAL);
  }

  public UFDateTime getSourcebts() {
    return (UFDateTime) this.getAttributeValue(CtAbstractBVO.SOURCEBTS);
  }

  public UFDateTime getSourcets() {
    return (UFDateTime) this.getAttributeValue(CtAbstractBVO.SOURCETS);
  }

  public UFDateTime getTs() {
    return (UFDateTime) this.getAttributeValue(CtAbstractBVO.TS);
  }

  public String getVbdef1() {
    return (String) this.getAttributeValue(CtAbstractBVO.VBDEF1);
  }

  public String getVbdef10() {
    return (String) this.getAttributeValue(CtAbstractBVO.VBDEF10);
  }

  public String getVbdef11() {
    return (String) this.getAttributeValue(CtAbstractBVO.VBDEF11);
  }

  public String getVbdef12() {
    return (String) this.getAttributeValue(CtAbstractBVO.VBDEF12);
  }

  public String getVbdef13() {
    return (String) this.getAttributeValue(CtAbstractBVO.VBDEF13);
  }

  public String getVbdef14() {
    return (String) this.getAttributeValue(CtAbstractBVO.VBDEF14);
  }

  public String getVbdef15() {
    return (String) this.getAttributeValue(CtAbstractBVO.VBDEF15);
  }

  public String getVbdef16() {
    return (String) this.getAttributeValue(CtAbstractBVO.VBDEF16);
  }

  public String getVbdef17() {
    return (String) this.getAttributeValue(CtAbstractBVO.VBDEF17);
  }

  public String getVbdef18() {
    return (String) this.getAttributeValue(CtAbstractBVO.VBDEF18);
  }

  public String getVbdef19() {
    return (String) this.getAttributeValue(CtAbstractBVO.VBDEF19);
  }

  public String getVbdef2() {
    return (String) this.getAttributeValue(CtAbstractBVO.VBDEF2);
  }

  public String getVbdef20() {
    return (String) this.getAttributeValue(CtAbstractBVO.VBDEF20);
  }

  public String getVbdef3() {
    return (String) this.getAttributeValue(CtAbstractBVO.VBDEF3);
  }

  public String getVbdef4() {
    return (String) this.getAttributeValue(CtAbstractBVO.VBDEF4);
  }

  public String getVbdef5() {
    return (String) this.getAttributeValue(CtAbstractBVO.VBDEF5);
  }

  public String getVbdef6() {
    return (String) this.getAttributeValue(CtAbstractBVO.VBDEF6);
  }

  public String getVbdef7() {
    return (String) this.getAttributeValue(CtAbstractBVO.VBDEF7);
  }

  public String getVbdef8() {
    return (String) this.getAttributeValue(CtAbstractBVO.VBDEF8);
  }

  public String getVbdef9() {
    return (String) this.getAttributeValue(CtAbstractBVO.VBDEF9);
  }

  public String getVchangerate() {
    return (String) this.getAttributeValue(CtAbstractBVO.VCHANGERATE);
  }

  public String getVfree1() {
    return (String) this.getAttributeValue(CtAbstractBVO.VFREE1);
  }

  public String getVfree10() {
    return (String) this.getAttributeValue(CtAbstractBVO.VFREE10);
  }

  public String getVfree2() {
    return (String) this.getAttributeValue(CtAbstractBVO.VFREE2);
  }

  public String getVfree3() {
    return (String) this.getAttributeValue(CtAbstractBVO.VFREE3);
  }

  public String getVfree4() {
    return (String) this.getAttributeValue(CtAbstractBVO.VFREE4);
  }

  public String getVfree5() {
    return (String) this.getAttributeValue(CtAbstractBVO.VFREE5);
  }

  public String getVfree6() {
    return (String) this.getAttributeValue(CtAbstractBVO.VFREE6);
  }

  public String getVfree7() {
    return (String) this.getAttributeValue(CtAbstractBVO.VFREE7);
  }

  public String getVfree8() {
    return (String) this.getAttributeValue(CtAbstractBVO.VFREE8);
  }

  public String getVfree9() {
    return (String) this.getAttributeValue(CtAbstractBVO.VFREE9);
  }

  public String getVmemo() {
    return (String) this.getAttributeValue(CtAbstractBVO.VMEMO);
  }

  public String getVqtunitrate() {
    return (String) this.getAttributeValue(CtAbstractBVO.VQTUNITRATE);
  }

  public String getVrstrantypecode() {
    return (String) this.getAttributeValue(CtAbstractBVO.VRSTRANTYPECODE);
  }

  public String getVsrccode() {
    return (String) this.getAttributeValue(CtAbstractBVO.VSRCCODE);
  }

  public String getVsrcrowno() {
    return (String) this.getAttributeValue(CtAbstractBVO.VSRCROWNO);
  }

  public String getVsrctype() {
    return (String) this.getAttributeValue(CtAbstractBVO.VSRCTYPE);
  }

  public void setBsourceec(UFBoolean bsourceec) {
    this.setAttributeValue(CtAbstractBVO.BSOURCEEC, bsourceec);
  }

  public void setCastunitid(String castunitid) {
    this.setAttributeValue(CtAbstractBVO.CASTUNITID, castunitid);
  }

  public void setCdevaddrid(String cdevaddrid) {
    this.setAttributeValue(CtAbstractBVO.CDEVADDRID, cdevaddrid);
  }

  public void setCdevareaid(String cdevareaid) {
    this.setAttributeValue(CtAbstractBVO.CDEVAREAID, cdevareaid);
  }

  public void setCffileid(String cffileid) {
    this.setAttributeValue(CtAbstractBVO.CFFILEID, cffileid);
  }

  public void setCproductorid(String cproductorid) {
    this.setAttributeValue(CtAbstractBVO.CPRODUCTORID, cproductorid);
  }

  public void setCqtunitid(String cqtunitid) {
    this.setAttributeValue(CtAbstractBVO.CQTUNITID, cqtunitid);
  }

  public void setCqualitylevelid(String cqualitylevelid) {
    this.setAttributeValue(CtAbstractBVO.CQUALITYLEVELID, cqualitylevelid);
  }

  public void setCrowno(String crowno) {
    this.setAttributeValue(CtAbstractBVO.CROWNO, crowno);
  }

  public void setCsrcbbid(String csrcbbid) {
    this.setAttributeValue(CtAbstractBVO.CSRCBBID, csrcbbid);
  }

  public void setCsrcbid(String csrcbid) {
    this.setAttributeValue(CtAbstractBVO.CSRCBID, csrcbid);
  }

  public void setCsrcid(String csrcid) {
    this.setAttributeValue(CtAbstractBVO.CSRCID, csrcid);
  }

  /** ˰�� setter ���� */
  public void setCtaxcodeid(String ctaxcodeid) {
    this.setAttributeValue(CTVatNameConst.CTAXCODEID, ctaxcodeid);
  }

  public void setCtranspmodeid(String ctranspmodeid) {
    this.setAttributeValue(CtAbstractBVO.CTRANSPMODEID, ctranspmodeid);
  }

  public void setCunitid(String cunitid) {
    this.setAttributeValue(CtAbstractBVO.CUNITID, cunitid);
  }

  public void setDelivdate(UFDate delivdate) {
    this.setAttributeValue(CtAbstractBVO.DELIVDATE, delivdate);
  }

  public void setDr(Integer dr) {
    this.setAttributeValue(CtAbstractBVO.DR, dr);
  }

  public void setFtaxtypeflag(Integer ftaxtypeflag) {
    this.setAttributeValue(CtAbstractBVO.FTAXTYPEFLAG, ftaxtypeflag);
  }

  public void setNastnum(UFDouble nastnum) {
    this.setAttributeValue(CtAbstractBVO.NASTNUM, nastnum);
  }

  /** ��˰��� setter ���� */
  public void setNcaltaxmny(UFDouble ncaltaxmny) {
    this.setAttributeValue(CTVatNameConst.NCALTAXMNY, ncaltaxmny);
  }

  public void setNglobalmny(UFDouble nglobalmny) {
    this.setAttributeValue(CtAbstractBVO.NGLOBALMNY, nglobalmny);
  }

  public void setNglobaltaxmny(UFDouble nglobaltaxmny) {
    this.setAttributeValue(CtAbstractBVO.NGLOBALTAXMNY, nglobaltaxmny);
  }

  public void setNgprice(UFDouble ngprice) {
    this.setAttributeValue(CtAbstractBVO.NGPRICE, ngprice);
  }

  public void setNgroupmny(UFDouble ngroupmny) {
    this.setAttributeValue(CtAbstractBVO.NGROUPMNY, ngroupmny);
  }

  public void setNgrouptaxmny(UFDouble ngrouptaxmny) {
    this.setAttributeValue(CtAbstractBVO.NGROUPTAXMNY, ngrouptaxmny);
  }

  public void setNgtaxprice(UFDouble ngtaxprice) {
    this.setAttributeValue(CtAbstractBVO.NGTAXPRICE, ngtaxprice);
  }

  public void setNmny(UFDouble nmny) {
    this.setAttributeValue(CtAbstractBVO.NMNY, nmny);
  }

  public void setNnum(UFDouble nnum) {
    this.setAttributeValue(CtAbstractBVO.NNUM, nnum);
  }

  public void setNordnum(UFDouble nordnum) {
    this.setAttributeValue(CtAbstractBVO.NORDNUM, nordnum);
  }

  public void setNordsum(UFDouble nordsum) {
    this.setAttributeValue(CtAbstractBVO.NORDSUM, nordsum);
  }

  public void setNorigmny(UFDouble norigmny) {
    this.setAttributeValue(CtAbstractBVO.NORIGMNY, norigmny);
  }

  public void setNorigprice(UFDouble norigprice) {
    this.setAttributeValue(CtAbstractBVO.NORIGPRICE, norigprice);
  }

  public void setNorigtaxmny(UFDouble norigtaxmny) {
    this.setAttributeValue(CtAbstractBVO.NORIGTAXMNY, norigtaxmny);
  }

  public void setNorigtaxprice(UFDouble norigtaxprice) {
    this.setAttributeValue(CtAbstractBVO.NORIGTAXPRICE, norigtaxprice);
  }

  public void setNoritotalgpmny(UFDouble noritotalgpmny) {
    this.setAttributeValue(CtAbstractBVO.NORITOTALGPMNY, noritotalgpmny);
  }

  public void setNqtorigprice(UFDouble nqtorigprice) {
    this.setAttributeValue(CtAbstractBVO.NQTORIGPRICE, nqtorigprice);
  }

  public void setNqtorigtaxprice(UFDouble nqtorigtaxprice) {
    this.setAttributeValue(CtAbstractBVO.NQTORIGTAXPRICE, nqtorigtaxprice);
  }

  public void setNqtprice(UFDouble nqtprice) {
    this.setAttributeValue(CtAbstractBVO.NQTPRICE, nqtprice);
  }

  public void setNqttaxprice(UFDouble nqttaxprice) {
    this.setAttributeValue(CtAbstractBVO.NQTTAXPRICE, nqttaxprice);
  }

  public void setNqtunitnum(UFDouble nqtunitnum) {
    this.setAttributeValue(CtAbstractBVO.NQTUNITNUM, nqtunitnum);
  }

  public void setNtax(UFDouble ntax) {
    this.setAttributeValue(CtAbstractBVO.NTAX, ntax);
  }

  public void setNtaxmny(UFDouble ntaxmny) {
    this.setAttributeValue(CtAbstractBVO.NTAXMNY, ntaxmny);
  }

  public void setNtaxrate(UFDouble ntaxrate) {
    this.setAttributeValue(CtAbstractBVO.NTAXRATE, ntaxrate);
  }

  public void setNtotalgpmny(UFDouble ntotalgpmny) {
    this.setAttributeValue(CtAbstractBVO.NTOTALGPMNY, ntotalgpmny);
  }

  public void setPk_arrvstoorg(String pk_arrvstoorg) {
    this.setAttributeValue(CtAbstractBVO.PK_ARRVSTOORG, pk_arrvstoorg);
  }

  public void setPk_arrvstoorg_v(String pk_arrvstoorg_v) {
    this.setAttributeValue(CtAbstractBVO.PK_ARRVSTOORG_V, pk_arrvstoorg_v);
  }

  public void setPk_financeorg(String pk_financeorg) {
    this.setAttributeValue(CtAbstractBVO.PK_FINANCEORG, pk_financeorg);
  }

  public void setPk_financeorg_v(String pk_financeorg_v) {
    this.setAttributeValue(CtAbstractBVO.PK_FINANCEORG_V, pk_financeorg_v);
  }

  public void setPk_group(String pk_group) {
    this.setAttributeValue(CtAbstractBVO.PK_GROUP, pk_group);
  }

  public void setPk_marbasclass(String pk_marbasclass) {
    this.setAttributeValue(CtAbstractBVO.PK_MARBASCLASS, pk_marbasclass);
  }

  public void setPk_material(String pk_material) {
    this.setAttributeValue(CtAbstractBVO.PK_MATERIAL, pk_material);
  }

  public void setPk_org(String pk_org) {
    this.setAttributeValue(CtAbstractBVO.PK_ORG, pk_org);
  }

  public void setPk_org_v(String pk_org_v) {
    this.setAttributeValue(CtAbstractBVO.PK_ORG_V, pk_org_v);
  }

  public void setPk_receiveaddress(String pk_receiveaddress) {
    this.setAttributeValue(CtAbstractBVO.PK_RECEIVEADDRESS, pk_receiveaddress);
  }

  public void setPk_srcmaterial(String pk_srcmaterial) {
    this.setAttributeValue(CtAbstractBVO.PK_SRCMATERIAL, pk_srcmaterial);
  }

  public void setSourcebts(UFDateTime sourcebts) {
    this.setAttributeValue(CtAbstractBVO.SOURCEBTS, sourcebts);
  }

  public void setSourcets(UFDateTime sourcets) {
    this.setAttributeValue(CtAbstractBVO.SOURCETS, sourcets);
  }

  public void setTs(UFDateTime ts) {
    this.setAttributeValue(CtAbstractBVO.TS, ts);
  }

  public void setVbdef1(String vbdef1) {
    this.setAttributeValue(CtAbstractBVO.VBDEF1, vbdef1);
  }

  public void setVbdef10(String vbdef10) {
    this.setAttributeValue(CtAbstractBVO.VBDEF10, vbdef10);
  }

  public void setVbdef11(String vbdef11) {
    this.setAttributeValue(CtAbstractBVO.VBDEF11, vbdef11);
  }

  public void setVbdef12(String vbdef12) {
    this.setAttributeValue(CtAbstractBVO.VBDEF12, vbdef12);
  }

  public void setVbdef13(String vbdef13) {
    this.setAttributeValue(CtAbstractBVO.VBDEF13, vbdef13);
  }

  public void setVbdef14(String vbdef14) {
    this.setAttributeValue(CtAbstractBVO.VBDEF14, vbdef14);
  }

  public void setVbdef15(String vbdef15) {
    this.setAttributeValue(CtAbstractBVO.VBDEF15, vbdef15);
  }

  public void setVbdef16(String vbdef16) {
    this.setAttributeValue(CtAbstractBVO.VBDEF16, vbdef16);
  }

  public void setVbdef17(String vbdef17) {
    this.setAttributeValue(CtAbstractBVO.VBDEF17, vbdef17);
  }

  public void setVbdef18(String vbdef18) {
    this.setAttributeValue(CtAbstractBVO.VBDEF18, vbdef18);
  }

  public void setVbdef19(String vbdef19) {
    this.setAttributeValue(CtAbstractBVO.VBDEF19, vbdef19);
  }

  public void setVbdef2(String vbdef2) {
    this.setAttributeValue(CtAbstractBVO.VBDEF2, vbdef2);
  }

  public void setVbdef20(String vbdef20) {
    this.setAttributeValue(CtAbstractBVO.VBDEF20, vbdef20);
  }

  public void setVbdef3(String vbdef3) {
    this.setAttributeValue(CtAbstractBVO.VBDEF3, vbdef3);
  }

  public void setVbdef4(String vbdef4) {
    this.setAttributeValue(CtAbstractBVO.VBDEF4, vbdef4);
  }

  public void setVbdef5(String vbdef5) {
    this.setAttributeValue(CtAbstractBVO.VBDEF5, vbdef5);
  }

  public void setVbdef6(String vbdef6) {
    this.setAttributeValue(CtAbstractBVO.VBDEF6, vbdef6);
  }

  public void setVbdef7(String vbdef7) {
    this.setAttributeValue(CtAbstractBVO.VBDEF7, vbdef7);
  }

  public void setVbdef8(String vbdef8) {
    this.setAttributeValue(CtAbstractBVO.VBDEF8, vbdef8);
  }

  public void setVbdef9(String vbdef9) {
    this.setAttributeValue(CtAbstractBVO.VBDEF9, vbdef9);
  }

  public void setVchangerate(String vchangerate) {
    this.setAttributeValue(CtAbstractBVO.VCHANGERATE, vchangerate);
  }

  public void setVfree1(String vfree1) {
    this.setAttributeValue(CtAbstractBVO.VFREE1, vfree1);
  }

  public void setVfree10(String vfree10) {
    this.setAttributeValue(CtAbstractBVO.VFREE10, vfree10);
  }

  public void setVfree2(String vfree2) {
    this.setAttributeValue(CtAbstractBVO.VFREE2, vfree2);
  }

  public void setVfree3(String vfree3) {
    this.setAttributeValue(CtAbstractBVO.VFREE3, vfree3);
  }

  public void setVfree4(String vfree4) {
    this.setAttributeValue(CtAbstractBVO.VFREE4, vfree4);
  }

  public void setVfree5(String vfree5) {
    this.setAttributeValue(CtAbstractBVO.VFREE5, vfree5);
  }

  public void setVfree6(String vfree6) {
    this.setAttributeValue(CtAbstractBVO.VFREE6, vfree6);
  }

  public void setVfree7(String vfree7) {
    this.setAttributeValue(CtAbstractBVO.VFREE7, vfree7);
  }

  public void setVfree8(String vfree8) {
    this.setAttributeValue(CtAbstractBVO.VFREE8, vfree8);
  }

  public void setVfree9(String vfree9) {
    this.setAttributeValue(CtAbstractBVO.VFREE9, vfree9);
  }

  public void setVmemo(String vmemo) {
    this.setAttributeValue(CtAbstractBVO.VMEMO, vmemo);
  }

  public void setVqtunitrate(String vqtunitrate) {
    this.setAttributeValue(CtAbstractBVO.VQTUNITRATE, vqtunitrate);
  }

  public void setVrstrantypecode(String vrstrantypecode) {
    this.setAttributeValue(CtAbstractBVO.VRSTRANTYPECODE, vrstrantypecode);
  }

  public void setVsrccode(String vsrccode) {
    this.setAttributeValue(CtAbstractBVO.VSRCCODE, vsrccode);
  }

  public void setVsrcrowno(String vsrcrowno) {
    this.setAttributeValue(CtAbstractBVO.VSRCROWNO, vsrcrowno);
  }

  public void setVsrctype(String vsrctype) {
    this.setAttributeValue(CtAbstractBVO.VSRCTYPE, vsrctype);
  }
}
