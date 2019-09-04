 package com.sunjray.osdma.HRservice;

 import com.sunjray.osdma.HRmodel.CompanyDetails;
import com.sunjray.osdma.HRmodel.TerminationLetter;

 public interface TerminationService {

	 public TerminationLetter getTerminationDetailsByEmployeeId(Long employeeId);
	 public CompanyDetails getCompanyDetails();
 
 }
