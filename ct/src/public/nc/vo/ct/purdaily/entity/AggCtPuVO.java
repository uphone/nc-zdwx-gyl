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
 * 该类是用于多子表的聚合VO 创建日期:2010-03-18 19:14:49 采购合同聚合VO
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
   * 方法功能描述：取得所有表体vo数组
   * <p>
   * <b>参数说明</b>
   * 
   * @param vo
   * @return <p>
   * @since 6.0
   * @author liuchx
   * @time 2010-6-1 下午09:01:34
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
   * 付款协议VO数组
   * 
   * @return
   */
  public CtPaymentVO[] getCtPaymentVO() {
    return (CtPaymentVO[]) super.getChildren(CtPaymentVO.class);
  }

  /**
   * 方法功能描述：取合同条款vo数组
   * <p>
   * <b>参数说明</b>
   * 
   * @return <p>
   * @since 6.0
   * @author liuchx
   * @time 2010-5-11 下午03:12:29
   */
  public PayPlanVO[] getCtPayPlanVO() {
    return (PayPlanVO[]) super.getChildren(PayPlanVO.class);
  }

  /**
   * 方法功能描述：方法功能描述：获得聚合vo的合同基本数组（）
   * <p>
   * <b>参数说明</b>
   * 
   * @return <p>
   * @since 6.0
   * @author liuchx
   * @time 2010-5-11 下午03:04:57
   */
  public CtPuBVO[] getCtPuBVO() {
    return (CtPuBVO[]) super.getChildrenVO();
  }

  /**
   * 方法功能描述：取合同变更vo数组
   * <p>
   * <b>参数说明</b>
   * 
   * @return <p>
   * @since 6.0
   * @author liuchx
   * @time 2010-5-11 下午03:05:09
   */
  public CtPuChangeVO[] getCtPuChangeVO() {
    return (CtPuChangeVO[]) this.getChildren(CtPuChangeVO.class);
  }

  /**
   * 方法功能描述：取合同执行数组
   * <p>
   * <b>参数说明</b>
   * 
   * @return <p>
   * @since 6.0
   * @author liuchx
   * @time 2010-5-11 下午03:11:11
   */
  public CtPuExecVO[] getCtPuExecVO() {
    return (CtPuExecVO[]) this.getChildren(CtPuExecVO.class);
  }

  /**
   * 方法功能描述：取合同费用vo数组
   * <p>
   * <b>参数说明</b>
   * 
   * @return <p>
   * @since 6.0
   * @author liuchx
   * @time 2010-5-11 下午03:11:36
   */
  public CtPuExpVO[] getCtPuExpVO() {
    return (CtPuExpVO[]) super.getChildren(CtPuExpVO.class);
  }

  /**
   * 方法功能描述：取合同大事记vo数组
   * <p>
   * <b>参数说明</b>
   * 
   * @return <p>
   * @since 6.0
   * @author liuchx
   * @time 2010-5-11 下午03:11:51
   */
  public CtPuMemoraVO[] getCtPuMemoraVO() {
    return (CtPuMemoraVO[]) super.getChildren(CtPuMemoraVO.class);
  }

  // @Override
  // public String getDefaultTableCode() {
  // return CtPuBVO.PK_CT_PU_B;
  // }

  /**
   * 取付款计划VO数组
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
   * 重载获得表头方法，避免繁琐的转型 父类方法重写
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
    // 将基本页签换到tableCodes[0]的位置
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
   * 方法功能描述：付款协议
   * <p>
   * <b>参数说明</b>
   * 
   * @param children
   *          <p>
   * @since 6.35
   * @author gaorw5
   * @time 2015-1-19 下午4:55:44
   */
  public void setCtPaymentVO(ISuperVO[] children) {
    super.setChildren(CtPaymentVO.class, children);
  }

  /**
   * 付款计划
   * 
   * @param children
   */
  public void setCtPayPlanVO(ISuperVO[] children) {
    super.setChildren(PayPlanVO.class, children);
  }

  /**
   * 方法功能描述：设置表体"合同基本"
   * <p>
   * <b>参数说明</b>
   * 
   * @param children
   *          <p>
   * @since 6.0
   * @author liuchx
   * @time 2010-5-25 上午10:52:02
   */
  public void setCtPuBVO(ISuperVO[] children) {
    super.setChildren(CtPuBVO.class, children);
  }

  /**
   * 方法功能描述：合同表更历史
   * <p>
   * <b>参数说明</b>
   * 
   * @param children
   *          <p>
   * @since 6.0
   * @author liuchx
   * @time 2010-5-25 上午11:00:42
   */
  public void setCtPuChangeVO(ISuperVO[] children) {
    super.setChildren(CtPuChangeVO.class, children);
  }

  /**
   * 方法功能描述：合同执行过程
   * <p>
   * <b>参数说明</b>
   * 
   * @param children
   *          <p>
   * @since 6.0
   * @author liuchx
   * @time 2010-5-25 上午11:00:55
   */
  public void setCtPuExecVO(ISuperVO[] children) {
    super.setChildren(CtPuExecVO.class, children);
  }

  /**
   * 合同 方法功能描述：合同费用
   * <p>
   * <b>参数说明</b>
   * 
   * @param children
   *          <p>
   * @since 6.0
   * @author liuchx
   * @time 2010-5-25 上午10:59:57
   */
  public void setCtPuExpVO(ISuperVO[] children) {
    super.setChildren(CtPuExpVO.class, children);
  }

  /**
   * 方法功能描述：合同合同大事记
   * <p>
   * <b>参数说明</b>
   * 
   * @param children
   *          <p>
   * @since 6.0
   * @author liuchx
   * @time 2010-5-25 上午11:00:23
   */
  public void setCtPuMemoraVO(ISuperVO[] children) {
    super.setChildren(CtPuMemoraVO.class, children);
  }

  /**
   * 方法功能描述："合同条款"
   * <p>
   * <b>参数说明</b>
   * 
   * @param children
   *          <p>
   * @since 6.0
   * @author liuchx
   * @time 2010-5-25 上午10:59:35
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
