package com.sunjray.osdma.HRservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunjray.osdma.HRmodel.OfferLetterData;
import com.sunjray.osdma.HRrepository.ComapanyMasterDAO;
import com.sunjray.osdma.HRrepository.EmployeeDesignationDao;

@Service
public class EmployeeOfferLetterImpl implements EmployeeOfferLetterService {

	@Autowired
	EmployeeDesignationDao empDesignation;
	@Autowired
	ComapanyMasterDAO compdao;

	
	@Override
	public OfferLetterData getOfferLetterData() {
		OfferLetterData ol=new OfferLetterData();
		ol.setDesignationlist(empDesignation.getAllDesignations());
		ol.setCompanydetails(compdao.fetchCompanyDetails());
		return ol;
		
	}

}
