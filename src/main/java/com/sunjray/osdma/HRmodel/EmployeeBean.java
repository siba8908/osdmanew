package com.sunjray.osdma.HRmodel;

import java.io.Serializable;

import lombok.Data;
@Data

public class EmployeeBean implements Serializable {

	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String firstName;
	
	private String lastName;
	
	private String empName;		
	
	private String designation;
	
	private String departmentName;	
		
	private Long addEmpId;
	
	private Long designationId;
	
	private Double salary;
	
	private Long departmentId;
	
	private String joiningDate;
	
	private String createdDate;
	
	private String employeeCode;
	
	private Long employeeId;
	
	private Long allowanceId;
	
	private Long deductionId;
	
	private EmployeePersonalDetails empdetails;
	
	private MasterDepartment masterDepartment;
	
	private MasterDesignation masterDesignation;

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

  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }

  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public Long getAddEmpId() {
    return addEmpId;
  }

  public void setAddEmpId(Long addEmpId) {
    this.addEmpId = addEmpId;
  }

  public Long getDesignationId() {
    return designationId;
  }

  public void setDesignationId(Long designationId) {
    this.designationId = designationId;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  public Long getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(Long departmentId) {
    this.departmentId = departmentId;
  }

  public String getJoiningDate() {
    return joiningDate;
  }

  public void setJoiningDate(String joiningDate) {
    this.joiningDate = joiningDate;
  }

  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

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

  public Long getAllowanceId() {
    return allowanceId;
  }

  public void setAllowanceId(Long allowanceId) {
    this.allowanceId = allowanceId;
  }

  public Long getDeductionId() {
    return deductionId;
  }

  public void setDeductionId(Long deductionId) {
    this.deductionId = deductionId;
  }

  public EmployeePersonalDetails getEmpdetails() {
    return empdetails;
  }

  public void setEmpdetails(EmployeePersonalDetails empdetails) {
    this.empdetails = empdetails;
  }

  public MasterDepartment getMasterDepartment() {
    return masterDepartment;
  }

  public void setMasterDepartment(MasterDepartment masterDepartment) {
    this.masterDepartment = masterDepartment;
  }

  public MasterDesignation getMasterDesignation() {
    return masterDesignation;
  }

  public void setMasterDesignation(MasterDesignation masterDesignation) {
    this.masterDesignation = masterDesignation;
  }
	
	
	
}
