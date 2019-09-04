package com.sunjray.osdma.dto;

import java.util.List;

public class TeamMemberDTO {

	private String teamName;
	private List<Long> teamMembersEmployeeId;
	private String firstName;
	private String lastName;
	private String employeeCode;
	private String designation;
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public List<Long> getTeamMembersEmployeeId() {
		return teamMembersEmployeeId;
	}

	public void setTeamMembersEmployeeId(List<Long> teamMembersEmployeeId) {
		this.teamMembersEmployeeId = teamMembersEmployeeId;
	}

	@Override
	public String toString() {
		return "TeamMemberDTO [teamName=" + teamName + ", teamMembersEmployeeId=" + teamMembersEmployeeId + "]";
	}

}
