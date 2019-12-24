/**
 * $�ļ�˵��$
 * 
 * @author linsf
 * @version 6.0
 * @see
 * @since 6.0
 * @time 2010-1-26 ����06:38:43
 */
package nc.vo.pu.m20.entity;

import nc.vo.pu.m21.entity.OrderItemVO;
import nc.vo.pu.pub.constant.PUEntity;
import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

/**
 * <p>
 * <b>�빺������VO</b>
 * <ul>
 * <li>
 * </ul>
 * <p>
 * <p>
 * 
 * @version 6.0
 * @since 6.0
 * @author linsf
 * @time 2010-1-26 ����06:38:43
 */
public class PraybillItemVO extends SuperVO {
  /** �ɹ���֯�ɱ༭ **/
  public static final String BCANPURCHASEORGEDIT = "bcanpurchaseorgedit";

  /** �Ƿ�̶������� **/
  public static final String BFIXEDRATE = "bfixedrate";

  /** �Ѱ��� **/
  public static final String BISARRANGE = "bisarrange";

  /** �������������� */
  public static final String BISGENSAORDER = "bisgensaorder";

  /** �������������� **/
  public static final String BPUBLISHTOEC = "bpublishtoec";

  /** �йر� **/
  public static final String BROWCLOSE = "browclose";

  /** �ͻ� */
  public static final String CASSCUSTID = "casscustid";

  /** ��λ **/
  public static final String CASTUNITID = "castunitid";

  /** ������ **/
  public static final String CFFILEID = "cffileid";

  /** Դͷ���ݷ�¼��ʶ **/
  public static final String CFIRSTBID = "cfirstbid";

  /** Դͷ���ݱ�ʶ **/
  public static final String CFIRSTID = "cfirstid";

  /** Դͷ�������� **/
  public static final String CFIRSTTYPECODE = "cfirsttypecode";

  /** �������� **/
  public static final String CORDERTRANTYPECODE = "cordertrantypecode";

  /** �������� **/
  public static final String CPRODUCTORID = "cproductorid";

  /** ��Ŀ **/
  public static final String CPROJECTID = "cprojectid";

  /** ��Ŀ���� */
  public static final String CPROJECTTASKID = "cprojecttaskid";

  /** �к� **/
  public static final String CROWNO = "crowno";

  /** ��Դ���ݷ�¼��ʶ **/
  public static final String CSOURCEBID = "csourcebid";

  /** ��Դ���ݱ�ʶ **/
  public static final String CSOURCEID = "csourceid";

  /** ��Դ�������� **/
  public static final String CSOURCETYPECODE = "csourcetypecode";

  /** ��������λ **/
  public static final String CUNITID = "cunitid";

  /** �빺���� **/
  public static final String DBILLDATE = "dbilldate";

  /** �������� **/
  public static final String DREQDATE = "dreqdate";

  /** ���鶩������ **/
  public static final String DSUGGESTDATE = "dsuggestdate";

  /** �ۼƶ������� **/
  public static final String NACCUMULATENUM = "naccumulatenum";

  /** ���� **/
  public static final String NASTNUM = "nastnum";

  /** ���ɺ�ͬ���� **/
  public static final String NGENCT = "ngenct";

  /** ������ **/
  public static final String NNUM = "nnum";

  /** ���ɼ۸����������� **/
  public static final String NPRICEAUDITBILL = "npriceauditbill";

  /** ����ѯ���۵����� **/
  public static final String NQUOTEBILL = "nquotebill";

  /** ���Ҽ�˰�ϼ� **/
  public static final String NTAXMNY = "ntaxmny";

  /** �����Һ�˰���� **/
  public static final String NTAXPRICE = "ntaxprice";

  /** ���ε��� **/
  public static final String PK_BATCHCODE = "pk_batchcode";

  /** �ɹ�Ա **/
  public static final String PK_EMPLOYEE = "pk_employee";

  /** �������� **/
  public static final String PK_GROUP = "pk_group";

  /** ����(VID) **/
  public static final String PK_MATERIAL = "pk_material";

  /** �����֯ **/
  public static final String PK_ORG = "pk_org";

  /** �����֯�汾 **/
  public static final String PK_ORG_V = "pk_org_v";

  /** �빺������_���� **/
  public static final String PK_PRAYBILL = "pk_praybill";

  /** �빺����ID **/
  public static final String PK_PRAYBILL_B = "pk_praybill_b";

  /** ��Ʒ **/
  public static final String PK_PRODUCT = "pk_product";

  /** ��Ʒ�汾 **/
  public static final String PK_PRODUCT_V = "pk_product_v";

  /** �ɹ���֯ **/
  public static final String PK_PURCHASEORG = "pk_purchaseorg";

  /** �ɹ���֯�汾 **/
  public static final String PK_PURCHASEORG_V = "pk_purchaseorg_v";

  /** ������ **/
  public static final String PK_REQDEPT = "pk_reqdept";

  /** �����Ű汾 **/
  public static final String PK_REQDEPT_V = "pk_reqdept_v";

  /** ԭʼ��������֯���°汾 */
  public static final String PK_REQSTOORG = "pk_reqstoorg";

  /** ԭʼ��������֯ */
  public static final String PK_REQSTOORG_V = "pk_reqstoorg_v";

  /** ����ֿ� **/
  public static final String PK_REQSTOR = "pk_reqstor";

