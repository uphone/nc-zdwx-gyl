package nc.ui.ic.m45.action;

import nc.ui.ic.general.action.GeneralAddFromSourceAction;
import nc.ui.ic.general.util.CardNumValueController;
import nc.ui.ic.pub.util.UIBusiCalculator;
import nc.ui.pub.bill.BillCardPanel;
import nc.vo.ic.general.define.MetaNameConst;
import nc.vo.ic.pub.util.StringUtil;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.lang.UFDouble;
import nc.vo.scmpub.res.billtype.ITBillType;
import nc.vo.scmpub.res.billtype.POBillType;

import org.apache.commons.lang.ArrayUtils;

/**
 * 参照上游单据生成出入库单据的Action
 * 
 * @author songhy
 */
public class PurchaseInAddFromSourceAction extends GeneralAddFromSourceAction {

  private static final long serialVersionUID = 7236153870772736486L;

  public PurchaseInAddFromSourceAction() {
    super();
  }

  /**
   * 联动计算
   */
  private void calculate(int[] rows) {
    UIBusiCalculator cal = new UIBusiCalculator();
    BillCardPanel panel =
        this.getEditorModel().getICBizView().getBillCardPanel();
    cal.calc(panel, MetaNameConst.NQTORIGPRICE, rows);
  }

  private int[] getRows() {
    BillCardPanel panel =
        this.getEditorModel().getICBizView().getBillCardPanel();
    int rowcount = panel.getRowCount();
    if (rowcount == 0) {
      return null;
    }
    int[] rows = new int[rowcount];
    for (int i = 0; i < rowcount; i++) {
      rows[i] = i;
    }
    return rows;
  }

  private void processForJCK() {
    // 来源进口明细单
    if (StringUtil.isStringEqual(ITBillType.Detail.getCode(),
        this.getSourceBillType())) {
      int[] rows = this.getRows();
      if (ArrayUtils.isEmpty(rows)) {
        return;
      }
      this.calculate(rows);
    }
  }

  @Override
  protected void afterProcessor() {
    super.afterProcessor();
    this.processForJCK();
  }

  /**
   * 父类方法重写
   */
  @Override
  protected AggregatedValueObject[] processAfterVoChange(
      AggregatedValueObject[] bills) {
	  // comment by zip 20200516: 取消正数限制
//    new CardNumValueController().setLGValueRange(this.getEditorModel(),
//        new UFDouble(Double.MAX_VALUE));
    // 采购订单到采购入库表体不自动增行
    if (StringUtil.isStringEqual(POBillType.Order.getCode(),
        this.getSourceBillType())
        || StringUtil.isStringEqual(ITBillType.Detail.getCode(),
            this.getSourceBillType())) {
      this.getEditorModel().getICBizView().getBillCardPanel().getBodyPanel()
          .setAutoAddLine(false);
    }
    else {
      this.getEditorModel().getICBizView().getBillCardPanel().getBodyPanel()
          .setAutoAddLine(true);
    }
    return bills;
  }

}
