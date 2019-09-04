package com.sunjray.osdma.AMservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunjray.osdma.AMmodel.AMDashboard;
import com.sunjray.osdma.AMmodel.MaterialPurchase;
import com.sunjray.osdma.AMrepository.AMDashboardDAO;
import com.sunjray.osdma.util.TransactionIdGenerator;
@Service
public class AMDashboardServiceImpl implements AMDashboardService {
	@Autowired
	private AMDashboardDAO dashboardDAO; 
	
	@Override
	public List<AMDashboard> getAllDetails() {
		// TODO Auto-generated method stub
		return dashboardDAO.getAllDetails();
	}
	
	@Override
	public int paydashboard(AMDashboard d) {
		// TODO Auto-generated method stub
		TransactionIdGenerator t=new TransactionIdGenerator();
		d.setTransactionId(t.get());
		return dashboardDAO.paydashboard(d);
	}

	@Override
	public Iterable<MaterialPurchase> getList() {
		// TODO Auto-generated method stub
		return dashboardDAO.getList();
	}
	
	@Override
	public Iterable<AMDashboard> getapprovedList() {
		// TODO Auto-generated method stub
		return dashboardDAO.getapprovedList();
	}
}
