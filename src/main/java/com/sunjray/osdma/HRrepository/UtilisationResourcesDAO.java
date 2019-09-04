package com.sunjray.osdma.HRrepository;

import java.util.List;

import com.sunjray.osdma.HRmodel.UtilisationResources;

public interface UtilisationResourcesDAO {
	public List<UtilisationResources> fetchAllUtilisationResourcesDetails();
	public int insertStatus(List<UtilisationResources> utilisationResourcesStatus);
	public List<UtilisationResources> fetchAllUtilisationResourcesReportDetails(); 

}
