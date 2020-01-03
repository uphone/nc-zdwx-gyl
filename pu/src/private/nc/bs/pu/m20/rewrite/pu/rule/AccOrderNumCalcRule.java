/**
 * $�ļ�˵��$
 * 
 * @author GGR
 * @version 6.0
 * @see
 * @since 6.0
 * @time 2010-3-23 ����04:53:36
 */
package nc.bs.pu.m20.rewrite.pu.rule;

import java.util.Map;

import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.pu.m20.entity.PraybillViewVO;
import nc.vo.pu.m20.entity.writeback.OrderWriteBackVO;
import nc.vo.pu.pub.util.CirVOUtil;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.pubapp.pattern.pub.MathTool;

/**
 * @description
 *              �빺�������ۼ�����
 * @scene
 *        �빺����д��������
 * @param
 *        OrderWriteBackVO[] wbVos ��д����VO
 * @since 6.3
 * @version 2014-10-21 ����10:19:56
 * @author yanxm5
 */
public class AccOrderNumCalcRule implements IRule<PraybillViewVO> {

  /** ��д����VO **/
  private final OrderWriteBackVO[] wbVos;

  public AccOrderNumCalcRule(OrderWriteBackVO[] wbVos) {
    this.wbVos = wbVos;
  }

  @Override
  public void process(PraybillViewVO[] views) {
    Map<String, PraybillViewVO> viewMap = CirVOUtil.createKeyVOMap(views);
    for (OrderWriteBackVO vo : this.wbVos) {
      PraybillViewVO view = viewMap.get(vo.getPk_praybill_b());
      UFDouble diffNum = vo.getDiffNum();
      UFDouble newAccNum = MathTool.add(view.getNaccumulatenum(), diffNum);
   // update by zip: 2020-01-03 ��������Դ�ڸ����빺���Ĳɹ�����
//      if (newAccNum.compareTo(UFDouble.ZERO_DBL) < 0) {
//        ExceptionUtils.wrappBusinessException(nc.vo.ml.NCLangRes4VoTransl
//            .getNCLangRes().getStrByID("4004020_0", "04004020-0118")/*
//                                                                     * @res
//                                                                     * "��Դ���빺���Ĳɹ�����������������Ϊ����"
//                                                                     */);
//      }
      view.setNaccumulatenum(newAccNum);
    }
  }

}
