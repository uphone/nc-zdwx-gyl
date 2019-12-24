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
     * 导入对话框。
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
		super.setBtnName("Excel导入");
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
			//税率
			String slSql="select a.pk_taxcode,b.mattaxescode from bd_taxcode a,bd_mattaxes b where a.mattaxes =b.pk_mattaxes and  b.pk_mattaxes ='"+map.get("pk_mattaxes")+"'";
			Map<String, String> mattaxescodeMap =(Map<String, String>)bs.executeQuery(slSql, new MapProcessor());
			
			pub.setCrowno(String.valueOf(rownum));//行号
			pub.setVbdef20(row[1]);//系统名称；
			pub.setVbdef19(row[2]);//序号
			pub.setVmemo(row[3]);//项目特征
			pub.setNastnum(new UFDouble(Double.valueOf(row[4])));//未采购数量
			pub.setNqtorigprice(new UFDouble(Double.valueOf(row[5])));//无税单价
			pub.setCtaxcodeid(mattaxescodeMap.get("pk_taxcode"));//税率
			if(mattaxescodeMap.get("mattaxescode").equals("CN001")){//17%
				pub.setNqtorigtaxprice(new UFDouble(Double.valueOf(row[5])*0.17));//含税单价
				pub.setNtaxrate(new UFDouble(17));
				pub.setNtax(new UFDouble(pub.getNqtorigprice().toDouble()*0.17));//税额
			}else if(mattaxescodeMap.get("mattaxescode").equals("CN002")){//13%
				pub.setNqtorigtaxprice(new UFDouble(Double.valueOf(row[5])*0.13));
				pub.setNtaxrate(new UFDouble(13));
				pub.setNtax(new UFDouble(pub.getNqtorigprice().toDouble()*0.13));//税额
			}else if(mattaxescodeMap.get("mattaxescode").equals("CN003")){//6%
				pub.setNqtorigtaxprice(new UFDouble(Double.valueOf(row[5])*0.06));
				pub.setNtaxrate(new UFDouble(6));
				pub.setNtax(new UFDouble(pub.getNqtorigprice().toDouble()*0.06));//税额
			}else if(mattaxescodeMap.get("mattaxescode").equals("CN001")){//4%
				pub.setNqtorigtaxprice(new UFDouble(Double.valueOf(row[5])*0.04));
				pub.setNtaxrate(new UFDouble(4));
				pub.setNtax(new UFDouble(pub.getNqtorigprice().toDouble()*0.04));//税额
			}else{
				pub.setNqtorigtaxprice(new UFDouble(Double.valueOf(row[5])));
				pub.setNtaxrate(new UFDouble(0));
				pub.setNtax(new UFDouble(0));//税额
			}
			//价税合计=含税单价*数量
			pub.setNorigtaxmny(new UFDouble(pub.getNqtorigtaxprice().toDouble()*pub.getNastnum().toDouble()));
			pub.setVbdef13(row[6]);//中标工程量
			pub.setVbdef2(row[7]);//深化工程量
			pub.setCastunitid(map.get("pk_measdoc"));//计量单位
			pub.setVbdef5(row[8]);//品牌
			pub.setVbdef9(row[9]);//深化品牌
//			pub.setVbdef10(map.get("materialtype"));//深化型号
			pub.setVbdef10(row[10]);//深化型号
			pub.setVbdef7(row[11]);//成本单价
			pub.setVbdef8(String.valueOf(Double.valueOf(row[11])*pub.getNastnum().toDouble()));//成本合价
			pub.setVbdef3(row[12]);//综合单价
			pub.setVbdef4(String.valueOf(Double.valueOf(row[12])*pub.getNastnum().toDouble()));//综合合价
			pub.setPk_material(map.get("pk_material"));
			pub.setVmemo(row[13]);//备注
			
			/**
			 * 页面没有的字段
			 */
			pub.setBsourceec(new UFBoolean(false));//来源EC
			pub.setBtriatradeflag(new UFBoolean(false));//三角贸易
			pub.setCasscustid(map.get("pk_measdoc"));//客户单位
			pub.setCqtunitid(map.get("pk_measdoc"));//报价单位
			pub.setCrececountryid("0001Z010000000079UJJ");//收货国家/地区
			pub.setCsendcountryid("0001Z010000000079UJJ");//发货国家/地区
			pub.setCtaxcountryid("0001Z010000000079UJJ");//报税国家/地区
			pub.setCunitid(map.get("pk_measdoc"));//主单位 
			pub.setFbuysellflag(2);//购销类型 1=国内销售，2=国内采购，3=出口，4=进口，5=不区分， 
			pub.setFtaxtypeflag(1);//扣税类别 1=应税外加，0=应税内含， 
			
			
			pub.setNgprice(pub.getNqtorigprice());//主本币无税单价  =报价无税单价?
			pub.setNorigprice(pub.getNqtorigprice());//主无税单价   =报价无税单价?
			pub.setNqtprice(pub.getNqtorigprice());//报价本币无税单价   =报价无税单价?
			
			pub.setNgtaxprice(pub.getNqtorigtaxprice());//主本币含税单价 =报价含税单价?
			pub.setNorigtaxprice(pub.getNqtorigtaxprice());//主含税单价=报价含税单价?
			pub.setNqttaxprice(pub.getNqtorigtaxprice());//报价本币含税单价=报价含税单价?
			
			pub.setNtaxmny(pub.getNorigtaxmny());//本币价税合计 =价税合计?
			
			//这些字段不知道怎么计算
//			pub.setNcalcostmny(null);//计成本金额
//			pub.setNcaltaxmny(null);//计税金额
//			pub.setNmny(null);//本币无税金额
//			pub.setNorigmny(null);//无税金额
//			pub.setNgprice(null);//主本币无税单价
//			pub.setNnosubtax(null);//不可抵扣税额
//			pub.setNnosubtaxrate(null);//不可抵扣税率
//			pub.setNordnum(null);//累计订单主数量
//			pub.setNordsum(null);//累计订单价税合计
//			pub.setNoritotalgpmny(null);//累计合同应付核销金额
//			pub.setNtotalgpmny(null);//累计合同应付本币核销金额
			
			String pk_vid=editor.getBillCardPanel().getHeadItem("pk_org_v").getValue();
			String stockSql="select pk_stockorg  from org_stockorg where pk_vid='"+pk_vid+"'";
			Map<String,String> stockMap=(Map<String, String>) bs.executeQuery(stockSql,new  MapProcessor());
			pub.setPk_arrvstock(stockMap.get("pk_stockorg"));//收货库存组织最新版本
			pub.setPk_arrvstock_v(pk_vid);//收货库存组织 
			String finSql="select pk_financeorg from org_financeorg where pk_vid='"+pk_vid+"'";
			Map<String,String> finMap=(Map<String, String>) bs.executeQuery(finSql,new  MapProcessor());
			pub.setPk_financeorg(finMap.get("pk_financeorg"));//财务组织最新版本
			pub.setPk_financeorg_v(pk_vid);//财务组织
			pub.setPk_group(ctx.getPk_group());//集团
			pub.setPk_org(pk_org);//采购组织最新版本
			pub.setPk_org_v(pk_vid);//采购组织
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
				throw new Exception("EXCEL文件读取错误，请选择正确的EXCEL文件！");
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
     * 取得表体列表编辑器。
     *
     * @return BatchBillTable 表体列表编辑器
     */
    public BatchBillTable getBillTable() {
        return billTable;
    }

    /**
     * 设置表体列表编辑器。
     *
     * @param billTable 表体列表编辑器
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
     * 设置脚本动作名称
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