package com.sunjray.osdma.HRservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.sunjray.osdma.HRmodel.UtilisationResources;
import com.sunjray.osdma.HRrepository.UtilisationResourcesDAO;
import com.sunjray.osdma.constants.AppConstants;

@Service
public class UtilisationResourcesServiceImpl implements UtilisationResourcesService {
	
	@Autowired
	private UtilisationResourcesDAO utilisationResourcesDAOImplObj;
	public List<UtilisationResources> getAllUtilisationResources()
	{
		List<UtilisationResources> UtilisationResources=null;
		System.out.println("Bussiness method Started...");
		UtilisationResources= utilisationResourcesDAOImplObj.fetchAllUtilisationResourcesDetails();
		System.out.println("Bussiness method End...");

		return UtilisationResources;
	}
	public String insertAllStatus(List<UtilisationResources> utilisationResourcesStatus) {
		String message=null;
		int result;
		System.out.println("Bussiness method Started...");
		try {
		result=utilisationResourcesDAOImplObj.insertStatus(utilisationResourcesStatus);
		if(result==1)
		{
			message=AppConstants.INSERTSUCESSMSG;
		}
		}
		catch(EmptyResultDataAccessException e)
		{
			 message=AppConstants.ERRORMSG;
		}
		return message;
	}
	public List<UtilisationResources> getAllUtilisationResourcesReport()
	{
		
		return utilisationResourcesDAOImplObj.fetchAllUtilisationResourcesReportDetails();
	}
}
