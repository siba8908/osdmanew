package com.sunjray.osdma.AMservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunjray.osdma.AMmodel.RaiseBill;
import com.sunjray.osdma.AMrepository.RaiseBillDAO;
@Service
public class RaiseBillServiceImpl implements RaiseBillService {
    @Autowired
	private RaiseBillDAO riseBillDAO;
	@Override
	public List<RaiseBill> riseBill() {
		// TODO Auto-generated method stub
		
		return riseBillDAO.riseBill();
	}
	@Override
	public int saveBill(RaiseBill rBill) {
		// TODO Auto-generated method stub
		return riseBillDAO.saveBill(rBill);
	}
	@Override
	public Iterable<RaiseBill> getBilllist() {
		// TODO Auto-generated method stub
		return riseBillDAO.getBilllist();
	}

}
