package com.sunjray.osdma.AMservice;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunjray.osdma.AMmodel.Consinment;
import com.sunjray.osdma.AMmodel.MaterialPurchase;
import com.sunjray.osdma.AMrepository.AccountDAO;


@Service
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	AccountDAO accountDAO;

	@Override
	public int addConsinment(Consinment consinment) {
		return accountDAO.addConsinment(consinment);
	}

	@Override
	public List<Consinment> findAllMaterial() {
		return accountDAO.findAllMaterial();
	}

	@Override
	public int updatetrack(Consinment consinment, HttpSession session) {
		return accountDAO.updateTrack(consinment);
	}

	@Override
	public List<Consinment> findAllConsignmentNo() {
		return accountDAO.findAllConsignmentNo();
	}

	@Transactional
	@Override
	public void addmaterial(MaterialPurchase materialPurchase) {
		//System.out.println("LLLLLLLLLLLLLLLLL");
		String item_name=materialPurchase.getItemName();
		String serial_no=materialPurchase.getSerialNo();
		Integer quantity= materialPurchase.getQuantity();
		Integer consinment_id = materialPurchase.getConsignmentId();
		accountDAO.addmaterial(item_name,serial_no,quantity,consinment_id);
		
	}

	@Override
	public List<Consinment> getConsNo() {
		return accountDAO.findAllConsignmentNo();
	}

	

}
