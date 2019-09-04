 package com.sunjray.osdma.HRrepository;

 import com.sunjray.osdma.HRmodel.CompanyDetails;
 import com.sunjray.osdma.HRmodel.TerminationLetter;

 public interface TerminationDAO {

	 TerminationLetter getTerminationDetailsByEmployeeId(Long employeeId);
	
	 public CompanyDetails fetchCompanyDetails(); 
  
 }
 