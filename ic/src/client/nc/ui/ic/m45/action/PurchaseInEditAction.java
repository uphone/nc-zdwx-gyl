package nc.ui.ic.m45.action;

import java.awt.event.ActionEvent;

import nc.ui.ic.general.action.GeneralEditAction;
import nc.ui.ic.general.util.CardNumValueController;
import nc.ui.pub.beans.UIRefPane;
import nc.vo.ic.general.define.MetaNameConst;
import nc.vo.ic.m45.entity.PurchaseInHeadVO;
import nc.vo.ic.pub.util.ValueCheckUtil;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDouble;

/**
 * <p>
 * <b>采购入库单修改按钮</b>
 * <ul>
 * <li>
 * </ul>
 * <p>
 * <p>
 * 
 * @version 6.0
 * @since 6.0
 * @author songhy
 * @time 2010-11-8 下午02:07:28
 */
public class PurchaseInEditAction extends GeneralEditAction {
  private static final long serialVersionUID = 7400727128507932164L;

  @Override
  public void doAction(ActionEvent e) throws Exception {
    super.doAction(e);

    UFBoolean freplenishflag =
        this.getEditorModel().getCardPanelWrapper()
            .getHeadValue_UFBoolean(PurchaseInHeadVO.FREPLENISHFLAG);

    if (ValueCheckUtil.isTrue(freplenishflag)) {
      // 如果之前点击过自制或者拉单，最小值已经设置为0,这里需要重新设置，最小值与其他UDdouble的字段保持一致
      UIRefPane uiref =
          (UIRefPane) this.getEditorModel().getCardPanelWrapper()
              .getBodyItem(MetaNameConst.NNETPRICE).getComponent();

      new CardNumValueController().setLEValueRange(this.getEditorModel(),
          new UFDouble(uiref.getMinValue()));
    }
    else {
    	// comment by zip 20200516: 取消正数限制
//      new CardNumValueController().setLGValueRange(this.getEditorModel(),
//          new UFDouble(Double.MAX_VALUE));
    }
  }
}
