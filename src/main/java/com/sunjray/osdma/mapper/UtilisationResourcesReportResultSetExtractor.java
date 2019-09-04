package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.sunjray.osdma.HRmodel.EmployeePersonalDetails;
import com.sunjray.osdma.HRmodel.ProjectDetails;
import com.sunjray.osdma.HRmodel.TeamDetails;
import com.sunjray.osdma.HRmodel.UtilisationResources;

public class UtilisationResourcesReportResultSetExtractor implements ResultSetExtractor<List<UtilisationResources>> {

	@Override
	public List<UtilisationResources> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<UtilisationResources>  utilisationResourcesList=new ArrayList<UtilisationResources>();
		UtilisationResources utilisationResourcesObj=null;
		ProjectDetails projectDetailsObj=null;
		EmployeePersonalDetails employeePersonalDetailsObj=null;
		TeamDetails teamDetailsObj=null;
		
		while(rs.next())
		{
			utilisationResourcesObj=new UtilisationResources();
			projectDetailsObj=new ProjectDetails();
			projectDetailsObj.setProjectName(rs.getString(1));
			
			teamDetailsObj=new TeamDetails();
			teamDetailsObj.setTeamName(rs.getString(2));
			

			employeePersonalDetailsObj=new EmployeePersonalDetails();
			employeePersonalDetailsObj.setFirstName(rs.getString(3));
			

			employeePersonalDetailsObj.setLastName(rs.getString(4));
			employeePersonalDetailsObj.setFullName(rs.getString(3)+" "+rs.getString(4));
			utilisationResourcesObj.setUtilID(rs.getLong(5));
			utilisationResourcesObj.setStatus(rs.getString("status"));
			utilisationResourcesObj.setProjectDetails(projectDetailsObj);
			utilisationResourcesObj.setEmployeePersonalDetails(employeePersonalDetailsObj);
			utilisationResourcesObj.setTeamDetails(teamDetailsObj);
			utilisationResourcesList.add(utilisationResourcesObj);
		}
		return utilisationResourcesList;
		
	}
}
