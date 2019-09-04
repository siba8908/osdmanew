package com.sunjray.osdma.HRrepository;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunjray.osdma.mapper.UtilisationResourcesListResultSetExtractor;
import com.sunjray.osdma.mapper.UtilisationResourcesReportResultSetExtractor;
import com.sunjray.osdma.HRmodel.UtilisationResources;
import com.sunjray.osdma.util.QueryConstant;

@Repository
public class UtilisationResourcesDAOImpl implements UtilisationResourcesDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<UtilisationResources> fetchAllUtilisationResourcesDetails()
	{
		//System.out.println("DAOIMPL....");
		List<UtilisationResources> utilisationResourcesListObj=null; 
		utilisationResourcesListObj=jdbcTemplate.query(QueryConstant.GET_RESOURCES_UTILISATION_DETAILS, new UtilisationResourcesListResultSetExtractor());
		return utilisationResourcesListObj;
	}
	public int insertStatus(List<UtilisationResources> utilisationResourcesStatus)
	{
		
		int result=0;
	Iterator<UtilisationResources> utilisationResourcesStatusList=utilisationResourcesStatus.iterator();
	while(utilisationResourcesStatusList.hasNext())
	{
		UtilisationResources utilisationResourcesObj=utilisationResourcesStatusList.next();
		result=jdbcTemplate.update(QueryConstant.SET_STATUS,utilisationResourcesObj.getStatus(),utilisationResourcesObj.getUtilID());
		}
	return result;
	}
	public List<UtilisationResources> fetchAllUtilisationResourcesReportDetails()
	{
		List<UtilisationResources> utilisationResourcesListObj=null; 
		utilisationResourcesListObj=jdbcTemplate.query(QueryConstant.GET_RESOURCES_UTILISATION_REPORT_DETAILS, new UtilisationResourcesReportResultSetExtractor());
		return utilisationResourcesListObj;
	}
	

}
