package nc.vo.ct.entity;

import nc.vo.pub.IColumnMeta;
import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;

/**
 * <b> �ڴ˴���Ҫ��������Ĺ��� </b>
 * <p>
 * ��ͬ����VO
 * </p>
 * ��������:2010-03-18 19:14:49
 * 
 * @author
 * @version lizhengb
 */

public abstract class CtAbstractVO extends SuperVO {
  // ʵ����ֹ����
  public static final String ACTUALINVALIDATE = "actualinvalidate";

  // ʵ����Ч����
  public static final String ACTUALVALIDATE = "actualvalidate";

  // �����
  public static final String APPROVER = "approver";

  /** �Ƶ��� */
  public static final String BILLMAKER = "billmaker";

  // �Ƿ����°汾
  public static final String BLATEST = "blatest";

  // �����ɶ�������Ϊ��ִͬ��
  public static final String BORDERNUMEXEC = "bordernumexec";

  // ί��
  public static final String BSC = "bsc";

  // ��������
  public static final String CBILLTYPECODE = "cbilltypecode";

  // ��λ��
  public static final String CCURRENCYID = "ccurrencyid";

  // ԭ�ұ���
  public static final String CORIGCURRENCYID = "corigcurrencyid";

  // ��Ŀ
  public static final String CPROJECTID = "cprojectid";

  // ����ʱ��
  public static final String CREATIONTIME = "creationtime";

  // ������
  public static final String CREATOR = "creator";

  // ��ͬ����
  public static final String CTNAME = "ctname";

  // ��ͬ����2
  public static final String CTNAME2 = "ctname2";

  // ��ͬ����3
  public static final String CTNAME3 = "ctname3";

  // ��ͬ����4
  public static final String CTNAME4 = "ctname4";

  // ��ͬ����5
  public static final String CTNAME5 = "ctname5";

  // ��ͬ����6
  public static final String CTNAME6 = "ctname6";

  /** �������� */
  public static final String CTRANTYPEID = "ctrantypeid";

  // �Է���λ˵��
  public static final String CUSTUNIT = "custunit";

  // ��������
  public static final String DBILLDATE = "dbilldate";

  // �����ص�
  public static final String DELIADDR = "deliaddr";

  // �������°汾
  public static final String DEPID = "depid";

  // ����
  public static final String DEPID_V = "depid_v";

  // �Ƶ�����
  public static final String DMAKEDATE = "dmakedate";

  // dr
  public static final String DR = "dr";

  // ��ͬ״̬
  public static final String FSTATUSFLAG = "fstatusflag";

  // �ƻ���ֹ����
  public static final String INVALLIDATE = "invallidate";

  // ��ӡ����
  public static final String IPRINTCOUNT = "iprintcount";

  // �޸�ʱ��
  public static final String MODIFIEDTIME = "modifiedtime";

  // �޸���
  public static final String MODIFIER = "modifier";

  // �۱�����
  public static final String NEXCHANGERATE = "nexchangerate";

  // ȫ�ֱ�λ�һ���
  public static final String NGLOBALEXCHGRATE = "nglobalexchgrate";

  // ���ű�λ�һ���
  public static final String NGROUPEXCHGRATE = "ngroupexchgrate";

  // ���Ͽ��Ʒ�ʽ
  public static final String NINVCTLSTYLE = "ninvctlstyle";

  // �ۼ�ԭ�Ҹ����ܶ�
  public static final String NORIGPSHAMOUNT = "norigpshamount";

  // ԭ��Ԥ�����޶�
  public static final String NORIPREPAYLIMITMNY = "noriprepaylimitmny";

  // ����Ԥ�����޶�
  public static final String NPREPAYLIMITMNY = "nprepaylimitmny";

  // ������
  public static final String NTOTALASTNUM = "ntotalastnum";

  // �ۼƱ��Ҹ����ܶ�
  public static final String NTOTALGPAMOUNT = "ntotalgpamount";

  // ԭ�Ҽ�˰�ϼ�
  public static final String NTOTALORIGMNY = "ntotalorigmny";

  // ���Ҽ�˰�ϼ�
  public static final String NTOTALTAXMNY = "ntotaltaxmny";

  // ��Ա
  public static final String PERSONNELID = "personnelid";

