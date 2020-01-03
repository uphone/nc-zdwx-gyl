/**
 * $�ļ�˵��$
 * 
 * @author GGR
 * @version 6.0
 * @see
 * @since 6.0
 * @time 2010-2-1 ����10:57:07
 */
package nc.bs.pu.m20.query;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import nc.bs.framework.common.NCLocator;
import nc.bs.pu.m20.query.logicutil.CondTOWhereUtil;
import nc.itf.scmpub.reference.uap.pf.PfServiceScmUtil;
import nc.pubitf.pu.m21.pu.m20.IOrderQueryFor20;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pf.change.PfUtilBaseTools;
import nc.vo.pu.m20.entity.PraybillHeaderVO;
import nc.vo.pu.m20.entity.PraybillItemVO;
import nc.vo.pu.m20.entity.PraybillVO;
import nc.vo.pu.m21.entity.m20.QueryParaFor20;
import nc.vo.pu.pub.constant.PUQueryConst;
import nc.vo.pu.pub.enumeration.POEnumBillStatus;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pubapp.AppContext;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.pubapp.pattern.model.tool.BillComposite;
import nc.vo.pubapp.pattern.pub.SqlBuilder;
import nc.vo.pubapp.query2.sql.process.QuerySchemeProcessor;
import nc.vo.scmpub.res.billtype.POBillType;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

/**
 * �빺��Ϊ�ɹ������ṩ��ѯ����Ĳ�ѯBP
 * <p>
 * <b>������Ҫ������¹��ܣ�</b>
 * <ul>
 * <li>
 * </ul>
 * <p>
 * <p>
 * 
 * @version 6.0
 * @since 6.0
 * @author GGR
 * @time 2010-2-1 ����10:57:07
 */
public class QueryFor21BP extends AbstractRefQueryBP {

  private IQueryScheme queryScheme = null;

  public QueryFor21BP(IQueryScheme queryScheme) {
    super(new QuerySchemeProcessor(queryScheme));
    this.queryScheme = queryScheme;
  }

  @Override
  public StringBuffer makeGetPKSql() {
    String sqlWhere = this.psor.getFinalFromWhere();
    String where = sqlWhere;
    if (null != sqlWhere && "1=1".equals(sqlWhere.trim())) {
      where = null;
    }

    StringBuffer sql = new StringBuffer();
    sql.append(" select distinct " + this.headtb + ".pk_praybill,");
    sql.append(this.itemtb + ".pk_praybill_b ");
    sql.append(where);
    sql.append(" and " + this.headtb + ".bsctype = 'N'");
    sql.append(" and " + this.headtb + ".bislatest = 'Y'");
    sql.append(" and " + this.headtb + ".fbillstatus = "
        + POEnumBillStatus.APPROVE.value());
    sql.append(" and " + this.headtb + ".dr = 0");
    sql.append(" and " + this.headtb + ".pk_praybill = " + this.itemtb
        + ".pk_praybill");
    // update by zip: 2020-01-03 �����ѯ�������빺���������ɲɹ�����(�˻�)
    sql.append(" and abs(" + this.itemtb + ".nnum) > abs(isnull(" + this.itemtb
        + ".naccumulatenum, 0))");
    sql.append(" and " + this.itemtb + ".nnum is not null");
    sql.append(" and " + this.itemtb + ".browclose = 'N'");
    sql.append(" and " + this.itemtb + ".bpublishtoec = 'N'");
    // 2012-10-17 fanly3 V63������ �����������������빺���в������������ε���
    sql.append(" and " + this.itemtb + ".bisgensaorder = 'N'");
    sql.append(" and " + this.itemtb + ".dr = 0");
    // 2012-7-4����ӡ�ҡ������С���С��ȷ���빺���߱���Ķ������ͣ����Ϊ�գ�Ҳ��������Ѱ�ҡ����Բ���Ҫ����
    // �Ǵ��������ͷ����ڵ�ġ�
    String orderttid = this.getOrderTranstype();
    if (null != orderttid) {
      sql.append(" and (" + this.itemtb + ".cordertrantypecode = '" + orderttid);
      sql.append("' or " + this.itemtb + ".cordertrantypecode = '~')");
    }
    else {
      // ���Ͻ������Ϳ��ƣ���������Ϊ�գ�����Ϊ�ɹ������Ľ������͡�
      SqlBuilder inSqlStr = new SqlBuilder();
      inSqlStr.append("select pk_billtypeid from bd_billtype ");
      inSqlStr.append(" where ");
      inSqlStr.append("parentbilltype", POBillType.Order.getCode());
      inSqlStr.append(" and ");
      inSqlStr.append("pk_group", AppContext.getInstance().getPkGroup());

      sql.append(" and ( " + this.itemtb + ".cordertrantypecode in (" + inSqlStr.toString()
          + ")");
      sql.append(" or ");
      sql.append(this.itemtb + ".cordertrantypecode = '~'");
      sql.append(")");
    }

    // �빺���Ŵ���
    CondTOWhereUtil.buildIsarrange(sql, this.headtb, this.itemtb);

    // �빺�������� ���ڲɹ��ڵĴ���
    FilterForPosUtil.filterMaterialByPos(this.psor, sql);
    
    return sql;
  }

