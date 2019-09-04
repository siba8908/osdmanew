package com.sunjray.osdma.HRservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunjray.osdma.HRmodel.CommonLetterData;
import com.sunjray.osdma.HRmodel.CompanyDetails;
import com.sunjray.osdma.HRrepository.ComapanyMasterDAO;
import com.sunjray.osdma.HRrepository.CommonLetterDataDAO;

@Service
public class CommonLetterDataServiceImpl implements CommonLetterDataService {
	
	@Autowired
	CommonLetterDataDAO experienceCertificateDAO;

	@Autowired
	private ComapanyMasterDAO companyDetailsDAO;
	
	public CommonLetterData getEmployeeExperienceDetailsByEmployeeCode(String empoyeeCode) {
		CompanyDetails companyDetailsObj=null;
		CommonLetterData experienceCertificateObj=null;
		System.out.println("Bussiness Logic Started....");
		experienceCertificateObj =experienceCertificateDAO.fetchEmployeeExperienceDetailsByEmployeeCode(empoyeeCode);
		//getCompanyDetails();
		companyDetailsObj=companyDetailsDAO.fetchCompanyDetails();
		experienceCertificateObj.setCompanyDetails(companyDetailsObj);
		System.out.println("Bussiness Logic End....");
		return experienceCertificateObj;
		
	}

	
}