  // pk_billorg
  public static final String PK_BILLORG = "pk_billorg";

  // ����
  public static final String PK_GROUP = "pk_group";

  // �ɹ���֯���°汾
  public static final String PK_ORG = "pk_org";

  // �ɹ���֯
  public static final String PK_ORG_V = "pk_org_v";

  // ԭʼid
  public static final String PK_ORIGCT = "pk_origct";

  // �ո���Э��
  public static final String PK_PAYTERM = "pk_payterm";

  // ��ͬǩ������
  public static final String SUBSCRIBEDATE = "subscribedate";

  // �������
  public static final String TAUDITTIME = "taudittime";

  // ʱ���
  public static final String TS = "ts";

  // �ƻ���Ч����
  public static final String VALDATE = "valdate";

  // ��ͬ����
  public static final String VBILLCODE = "vbillcode";

  // �Զ�����1
  public static final String VDEF1 = "vdef1";

  // �Զ�����10
  public static final String VDEF10 = "vdef10";

  // �Զ�����11
  public static final String VDEF11 = "vdef11";

  // �Զ�����12
  public static final String VDEF12 = "vdef12";

  // �Զ�����13
  public static final String VDEF13 = "vdef13";

  // �Զ�����14
  public static final String VDEF14 = "vdef14";

  // �Զ�����15
  public static final String VDEF15 = "vdef15";

  // �Զ�����16
  public static final String VDEF16 = "vdef16";

  // �Զ�����17
  public static final String VDEF17 = "vdef17";

  // �Զ�����18
  public static final String VDEF18 = "vdef18";

  // �Զ�����19
  public static final String VDEF19 = "vdef19";

  // �Զ�����2
  public static final String VDEF2 = "vdef2";

  // �Զ�����20
  public static final String VDEF20 = "vdef20";

  // �Զ�����3
  public static final String VDEF3 = "vdef3";

  // �Զ�����4
  public static final String VDEF4 = "vdef4";

  // �Զ�����5
  public static final String VDEF5 = "vdef5";

  // �Զ�����6
  public static final String VDEF6 = "vdef6";

  // �Զ�����7
  public static final String VDEF7 = "vdef7";

  // �Զ�����8
  public static final String VDEF8 = "vdef8";

  // �Զ�����9
  public static final String VDEF9 = "vdef9";

  // �汾��
  public static final String VERSION = "version";

  // ��������
  public static final String VTRANTYPECODE = "vtrantypecode";

  /**
   * 
   */
  private static final long serialVersionUID = -2234985987427154525L;

  /**
   * ����Ĭ�Ϸ�ʽ����������. ��������:2010-03-18 19:14:49
   */
  public CtAbstractVO() {
    super();
  }

  public UFDate getActualinvalidate() {
    return (UFDate) this.getAttributeValue(CtAbstractVO.ACTUALINVALIDATE);
  }

  public UFDate getActualvalidate() {
    return (UFDate) this.getAttributeValue(CtAbstractVO.ACTUALVALIDATE);
  }

  public String getApprover() {
    return (String) this.getAttributeValue(CtAbstractVO.APPROVER);
  }

  /** �Ƶ��� getter ���� */
  public String getBillmaker() {
    return (String) this.getAttributeValue(CtAbstractVO.BILLMAKER);
  }

  public UFBoolean getBlatest() {
    return (UFBoolean) this.getAttributeValue(CtAbstractVO.BLATEST);
  }

  public UFBoolean getBordernumexec() {
    return (UFBoolean) this.getAttributeValue(CtAbstractVO.BORDERNUMEXEC);
  }

  public UFBoolean getBsc() {
    return (UFBoolean) this.getAttributeValue(CtAbstractVO.BSC);
  }

  public String getCbilltypecode() {
    return (String) this.getAttributeValue(CtAbstractVO.CBILLTYPECODE);
  }

  public String getCcurrencyid() {
    return (String) this.getAttributeValue(CtAbstractVO.CCURRENCYID);
  }

  public String getCorigcurrencyid() {
    return (String) this.getAttributeValue(CtAbstractVO.CORIGCURRENCYID);
  }

  public String getCprojectid() {
    return (String) this.getAttributeValue(CtAbstractVO.CPROJECTID);
  }

