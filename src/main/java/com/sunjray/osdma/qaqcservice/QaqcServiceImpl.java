package com.sunjray.osdma.qaqcservice;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunjray.osdma.AMmodel.MaterialPurchase;
import com.sunjray.osdma.qaqcModel.MaterialCode;
import com.sunjray.osdma.qaqcModel.QaqcItem;
import com.sunjray.osdma.qaqcRepository.QaQcDAO;




@Service
public class QaqcServiceImpl implements QaqcService{
	
	@Autowired
	QaQcDAO qaqcDAO;

	@Override
	public List<MaterialPurchase> getItems() {
		return qaqcDAO.getItem();
	}

	@Override
	public int saveItemdtls(QaqcItem qaqcItem, HttpSession session) {
		return qaqcDAO.addItems(qaqcItem);
	}

	@Override
	public List<MaterialCode> getcomponent() {
		return qaqcDAO.getComponent();
	}

	@Override
	public int updateProduct(QaqcItem qaqcItem, HttpSession session) {
		return qaqcDAO.getProduct(qaqcItem);
	}

	@Override
	public Iterable<QaqcItem> getRejectList() {
		// TODO Auto-generated method stub
		return qaqcDAO.getRejectList();
	}
	

}
