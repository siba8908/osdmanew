
package com.sunjray.osdma.HRmodel;

import java.io.Serializable;

import lombok.Data;

@Data
public class UtilisationResources implements Serializable {
	private static final long serialVersionUID = 6589129842329530954L;
	private Long utilID;
	private String status;
	private ProjectDetails projectDetails;
	private TeamDetails teamDetails;
	private EmployeePersonalDetails employeePersonalDetails;
	
  public Long getUtilID() {
    return utilID;
  }
  public void setUtilID(Long utilID) {
    this.utilID = utilID;
  }
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }
  public ProjectDetails getProjectDetails() {
    return projectDetails;
  }
  public void setProjectDetails(ProjectDetails projectDetails) {
    this.projectDetails = projectDetails;
  }
  public TeamDetails getTeamDetails() {
    return teamDetails;
  }
  public void setTeamDetails(TeamDetails teamDetails) {
    this.teamDetails = teamDetails;
  }
  public EmployeePersonalDetails getEmployeePersonalDetails() {
    return employeePersonalDetails;
  }
  public void setEmployeePersonalDetails(EmployeePersonalDetails employeePersonalDetails) {
    this.employeePersonalDetails = employeePersonalDetails;
  }
	

}