  public UFDateTime getCreationtime() {
    return (UFDateTime) this.getAttributeValue(CtAbstractVO.CREATIONTIME);
  }

  public String getCreator() {
    return (String) this.getAttributeValue(CtAbstractVO.CREATOR);
  }

  public String getCtname() {
    return (String) this.getAttributeValue(CtAbstractVO.CTNAME);
  }

  public String getCtname2() {
    return (String) this.getAttributeValue(CtAbstractVO.CTNAME2);
  }

  public String getCtname3() {
    return (String) this.getAttributeValue(CtAbstractVO.CTNAME3);
  }

  public String getCtname4() {
    return (String) this.getAttributeValue(CtAbstractVO.CTNAME4);
  }

  public String getCtname5() {
    return (String) this.getAttributeValue(CtAbstractVO.CTNAME5);
  }

  public String getCtname6() {
    return (String) this.getAttributeValue(CtAbstractVO.CTNAME6);
  }

  /** �������� getter ���� */
  public String getCtrantypeid() {
    return (String) this.getAttributeValue(CtAbstractVO.CTRANTYPEID);
  }

  public String getCustunit() {
    return (String) this.getAttributeValue(CtAbstractVO.CUSTUNIT);
  }

  public UFDate getDbilldate() {
    return (UFDate) this.getAttributeValue(CtAbstractVO.DBILLDATE);
  }

  public String getDeliaddr() {
    return (String) this.getAttributeValue(CtAbstractVO.DELIADDR);
  }

  public String getDepid() {
    return (String) this.getAttributeValue(CtAbstractVO.DEPID);
  }

  public String getDepid_v() {
    return (String) this.getAttributeValue(CtAbstractVO.DEPID_V);
  }

  public UFDate getDmakedate() {
    return (UFDate) this.getAttributeValue(CtAbstractVO.DMAKEDATE);
  }

  public Integer getDr() {
    return (Integer) this.getAttributeValue(CtAbstractVO.DR);
  }

  public Integer getFstatusflag() {
    return (Integer) this.getAttributeValue(CtAbstractVO.FSTATUSFLAG);
  }

  /**
   * @return ���غ�ͬ��������
   */
  public String getHeadKeyName() {

    IVOMeta meta = this.getMetaData();
    if (meta != null) {
      IColumnMeta column = meta.getPrimaryAttribute().getColumn();
      if (column != null) {
        return column.getName();
      }
    }
    return null;
  }

  /**
   * @return ���غ�ͬ������ֵ
   */
  public String getHeadKeyValue() {
    return (String) this.getAttributeValue(this.getHeadKeyName());
  }

  /**
   * @return ����vo������
   */
  public String getHeadTableName() {
    IVOMeta meta = this.getMetaData();
    if (meta != null) {
      IColumnMeta column = meta.getPrimaryAttribute().getColumn();
      if (column != null) {
        return column.getTable().getName();
      }
    }
    return null;
  }

  public UFDate getInvallidate() {
    return (UFDate) this.getAttributeValue(CtAbstractVO.INVALLIDATE);
  }

  public Integer getIprintcount() {
    return (Integer) this.getAttributeValue(CtAbstractVO.IPRINTCOUNT);
  }

  public UFDateTime getModifiedtime() {
    return (UFDateTime) this.getAttributeValue(CtAbstractVO.MODIFIEDTIME);
  }

  public String getModifier() {
    return (String) this.getAttributeValue(CtAbstractVO.MODIFIER);
  }

  public UFDouble getNexchangerate() {
    return (UFDouble) this.getAttributeValue(CtAbstractVO.NEXCHANGERATE);
  }

  public UFDouble getNglobalexchgrate() {
    return (UFDouble) this.getAttributeValue(CtAbstractVO.NGLOBALEXCHGRATE);
  }

  public UFDouble getNgroupexchgrate() {
    return (UFDouble) this.getAttributeValue(CtAbstractVO.NGROUPEXCHGRATE);
  }

  /**
   * �������Ͽ��Ʒ�ʽ��Getter����. ��������:2010-03-04 10:33:19
   * 
   * @return Integer
   */
  public Integer getNinvctlstyle() {
    return (Integer) this.getAttributeValue(CtAbstractVO.NINVCTLSTYLE);
  }

