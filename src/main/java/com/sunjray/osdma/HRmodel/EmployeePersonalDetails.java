package com.sunjray.osdma.HRmodel;

import java.io.Serializable;

import lombok.Data;
@Data
public class EmployeePersonalDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long employeeId;
	
	private Long  userId;
	
	private String  firstName;
	
	private String lastName;
	
	private String fullName;
	
	private String fatherName;
	
	private String  DOB;
	
	private String  gender; 
	
	private Long contactNo;
	
	private String religion;
	
	private Long adharNo;
	
	private String  maritalStatus; 
	
	private String	panCardNo;
	
	private String insurancePolicyNo;
	
	private String	regStatus;
	
	private String createdDate;

  public Long getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(Long employeeId) {
    this.employeeId = employeeId;
  }

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
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
  

  public String getFatherName() {
    return fatherName;
  }

  public void setFatherName(String fatherName) {
    this.fatherName = fatherName;
  }

  public String getDOB() {
    return DOB;
  }

  public void setDOB(String dOB) {
    DOB = dOB;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Long getContactNo() {
    return contactNo;
  }

  public void setContactNo(Long contactNo) {
    this.contactNo = contactNo;
  }

  public String getReligion() {
    return religion;
  }

  public void setReligion(String religion) {
    this.religion = religion;
  }

  public Long getAdharNo() {
    return adharNo;
  }

  public void setAdharNo(Long adharNo) {
    this.adharNo = adharNo;
  }

  public String getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public String getPanCardNo() {
    return panCardNo;
  }

  public void setPanCardNo(String panCardNo) {
    this.panCardNo = panCardNo;
  }

  public String getInsurancePolicyNo() {
    return insurancePolicyNo;
  }

  public void setInsurancePolicyNo(String insurancePolicyNo) {
    this.insurancePolicyNo = insurancePolicyNo;
  }

  public String getRegStatus() {
    return regStatus;
  }

  public void setRegStatus(String regStatus) {
    this.regStatus = regStatus;
  }

  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }
	
	
		
}