  /** ����(OID) **/
  public static final String PK_SRCMATERIAL = "pk_srcmaterial";

  /** ���鹩Ӧ�� **/
  public static final String PK_SUGGESTSUPPLIER = "pk_suggestsupplier";

  /** ��Դ������TS */
  public static final String SOURCEBTS = "sourcebts";

  /** ��Դ����TS */
  public static final String SOURCETS = "sourcets";

  /** ʱ��� **/
  public static final String TS = "ts";

  /** ���κ� **/
  public static final String VBATCHCODE = "vbatchcode";

  /** �Զ�����1 **/
  public static final String VBDEF1 = "vbdef1";

  /** �Զ�����10 **/
  public static final String VBDEF10 = "vbdef10";

  /** �Զ�����11 **/
  public static final String VBDEF11 = "vbdef11";

  /** �Զ�����12 **/
  public static final String VBDEF12 = "vbdef12";

  /** �Զ�����13 **/
  public static final String VBDEF13 = "vbdef13";

  /** �Զ�����14 **/
  public static final String VBDEF14 = "vbdef14";

  /** �Զ�����15 **/
  public static final String VBDEF15 = "vbdef15";

  /** �Զ�����16 **/
  public static final String VBDEF16 = "vbdef16";

  /** �Զ�����17 **/
  public static final String VBDEF17 = "vbdef17";

  /** �Զ�����18 **/
  public static final String VBDEF18 = "vbdef18";

  /** �Զ�����19 **/
  public static final String VBDEF19 = "vbdef19";

  /** �Զ�����2 **/
  public static final String VBDEF2 = "vbdef2";

  /** �Զ�����20 **/
  public static final String VBDEF20 = "vbdef20";

  /** �Զ�����3 **/
  public static final String VBDEF3 = "vbdef3";

  /** �Զ�����4 **/
  public static final String VBDEF4 = "vbdef4";

  /** �Զ�����5 **/
  public static final String VBDEF5 = "vbdef5";

  /** �Զ�����6 **/
  public static final String VBDEF6 = "vbdef6";

  /** �Զ�����7 **/
  public static final String VBDEF7 = "vbdef7";

  /** �Զ�����8 **/
  public static final String VBDEF8 = "vbdef8";

  /** �Զ�����9 **/
  public static final String VBDEF9 = "vbdef9";

  /** ��ע **/
  public static final String VBMEMO = "vbmemo";

  /** ������ **/
  public static final String VCHANGERATE = "vchangerate";

  /** Դͷ���ݺ� **/
  public static final String VFIRSTCODE = "vfirstcode";

  /** Դͷ�����к� **/
  public static final String VFIRSTROWNO = "vfirstrowno";

  /** Դͷ�������� **/
  public static final String VFIRSTTRANTYPE = "vfirsttrantype";

  /** ���ɸ�������1 **/
  public static final String VFREE1 = "vfree1";

  /** ���ɸ�������10 **/
  public static final String VFREE10 = "vfree10";

  /** ���ɸ�������2 **/
  public static final String VFREE2 = "vfree2";

  /** ���ɸ�������3 **/
  public static final String VFREE3 = "vfree3";

  /** ���ɸ�������4 **/
  public static final String VFREE4 = "vfree4";

  /** ���ɸ�������5 **/
  public static final String VFREE5 = "vfree5";

  /** ���ɸ�������6 **/
  public static final String VFREE6 = "vfree6";

  /** ���ɸ�������7 **/
  public static final String VFREE7 = "vfree7";

  /** ���ɸ�������8 **/
  public static final String VFREE8 = "vfree8";

  /** ���ɸ�������9 **/
  public static final String VFREE9 = "vfree9";

  /** ��Դ���ݺ� **/
  public static final String VSOURCECODE = "vsourcecode";

  /** ��Դ�����к� **/
  public static final String VSOURCEROWNO = "vsourcerowno";

  /** ��Դ�������� **/
  public static final String VSRCTRANTYPECODE = "vsrctrantypecode";

  private static final long serialVersionUID = -3432997440833423530L;

  /** �ɹ���֯�ɱ༭ **/
  public UFBoolean getBcanpurchaseorgedit() {
    return (UFBoolean) this
        .getAttributeValue(PraybillItemVO.BCANPURCHASEORGEDIT);
  }

  /** �Ƿ�̶������� **/
  public UFBoolean getBfixedrate() {
    return (UFBoolean) this.getAttributeValue(PraybillItemVO.BFIXEDRATE);
  }

  /** �Ѱ��� **/
  public UFBoolean getBisarrange() {
    return (UFBoolean) this.getAttributeValue(PraybillItemVO.BISARRANGE);
  }

  /** �������������� **/
  public UFBoolean getBisgensaorder() {
    return (UFBoolean) this.getAttributeValue(PraybillItemVO.BISGENSAORDER);
  }

  /** �������������� **/
  public UFBoolean getBpublishtoec() {
    return (UFBoolean) this.getAttributeValue(PraybillItemVO.BPUBLISHTOEC);
  }

  /** �йر� **/
  public UFBoolean getBrowclose() {
    return (UFBoolean) this.getAttributeValue(PraybillItemVO.BROWCLOSE);
  }

  /** �ͻ� getter ���� */
  public String getCasscustid() {
    return (String) this.getAttributeValue(PraybillItemVO.CASSCUSTID);
  }

