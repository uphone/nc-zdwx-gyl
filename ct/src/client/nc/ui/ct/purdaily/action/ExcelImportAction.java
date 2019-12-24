package nc.ui.ct.purdaily.action;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.swing.JFileChooser;

import org.apache.commons.io.FilenameUtils;

import nc.bs.framework.common.NCLocator;
import nc.bs.uif2.IActionCode;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.MapProcessor;
import nc.ui.am.excel.ExcelImportDialog;
import nc.ui.fa.categoryimport.view.CategoryImportTable;
import nc.ui.pu.m422x.excel.ZdwxTransExcel;
import nc.ui.pub.beans.MessageDialog;
import nc.ui.pub.beans.UIDialog;
import nc.ui.pubapp.pub.common.context.PFlowContext;
import nc.ui.pubapp.uif2app.model.BillManageModel;
import nc.ui.pubapp.uif2app.view.BillForm;
import nc.ui.trade.businessaction.IPFACTION;
import nc.ui.uif2.NCAction;
import nc.ui.uif2.actions.ActionInitializer;
import nc.ui.uif2.editor.BatchBillTable;
import nc.vo.ct.purdaily.entity.CtPuBVO;
import nc.vo.fa.categoryimport.CategoryImportVO;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDouble;
import nc.vo.uap.ObjectProcessor;
import nc.vo.uif2.LoginContext;

@SuppressWarnings("restriction")
public class ExcelImportAction extends NCAction {
	
	/**
     * ����Ի���
     */
	private BillManageModel model;
	private BillForm editor;
	private BatchBillTable billTable = null;
	private static final long serialVersionUID = 1L;
	 private String actionName;
	  protected List<String> afterActionNames;
	  protected boolean isBactch;
	  protected PFlowContext flowContext;
	  
	public String getActionName() {
		return actionName;
	}

	public List<String> getAfterActionNames() {
		return afterActionNames;
	}

	public boolean isBactch() {
		return isBactch;
	}

	public void setFlowContext(PFlowContext flowContext) {
		this.flowContext = flowContext;
	}

	public ExcelImportAction() {
		ActionInitializer.initializeAction(this, IActionCode.IMPORT);
	    this.setActionName("EXCELIMPORT");
		super.setBtnName("Excel����");
	}

