package nc.vo.pu.m21.rule;

import nc.vo.pu.m21.entity.OrderHeaderVO;
import nc.vo.pu.m21.entity.OrderItemVO;
import nc.vo.pu.pub.util.IKeyValue;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.data.ValueUtils;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.pubapp.pattern.pub.MathTool;

/**
 * <p>
 * <b>������Ҫ������¹��ܣ�</b>
 * <ul>
 * <li>������������ۡ���˰�ʡ�����
 * </ul>
 * <p>
 * <p>
 * 
 * @version 6.0
 * @since 6.0
 * @author wuxla
 * @time 2010-3-23 ����01:54:49
 */
public class ValueCheck {
  private IKeyValue keyValue;

  private UFDouble oldValue;

  public ValueCheck(IKeyValue keyValue, UFDouble oldValue) {
    this.keyValue = keyValue;
    this.oldValue = oldValue;
  }

  /**
   * ��������������������������ۡ���˰�ʡ����ʡ�
   * <p>
   * <b>����˵��</b>
   * 
   * @param row
   * @param key
   *          <p>
   * @since 6.0
   * @author wuxla
   * @time 2010-3-23 ����01:58:36
   */
  public void checkValue(int row, String itemKey) {

    if (OrderItemVO.NASTNUM.equals(itemKey) || OrderItemVO.NNUM.equals(itemKey)
        || OrderItemVO.NQTUNITNUM.equals(itemKey)) {
      // ����
      this.checkNum(row, itemKey);
    }
    else if (OrderItemVO.NTAXRATE.equals(itemKey)) {
      // ˰��
      this.checkNTaxRate(row);
    }
    else if (OrderItemVO.NNOSUBTAXRATE.equals(itemKey)) {
      // ���ɵֿ�˰��
      this.checkNoSubTaxRate(row);
    }
    else if (OrderItemVO.NQTORIGPRICE.equals(itemKey)) {
      // ����ԭ����˰����
//      this.checkNqtorigprice(row);
    }
    else if (OrderItemVO.NQTORIGTAXPRICE.equals(itemKey)) {
      // ����ԭ�Һ�˰����
//      this.checkNqtorigtaxprice(row);
    }
    else if (OrderItemVO.NITEMDISCOUNTRATE.equals(itemKey)) {
      // ��Ʒ�ۿ���
      this.checkNitemdiscountrate(row);
    }
    else if (OrderItemVO.NORIGTAXNETPRICE.equals(itemKey)) {
      // ����λԭ�Һ�˰����
      this.checkNorigtaxnetprice(row);
    }
    else if (OrderItemVO.NORIGPRICE.equals(itemKey)) {
      // ����λԭ����˰����
      this.checkNorigprice(row);
    }
  }

  /**
   * ����������������Ʒ�ۿ��ʡ�
   * <p>
   * <b>����˵��</b>
   * 
   * @param row
   *          <p>
   * @since 6.0
   * @author wuxla
   * @time 2010-3-23 ����03:16:00
   */
  private void checkNitemdiscountrate(int row) {
    UFDouble nitemdiscountrate =
        (UFDouble) this.keyValue.getBodyValue(row,
            OrderItemVO.NITEMDISCOUNTRATE);
    if (MathTool.compareTo(nitemdiscountrate, UFDouble.ZERO_DBL) < 0) {
      this.keyValue.setBodyValue(row, OrderItemVO.NITEMDISCOUNTRATE,
          this.oldValue);
      ExceptionUtils.wrappBusinessException(nc.vo.ml.NCLangRes4VoTransl
          .getNCLangRes().getStrByID("4004030_0", "04004030-0199")/*
                                                                   * @res
                                                                   * "��Ʒ�ۿ��ʲ���С��0"
                                                                   */);
    }
  }

  /**
   * ������������������λԭ����˰���ۡ�
   * <p>
   * <b>����˵��</b>
   * 
   * @param row
   *          <p>
   * @since 6.0
   * @author wuxla
   * @time 2010-3-24 ����08:12:22
   */
  private void checkNorigprice(int row) {
    UFDouble nitemdiscountrate =
        (UFDouble) this.keyValue.getBodyValue(row, OrderItemVO.NORIGPRICE);
    if (MathTool.compareTo(nitemdiscountrate, UFDouble.ZERO_DBL) < 0) {
      this.keyValue.setBodyValue(row, OrderItemVO.NORIGPRICE, this.oldValue);
      ExceptionUtils.wrappBusinessException(nc.vo.ml.NCLangRes4VoTransl
          .getNCLangRes().getStrByID("4004030_0", "04004030-0200")/*
                                                                   * @res
                                                                   * "����λԭ����˰���۲���С��0"
                                                                   */);
    }
  }

  /**
   * ������������������λԭ�Һ�˰���ۡ�
   * <p>
   * <b>����˵��</b>
   * 
   * @param row
   *          <p>
   * @since 6.0
   * @author wuxla
   * @time 2010-3-24 ����08:09:59
   */
  private void checkNorigtaxnetprice(int row) {
    UFDouble nitemdiscountrate =
        (UFDouble) this.keyValue
            .getBodyValue(row, OrderItemVO.NORIGTAXNETPRICE);
    if (MathTool.compareTo(nitemdiscountrate, UFDouble.ZERO_DBL) < 0) {
      this.keyValue.setBodyValue(row, OrderItemVO.NORIGTAXNETPRICE,
          this.oldValue);
      ExceptionUtils.wrappBusinessException(nc.vo.ml.NCLangRes4VoTransl
          .getNCLangRes().getStrByID("4004030_0", "04004030-0201")/*
                                                                   * @res
                                                                   * "����λԭ�Һ�˰���۲���С��0"
                                                                   */);
    }
  }

