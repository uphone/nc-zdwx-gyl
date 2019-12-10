package nc.vo.ct.purdaily.entity;

import java.util.ArrayList;
import java.util.List;

import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.ISuperVO;
import nc.vo.pub.SuperVO;
import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

/**
 * ���������ڶ��ӱ�ľۺ�VO ��������:2010-03-18 19:14:49 �ɹ���ͬ�ۺ�VO
 * 
 * @author lizhengb
 * @version
 */
@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.ct.purdaily.entity.CtPuVO")
public class AggCtPuVO extends AbstractBill {

  /**
   * 
   */
  private static final long serialVersionUID = -7158467869268301141L;

  /**
   * ��������������ȡ�����б���vo����
   * <p>
   * <b>����˵��</b>
   * 
   * @param vo
   * @return <p>
   * @since 6.0
   * @author liuchx
   * @time 2010-6-1 ����09:01:34
   */
  public SuperVO[][] getAllChildren() {
    List<SuperVO[]> allChildren = new ArrayList<SuperVO[]>();
    allChildren.add(this.getCtPuBVO());
    allChildren.add(this.getCtPuChangeVO());
    allChildren.add(this.getCtPuExecVO());
    allChildren.add(this.getCtPuTermVO());
    allChildren.add(this.getCtPuExpVO());
    allChildren.add(this.getCtPuMemoraVO());
    allChildren.add(this.getCtPayPlanVO());
    allChildren.add(this.getCtPaymentVO());
    return allChildren.toArray(new SuperVO[0][0]);
  }

  @Override
  public CircularlyAccessibleValueObject[] getAllChildrenVO() {
    return super.getChildrenVO();
  }

  public CtPuBVO getChildByRow(int row) {
    CtPuBVO[] children = this.getCtPuBVO();
    return children[row];
  }

  /**
   * ����Э��VO����
   * 
   * @return
   */
  public CtPaymentVO[] getCtPaymentVO() {
    return (CtPaymentVO[]) super.getChildren(CtPaymentVO.class);
  }

  /**
   * ��������������ȡ��ͬ����vo����
   * <p>
   * <b>����˵��</b>
   * 
   * @return <p>
   * @since 6.0
   * @author liuchx
   * @time 2010-5-11 ����03:12:29
   */
  public PayPlanVO[] getCtPayPlanVO() {
    return (PayPlanVO[]) super.getChildren(PayPlanVO.class);
  }

  /**
   * ������������������������������þۺ�vo�ĺ�ͬ�������飨��
   * <p>
   * <b>����˵��</b>
   * 
   * @return <p>
   * @since 6.0
   * @author liuchx
   * @time 2010-5-11 ����03:04:57
   */
  public CtPuBVO[] getCtPuBVO() {
    return (CtPuBVO[]) super.getChildrenVO();
  }

  /**
   * ��������������ȡ��ͬ���vo����
   * <p>
   * <b>����˵��</b>
   * 
   * @return <p>
   * @since 6.0
   * @author liuchx
   * @time 2010-5-11 ����03:05:09
   */
  public CtPuChangeVO[] getCtPuChangeVO() {
    return (CtPuChangeVO[]) this.getChildren(CtPuChangeVO.class);
  }

  /**
   * ��������������ȡ��ִͬ������
   * <p>
   * <b>����˵��</b>
   * 
   * @return <p>
   * @since 6.0
   * @author liuchx
   * @time 2010-5-11 ����03:11:11
   */
  public CtPuExecVO[] getCtPuExecVO() {
    return (CtPuExecVO[]) this.getChildren(CtPuExecVO.class);
  }

  /**
   * ��������������ȡ��ͬ����vo����
   * <p>
   * <b>����˵��</b>
   * 
   * @return <p>
   * @since 6.0
   * @author liuchx
   * @time 2010-5-11 ����03:11:36
   */
  public CtPuExpVO[] getCtPuExpVO() {
    return (CtPuExpVO[]) super.getChildren(CtPuExpVO.class);
  }

  /**
   * ��������������ȡ��ͬ���¼�vo����
   * <p>
   * <b>����˵��</b>
   * 
   * @return <p>
   * @since 6.0
   * @author liuchx
   * @time 2010-5-11 ����03:11:51
   */
  public CtPuMemoraVO[] getCtPuMemoraVO() {
    return (CtPuMemoraVO[]) super.getChildren(CtPuMemoraVO.class);
  }

  // @Override
  // public String getDefaultTableCode() {
  // return CtPuBVO.PK_CT_PU_B;
  // }

  /**
   * ȡ����ƻ�VO����
   * 
   * @return
   */
  public CtPuTermVO[] getCtPuTermVO() {
    return (CtPuTermVO[]) super.getChildren(CtPuTermVO.class);
  }

  @Override
  public IBillMeta getMetaData() {
    IBillMeta billMeta =
        BillMetaFactory.getInstance().getBillMeta(PuManageMeta.class);
    return billMeta;
  }