	@Override
	public void doAction(ActionEvent arg0) throws Exception {
		//PluginBeanConfigFilePath_Industry0_excelImport  nc/ui/ct/purdaily/model/purdaily_excelImport_config.xml
		
		IUAPQueryBS bs = NCLocator.getInstance().lookup(IUAPQueryBS.class);
		String str=readPath();
		if(str==null) return;
		LoginContext ctx = model.getContext();
		String pk_org=ctx.getPk_org();
		File file = new File(str);
		List<String> list = new ArrayList<String>();
		list = new ZdwxTransExcel().exportListFromExcel(new FileInputStream(file),
					FilenameUtils.getExtension(file.getName()), 0);
		if(list.size()<=1) return ;
		list.remove(0);
		CtPuBVO [] bodys=new CtPuBVO[list.size()];
		int rownum=0;
		editor.getBillCardPanel().getBillModel().clearBodyData();
		for(int i=0;i<list.size();i++){
			rownum+=10;
			String valStr=list.get(i).substring(1,list.get(i).length());
			String [] row=valStr.split(",");
			CtPuBVO   pub = new CtPuBVO();
			String sql="select pk_material,pk_mattaxes,pk_measdoc,materialtype from bd_material where code='"+row[0]+"' and pk_org='"+pk_org+"'";
			Map<String, String> map=(Map<String, String>) bs.executeQuery(sql, new MapProcessor());
			//˰��
			String slSql="select a.pk_taxcode,b.mattaxescode from bd_taxcode a,bd_mattaxes b where a.mattaxes =b.pk_mattaxes and  b.pk_mattaxes ='"+map.get("pk_mattaxes")+"'";
			Map<String, String> mattaxescodeMap =(Map<String, String>)bs.executeQuery(slSql, new MapProcessor());
			
			pub.setCrowno(String.valueOf(rownum));//�к�
			pub.setVbdef20(row[1]);//ϵͳ���ƣ�
			pub.setVbdef19(row[2]);//���
			pub.setVmemo(row[3]);//��Ŀ����
			pub.setNastnum(new UFDouble(Double.valueOf(row[4])));//δ�ɹ�����
			pub.setNqtorigprice(new UFDouble(Double.valueOf(row[5])));//��˰����
			pub.setCtaxcodeid(mattaxescodeMap.get("pk_taxcode"));//˰��
			if(mattaxescodeMap.get("mattaxescode").equals("CN001")){//17%
				pub.setNqtorigtaxprice(new UFDouble(Double.valueOf(row[5])*0.17));//��˰����
				pub.setNtaxrate(new UFDouble(17));
				pub.setNtax(new UFDouble(pub.getNqtorigprice().toDouble()*0.17));//˰��
			}else if(mattaxescodeMap.get("mattaxescode").equals("CN002")){//13%
				pub.setNqtorigtaxprice(new UFDouble(Double.valueOf(row[5])*0.13));
				pub.setNtaxrate(new UFDouble(13));
				pub.setNtax(new UFDouble(pub.getNqtorigprice().toDouble()*0.13));//˰��
			}else if(mattaxescodeMap.get("mattaxescode").equals("CN003")){//6%
				pub.setNqtorigtaxprice(new UFDouble(Double.valueOf(row[5])*0.06));
				pub.setNtaxrate(new UFDouble(6));
				pub.setNtax(new UFDouble(pub.getNqtorigprice().toDouble()*0.06));//˰��
			}else if(mattaxescodeMap.get("mattaxescode").equals("CN001")){//4%
				pub.setNqtorigtaxprice(new UFDouble(Double.valueOf(row[5])*0.04));
				pub.setNtaxrate(new UFDouble(4));
				pub.setNtax(new UFDouble(pub.getNqtorigprice().toDouble()*0.04));//˰��
			}else{
				pub.setNqtorigtaxprice(new UFDouble(Double.valueOf(row[5])));
				pub.setNtaxrate(new UFDouble(0));
				pub.setNtax(new UFDouble(0));//˰��
			}
			//��˰�ϼ�=��˰����*����
			pub.setNorigtaxmny(new UFDouble(pub.getNqtorigtaxprice().toDouble()*pub.getNastnum().toDouble()));
			pub.setVbdef13(row[6]);//�б깤����
			pub.setVbdef2(row[7]);//�������
			pub.setCastunitid(map.get("pk_measdoc"));//������λ
			pub.setVbdef5(row[8]);//Ʒ��
			pub.setVbdef9(row[9]);//�Ʒ��
//			pub.setVbdef10(map.get("materialtype"));//��ͺ�
			pub.setVbdef10(row[10]);//��ͺ�
			pub.setVbdef7(row[11]);//�ɱ�����
			pub.setVbdef8(String.valueOf(Double.valueOf(row[11])*pub.getNastnum().toDouble()));//�ɱ��ϼ�
			pub.setVbdef3(row[12]);//�ۺϵ���
			pub.setVbdef4(String.valueOf(Double.valueOf(row[12])*pub.getNastnum().toDouble()));//�ۺϺϼ�
			pub.setPk_material(map.get("pk_material"));
			pub.setVmemo(row[13]);//��ע
			
			/**
			 * ҳ��û�е��ֶ�
			 */
			pub.setBsourceec(new UFBoolean(false));//��ԴEC
			pub.setBtriatradeflag(new UFBoolean(false));//����ó��
			pub.setCasscustid(map.get("pk_measdoc"));//�ͻ���λ
			pub.setCqtunitid(map.get("pk_measdoc"));//���۵�λ
			pub.setCrececountryid("0001Z010000000079UJJ");//�ջ�����/����
			pub.setCsendcountryid("0001Z010000000079UJJ");//��������/����
			pub.setCtaxcountryid("0001Z010000000079UJJ");//��˰����/����
			pub.setCunitid(map.get("pk_measdoc"));//����λ 
			pub.setFbuysellflag(2);//�������� 1=�������ۣ�2=���ڲɹ���3=���ڣ�4=���ڣ�5=�����֣� 
			pub.setFtaxtypeflag(1);//��˰��� 1=Ӧ˰��ӣ�0=Ӧ˰�ں��� 
			
			
			pub.setNgprice(pub.getNqtorigprice());//��������˰����  =������˰����?
			pub.setNorigprice(pub.getNqtorigprice());//����˰����   =������˰����?
			pub.setNqtprice(pub.getNqtorigprice());//���۱�����˰����   =������˰����?
			
			pub.setNgtaxprice(pub.getNqtorigtaxprice());//�����Һ�˰���� =���ۺ�˰����?
			pub.setNorigtaxprice(pub.getNqtorigtaxprice());//����˰����=���ۺ�˰����?
			pub.setNqttaxprice(pub.getNqtorigtaxprice());//���۱��Һ�˰����=���ۺ�˰����?
			
			pub.setNtaxmny(pub.getNorigtaxmny());//���Ҽ�˰�ϼ� =��˰�ϼ�?
			
			//��Щ�ֶβ�֪����ô����
//			pub.setNcalcostmny(null);//�Ƴɱ����
//			pub.setNcaltaxmny(null);//��˰���
//			pub.setNmny(null);//������˰���
//			pub.setNorigmny(null);//��˰���
//			pub.setNgprice(null);//��������˰����
//			pub.setNnosubtax(null);//���ɵֿ�˰��
//			pub.setNnosubtaxrate(null);//���ɵֿ�˰��
//			pub.setNordnum(null);//�ۼƶ���������
//			pub.setNordsum(null);//�ۼƶ�����˰�ϼ�
//			pub.setNoritotalgpmny(null);//�ۼƺ�ͬӦ���������
//			pub.setNtotalgpmny(null);//�ۼƺ�ͬӦ�����Һ������
			
			String pk_vid=editor.getBillCardPanel().getHeadItem("pk_org_v").getValue();
			String stockSql="select pk_stockorg  from org_stockorg where pk_vid='"+pk_vid+"'";
			Map<String,String> stockMap=(Map<String, String>) bs.executeQuery(stockSql,new  MapProcessor());
			pub.setPk_arrvstock(stockMap.get("pk_stockorg"));//�ջ������֯���°汾
			pub.setPk_arrvstock_v(pk_vid);//�ջ������֯ 
			String finSql="select pk_financeorg from org_financeorg where pk_vid='"+pk_vid+"'";
			Map<String,String> finMap=(Map<String, String>) bs.executeQuery(finSql,new  MapProcessor());
			pub.setPk_financeorg(finMap.get("pk_financeorg"));//������֯���°汾
			pub.setPk_financeorg_v(pk_vid);//������֯
			pub.setPk_group(ctx.getPk_group());//����
			pub.setPk_org(pk_org);//�ɹ���֯���°汾
			pub.setPk_org_v(pk_vid);//�ɹ���֯
			pub.setPk_srcmaterial(map.get("map"));
			pub.setVchangerate("1.00/1.00"); 
			pub.setVqtunitrate("1.00/1.00");
			Integer rowCount=editor.getBillCardPanel().getBillModel().getRowCount();
			bodys[i]=pub;
		}
//		editor.getBillCardPanel().getBillModel().addRowAttributeObject(0, "vbdef19", "11");
//		editor.getBillCardPanel().getBillModel().addLine();
		editor.getBillCardPanel().getBillModel().setBodyDataVO(bodys);
//		editor.getBillCardPanel().getBillModel().setImportBodyDataVOPu(bodys);
		System.out.println("12");
	}

