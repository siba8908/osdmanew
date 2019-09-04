package com.sunjray.osdma.HRmodel;

import java.io.Serializable;

import lombok.Data;

@Data
public class Appraisal implements Serializable {

	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long appraisalId;

	private String empCode;
	
	private String section;
	
	private String doe;
	
	private String reviewDateFrom;
	
	private String reviewDateTo;
	
	private String remarks;
	
	private Long employeeId;
	
	private String createdDate;

  public Long getAppraisalId() {
    return appraisalId;
  }

  public void setAppraisalId(Long appraisalId) {
    this.appraisalId = appraisalId;
  }

  public String getEmpCode() {
    return empCode;
  }

  public void setEmpCode(String empCode) {
    this.empCode = empCode;
  }

  public String getSection() {
    return section;
  }

  public void setSection(String section) {
    this.section = section;
  }

  public String getDoe() {
    return doe;
  }

  public void setDoe(String doe) {
    this.doe = doe;
  }

  public String getReviewDateFrom() {
    return reviewDateFrom;
  }

  public void setReviewDateFrom(String reviewDateFrom) {
    this.reviewDateFrom = reviewDateFrom;
  }

  public String getReviewDateTo() {
    return reviewDateTo;
  }

  public void setReviewDateTo(String reviewDateTo) {
    this.reviewDateTo = reviewDateTo;
  }

  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  public Long getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(Long employeeId) {
    this.employeeId = employeeId;
  }

  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }
	
	
	
}