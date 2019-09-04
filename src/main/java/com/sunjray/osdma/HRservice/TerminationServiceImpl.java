 package com.sunjray.osdma.HRservice;
  
 import org.springframework.beans.factory.annotation.Autowired; 
 import org.springframework.stereotype.Service;

import com.sunjray.osdma.HRmodel.CompanyDetails;
import com.sunjray.osdma.HRmodel.TerminationLetter;
import com.sunjray.osdma.HRrepository.TerminationDAO;

 @Service 
 public class TerminationServiceImpl implements TerminationService {
  
	@Autowired
	private TerminationDAO terminationDAO;
	TerminationLetter exit = null;

	@Override
	public TerminationLetter getTerminationDetailsByEmployeeId(Long employeeId) {
		
		exit = terminationDAO.getTerminationDetailsByEmployeeId(employeeId);
		getCompanyDetails();
		return exit;

	}
	public CompanyDetails getCompanyDetails() {
		
		CompanyDetails companyDetails=null;
		companyDetails=terminationDAO.fetchCompanyDetails();
		exit.setCompanyDetails(companyDetails);
		return companyDetails;
	}
  
  
  }
 