  public UFDouble getNorigpshamount() {
    return (UFDouble) this.getAttributeValue(CtAbstractVO.NORIGPSHAMOUNT);
  }

  public UFDouble getNoriprepaylimitmny() {
    return (UFDouble) this.getAttributeValue(CtAbstractVO.NORIPREPAYLIMITMNY);
  }

  public UFDouble getNprepaylimitmny() {
    return (UFDouble) this.getAttributeValue(CtAbstractVO.NPREPAYLIMITMNY);
  }

  public UFDouble getNtotalastnum() {
    return (UFDouble) this.getAttributeValue(CtAbstractVO.NTOTALASTNUM);
  }

  public UFDouble getNtotalgpamount() {
    return (UFDouble) this.getAttributeValue(CtAbstractVO.NTOTALGPAMOUNT);
  }

  public UFDouble getNtotalorigmny() {
    return (UFDouble) this.getAttributeValue(CtAbstractVO.NTOTALORIGMNY);
  }

  public UFDouble getNtotaltaxmny() {
    return (UFDouble) this.getAttributeValue(CtAbstractVO.NTOTALTAXMNY);
  }

  public String getPersonnelid() {
    return (String) this.getAttributeValue(CtAbstractVO.PERSONNELID);
  }

  public String getPk_billorg() {
    return (String) this.getAttributeValue(CtAbstractVO.PK_BILLORG);
  }

  public String getPk_group() {
    return (String) this.getAttributeValue(CtAbstractVO.PK_GROUP);
  }

  public String getPk_org() {
    return (String) this.getAttributeValue(CtAbstractVO.PK_ORG);
  }

  public String getPk_org_v() {
    return (String) this.getAttributeValue(CtAbstractVO.PK_ORG_V);
  }

  public String getPk_origct() {
    return (String) this.getAttributeValue(CtAbstractVO.PK_ORIGCT);
  }

  public String getPk_payterm() {
    return (String) this.getAttributeValue(CtAbstractVO.PK_PAYTERM);
  }

  public UFDate getSubscribedate() {
    return (UFDate) this.getAttributeValue(CtAbstractVO.SUBSCRIBEDATE);
  }

  public UFDate getTaudittime() {
    return (UFDate) this.getAttributeValue(CtAbstractVO.TAUDITTIME);
  }

  public UFDateTime getTs() {
    return (UFDateTime) this.getAttributeValue(CtAbstractVO.TS);
  }

  public UFDate getValdate() {
    return (UFDate) this.getAttributeValue(CtAbstractVO.VALDATE);
  }

  public String getVbillcode() {
    return (String) this.getAttributeValue(CtAbstractVO.VBILLCODE);
  }

  public String getVdef1() {
    return (String) this.getAttributeValue(CtAbstractVO.VDEF1);
  }

  public String getVdef10() {
    return (String) this.getAttributeValue(CtAbstractVO.VDEF10);
  }

  public String getVdef11() {
    return (String) this.getAttributeValue(CtAbstractVO.VDEF11);
  }

  public String getVdef12() {
    return (String) this.getAttributeValue(CtAbstractVO.VDEF12);
  }

  public String getVdef13() {
    return (String) this.getAttributeValue(CtAbstractVO.VDEF13);
  }

  public String getVdef14() {
    return (String) this.getAttributeValue(CtAbstractVO.VDEF14);
  }

  public String getVdef15() {
    return (String) this.getAttributeValue(CtAbstractVO.VDEF15);
  }

  public String getVdef16() {
    return (String) this.getAttributeValue(CtAbstractVO.VDEF16);
  }

  public String getVdef17() {
    return (String) this.getAttributeValue(CtAbstractVO.VDEF17);
  }

  public String getVdef18() {
    return (String) this.getAttributeValue(CtAbstractVO.VDEF18);
  }

  public String getVdef19() {
    return (String) this.getAttributeValue(CtAbstractVO.VDEF19);
  }

  public String getVdef2() {
    return (String) this.getAttributeValue(CtAbstractVO.VDEF2);
  }

  public String getVdef20() {
    return (String) this.getAttributeValue(CtAbstractVO.VDEF20);
  }

