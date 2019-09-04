package com.sunjray.osdma.HRservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunjray.osdma.HRmodel.CompanyDetails;
import com.sunjray.osdma.HRrepository.ComapanyMasterDAO;
@Service
public class CompanyDetailsServiceImpl implements CompanyDetailsService {

	@Autowired
	ComapanyMasterDAO compDAO;
	@Override
	public CompanyDetails fetchCompanyDetails() 
	{
		return compDAO.fetchCompanyDetails();
	}

}
