package nc.bs.uapbd.busireg.supplier;

import nc.bs.businessevent.IBusinessEvent;
import nc.bs.businessevent.IBusinessListener;
import nc.bs.businessevent.bd.BDCommonEvent;
import nc.vo.bd.cust.CustbankVO;
import nc.vo.bd.supplier.SupplierVO;
import nc.vo.pub.BusinessException;

public class SupplierEnableValidateListener implements IBusinessListener {

	@Override
	public void doAction(IBusinessEvent event) throws BusinessException {
		BDCommonEvent be = (BDCommonEvent) event;
		Object[] objs = be.getNewObjs();
		SupplierVO supVO = (SupplierVO) objs[0];
		CustbankVO[] bankVOs = supVO.getSupbankacc();
		if (bankVOs == null || bankVOs.length == 0) {
			throw new BusinessException("请先增加银行账户");
		}
	}

}