  public String getVdef3() {
    return (String) this.getAttributeValue(CtAbstractVO.VDEF3);
  }

  public String getVdef4() {
    return (String) this.getAttributeValue(CtAbstractVO.VDEF4);
  }

  public String getVdef5() {
    return (String) this.getAttributeValue(CtAbstractVO.VDEF5);
  }

  public String getVdef6() {
    return (String) this.getAttributeValue(CtAbstractVO.VDEF6);
  }

  public String getVdef7() {
    return (String) this.getAttributeValue(CtAbstractVO.VDEF7);
  }

  public String getVdef8() {
    return (String) this.getAttributeValue(CtAbstractVO.VDEF8);
  }

  public String getVdef9() {
    return (String) this.getAttributeValue(CtAbstractVO.VDEF9);
  }

  public UFDouble getVersion() {
    return (UFDouble) this.getAttributeValue(CtAbstractVO.VERSION);
  }

  public String getVtrantypecode() {
    return (String) this.getAttributeValue(CtAbstractVO.VTRANTYPECODE);
  }

  public void setActualinvalidate(UFDate actualinvalidate) {
    this.setAttributeValue(CtAbstractVO.ACTUALINVALIDATE, actualinvalidate);
  }

  public void setActualvalidate(UFDate actualvalidate) {
    this.setAttributeValue(CtAbstractVO.ACTUALVALIDATE, actualvalidate);
  }

  public void setApprover(String approver) {
    this.setAttributeValue(CtAbstractVO.APPROVER, approver);
  }

  /** �Ƶ��� setter ���� */
  public void setBillmaker(String billmaker) {
    this.setAttributeValue(CtAbstractVO.BILLMAKER, billmaker);
  }

  public void setBlatest(UFBoolean blatest) {
    this.setAttributeValue(CtAbstractVO.BLATEST, blatest);
  }

  public void setBordernumexec(UFBoolean bordernumexec) {
    this.setAttributeValue(CtAbstractVO.BORDERNUMEXEC, bordernumexec);
  }

  public void setBsc(UFBoolean bsc) {
    this.setAttributeValue(CtAbstractVO.BSC, bsc);
  }

  public void setCbilltypecode(String cbilltypecode) {
    this.setAttributeValue(CtAbstractVO.CBILLTYPECODE, cbilltypecode);
  }

  public void setCcurrencyid(String ccurrencyid) {
    this.setAttributeValue(CtAbstractVO.CCURRENCYID, ccurrencyid);
  }

  public void setCorigcurrencyid(String corigcurrencyid) {
    this.setAttributeValue(CtAbstractVO.CORIGCURRENCYID, corigcurrencyid);
  }

  public void setCprojectid(String cprojectid) {
    this.setAttributeValue(CtAbstractVO.CPROJECTID, cprojectid);
  }

  public void setCreationtime(UFDateTime creationtime) {
    this.setAttributeValue(CtAbstractVO.CREATIONTIME, creationtime);
  }

  public void setCreator(String creator) {
    this.setAttributeValue(CtAbstractVO.CREATOR, creator);
  }

  public void setCtname(String ctname) {
    this.setAttributeValue(CtAbstractVO.CTNAME, ctname);
  }

  public void setCtname2(String ctname2) {
    this.setAttributeValue(CtAbstractVO.CTNAME2, ctname2);
  }

  public void setCtname3(String ctname3) {
    this.setAttributeValue(CtAbstractVO.CTNAME3, ctname3);
  }

  public void setCtname4(String ctname) {
    this.setAttributeValue(CtAbstractVO.CTNAME4, ctname);
  }

  public void setCtname5(String ctname) {
    this.setAttributeValue(CtAbstractVO.CTNAME5, ctname);
  }

  public void setCtname6(String ctname) {
    this.setAttributeValue(CtAbstractVO.CTNAME6, ctname);
  }

  /** �������� setter ���� */
  public void setCtrantypeid(String ctrantypeid) {
    this.setAttributeValue(CtAbstractVO.CTRANTYPEID, ctrantypeid);
  }

  public void setCustunit(String custunit) {
    this.setAttributeValue(CtAbstractVO.CUSTUNIT, custunit);
  }

