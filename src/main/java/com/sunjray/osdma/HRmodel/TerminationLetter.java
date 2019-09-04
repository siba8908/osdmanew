package com.sunjray.osdma.HRmodel;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
@Data
public class TerminationLetter implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long employeeId;

	private String firstName;
	
	private String lastName;
	
	private CompanyDetails companyDetails;
	
	private String presentVillage;
	
	private String districtName;
	
	private String stateName;
	
	private String presentPin;
	
	private String joinDate;
	
	private Date propertyReturnDate;
	
	private Date terminationDate;
	
	private String reason;

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

  public CompanyDetails getCompanyDetails() {
    return companyDetails;
  }

  public void setCompanyDetails(CompanyDetails companyDetails) {
    this.companyDetails = companyDetails;
  }

  public String getPresentVillage() {
    return presentVillage;
  }

  public void setPresentVillage(String presentVillage) {
    this.presentVillage = presentVillage;
  }

  public String getDistrictName() {
    return districtName;
  }

  public void setDistrictName(String districtName) {
    this.districtName = districtName;
  }

  public String getStateName() {
    return stateName;
  }

  public void setStateName(String stateName) {
    this.stateName = stateName;
  }

  public String getPresentPin() {
    return presentPin;
  }

  public void setPresentPin(String presentPin) {
    this.presentPin = presentPin;
  }

  public String getJoinDate() {
    return joinDate;
  }

  public void setJoinDate(String joinDate) {
    this.joinDate = joinDate;
  }

  public Date getPropertyReturnDate() {
    return propertyReturnDate;
  }

  public void setPropertyReturnDate(Date propertyReturnDate) {
    this.propertyReturnDate = propertyReturnDate;
  }

  public Date getTerminationDate() {
    return terminationDate;
  }

  public void setTerminationDate(Date terminationDate) {
    this.terminationDate = terminationDate;
  }

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }
	
	
	 
}