  /**
   * ���ػ�ñ�ͷ���������ⷱ����ת�� ���෽����д
   * 
   * @see nc.vo.pubapp.pattern.model.entity.bill.AbstractBill#getParentVO()
   */
  @Override
  public CtPuVO getParentVO() {
    return (CtPuVO) super.getParentVO();
  }

  // @Override
  // public String[] getTableNames() {
  // return new String[] {
  // CtPuTableCode.CTPUB_TABLE, CtPuTableCode.CTPUTERM_TABLE,
  // CtPuTableCode.CTPUEXP_TABLE, CtPuTableCode.CTPUMEMORA_TABLE,
  // CtPuTableCode.CTPUCHANGE_TABLE, CtPuTableCode.CTPUEXEC_TABLE,
  // CtPuTableCode.CTPAYPLAN_TABLE
  // };
  // }
  //
  // @Override
  // public CircularlyAccessibleValueObject[] getTableVO(String tableCode) {
  // if ("pk_ct_pu_b".equalsIgnoreCase(tableCode)
  // || "ct_pu_b".equalsIgnoreCase(tableCode)) {
  // return this.getCtPuBVO();
  // }
  // return null;
  // }

  @Override
  public String[] getTableCodes() {
    String[] tableCodes = super.getTableCodes();
    // ������ҳǩ����tableCodes[0]��λ��
    for (int i = 0, length = tableCodes.length; i < length; i++) {
      if (CtPuBVO.PK_CT_PU_B.equals(tableCodes[i])) {
        tableCodes[i] = tableCodes[0];
        tableCodes[0] = CtPuBVO.PK_CT_PU_B;
        break;
      }
    }
    return tableCodes;
  }

  /**
   * ������������������Э��
   * <p>
   * <b>����˵��</b>
   * 
   * @param children
   *          <p>
   * @since 6.35
   * @author gaorw5
   * @time 2015-1-19 ����4:55:44
   */
  public void setCtPaymentVO(ISuperVO[] children) {
    super.setChildren(CtPaymentVO.class, children);
  }

  /**
   * ����ƻ�
   * 
   * @param children
   */
  public void setCtPayPlanVO(ISuperVO[] children) {
    super.setChildren(PayPlanVO.class, children);
  }

  /**
   * �����������������ñ���"��ͬ����"
   * <p>
   * <b>����˵��</b>
   * 
   * @param children
   *          <p>
   * @since 6.0
   * @author liuchx
   * @time 2010-5-25 ����10:52:02
   */
  public void setCtPuBVO(ISuperVO[] children) {
    super.setChildren(CtPuBVO.class, children);
  }

  /**
   * ����������������ͬ�����ʷ
   * <p>
   * <b>����˵��</b>
   * 
   * @param children
   *          <p>
   * @since 6.0
   * @author liuchx
   * @time 2010-5-25 ����11:00:42
   */
  public void setCtPuChangeVO(ISuperVO[] children) {
    super.setChildren(CtPuChangeVO.class, children);
  }

  /**
   * ����������������ִͬ�й���
   * <p>
   * <b>����˵��</b>
   * 
   * @param children
   *          <p>
   * @since 6.0
   * @author liuchx
   * @time 2010-5-25 ����11:00:55
   */
  public void setCtPuExecVO(ISuperVO[] children) {
    super.setChildren(CtPuExecVO.class, children);
  }

  /**
   * ��ͬ ����������������ͬ����
   * <p>
   * <b>����˵��</b>
   * 
   * @param children
   *          <p>
   * @since 6.0
   * @author liuchx
   * @time 2010-5-25 ����10:59:57
   */
  public void setCtPuExpVO(ISuperVO[] children) {
    super.setChildren(CtPuExpVO.class, children);
  }

  /**
   * ����������������ͬ��ͬ���¼�
   * <p>
   * <b>����˵��</b>
   * 
   * @param children
   *          <p>
   * @since 6.0
   * @author liuchx
   * @time 2010-5-25 ����11:00:23
   */
  public void setCtPuMemoraVO(ISuperVO[] children) {
    super.setChildren(CtPuMemoraVO.class, children);
  }

  /**
   * ��������������"��ͬ����"
   * <p>
   * <b>����˵��</b>
   * 
   * @param children
   *          <p>
   * @since 6.0
   * @author liuchx
   * @time 2010-5-25 ����10:59:35
   */
  public void setCtPuTermVO(ISuperVO[] children) {
    super.setChildren(CtPuTermVO.class, children);
  }

  // @Override
  // public void setTableVO(String tableCode,
  // CircularlyAccessibleValueObject[] values) {
  // if ("pk_ct_pu_b".equalsIgnoreCase(tableCode)
  // || "ct_pu_b".equalsIgnoreCase(tableCode)) {
  // this.setCtPuBVO((CtPuBVO[]) values);
  // }
  // }
}
