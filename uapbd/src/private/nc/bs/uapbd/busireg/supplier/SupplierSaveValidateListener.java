package nc.bs.uapbd.busireg.supplier;

import nc.bs.businessevent.IBusinessEvent;
import nc.bs.businessevent.IBusinessListener;
import nc.bs.businessevent.bd.BDCommonEvent;
import nc.bs.dao.BaseDAO;
import nc.vo.bd.supplier.SupLinkmanVO;
import nc.vo.bd.supplier.SupplierVO;
import nc.vo.pub.BusinessException;

public class SupplierSaveValidateListener implements IBusinessListener {

	@Override
	public void doAction(IBusinessEvent event) throws BusinessException {
		BDCommonEvent be = (BDCommonEvent) event;
		Object[] objs = be.getNewObjs();
		SupplierVO supVO = (SupplierVO) objs[0];
		SupLinkmanVO[] links = supVO.getSuplinkman();
		if (links == null || links.length == 0)
			throw new BusinessException("请增加联系人");
		// 由于银行账户必须是新增后才能新增的信息，所以新增保存后先将启用状态更新为停用，再新增好银行账户后，再进行启用
		supVO.setEnablestate(3);
		BaseDAO dao = new BaseDAO();
		dao.updateVO(supVO, new String[] { "enablestate" });
	}

}
