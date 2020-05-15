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
 * <b>�ɹ���ⵥ�޸İ�ť</b>
 * <ul>
 * <li>
 * </ul>
 * <p>
 * <p>
 * 
 * @version 6.0
 * @since 6.0
 * @author songhy
 * @time 2010-11-8 ����02:07:28
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
      // ���֮ǰ��������ƻ�����������Сֵ�Ѿ�����Ϊ0,������Ҫ�������ã���Сֵ������UDdouble���ֶα���һ��
      UIRefPane uiref =
          (UIRefPane) this.getEditorModel().getCardPanelWrapper()
              .getBodyItem(MetaNameConst.NNETPRICE).getComponent();

      new CardNumValueController().setLEValueRange(this.getEditorModel(),
          new UFDouble(uiref.getMinValue()));
    }
    else {
    	// comment by zip 20200516: ȡ����������
//      new CardNumValueController().setLGValueRange(this.getEditorModel(),
//          new UFDouble(Double.MAX_VALUE));
    }
  }
}
