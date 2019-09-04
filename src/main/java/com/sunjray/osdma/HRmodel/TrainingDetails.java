package com.sunjray.osdma.HRmodel;

import java.io.Serializable;

import lombok.Data;
@Data
public class TrainingDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String firstName;
	
	private String lastName;
	
	private String empName;		
	
	private Long trainingId;
	
	private Long employeeId;
	
	private String typesOfTraining;
	
	private String currentDate;
	
	private EmployeePersonalDetails empdetails;

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

  public Long getTrainingId() {
    return trainingId;
  }

  public void setTrainingId(Long trainingId) {
    this.trainingId = trainingId;
  }

  public Long getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(Long employeeId) {
    this.employeeId = employeeId;
  }

  public String getTypesOfTraining() {
    return typesOfTraining;
  }

  public void setTypesOfTraining(String typesOfTraining) {
    this.typesOfTraining = typesOfTraining;
  }

  public String getCurrentDate() {
    return currentDate;
  }

  public void setCurrentDate(String currentDate) {
    this.currentDate = currentDate;
  }

  public EmployeePersonalDetails getEmpdetails() {
    return empdetails;
  }

  public void setEmpdetails(EmployeePersonalDetails empdetails) {
    this.empdetails = empdetails;
  }
	
	

}