	public BillManageModel getModel() {
		return model;
	}
	public void setModel(BillManageModel model) {
		this.model = model;
	}

	public static String readPath() throws Exception{
		String pathName = null;
		JFileChooser fc = new JFileChooser();
		fc.setDialogType(JFileChooser.OPEN_DIALOG);
		fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		fc.setMultiSelectionEnabled(true);
		int i=fc.showOpenDialog(fc);
		File ff = fc.getSelectedFile();
		if(i==1) return null;
		if (fc.getSelectedFile() != null) {
			if(ff.getPath().endsWith(".xlsx")||ff.getPath().endsWith(".xls")||ff.getPath().endsWith(".XLS")||ff.getPath().endsWith(".XLSX")){
				pathName=ff.getPath();
			}else{
				throw new Exception("EXCEL�ļ���ȡ������ѡ����ȷ��EXCEL�ļ���");
			}
		}
		// ff.deleteOnExit();
		return pathName;
	}
    
    
    public BillForm getEditor() {
		return editor;
	}

	public void setEditor(BillForm editor) {
		this.editor = editor;
	}

	/**
     * ȡ�ñ����б�༭����
     *
     * @return BatchBillTable �����б�༭��
     */
    public BatchBillTable getBillTable() {
        return billTable;
    }

    /**
     * ���ñ����б�༭����
     *
     * @param billTable �����б�༭��
     */
    public void setBillTable(BatchBillTable billTable) {
        this.billTable = billTable;
    }
    
    public PFlowContext getFlowContext() {
        if (this.flowContext == null) {
          this.flowContext = new PFlowContext();
        }
        return this.flowContext;
      }
    
    /**
     * ���ýű���������
     * 
     * @param actionName
     */
    public void setActionName(String actionName) {
      this.actionName = actionName;
      this.getFlowContext().setActionName(actionName);
    }

    public void setAfterActionNames(List<String> afterActionNames) {
      this.afterActionNames = afterActionNames;
    }

    public void setBactch(boolean bactch) {
      this.isBactch = bactch;
    }
    public String getBillType(){
  	  return  this.getFlowContext().getBillType();
    }

}