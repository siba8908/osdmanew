package com.sunjray.osdma.HRmodel;

import java.io.Serializable;

import lombok.Data;
@Data
public class WorkingDays implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long employeeId;
	private Long count;
  public Long getEmployeeId() {
    return employeeId;
  }
  public void setEmployeeId(Long employeeId) {
    this.employeeId = employeeId;
  }
  public Long getCount() {
    return count;
  }
  public void setCount(Long count) {
    this.count = count;
  }
	
	
	

}
