package nc.bs.pu.m21.maintain.rule;

import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.pu.m21.entity.OrderItemVO;
import nc.vo.pu.m21.entity.OrderVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.pubapp.pattern.pub.MathTool;

/**
 * @description
 *              �ɹ��������ۡ������ĺϷ���У��
 * @scene
 *        �ɹ����������޸�
 * @param ��
 * @since 6.3
 * @version 2014-10-22 ����11:26:38
 * @author luojw
 */
public class NumAndPriceCheckRule implements IRule<OrderVO> {

  @Override
  public void process(OrderVO[] vos) {
    StringBuilder sb = new StringBuilder();
    for (OrderVO vo : vos) {
      String err = this.check(vo);
      if (err.length() > 0) {
        sb.append("\n").append(err);
      }
    }
    if (sb.length() > 0) {
      sb.insert(
          0,
          nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("4004030_0",
              "04004030-0127")/* @res "���������򵥼۲���ȷ��" */);
      ExceptionUtils.wrappBusinessException(sb.toString());
    }
  }

  /**
   * ������������������VO��飺1���˻�������������Ϊ����2������������������Ϊ����3�����۲���Ϊ������Ʒ�С�������ۿ������ϵĵ�������Ϊ0����
   * <p>
   * <b>����˵��</b>
   * 
   * @param vo Ҫ���Ķ���VO
   * @return ������δͨ�������ش�����Ϣ�ַ�����������ͨ�������ؿ��ַ���
   *         <p>
   * @since 6.0
   * @author duy
   * @time 2010-3-4 ����06:24:26
   */
  private String check(OrderVO vo) {
    OrderItemVO[] items = vo.getBVO();
    StringBuilder sb = new StringBuilder();
    boolean isReturn = UFBoolean.TRUE.equals(vo.getHVO().getBreturn());
    for (OrderItemVO item : items) {
    	if(item.getStatus()==3){
    		continue;
    	}
      // ��ס��ǰbuffer�Ĵ�С���������ѭ�����쳣���������λ�ò��� ��{0}�У�
      int offset = sb.length();

      if (isReturn && UFDouble.ZERO_DBL.compareTo(item.getNnum()) < 0) {
        sb.append(
            nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("4004030_0",
                "04004030-0128")/* @res "[�˻�������������Ϊ��]" */).append(",");
      }
      else if (!isReturn && UFDouble.ZERO_DBL.compareTo(item.getNnum()) > 0) {
        sb.append(
            nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("4004030_0",
                "04004030-0129")/* @res "[����������������Ϊ��]" */).append(",");
      }
      int sign =
          UFDouble.ZERO_DBL
              .compareTo(item.getNorigtaxprice() == null ? UFDouble.ZERO_DBL
                  : item.getNorigtaxprice());
      int signNet =
          UFDouble.ZERO_DBL
              .compareTo(item.getNorigtaxnetprice() == null ? UFDouble.ZERO_DBL
                  : item.getNorigtaxnetprice());
      if (sign > 0 || signNet > 0) {
//        sb.append(
//            nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("4004030_0",
//                "04004030-0130")/* @res "[���۲���Ϊ��]" */).append(",");
      }
      else if ((sign == 0 || signNet == 0)
          && UFBoolean.FALSE.equals(item.getBlargess())) {
        sb.append(
            nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("4004030_0",
                "04004030-0131")/* @res "[���۲���Ϊ��]" */).append(",");
      }

      sign =
          UFDouble.ZERO_DBL
              .compareTo(item.getNqtorigtaxprice() == null ? UFDouble.ZERO_DBL
                  : item.getNqtorigtaxprice());
      signNet =
          UFDouble.ZERO_DBL
              .compareTo(item.getNqtorigtaxnetprc() == null ? UFDouble.ZERO_DBL
                  : item.getNqtorigtaxnetprc());
      if (sign > 0 || signNet > 0) {
//        sb.append(
//            nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("4004030_0",
//                "04004030-0130")/* @res "[���۲���Ϊ��]" */).append(",");
      }
      else if ((sign == 0 || signNet == 0)
          && UFBoolean.FALSE.equals(item.getBlargess())) {
        sb.append(
            nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("4004030_0",
                "04004030-0131")/* @res "[���۲���Ϊ��]" */).append(",");
      }

      sign = MathTool.compareTo(UFDouble.ZERO_DBL, item.getNtaxrate());
      if (sign > 0) {
        sb.append(
            nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("4004030_0",
                "04004030-0132")/* @res "[˰�ʲ���Ϊ��]" */).append(",");
      }

      sign = MathTool.compareTo(UFDouble.ZERO_DBL, item.getNexchangerate());
      if (sign >= 0) {
        sb.append(
            nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("4004030_0",
                "04004030-0133")/* @res "[�۱����ʲ���Ϊ0���߸�]" */).append(",");
      }

      if (sb.length() > 1) {
        // ����ѭ���з����쳣�����쳣��ʾǰ���� ��{0}�У� ������
        sb.insert(offset, nc.vo.ml.NCLangRes4VoTransl.getNCLangRes()
            .getStrByID("4004030_0", "04004030-0361", null, new String[] {
              item.getCrowno()
            })/* @res "��{0}�У�" */);

        // ɾ�����Ķ���
        sb.deleteCharAt(sb.length() - 1);
        sb.append("\n");
      }
    }

    return sb.toString();
  }

}
