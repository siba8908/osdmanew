package com.sunjray.osdma.HRmodel;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;


@Data
public class AddEmployeeDetails implements Serializable {
	private static final long serialVersionUID = 6589129842329530954L;
	private String empCode;
	private Date joinDate;
	
  public String getEmpCode() {
    return empCode;
  }
  public void setEmpCode(String empCode) {
    this.empCode = empCode;
  }
  public Date getJoinDate() {
    return joinDate;
  }
  public void setJoinDate(Date joinDate) {
    this.joinDate = joinDate;
  }
	
	
	

}
