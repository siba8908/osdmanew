package com.sunjray.osdma.AMservice;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunjray.osdma.AMmodel.ConsingementTrackP2A;
import com.sunjray.osdma.AMmodel.Consinment;
import com.sunjray.osdma.AMmodel.Expence;
import com.sunjray.osdma.AMmodel.ServProBill;
import com.sunjray.osdma.AMmodel.SiteCode;
import com.sunjray.osdma.AMrepository.AMReportDAO;

@Service
public class AMReportServiceImpl implements AMReportService {

	@Autowired
	private AMReportDAO reportDAO;
	
	public Iterable<ServProBill> getLedgerList() {
		// TODO Auto-generated method stub
		return reportDAO.getLedgerList();
	}

	@Override
	public Iterable<Consinment> getTrackingc2p() {
		// TODO Auto-generated method stub
		return reportDAO.getTrackingc2p();
	}

	@Override
	public Iterable<ConsingementTrackP2A> getTrackingp2a() {
		// TODO Auto-generated method stub
		return reportDAO.getTrackingp2a();
	}
	
	@Override
	public List<SiteCode> getAllSiteCode() {
		// TODO Auto-generated method stub
		return reportDAO.getAllSiteCode();
	}

	@Override
	public Expence ExpencesReport(SiteCode sitecode) {
		// TODO Auto-generated method stub
		List<Expence> ex=new ArrayList<Expence>();
		Expence e=new Expence();
		e= reportDAO.ExpencesReport(sitecode);
		/*
		 * Double ins=e.getInstalationBudget(); System.out.println(ins); Double
		 * total=e.getCivilBudget()+e.getElectricalBudget()+e.getHandovereBudget()+e.
		 * getInstalationBudget()+e.getPerformanceBudget()+e.getSiteSurveyBudget();
		 * System.out.println("total"+total); e.setTotal(total);
		 */
		return e;
	}
	
}
