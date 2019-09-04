package com.sunjray.osdma.HRmodel;

import java.util.Date;

import lombok.Data;

@Data
public class NatureOfInfraction {
	private MasterNatureOfInfraction masterNatureOfInfraction;
	private AddEmployeeDetails addEmployeeDetails;
	private String others;
	private Date date;
	private String infractionLocation;
	private String details;
  public MasterNatureOfInfraction getMasterNatureOfInfraction() {
    return masterNatureOfInfraction;
  }
  public void setMasterNatureOfInfraction(MasterNatureOfInfraction masterNatureOfInfraction) {
    this.masterNatureOfInfraction = masterNatureOfInfraction;
  }
  public AddEmployeeDetails getAddEmployeeDetails() {
    return addEmployeeDetails;
  }
  public void setAddEmployeeDetails(AddEmployeeDetails addEmployeeDetails) {
    this.addEmployeeDetails = addEmployeeDetails;
  }
  public String getOthers() {
    return others;
  }
  public void setOthers(String others) {
    this.others = others;
  }
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }
  public String getInfractionLocation() {
    return infractionLocation;
  }
  public void setInfractionLocation(String infractionLocation) {
    this.infractionLocation = infractionLocation;
  }
  public String getDetails() {
    return details;
  }
  public void setDetails(String details) {
    this.details = details;
  }

}