  private void checkNoSubTaxRate(int row) {
    UFDouble ntaxrate =
        (UFDouble) this.keyValue.getBodyValue(row, OrderItemVO.NNOSUBTAXRATE);
    if (MathTool.compareTo(ntaxrate, UFDouble.ZERO_DBL) < 0) {
      this.keyValue.setBodyValue(row, OrderItemVO.NNOSUBTAXRATE, this.oldValue);
      ExceptionUtils.wrappBusinessException(nc.vo.ml.NCLangRes4VoTransl
          .getNCLangRes().getStrByID("4004030_0", "04004030-0355")/*
                                                                   * @res
                                                                   * "���ɵֿ�˰�ʲ���С��0"
                                                                   */);
    }
  }

  /**
   * ������������������ԭ����˰���ۡ�
   * <p>
   * <b>����˵��</b>
   * 
   * @param row
   *          <p>
   * @since 6.0
   * @author wuxla
   * @time 2010-3-23 ����03:11:55
   */
  private void checkNqtorigprice(int row) {
    UFDouble nqtorigprice =
        (UFDouble) this.keyValue.getBodyValue(row, OrderItemVO.NQTORIGPRICE);
    if (MathTool.compareTo(nqtorigprice, UFDouble.ZERO_DBL) < 0) {
      this.keyValue.setBodyValue(row, OrderItemVO.NQTORIGPRICE, this.oldValue);
      ExceptionUtils.wrappBusinessException(nc.vo.ml.NCLangRes4VoTransl
          .getNCLangRes().getStrByID("4004030_0", "04004030-0202")/*
                                                                   * @res
                                                                   * "��˰���۲���С��0"
                                                                   */);
    }
  }

  /**
   * ������������������ԭ�Һ�˰���ۡ�
   * <p>
   * <b>����˵��</b>
   * 
   * @param row
   *          <p>
   * @since 6.0
   * @author wuxla
   * @time 2010-3-23 ����03:12:38
   */
  private void checkNqtorigtaxprice(int row) {
    UFDouble nqtorigtaxprice =
        (UFDouble) this.keyValue.getBodyValue(row, OrderItemVO.NQTORIGTAXPRICE);
    if (MathTool.compareTo(nqtorigtaxprice, UFDouble.ZERO_DBL) < 0) {
      this.keyValue.setBodyValue(row, OrderItemVO.NQTORIGTAXPRICE,
          this.oldValue);
      ExceptionUtils.wrappBusinessException(nc.vo.ml.NCLangRes4VoTransl
          .getNCLangRes().getStrByID("4004030_0", "04004030-0203")/*
                                                                   * @res
                                                                   * "��˰���۲���С��0"
                                                                   */);
    }
  }

  /**
   * ��������������˰�ʼ�顣
   * <p>
   * <b>����˵��</b>
   * 
   * @param row
   *          <p>
   * @since 6.0
   * @author wuxla
   * @time 2010-3-23 ����03:06:01
   */
  private void checkNTaxRate(int row) {
    UFDouble nheadTaxRate =
        (UFDouble) this.keyValue.getHeadValue(OrderHeaderVO.NHTAXRATE);
    UFDouble ntaxrate =
        (UFDouble) this.keyValue.getBodyValue(row, OrderItemVO.NTAXRATE);
    if (MathTool.compareTo(nheadTaxRate, UFDouble.ZERO_DBL) < 0
        || MathTool.compareTo(ntaxrate, UFDouble.ZERO_DBL) < 0) {
    	this.keyValue.setHeadValue(OrderHeaderVO.NHTAXRATE, null);
      this.keyValue.setBodyValue(row, OrderItemVO.NTAXRATE, this.oldValue);
      ExceptionUtils.wrappBusinessException(nc.vo.ml.NCLangRes4VoTransl
          .getNCLangRes().getStrByID("4004030_0", "04004030-0204")/*
                                                                   * @res
                                                                   * "˰�ʲ���С��0"
                                                                   */);
    }
  }

  /**
   * ��������������������顣
   * <p>
   * <b>����˵��</b>
   * 
   * @param row
   * @param numKey
   *          <p>
   * @since 6.0
   * @author wuxla
   * @time 2010-3-23 ����02:08:42
   */
  private void checkNum(int row, String numKey) {
    UFBoolean breturn =
        ValueUtils.getUFBoolean(this.keyValue
            .getHeadValue(OrderHeaderVO.BRETURN));
    UFDouble num = (UFDouble) this.keyValue.getBodyValue(row, numKey);
    if (MathTool.compareTo(num, UFDouble.ZERO_DBL) > 0
        && breturn.booleanValue()) {
      this.keyValue.setBodyValue(row, numKey, this.oldValue);
      ExceptionUtils.wrappBusinessException(nc.vo.ml.NCLangRes4VoTransl
          .getNCLangRes().getStrByID("4004030_0", "04004030-0197")/*
                                                                   * @res
                                                                   * "�˻�����������������Ϊ��"
                                                                   */);
    }
    else if (MathTool.compareTo(num, UFDouble.ZERO_DBL) < 0
        && !breturn.booleanValue()) {
      this.keyValue.setBodyValue(row, numKey, this.oldValue);
      ExceptionUtils.wrappBusinessException(nc.vo.ml.NCLangRes4VoTransl
          .getNCLangRes().getStrByID("4004030_0", "04004030-0198")/*
                                                                   * @res
                                                                   * "���˻�����������������Ϊ��"
                                                                   */);
    }
  }
}