  /** ��λ **/
  public String getCastunitid() {
    return (String) this.getAttributeValue(PraybillItemVO.CASTUNITID);
  }

  /** ������ **/
  public String getCffileid() {
    return (String) this.getAttributeValue(PraybillItemVO.CFFILEID);
  }

  /** Դͷ���ݷ�¼��ʶ **/
  public String getCfirstbid() {
    return (String) this.getAttributeValue(PraybillItemVO.CFIRSTBID);
  }

  /** Դͷ���ݱ�ʶ **/
  public String getCfirstid() {
    return (String) this.getAttributeValue(PraybillItemVO.CFIRSTID);
  }

  /** Դͷ�������� **/
  public String getCfirsttypecode() {
    return (String) this.getAttributeValue(PraybillItemVO.CFIRSTTYPECODE);
  }

  /** �������� **/
  public String getCordertrantypecode() {
    return (String) this.getAttributeValue(PraybillItemVO.CORDERTRANTYPECODE);
  }

  /** �������� **/
  public String getCproductorid() {
    return (String) this.getAttributeValue(PraybillItemVO.CPRODUCTORID);
  }

  /** ��Ŀ **/
  public String getCprojectid() {
    return (String) this.getAttributeValue(PraybillItemVO.CPROJECTID);
  }

  /** ��Ŀ���� getter ���� */
  public String getCprojecttaskid() {
    return (String) this.getAttributeValue(PraybillItemVO.CPROJECTTASKID);
  }

  /** �к� **/
  public String getCrowno() {
    return (String) this.getAttributeValue(PraybillItemVO.CROWNO);
  }

  /** ��Դ���ݷ�¼��ʶ **/
  public String getCsourcebid() {
    return (String) this.getAttributeValue(PraybillItemVO.CSOURCEBID);
  }

  /** ��Դ���ݱ�ʶ **/
  public String getCsourceid() {
    return (String) this.getAttributeValue(PraybillItemVO.CSOURCEID);
  }

  /** ��Դ�������� **/
  public String getCsourcetypecode() {
    return (String) this.getAttributeValue(PraybillItemVO.CSOURCETYPECODE);
  }

  /** ��������λ **/
  public String getCunitid() {
    return (String) this.getAttributeValue(PraybillItemVO.CUNITID);
  }

  /** �빺���� **/
  public UFDate getDbilldate() {
    return (UFDate) this.getAttributeValue(PraybillHeaderVO.DBILLDATE);
  }

  /** �������� **/
  public UFDate getDreqdate() {
    return (UFDate) this.getAttributeValue(PraybillItemVO.DREQDATE);
  }

  /** ���鶩������ **/
  public UFDate getDsuggestdate() {
    return (UFDate) this.getAttributeValue(PraybillItemVO.DSUGGESTDATE);
  }

