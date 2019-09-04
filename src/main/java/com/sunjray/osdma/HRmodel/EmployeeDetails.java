package com.sunjray.osdma.HRmodel;

import java.io.Serializable;

import lombok.Data;
@Data
public class EmployeeDetails implements Serializable {

	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String employee_code;
	
	private String firstName;
	private String lastName;
	private String designation;
	private String fullName;
	public String getEmployee_code() {
		return employee_code;
	}
	public void setEmployee_code(String employee_code) {
		this.employee_code = employee_code;
	}
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
