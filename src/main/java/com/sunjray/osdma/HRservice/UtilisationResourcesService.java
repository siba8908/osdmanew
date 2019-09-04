package com.sunjray.osdma.HRservice;

import java.util.List;

import com.sunjray.osdma.HRmodel.UtilisationResources;

public interface UtilisationResourcesService {
	public List<UtilisationResources> getAllUtilisationResources();
	public String insertAllStatus(List<UtilisationResources> utilisationResourcesStatus);
	public List<UtilisationResources> getAllUtilisationResourcesReport();

}
