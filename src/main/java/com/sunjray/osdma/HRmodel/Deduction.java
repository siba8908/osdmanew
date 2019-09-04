package com.sunjray.osdma.HRmodel;

import java.io.Serializable;

import lombok.Data;
@Data
public class Deduction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fullName;
	private String departmentName;
	private String employeeCode;
	private String firstName;
	private String lastName;
	private Long deductionId;
	private Long employeeId;
	private Double pf;
	private Double esi;
	private Double loan;
	private Double tds;
	private Double workOnHolidays;
	private Double bonus;
	private Double salary;
	private Double caluSalary;
  public String getFullName() {
    return fullName;
  }
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }
  public String getDepartmentName() {
    return departmentName;
  }
  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }
  public String getEmployeeCode() {
    return employeeCode;
  }
  public void setEmployeeCode(String employeeCode) {
    this.employeeCode = employeeCode;
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
  public Long getDeductionId() {
    return deductionId;
  }
  public void setDeductionId(Long deductionId) {
    this.deductionId = deductionId;
  }
  public Long getEmployeeId() {
    return employeeId;
  }
  public void setEmployeeId(Long employeeId) {
    this.employeeId = employeeId;
  }
  public Double getPf() {
    return pf;
  }
  public void setPf(Double pf) {
    this.pf = pf;
  }
  public Double getEsi() {
    return esi;
  }
  public void setEsi(Double esi) {
    this.esi = esi;
  }
  public Double getLoan() {
    return loan;
  }
  public void setLoan(Double loan) {
    this.loan = loan;
  }
  public Double getTds() {
    return tds;
  }
  public void setTds(Double tds) {
    this.tds = tds;
  }
  public Double getWorkOnHolidays() {
    return workOnHolidays;
  }
  public void setWorkOnHolidays(Double workOnHolidays) {
    this.workOnHolidays = workOnHolidays;
  }
  public Double getBonus() {
    return bonus;
  }
  public void setBonus(Double bonus) {
    this.bonus = bonus;
  }
  public Double getSalary() {
    return salary;
  }
  public void setSalary(Double salary) {
    this.salary = salary;
  }
  public Double getCaluSalary() {
    return caluSalary;
  }
  public void setCaluSalary(Double caluSalary) {
    this.caluSalary = caluSalary;
  }
	
	
	
	

}