  public void setDbilldate(UFDate dbilldate) {
    this.setAttributeValue(CtAbstractVO.DBILLDATE, dbilldate);
  }

  public void setDeliaddr(String deliaddr) {
    this.setAttributeValue(CtAbstractVO.DELIADDR, deliaddr);
  }

  public void setDepid(String depid) {
    this.setAttributeValue(CtAbstractVO.DEPID, depid);
  }

  public void setDepid_v(String depid_v) {
    this.setAttributeValue(CtAbstractVO.DEPID_V, depid_v);
  }

  public void setDmakedate(UFDate dmakedate) {
    this.setAttributeValue(CtAbstractVO.DMAKEDATE, dmakedate);
  }

  public void setDr(Integer dr) {
    this.setAttributeValue(CtAbstractVO.DR, dr);
  }

  public void setFstatusflag(Integer fstatusflag) {
    this.setAttributeValue(CtAbstractVO.FSTATUSFLAG, fstatusflag);
  }

  public void setInvallidate(UFDate invallidate) {
    this.setAttributeValue(CtAbstractVO.INVALLIDATE, invallidate);
  }

  public void setIprintcount(Integer iprintcount) {
    this.setAttributeValue(CtAbstractVO.IPRINTCOUNT, iprintcount);
  }

  public void setModifiedtime(UFDateTime modifiedtime) {
    this.setAttributeValue(CtAbstractVO.MODIFIEDTIME, modifiedtime);
  }

  public void setModifier(String modifier) {
    this.setAttributeValue(CtAbstractVO.MODIFIER, modifier);
  }

  public void setNexchangerate(UFDouble nexchangerate) {
    this.setAttributeValue(CtAbstractVO.NEXCHANGERATE, nexchangerate);
  }

  public void setNglobalexchgrate(UFDouble nglobalexchgrate) {
    this.setAttributeValue(CtAbstractVO.NGLOBALEXCHGRATE, nglobalexchgrate);
  }

  public void setNgroupexchgrate(UFDouble ngroupexchgrate) {
    this.setAttributeValue(CtAbstractVO.NGROUPEXCHGRATE, ngroupexchgrate);
  }

  /**
   * �������Ͽ��Ʒ�ʽ��Setter����. ��������:2010-03-04 10:33:19
   * 
   * @param newNinvctlstyle
   *          Integer
   */
  public void setNinvctlstyle(Integer newNinvctlstyle) {
    this.setAttributeValue(CtAbstractVO.NINVCTLSTYLE, newNinvctlstyle);
  }

  public void setNorigpshamount(UFDouble norigpshamount) {
    this.setAttributeValue(CtAbstractVO.NORIGPSHAMOUNT, norigpshamount);
  }

  public void setNoriprepaylimitmny(UFDouble noriprepaylimitmny) {
    this.setAttributeValue(CtAbstractVO.NORIPREPAYLIMITMNY, noriprepaylimitmny);
  }

  public void setNprepaylimitmny(UFDouble nprepaylimitmny) {
    this.setAttributeValue(CtAbstractVO.NPREPAYLIMITMNY, nprepaylimitmny);
  }

  public void setNtotalastnum(UFDouble ntotalastnum) {
    this.setAttributeValue(CtAbstractVO.NTOTALASTNUM, ntotalastnum);
  }

  public void setNtotalgpamount(UFDouble ntotalgpamount) {
    this.setAttributeValue(CtAbstractVO.NTOTALGPAMOUNT, ntotalgpamount);
  }

  public void setNtotalorigmny(UFDouble ntotalorigmny) {
    this.setAttributeValue(CtAbstractVO.NTOTALORIGMNY, ntotalorigmny);
  }

  public void setNtotaltaxmny(UFDouble ntotaltaxmny) {
    this.setAttributeValue(CtAbstractVO.NTOTALTAXMNY, ntotaltaxmny);
  }

  public void setPersonnelid(String personnelid) {
    this.setAttributeValue(CtAbstractVO.PERSONNELID, personnelid);
  }

  public void setPk_billorg(String pk_billorg) {
    this.setAttributeValue(CtAbstractVO.PK_BILLORG, pk_billorg);
  }

  public void setPk_group(String pk_group) {
    this.setAttributeValue(CtAbstractVO.PK_GROUP, pk_group);
  }

