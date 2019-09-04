package com.sunjray.osdma.HRmodel;

import java.util.List;


public class SingleEmpDetails {

 //Employee personal details
private String firstName;
private String lastName;
private String fatherName;
private String dob;
private String gender;
private Long contactNo;
private String religion;
private Long adharNo;
private String maritalStatus;
private String insurancePolicyNo;

  //Incase of emergency
private String contactPerson;
private String relationship;
private Long relContactNo;
private String bloodGroup;

   //Employee Address details
private String village;
private String post;
private String station;
private int state;
private String stateName;
public String getStateName() {
	return stateName;
}
public void setStateName(String stateName) {
	this.stateName = stateName;
}
private int dist;
private String distName;
public String getDistName() {
	return distName;
}
public void setDistName(String distName) {
	this.distName = distName;
}
private int pin;

//Employee education details
private  List<EmployeeEducationBean> empEducation;

//Employee experience information
private  List<EmpoloyeeExperienceBean> empExperience;

/*private String organisationName;
private String designation;
private String joiningDate;
private String relievingDate;
private Long orgContactNo;*/

//Employee Account details
private String accountHolderName;
private Long accountNo;
private String bankName;
private String ifscCode;


public String getIfscCode() {
	return ifscCode;
}
public void setIfscCode(String ifscCode) {
	this.ifscCode = ifscCode;
}
public int getState() {
	return state;
}
public void setState(int State) {
	this.state = State;
}
public List<EmployeeEducationBean> getEmpEducation() {
	return empEducation;
}
public void setEmpEducation(List<EmployeeEducationBean> empEducation) {
	this.empEducation = empEducation;
}
public List<EmpoloyeeExperienceBean> getEmpExperience() {
	return empExperience;
}
public void setEmpExperience(List<EmpoloyeeExperienceBean> empExperience) {
	this.empExperience = empExperience;
}


public String getAccountHolderName() {
	return accountHolderName;
}
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}
public Long getAccountNo() {
	return accountNo;
}
public void setAccountNo(Long accountNo) {
	this.accountNo = accountNo;
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}



public String getVillage() {
	return village;
}
public void setVillage(String village) {
	this.village = village;
}
public String getPost() {
	return post;
}
public void setPost(String post) {
	this.post = post;
}
public String getStation() {
	return station;
}
public void setStation(String station) {
	this.station = station;
}
public int getDist() {
	return dist;
}
public void setDist(int dist) {
	this.dist = dist;
}


public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}

public String getContactPerson() {
	return contactPerson;
}
public void setContactPerson(String contactPerson) {
	this.contactPerson = contactPerson;
}
public String getRelationship() {
	return relationship;
}
public void setRelationship(String relationship) {
	this.relationship = relationship;
}
public Long getRelContactNo() {
	return relContactNo;
}
public void setRelContactNo(Long relContactNo) {
	this.relContactNo = relContactNo;
}
public String getBloodGroup() {
	return bloodGroup;
}
public void setBloodGroup(String bloodGroup) {
	this.bloodGroup = bloodGroup;
}

public String getMaritalStatus() {
	return maritalStatus;
}
public void setMaritalStatus(String maritalStatus) {
	this.maritalStatus = maritalStatus;
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
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
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
public String getInsurancePolicyNo() {
	return insurancePolicyNo;
}
public void setInsurancePolicyNo(String insurancePolicyNo) {
	this.insurancePolicyNo = insurancePolicyNo;
}


	
	
}
