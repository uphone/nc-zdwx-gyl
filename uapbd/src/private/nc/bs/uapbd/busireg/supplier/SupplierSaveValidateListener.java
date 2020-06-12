package nc.bs.uapbd.busireg.supplier;

import nc.bs.businessevent.IBusinessEvent;
import nc.bs.businessevent.IBusinessListener;
import nc.bs.businessevent.bd.BDCommonEvent;
import nc.bs.dao.BaseDAO;
import nc.itf.org.IOrgConst;
import nc.itf.uap.busibean.SysinitAccessor;
import nc.vo.bd.supplier.SupLinkmanVO;
import nc.vo.bd.supplier.SupplierVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;

public class SupplierSaveValidateListener implements IBusinessListener {

	@Override
	public void doAction(IBusinessEvent event) throws BusinessException {
//		UFBoolean bl = SysinitAccessor.getInstance().getParaBoolean(
//				IOrgConst.GLOBEORG, "BD9001");
//		if (!bl.booleanValue())
//			return;
		BDCommonEvent be = (BDCommonEvent) event;
		Object[] objs = be.getNewObjs();
		SupplierVO supVO = (SupplierVO) objs[0];
		SupLinkmanVO[] links = supVO.getSuplinkman();
		if (links == null || links.length == 0)
			throw new BusinessException("��������ϵ��");
		// ���������˻������������������������Ϣ����������������Ƚ�����״̬����Ϊͣ�ã��������������˻����ٽ�������
		supVO.setEnablestate(3);
		BaseDAO dao = new BaseDAO();
		dao.updateVO(supVO, new String[] { "enablestate" });
	}

}
