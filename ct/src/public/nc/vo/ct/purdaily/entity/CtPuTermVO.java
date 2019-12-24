package nc.vo.ct.purdaily.entity;

import nc.vo.ct.entity.CtAbstractTermVO;
import nc.vo.ct.enumeration.CtEntity;
import nc.vo.pub.IVOMeta;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;
import nc.vo.pubapp.res.NCModule;

/**
 * <b> 在此处简要描述此类的功能 </b>
 * <p>
 * 采购合同合同条款VO
 * </p>
 * 创建日期:2010-03-18 19:39:27
 * 
 * @author
 * @version lizhengb
 */
public class CtPuTermVO extends CtAbstractTermVO {
  // 采购合同_主键
  public static final String PK_CT_PU = "pk_ct_pu";

  // 合同条款id
  public static final String PK_CT_PU_TERM = "pk_ct_pu_term";

  /**
   * 
   */
  private static final long serialVersionUID = 8686385534809534353L;

  /**
   * 按照默认方式创建构造子. 创建日期:2010-03-18 19:39:27
   */
  public CtPuTermVO() {
    super();
  }

  /**
   * 得到元数据的实体属性，其中”ct.ct_pu_term”, ct表示的组件命名空间，对于期初差异来说，
   * 其组件命名空间就是合同管理ct，ct_pu_term 表示该实体的数据库表名。
   */
  @Override
  public IVOMeta getMetaData() {

    IVOMeta meta =
        VOMetaFactory.getInstance().getVOMeta(
            NCModule.CT.getName().toLowerCase() + "."
                + CtEntity.ct_pu_term.name());
    return meta;
  }

  public String getPk_ct_pu() {
    return (String) this.getAttributeValue(CtPuTermVO.PK_CT_PU);
  }

  public String getPk_ct_pu_term() {
    return (String) this.getAttributeValue(CtPuTermVO.PK_CT_PU_TERM);
  }

  public void setPk_ct_pu(String pk_ct_pu) {
    this.setAttributeValue(CtPuTermVO.PK_CT_PU, pk_ct_pu);
  }

  public void setPk_ct_pu_term(String pk_ct_pu_term) {
    this.setAttributeValue(CtPuTermVO.PK_CT_PU_TERM, pk_ct_pu_term);
  }
  
  
  // start <<<  add by zip 20191224 添加自定义项（3个）
  public static final String VBDEF1 = "vbdef1";
  public void setVbdef1(String vbdef1){
	  this.setAttributeValue(CtPuTermVO.VBDEF1, vbdef1);
  }
  public String getVbdef1(){
	  return (String)this.getAttributeValue(CtPuTermVO.VBDEF1);
  }
  public static final String VBDEF2 = "vbdef2";
  public void setVbdef2(String vbdef2){
	  this.setAttributeValue(CtPuTermVO.VBDEF2, vbdef2);
  }
  public String getVbdef2(){
	  return (String)this.getAttributeValue(CtPuTermVO.VBDEF2);
  }
  public static final String VBDEF3 = "vbdef3";
  public void setVbdef3(String vbdef3){
	  this.setAttributeValue(CtPuTermVO.VBDEF3, VBDEF3);
  }
  public String getVbdef3(){
	  return (String)this.getAttributeValue(CtPuTermVO.VBDEF3);
  }
  // >>>> end

}
