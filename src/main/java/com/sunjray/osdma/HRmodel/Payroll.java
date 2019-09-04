package com.sunjray.osdma.HRmodel;

import java.io.Serializable;

import lombok.Data;
@Data
public class Payroll implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String employeeCode;
	private Long employeeId;
	private String firstName;
	private String lastName;
	private String designation;
	private String department;
	private Long totalNoOfDays;
	 private Long noOfDays; 
	private Double salary;
	private WorkingDays workingDays;
  public String getEmployeeCode() {
    return employeeCode;
  }
  public void setEmployeeCode(String employeeCode) {
    this.employeeCode = employeeCode;
  }
  public Long getEmployeeId() {
    return employeeId;
  }
  public void setEmployeeId(Long employeeId) {
    this.employeeId = employeeId;
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
  public String getDepartment() {
    return department;
  }
  public void setDepartment(String department) {
    this.department = department;
  }
  public Long getTotalNoOfDays() {
    return totalNoOfDays;
  }
  public void setTotalNoOfDays(Long totalNoOfDays) {
    this.totalNoOfDays = totalNoOfDays;
  }
  public Long getNoOfDays() {
    return noOfDays;
  }
  public void setNoOfDays(Long noOfDays) {
    this.noOfDays = noOfDays;
  }
  public Double getSalary() {
    return salary;
  }
  public void setSalary(Double salary) {
    this.salary = salary;
  }
  public WorkingDays getWorkingDays() {
    return workingDays;
  }
  public void setWorkingDays(WorkingDays workingDays) {
    this.workingDays = workingDays;
  }
	
	
	
}
