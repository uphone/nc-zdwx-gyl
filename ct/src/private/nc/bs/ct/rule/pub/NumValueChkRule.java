package nc.bs.ct.rule.pub;

import nc.bs.ml.NCLangResOnserver;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.itf.scmpub.reference.uap.group.SysInitGroupQuery;
import nc.vo.ct.entity.CtAbstractBVO;
import nc.vo.ct.entity.CtAbstractVO;
import nc.vo.ct.purdaily.entity.CtPuBVO;
import nc.vo.ct.uitl.ValueUtil;
import nc.vo.pub.VOStatus;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.data.ValueUtils;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;
import nc.vo.pubapp.pattern.pub.MathTool;

import org.apache.commons.lang.SystemUtils;

/**
 * @description 数值型属性检查
 * @scene 采购合同新增BP、修改BP、变更保存；销售合同新增BP、修改BP、变更保存；其它收合同新增BP、修改BP、变更保存；
 *        其它付合同新增BP、修改BP、变更保存
 * @param 无
 * @since 6.0
 * @version 2011-1-4 上午11:55:59
 * @author lizhengb
 */
public class NumValueChkRule<T extends IBill> implements IRule<T> {

  @Override
  public void process(T[] vos) {
    StringBuffer errorBuffer = new StringBuffer();
    for (T vo : vos) {
      AbstractBill billvo = (AbstractBill) vo;
      CtAbstractVO headerVO = (CtAbstractVO) billvo.getParentVO();
      StringBuffer headerErrors = this.checkHeaderVO(headerVO);
      if (headerErrors.length() > 0) {
        errorBuffer.append(headerErrors);
        errorBuffer.append(SystemUtils.LINE_SEPARATOR);
      }
      CtAbstractBVO[] itemVOs = (CtAbstractBVO[]) billvo.getChildrenVO();
      for (CtAbstractBVO itemVO : itemVOs) {
        // 表体未改变或者已删除的状态,不做处理.
        if (itemVO.getStatus() == VOStatus.UNCHANGED
            || itemVO.getStatus() == VOStatus.DELETED) {
          continue;
        }
        StringBuffer itemErrors = this.checkItemVO(itemVO);
        if (itemErrors.length() > 0) {
          errorBuffer.append(NCLangResOnserver.getInstance().getStrByID(
              "4020003_0", "04020003-0235", null, new String[] {
                itemVO.getCrowno()
              })/* 第{0}行: */);
          errorBuffer.append(itemErrors);
          errorBuffer.append(SystemUtils.LINE_SEPARATOR);
        }
      }
    }
    if (errorBuffer.length() > 0) {
      ExceptionUtils.wrappBusinessException(errorBuffer.toString());
    }
  }

  private StringBuffer checkHeaderVO(CtAbstractVO headerVO) {

    StringBuffer errorBuffer = new StringBuffer();
    UFBoolean isBsc = headerVO.getBsc();
    if (MathTool.compareTo(headerVO.getNexchangerate(), UFDouble.ZERO_DBL) == 0) {
      errorBuffer.append(nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID(
          "4020003_0", "04020003-0140")/* @res "折本汇率不能为空或者为零;" */);
    }

    if (!ValueUtil.isEmpty(isBsc) && isBsc.booleanValue()) {
      boolean isSCEnabled = false;
      isSCEnabled = SysInitGroupQuery.isSCEnabled();
      if (!isSCEnabled) {
        errorBuffer.append(nc.vo.ml.NCLangRes4VoTransl.getNCLangRes()
            .getStrByID("4020003_0", "04020003-0141")/*
                                                      * @res
                                                      * "委外模块没有启动，采购合同不能做委外操作！"
                                                      */);
      }
    }
    return errorBuffer;
  }

  private StringBuffer checkItemVO(CtAbstractBVO itemVO) {
    StringBuffer errorBuffer = new StringBuffer();

    String[][] bodyFields =
        new String[][] {
          {
            CtAbstractBVO.NORIGPRICE,
            nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("4020003_0",
                "04020003-0142")
          /* @res "[主无税单价]不能为负" */
          },
          {
            CtAbstractBVO.NORIGTAXPRICE,
            nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("4020003_0",
                "04020003-0143")
          /* @res "[主含税单价]不能为负" */
          },
          {
            CtAbstractBVO.NQTORIGPRICE,
            nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("4020003_0",
                "04020003-0144")
          /* @res "[无税单价]不能为负" */
          },
          {
            CtAbstractBVO.NQTORIGTAXPRICE,
            nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("4020003_0",
                "04020003-0145")
          /* @res "[含税单价]不能为负" */
          },
          {
            CtAbstractBVO.NQTPRICE,
            nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("4020003_0",
                "04020003-0146")
          /* @res "[本币无税单价]不能为负" */
          },
          {
            CtAbstractBVO.NQTTAXPRICE,
            nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("4020003_0",
                "04020003-0147")
          /* @res "[本币含税单价]不能为负" */
          },
          {
            CtAbstractBVO.NNUM,
            nc.vo.ml.NCLangRes4VoTransl.getNCLangRes().getStrByID("4020003_0",
                "04020003-0148")
          /* @res "[主数量]不能为负" */
          }
        };
    for (int i = 0; i < bodyFields.length; i++) {
      if (MathTool.compareTo(
          ValueUtils.getUFDouble(itemVO.getAttributeValue(bodyFields[i][0])),
          UFDouble.ZERO_DBL) < 0&&itemVO.getClass()!=CtPuBVO.class) {
        errorBuffer.append(bodyFields[i][1]);
      }
    }
    return errorBuffer;
  }
}
