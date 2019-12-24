package nc.vo.ct.purdaily.entity;

import nc.vo.ct.entity.CtAbstractTermVO;
import nc.vo.ct.enumeration.CtEntity;
import nc.vo.pub.IVOMeta;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;
import nc.vo.pubapp.res.NCModule;

/**
 * <b> �ڴ˴���Ҫ��������Ĺ��� </b>
 * <p>
 * �ɹ���ͬ��ͬ����VO
 * </p>
 * ��������:2010-03-18 19:39:27
 * 
 * @author
 * @version lizhengb
 */
public class CtPuTermVO extends CtAbstractTermVO {
  // �ɹ���ͬ_����
  public static final String PK_CT_PU = "pk_ct_pu";

  // ��ͬ����id
  public static final String PK_CT_PU_TERM = "pk_ct_pu_term";

  /**
   * 
   */
  private static final long serialVersionUID = 8686385534809534353L;

  /**
   * ����Ĭ�Ϸ�ʽ����������. ��������:2010-03-18 19:39:27
   */
  public CtPuTermVO() {
    super();
  }

  /**
   * �õ�Ԫ���ݵ�ʵ�����ԣ����С�ct.ct_pu_term��, ct��ʾ����������ռ䣬�����ڳ�������˵��
   * ����������ռ���Ǻ�ͬ����ct��ct_pu_term ��ʾ��ʵ������ݿ������
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
  
  
  // start <<<  add by zip 20191224 ����Զ����3����
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