  @Override
  public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta(PUEntity.M20_B);
  }

  /** �ۼƶ������� **/
  public UFDouble getNaccumulatenum() {
    return (UFDouble) this.getAttributeValue(PraybillItemVO.NACCUMULATENUM);
  }

  /** ���� **/
  public UFDouble getNastnum() {
    return (UFDouble) this.getAttributeValue(PraybillItemVO.NASTNUM);
  }

  /** ���ɺ�ͬ���� **/
  public Integer getNgenct() {
    return (Integer) this.getAttributeValue(PraybillItemVO.NGENCT);
  }

  /** ������ **/
  public UFDouble getNnum() {
    return (UFDouble) this.getAttributeValue(PraybillItemVO.NNUM);
  }

  /** ���ɼ۸����������� **/
  public Integer getNpriceauditbill() {
    return (Integer) this.getAttributeValue(PraybillItemVO.NPRICEAUDITBILL);
  }

  /** ����ѯ���۵����� **/
  public Integer getNquotebill() {
    return (Integer) this.getAttributeValue(PraybillItemVO.NQUOTEBILL);
  }

  /** ���Ҽ�˰�ϼ� **/
  public UFDouble getNtaxmny() {
    return (UFDouble) this.getAttributeValue(PraybillItemVO.NTAXMNY);
  }

  /** �����Һ�˰���� **/
  public UFDouble getNtaxprice() {
    return (UFDouble) this.getAttributeValue(PraybillItemVO.NTAXPRICE);
  }

  /** ���ε��� **/
  public String getPk_batchcode() {
    return (String) this.getAttributeValue(PraybillItemVO.PK_BATCHCODE);
  }

  /** �ɹ�Ա **/
  public String getPk_employee() {
    return (String) this.getAttributeValue(PraybillItemVO.PK_EMPLOYEE);
  }

  /** �������� **/
  public String getPk_group() {
    return (String) this.getAttributeValue(PraybillItemVO.PK_GROUP);
  }

  /** ����(VID) **/
  public String getPk_material() {
    return (String) this.getAttributeValue(PraybillItemVO.PK_MATERIAL);
  }

  /** �����֯ **/
  public String getPk_org() {
    return (String) this.getAttributeValue(PraybillItemVO.PK_ORG);
  }

  /** �����֯�汾 **/
  public String getPk_org_v() {
    return (String) this.getAttributeValue(PraybillItemVO.PK_ORG_V);
  }

  /** �빺������_���� **/
  public String getPk_praybill() {
    return (String) this.getAttributeValue(PraybillItemVO.PK_PRAYBILL);
  }

  /** �빺����ID **/
  public String getPk_praybill_b() {
    return (String) this.getAttributeValue(PraybillItemVO.PK_PRAYBILL_B);
  }

  /** ��Ʒ **/
  public String getPk_product() {
    return (String) this.getAttributeValue(PraybillItemVO.PK_PRODUCT);
  }

  /** ��Ʒ�汾 **/
  public String getPk_product_v() {
    return (String) this.getAttributeValue(PraybillItemVO.PK_PRODUCT_V);
  }

  /** �ɹ���֯ **/
  public String getPk_purchaseorg() {
    return (String) this.getAttributeValue(PraybillItemVO.PK_PURCHASEORG);
  }

  /** �ɹ���֯�汾 **/
  public String getPk_purchaseorg_v() {
    return (String) this.getAttributeValue(PraybillItemVO.PK_PURCHASEORG_V);
  }

  /** ������ **/
  public String getPk_reqdept() {
    return (String) this.getAttributeValue(PraybillItemVO.PK_REQDEPT);
  }

  /** �����Ű汾 **/
  public String getPk_reqdept_v() {
    return (String) this.getAttributeValue(PraybillItemVO.PK_REQDEPT_V);
  }

  /** ԭʼ��������֯���°汾 **/
  public String getPk_reqstoorg() {
    return (String) this.getAttributeValue(PraybillItemVO.PK_REQSTOORG);
  }

  /** ԭʼ��������֯ **/
  public String getPk_reqstoorg_v() {
    return (String) this.getAttributeValue(PraybillItemVO.PK_REQSTOORG_V);
  }

  /** ����ֿ� **/
  public String getPk_reqstor() {
    return (String) this.getAttributeValue(PraybillItemVO.PK_REQSTOR);
  }

  /** ����(OID) **/
  public String getPk_srcmaterial() {
    return (String) this.getAttributeValue(PraybillItemVO.PK_SRCMATERIAL);
  }

  /** ���鹩Ӧ�� **/
  public String getPk_suggestsupplier() {
    return (String) this.getAttributeValue(PraybillItemVO.PK_SUGGESTSUPPLIER);
  }

  /** ��Դ������TS getter ���� */
  public UFDateTime getSourcebts() {
    return (UFDateTime) this.getAttributeValue(OrderItemVO.SOURCEBTS);
  }

  /** ��Դ����TS getter ���� */
  public UFDateTime getSourcets() {
    return (UFDateTime) this.getAttributeValue(OrderItemVO.SOURCETS);
  }

  /** ʱ��� **/
  public UFDateTime getTs() {
    return (UFDateTime) this.getAttributeValue(PraybillItemVO.TS);
  }

  /** ���κ� **/
  public String getVbatchcode() {
    return (String) this.getAttributeValue(PraybillItemVO.VBATCHCODE);
  }

  /** �Զ�����1 **/
  public String getVbdef1() {
    return (String) this.getAttributeValue(PraybillItemVO.VBDEF1);
  }

  /** �Զ�����10 **/
  public String getVbdef10() {
    return (String) this.getAttributeValue(PraybillItemVO.VBDEF10);
  }

  /** �Զ�����11 **/
  public String getVbdef11() {
    return (String) this.getAttributeValue(PraybillItemVO.VBDEF11);
  }

  /** �Զ�����12 **/
  public String getVbdef12() {
    return (String) this.getAttributeValue(PraybillItemVO.VBDEF12);
  }

  /** �Զ�����13 **/
  public String getVbdef13() {
    return (String) this.getAttributeValue(PraybillItemVO.VBDEF13);
  }

  /** �Զ�����14 **/
  public String getVbdef14() {
    return (String) this.getAttributeValue(PraybillItemVO.VBDEF14);
  }

  /** �Զ�����15 **/
  public String getVbdef15() {
    return (String) this.getAttributeValue(PraybillItemVO.VBDEF15);
  }

  /** �Զ�����16 **/
  public String getVbdef16() {
    return (String) this.getAttributeValue(PraybillItemVO.VBDEF16);
  }

  /** �Զ�����17 **/
  public String getVbdef17() {
    return (String) this.getAttributeValue(PraybillItemVO.VBDEF17);
  }

  /** �Զ�����18 **/
  public String getVbdef18() {
    return (String) this.getAttributeValue(PraybillItemVO.VBDEF18);
  }

  /** �Զ�����19 **/
  public String getVbdef19() {
    return (String) this.getAttributeValue(PraybillItemVO.VBDEF19);
  }

  /** �Զ�����2 **/
  public String getVbdef2() {
    return (String) this.getAttributeValue(PraybillItemVO.VBDEF2);
  }

  /** �Զ�����20 **/
  public String getVbdef20() {
    return (String) this.getAttributeValue(PraybillItemVO.VBDEF20);
  }

  /** �Զ�����3 **/
  public String getVbdef3() {
    return (String) this.getAttributeValue(PraybillItemVO.VBDEF3);
  }

  /** �Զ�����4 **/
  public String getVbdef4() {
    return (String) this.getAttributeValue(PraybillItemVO.VBDEF4);
  }

  /** �Զ�����5 **/
  public String getVbdef5() {
    return (String) this.getAttributeValue(PraybillItemVO.VBDEF5);
  }

  /** �Զ�����6 **/
  public String getVbdef6() {
    return (String) this.getAttributeValue(PraybillItemVO.VBDEF6);
  }

  /** �Զ�����7 **/
  public String getVbdef7() {
    return (String) this.getAttributeValue(PraybillItemVO.VBDEF7);
  }

  /** �Զ�����8 **/
  public String getVbdef8() {
    return (String) this.getAttributeValue(PraybillItemVO.VBDEF8);
  }

  /** �Զ�����9 **/
  public String getVbdef9() {
    return (String) this.getAttributeValue(PraybillItemVO.VBDEF9);
  }

  /** ��ע **/
  public String getVbmemo() {
    return (String) this.getAttributeValue(PraybillItemVO.VBMEMO);
  }

  /** ������ **/
  public String getVchangerate() {
    return (String) this.getAttributeValue(PraybillItemVO.VCHANGERATE);
  }

  /** Դͷ���ݺ� **/
  public String getVfirstcode() {
    return (String) this.getAttributeValue(PraybillItemVO.VFIRSTCODE);
  }

  /** Դͷ�����к� **/
  public String getVfirstrowno() {
    return (String) this.getAttributeValue(PraybillItemVO.VFIRSTROWNO);
  }

  /** Դͷ�������� **/
  public String getVfirsttrantype() {
    return (String) this.getAttributeValue(PraybillItemVO.VFIRSTTRANTYPE);
  }

  /** ���ɸ�������1 **/
  public String getVfree1() {
    return (String) this.getAttributeValue(PraybillItemVO.VFREE1);
  }

  /** ���ɸ�������10 **/
  public String getVfree10() {
    return (String) this.getAttributeValue(PraybillItemVO.VFREE10);
  }

  /** ���ɸ�������2 **/
  public String getVfree2() {
    return (String) this.getAttributeValue(PraybillItemVO.VFREE2);
  }

  /** ���ɸ�������3 **/
  public String getVfree3() {
    return (String) this.getAttributeValue(PraybillItemVO.VFREE3);
  }

  /** ���ɸ�������4 **/
  public String getVfree4() {
    return (String) this.getAttributeValue(PraybillItemVO.VFREE4);
  }

  /** ���ɸ�������5 **/
  public String getVfree5() {
    return (String) this.getAttributeValue(PraybillItemVO.VFREE5);
  }

  /** ���ɸ�������6 **/
  public String getVfree6() {
    return (String) this.getAttributeValue(PraybillItemVO.VFREE6);
  }

  /** ���ɸ�������7 **/
  public String getVfree7() {
    return (String) this.getAttributeValue(PraybillItemVO.VFREE7);
  }

  /** ���ɸ�������8 **/
  public String getVfree8() {
    return (String) this.getAttributeValue(PraybillItemVO.VFREE8);
  }

  /** ���ɸ�������9 **/
  public String getVfree9() {
    return (String) this.getAttributeValue(PraybillItemVO.VFREE9);
  }

  /** ��Դ���ݺ� **/
  public String getVsourcecode() {
    return (String) this.getAttributeValue(PraybillItemVO.VSOURCECODE);
  }

  /** ��Դ�����к� **/
  public String getVsourcerowno() {
    return (String) this.getAttributeValue(PraybillItemVO.VSOURCEROWNO);
  }

  /** ��Դ�������� **/
  public String getVsrctrantypecode() {
    return (String) this.getAttributeValue(PraybillItemVO.VSRCTRANTYPECODE);
  }

  /** �ɹ���֯�ɱ༭ **/
  public void setBcanpurchaseorgedit(UFBoolean bcanpurchaseorgedit) {
    this.setAttributeValue(PraybillItemVO.BCANPURCHASEORGEDIT,
        bcanpurchaseorgedit);
  }

  /** �Ƿ�̶������� **/
  public void setBfixedrate(UFBoolean bfixedrate) {
    this.setAttributeValue(PraybillItemVO.BFIXEDRATE, bfixedrate);
  }

  /** �Ѱ��� **/
  public void setBisarrange(UFBoolean bisarrange) {
    this.setAttributeValue(PraybillItemVO.BISARRANGE, bisarrange);
  }

  /** �������������� **/
  public void setBisgensaorder(UFBoolean bisgensaorder) {
    this.setAttributeValue(PraybillItemVO.BISGENSAORDER, bisgensaorder);
  }

  /** �������������� **/
  public void setBpublishtoec(UFBoolean bpublishtoec) {
    this.setAttributeValue(PraybillItemVO.BPUBLISHTOEC, bpublishtoec);
  }

  /** �йر� **/
  public void setBrowclose(UFBoolean browclose) {
    this.setAttributeValue(PraybillItemVO.BROWCLOSE, browclose);
  }

  /** �ͻ� setter ���� */
  public void setCasscustid(String casscustid) {
    this.setAttributeValue(PraybillItemVO.CASSCUSTID, casscustid);
  }

  /** ��λ **/
  public void setCastunitid(String castunitid) {
    this.setAttributeValue(PraybillItemVO.CASTUNITID, castunitid);
  }

  /** ������ **/
  public void setCffileid(String cffileid) {
    this.setAttributeValue(PraybillItemVO.CFFILEID, cffileid);
  }

  /** Դͷ���ݷ�¼��ʶ **/
  public void setCfirstbid(String cfirstbid) {
    this.setAttributeValue(PraybillItemVO.CFIRSTBID, cfirstbid);
  }

  /** Դͷ���ݱ�ʶ **/
  public void setCfirstid(String cfirstid) {
    this.setAttributeValue(PraybillItemVO.CFIRSTID, cfirstid);
  }

  /** Դͷ�������� **/
  public void setCfirsttypecode(String cfirsttypecode) {
    this.setAttributeValue(PraybillItemVO.CFIRSTTYPECODE, cfirsttypecode);
  }

  /** �������� **/
  public void setCordertrantypecode(String cordertrantypecode) {
    this.setAttributeValue(PraybillItemVO.CORDERTRANTYPECODE,
        cordertrantypecode);
  }

  /** �������� **/
  public void setCproductorid(String cproductorid) {
    this.setAttributeValue(PraybillItemVO.CPRODUCTORID, cproductorid);
  }

  /** ��Ŀ **/
  public void setCprojectid(String cprojectid) {
    this.setAttributeValue(PraybillItemVO.CPROJECTID, cprojectid);
  }

  /** ��Ŀ���� setter ���� */
  public void setCprojecttaskid(String cprojecttaskid) {
    this.setAttributeValue(PraybillItemVO.CPROJECTTASKID, cprojecttaskid);
  }

  /** �к� **/
  public void setCrowno(String crowno) {
    this.setAttributeValue(PraybillItemVO.CROWNO, crowno);
  }

  /** ��Դ���ݷ�¼��ʶ **/
  public void setCsourcebid(String csourcebid) {
    this.setAttributeValue(PraybillItemVO.CSOURCEBID, csourcebid);
  }

  /** ��Դ���ݱ�ʶ **/
  public void setCsourceid(String csourceid) {
    this.setAttributeValue(PraybillItemVO.CSOURCEID, csourceid);
  }

  /** ��Դ�������� **/
  public void setCsourcetypecode(String csourcetypecode) {
    this.setAttributeValue(PraybillItemVO.CSOURCETYPECODE, csourcetypecode);
  }

  /** ��������λ **/
  public void setCunitid(String cunitid) {
    this.setAttributeValue(PraybillItemVO.CUNITID, cunitid);
  }

  /** �빺���� **/
  public void setDbilldate(UFDate dbilldate) {
    this.setAttributeValue(PraybillHeaderVO.DBILLDATE, dbilldate);
  }

  /** �������� **/
  public void setDreqdate(UFDate dreqdate) {
    this.setAttributeValue(PraybillItemVO.DREQDATE, dreqdate);
  }

  /** ���鶩������ **/
  public void setDsuggestdate(UFDate dsuggestdate) {
    this.setAttributeValue(PraybillItemVO.DSUGGESTDATE, dsuggestdate);
  }

  /** �ۼƶ������� **/
  public void setNaccumulatenum(UFDouble naccumulatenum) {
    this.setAttributeValue(PraybillItemVO.NACCUMULATENUM, naccumulatenum);
  }

  /** ���� **/
  public void setNastnum(UFDouble nastnum) {
    this.setAttributeValue(PraybillItemVO.NASTNUM, nastnum);
  }

  /** ���ɺ�ͬ���� **/
  public void setNgenct(Integer ngenct) {
    this.setAttributeValue(PraybillItemVO.NGENCT, ngenct);
  }

  /** ������ **/
  public void setNnum(UFDouble nnum) {
    this.setAttributeValue(PraybillItemVO.NNUM, nnum);
  }

  /** ���ɼ۸����������� **/
  public void setNpriceauditbill(Integer npriceauditbill) {
    this.setAttributeValue(PraybillItemVO.NPRICEAUDITBILL, npriceauditbill);
  }

  /** ����ѯ���۵����� **/
  public void setNquotebill(Integer nquotebill) {
    this.setAttributeValue(PraybillItemVO.NQUOTEBILL, nquotebill);
  }

  /** ���Ҽ�˰�ϼ� **/
  public void setNtaxmny(UFDouble ntaxmny) {
    this.setAttributeValue(PraybillItemVO.NTAXMNY, ntaxmny);
  }

  /** �����Һ�˰���� **/
  public void setNtaxprice(UFDouble ntaxprice) {
    this.setAttributeValue(PraybillItemVO.NTAXPRICE, ntaxprice);
  }

  /** ���ε��� **/
  public void setPk_batchcode(String pk_batchcode) {
    this.setAttributeValue(PraybillItemVO.PK_BATCHCODE, pk_batchcode);
  }

  /** �ɹ�Ա **/
  public void setPk_employee(String pk_employee) {
    this.setAttributeValue(PraybillItemVO.PK_EMPLOYEE, pk_employee);
  }

  /** �������� **/
  public void setPk_group(String pk_group) {
    this.setAttributeValue(PraybillItemVO.PK_GROUP, pk_group);
  }

  /** ����(VID) **/
  public void setPk_material(String pk_material) {
    this.setAttributeValue(PraybillItemVO.PK_MATERIAL, pk_material);
  }

  /** �����֯ **/
  public void setPk_org(String pk_org) {
    this.setAttributeValue(PraybillItemVO.PK_ORG, pk_org);
  }

  /** �����֯�汾 **/
  public void setPk_org_v(String pk_org_v) {
    this.setAttributeValue(PraybillItemVO.PK_ORG_V, pk_org_v);
  }

  /** �빺������_���� **/
  public void setPk_praybill(String pk_praybill) {
    this.setAttributeValue(PraybillItemVO.PK_PRAYBILL, pk_praybill);
  }

  /** �빺����ID **/
  public void setPk_praybill_b(String pk_praybill_b) {
    this.setAttributeValue(PraybillItemVO.PK_PRAYBILL_B, pk_praybill_b);
  }

  /** ��Ʒ **/
  public void setPk_product(String pk_product) {
    this.setAttributeValue(PraybillItemVO.PK_PRODUCT, pk_product);
  }

  /** ��Ʒ�汾 **/
  public void setPk_product_v(String pk_product_v) {
    this.setAttributeValue(PraybillItemVO.PK_PRODUCT_V, pk_product_v);
  }

  /** �ɹ���֯ **/
  public void setPk_purchaseorg(String pk_purchaseorg) {
    this.setAttributeValue(PraybillItemVO.PK_PURCHASEORG, pk_purchaseorg);
  }

  /** �ɹ���֯�汾 **/
  public void setPk_purchaseorg_v(String pk_purchaseorg_v) {
    this.setAttributeValue(PraybillItemVO.PK_PURCHASEORG_V, pk_purchaseorg_v);
  }

  /** ������ **/
  public void setPk_reqdept(String pk_reqdept) {
    this.setAttributeValue(PraybillItemVO.PK_REQDEPT, pk_reqdept);
  }

  /** �����Ű汾 **/
  public void setPk_reqdept_v(String pk_reqdept_v) {
    this.setAttributeValue(PraybillItemVO.PK_REQDEPT_V, pk_reqdept_v);
  }

  /** ԭʼ��������֯���°汾 **/
  public void setPk_reqstoorg(String pk_reqstoorg) {
    this.setAttributeValue(PraybillItemVO.PK_REQSTOORG, pk_reqstoorg);
  }

  /** ԭʼ��������֯ **/
  public void setPk_reqstoorg_v(String pk_reqstoorg_v) {
    this.setAttributeValue(PraybillItemVO.PK_REQSTOORG_V, pk_reqstoorg_v);
  }

  /** ����ֿ� **/
  public void setPk_reqstor(String pk_reqstor) {
    this.setAttributeValue(PraybillItemVO.PK_REQSTOR, pk_reqstor);
  }

  /** ����(OID) **/
  public void setPk_srcmaterial(String pk_srcmaterial) {
    this.setAttributeValue(PraybillItemVO.PK_SRCMATERIAL, pk_srcmaterial);
  }

  /** ���鹩Ӧ�� **/
  public void setPk_suggestsupplier(String pk_suggestsupplier) {
    this.setAttributeValue(PraybillItemVO.PK_SUGGESTSUPPLIER,
        pk_suggestsupplier);
  }

  /** ��Դ������TS setter ���� */
  public void setSourcebts(UFDateTime sourcebts) {
    this.setAttributeValue(OrderItemVO.SOURCEBTS, sourcebts);
  }

  /** ��Դ����TS setter ���� */
  public void setSourcets(UFDateTime sourcets) {
    this.setAttributeValue(OrderItemVO.SOURCETS, sourcets);
  }

  /** ʱ��� **/
  public void setTs(UFDateTime ts) {
    this.setAttributeValue(PraybillItemVO.TS, ts);
  }

  /** ���κ� **/
  public void setVbatchcode(String vbatchcode) {
    this.setAttributeValue(PraybillItemVO.VBATCHCODE, vbatchcode);
  }

  /** �Զ�����1 **/
  public void setVbdef1(String vbdef1) {
    this.setAttributeValue(PraybillItemVO.VBDEF1, vbdef1);
  }

  /** �Զ�����10 **/
  public void setVbdef10(String vbdef10) {
    this.setAttributeValue(PraybillItemVO.VBDEF10, vbdef10);
  }

  /** �Զ�����11 **/
  public void setVbdef11(String vbdef11) {
    this.setAttributeValue(PraybillItemVO.VBDEF11, vbdef11);
  }

  /** �Զ�����12 **/
  public void setVbdef12(String vbdef12) {
    this.setAttributeValue(PraybillItemVO.VBDEF12, vbdef12);
  }

  /** �Զ�����13 **/
  public void setVbdef13(String vbdef13) {
    this.setAttributeValue(PraybillItemVO.VBDEF13, vbdef13);
  }

  /** �Զ�����14 **/
  public void setVbdef14(String vbdef14) {
    this.setAttributeValue(PraybillItemVO.VBDEF14, vbdef14);
  }

  /** �Զ�����15 **/
  public void setVbdef15(String vbdef15) {
    this.setAttributeValue(PraybillItemVO.VBDEF15, vbdef15);
  }

  /** �Զ�����16 **/
  public void setVbdef16(String vbdef16) {
    this.setAttributeValue(PraybillItemVO.VBDEF16, vbdef16);
  }

  /** �Զ�����17 **/
  public void setVbdef17(String vbdef17) {
    this.setAttributeValue(PraybillItemVO.VBDEF17, vbdef17);
  }

  /** �Զ�����18 **/
  public void setVbdef18(String vbdef18) {
    this.setAttributeValue(PraybillItemVO.VBDEF18, vbdef18);
  }

  /** �Զ�����19 **/
  public void setVbdef19(String vbdef19) {
    this.setAttributeValue(PraybillItemVO.VBDEF19, vbdef19);
  }

  /** �Զ�����2 **/
  public void setVbdef2(String vbdef2) {
    this.setAttributeValue(PraybillItemVO.VBDEF2, vbdef2);
  }

  /** �Զ�����20 **/
  public void setVbdef20(String vbdef20) {
    this.setAttributeValue(PraybillItemVO.VBDEF20, vbdef20);
  }

  /** �Զ�����3 **/
  public void setVbdef3(String vbdef3) {
    this.setAttributeValue(PraybillItemVO.VBDEF3, vbdef3);
  }

  /** �Զ�����4 **/
  public void setVbdef4(String vbdef4) {
    this.setAttributeValue(PraybillItemVO.VBDEF4, vbdef4);
  }

  /** �Զ�����5 **/
  public void setVbdef5(String vbdef5) {
    this.setAttributeValue(PraybillItemVO.VBDEF5, vbdef5);
  }

  /** �Զ�����6 **/
  public void setVbdef6(String vbdef6) {
    this.setAttributeValue(PraybillItemVO.VBDEF6, vbdef6);
  }

  /** �Զ�����7 **/
  public void setVbdef7(String vbdef7) {
    this.setAttributeValue(PraybillItemVO.VBDEF7, vbdef7);
  }

  /** �Զ�����8 **/
  public void setVbdef8(String vbdef8) {
    this.setAttributeValue(PraybillItemVO.VBDEF8, vbdef8);
  }

  /** �Զ�����9 **/
  public void setVbdef9(String vbdef9) {
    this.setAttributeValue(PraybillItemVO.VBDEF9, vbdef9);
  }

  /** ��ע **/
  public void setVbmemo(String vmemo) {
    this.setAttributeValue(PraybillItemVO.VBMEMO, vmemo);
  }

  /** ������ **/
  public void setVchangerate(String vchangerate) {
    this.setAttributeValue(PraybillItemVO.VCHANGERATE, vchangerate);
  }

  /** Դͷ���ݺ� **/
  public void setVfirstcode(String vfirstcode) {
    this.setAttributeValue(PraybillItemVO.VFIRSTCODE, vfirstcode);
  }

  /** Դͷ�����к� **/
  public void setVfirstrowno(String vfirstrowno) {
    this.setAttributeValue(PraybillItemVO.VFIRSTROWNO, vfirstrowno);
  }

  /** Դͷ�������� **/
  public void setVfirsttrantype(String vfirsttrantype) {
    this.setAttributeValue(PraybillItemVO.VFIRSTTRANTYPE, vfirsttrantype);
  }

  /** ���ɸ�������1 **/
  public void setVfree1(String vfree1) {
    this.setAttributeValue(PraybillItemVO.VFREE1, vfree1);
  }

  /** ���ɸ�������10 **/
  public void setVfree10(String vfree10) {
    this.setAttributeValue(PraybillItemVO.VFREE10, vfree10);
  }

  /** ���ɸ�������2 **/
  public void setVfree2(String vfree2) {
    this.setAttributeValue(PraybillItemVO.VFREE2, vfree2);
  }

  /** ���ɸ�������3 **/
  public void setVfree3(String vfree3) {
    this.setAttributeValue(PraybillItemVO.VFREE3, vfree3);
  }

  /** ���ɸ�������4 **/
  public void setVfree4(String vfree4) {
    this.setAttributeValue(PraybillItemVO.VFREE4, vfree4);
  }

  /** ���ɸ�������5 **/
  public void setVfree5(String vfree5) {
    this.setAttributeValue(PraybillItemVO.VFREE5, vfree5);
  }

  /** ���ɸ�������6 **/
  public void setVfree6(String vfree6) {
    this.setAttributeValue(PraybillItemVO.VFREE6, vfree6);
  }

  /** ���ɸ�������7 **/
  public void setVfree7(String vfree7) {
    this.setAttributeValue(PraybillItemVO.VFREE7, vfree7);
  }

  /** ���ɸ�������8 **/
  public void setVfree8(String vfree8) {
    this.setAttributeValue(PraybillItemVO.VFREE8, vfree8);
  }

  /** ���ɸ�������9 **/
  public void setVfree9(String vfree9) {
    this.setAttributeValue(PraybillItemVO.VFREE9, vfree9);
  }

  /** ��Դ���ݺ� **/
  public void setVsourcecode(String vsourcecode) {
    this.setAttributeValue(PraybillItemVO.VSOURCECODE, vsourcecode);
  }

  /** ��Դ�����к� **/
  public void setVsourcerowno(String vsourcerowno) {
    this.setAttributeValue(PraybillItemVO.VSOURCEROWNO, vsourcerowno);
  }

  /** ��Դ�������� **/
  public void setVsrctrantypecode(String vsrctrantypecode) {
    this.setAttributeValue(PraybillItemVO.VSRCTRANTYPECODE, vsrctrantypecode);
  }
  
  
  
  //start <<<  add by zip 20191224 ����Զ����2����
  public static final String VBDEF21 = "vbdef21";
  public String getVbdef21() {
    return (String) this.getAttributeValue(PraybillItemVO.VBDEF21);
  }
  public void setVbdef21(String vbdef21) {
    this.setAttributeValue(PraybillItemVO.VBDEF21, vbdef21);
  }
  public static final String VBDEF22 = "vbdef22";
  public String getVbdef22() {
    return (String) this.getAttributeValue(PraybillItemVO.VBDEF22);
  }
  public void setVbdef22(String vbdef22) {
    this.setAttributeValue(PraybillItemVO.VBDEF22, vbdef22);
  }
  // >>> end
}