  /**
   * �����������������ݶ����ṩ�Ĳ�ѯ������ѯ�빺����
   * <p>
   * <b>����˵��</b>
   * 
   * @param sql
   * @return �����ѯ�������빺�����ӱ��Ѿ����ˣ�
   * @since 6.0
   * @author GGR
   * @time 2010-2-1 ����11:29:27
   */
  @Override
  public PraybillVO[] queryPrayBills() {
    return super.queryPrayBills();
  }

  /**
   * @param queryResult
   */
  private QueryParaFor20[] createPara(PraybillVO[] queryResult) {
    List<QueryParaFor20> paraList = new ArrayList<QueryParaFor20>();
    for (PraybillVO vo : queryResult) {
      for (PraybillItemVO item : vo.getBVO()) {
        if (StringUtils.isEmpty(item.getCordertrantypecode())) {
          continue;
        }
        QueryParaFor20 para = new QueryParaFor20();
        para.setCurrency(vo.getHVO().getCcurrencyid());
        para.setDate(AppContext.getInstance().getBusiDate());
        para.setPk_praybill_b(item.getPk_praybill_b());
        para.setPk_srcmaterial(item.getPk_srcmaterial());
        para.setPk_org(item.getPk_purchaseorg());
        para.setPk_ordertrantype(item.getCordertrantypecode());
        // wuxla V61 ��Ϊ���ɹ�����������ί���ǿ϶�ΪN
        // ��������ί���ǣ�����ɹ��۸񲻻��ѯ��Ӧ�̼�Ŀ��
        para.setBsc(UFBoolean.FALSE);
        paraList.add(para);
      }
    }
    if (paraList.size() == 0) {
      return null;
    }
    return paraList.toArray(new QueryParaFor20[paraList.size()]);
  }

  private String getOrderTranstype() {
    String ttypecode =
        (String) this.queryScheme.get(PUQueryConst.BILLTYPE_QS_KEY);
    if (null != ttypecode && PfUtilBaseTools.isTranstype(ttypecode)) {
      return PfServiceScmUtil.getTrantypeidByCode(new String[] {
        ttypecode
      }).get(ttypecode);
    }
    return null;
  }

  @Override
  protected PraybillVO[] processQueryResult(PraybillVO[] queryResult) {
    QueryParaFor20[] paras = this.createPara(queryResult);
    if (ArrayUtils.isEmpty(paras)) {
      return queryResult;
    }
    Set<String> filterItemIds = null;
    try {
      filterItemIds =
          NCLocator.getInstance().lookup(IOrderQueryFor20.class)
              .filterItemsByOrderTranType(paras);
    }
    catch (BusinessException e) {
      ExceptionUtils.wrappException(e);
    }

    Set<PraybillHeaderVO> headers = new HashSet<PraybillHeaderVO>();
    List<PraybillItemVO> children = new ArrayList<PraybillItemVO>();
    // �Ȱ�û�ж������͵��빺���зŽ�ȥ��
    for (PraybillVO bill : queryResult) {
      for (PraybillItemVO child : bill.getBVO()) {
        if (StringUtils.isEmpty(child.getCordertrantypecode())) {
          headers.add(bill.getHVO());
          children.add(child);
        }
      }
    }
    // �ٰѷ��������������빺�������õ�list����
    if (!CollectionUtils.isEmpty(filterItemIds)) {
      for (PraybillVO bill : queryResult) {
        for (PraybillItemVO child : bill.getBVO()) {
          if (filterItemIds.contains(child.getPk_praybill_b())) {
            headers.add(bill.getHVO());
            children.add(child);
          }
        }
      }
    }
    if (CollectionUtils.isEmpty(headers) || CollectionUtils.isEmpty(children)) {
      return null;
    }
    BillComposite<PraybillVO> bc =
        new BillComposite<PraybillVO>(PraybillVO.class);
    PraybillVO tempVO = new PraybillVO();
    bc.append(tempVO.getMetaData().getParent(),
        headers.toArray(new PraybillHeaderVO[headers.size()]));
    bc.append(tempVO.getMetaData().getVOMeta(PraybillItemVO.class),
        children.toArray(new PraybillItemVO[children.size()]));
    return bc.composite();
  }
}