  public void setPk_org(String pk_org) {
    this.setAttributeValue(CtAbstractVO.PK_ORG, pk_org);
  }

  public void setPk_org_v(String pk_org_v) {
    this.setAttributeValue(CtAbstractVO.PK_ORG_V, pk_org_v);
  }

  public void setPk_origct(String pk_origct) {
    this.setAttributeValue(CtAbstractVO.PK_ORIGCT, pk_origct);
  }

  public void setPk_payterm(String pk_payterm) {
    this.setAttributeValue(CtAbstractVO.PK_PAYTERM, pk_payterm);
  }

  public void setSubscribedate(UFDate subscribedate) {
    this.setAttributeValue(CtAbstractVO.SUBSCRIBEDATE, subscribedate);
  }

  public void setTaudittime(UFDate taudittime) {
    this.setAttributeValue(CtAbstractVO.TAUDITTIME, taudittime);
  }

  public void setTs(UFDateTime ts) {
    this.setAttributeValue(CtAbstractVO.TS, ts);
  }

  public void setValdate(UFDate valdate) {
    this.setAttributeValue(CtAbstractVO.VALDATE, valdate);
  }

  public void setVbillcode(String vbillcode) {
    this.setAttributeValue(CtAbstractVO.VBILLCODE, vbillcode);
  }

  public void setVdef1(String vdef1) {
    this.setAttributeValue(CtAbstractVO.VDEF1, vdef1);
  }

  public void setVdef10(String vdef10) {
    this.setAttributeValue(CtAbstractVO.VDEF10, vdef10);
  }

  public void setVdef11(String vdef11) {
    this.setAttributeValue(CtAbstractVO.VDEF11, vdef11);
  }

  public void setVdef12(String vdef12) {
    this.setAttributeValue(CtAbstractVO.VDEF12, vdef12);
  }

  public void setVdef13(String vdef13) {
    this.setAttributeValue(CtAbstractVO.VDEF13, vdef13);
  }

  public void setVdef14(String vdef14) {
    this.setAttributeValue(CtAbstractVO.VDEF14, vdef14);
  }

  public void setVdef15(String vdef15) {
    this.setAttributeValue(CtAbstractVO.VDEF15, vdef15);
  }

  public void setVdef16(String vdef16) {
    this.setAttributeValue(CtAbstractVO.VDEF16, vdef16);
  }

  public void setVdef17(String vdef17) {
    this.setAttributeValue(CtAbstractVO.VDEF17, vdef17);
  }

  public void setVdef18(String vdef18) {
    this.setAttributeValue(CtAbstractVO.VDEF18, vdef18);
  }

  public void setVdef19(String vdef19) {
    this.setAttributeValue(CtAbstractVO.VDEF19, vdef19);
  }

  public void setVdef2(String vdef2) {
    this.setAttributeValue(CtAbstractVO.VDEF2, vdef2);
  }

  public void setVdef20(String vdef20) {
    this.setAttributeValue(CtAbstractVO.VDEF20, vdef20);
  }

  public void setVdef3(String vdef3) {
    this.setAttributeValue(CtAbstractVO.VDEF3, vdef3);
  }

  public void setVdef4(String vdef4) {
    this.setAttributeValue(CtAbstractVO.VDEF4, vdef4);
  }

  public void setVdef5(String vdef5) {
    this.setAttributeValue(CtAbstractVO.VDEF5, vdef5);
  }

  public void setVdef6(String vdef6) {
    this.setAttributeValue(CtAbstractVO.VDEF6, vdef6);
  }

  public void setVdef7(String vdef7) {
    this.setAttributeValue(CtAbstractVO.VDEF7, vdef7);
  }

  public void setVdef8(String vdef8) {
    this.setAttributeValue(CtAbstractVO.VDEF8, vdef8);
  }

  public void setVdef9(String vdef9) {
    this.setAttributeValue(CtAbstractVO.VDEF9, vdef9);
  }

  public void setVersion(UFDouble version) {
    this.setAttributeValue(CtAbstractVO.VERSION, version);
  }

  public void setVtrantypecode(String vtrantypecode) {
    this.setAttributeValue(CtAbstractVO.VTRANTYPECODE, vtrantypecode);
  }

}
