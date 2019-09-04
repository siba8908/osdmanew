package com.sunjray.osdma.HRmodel;

import java.io.Serializable;

import lombok.Data;
@Data
public class Leave implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private Long leaveId;
	private Long employeeCode;
	private String leaveType; 
	private Long permitedLeave;
	private Long leaveTaken;
	private Long avaliableLeave;
  public Long getLeaveId() {
    return leaveId;
  }
  public void setLeaveId(Long leaveId) {
    this.leaveId = leaveId;
  }
  public Long getEmployeeCode() {
    return employeeCode;
  }
  public void setEmployeeCode(Long employeeCode) {
    this.employeeCode = employeeCode;
  }
  public String getLeaveType() {
    return leaveType;
  }
  public void setLeaveType(String leaveType) {
    this.leaveType = leaveType;
  }
  public Long getPermitedLeave() {
    return permitedLeave;
  }
  public void setPermitedLeave(Long permitedLeave) {
    this.permitedLeave = permitedLeave;
  }
  public Long getLeaveTaken() {
    return leaveTaken;
  }
  public void setLeaveTaken(Long leaveTaken) {
    this.leaveTaken = leaveTaken;
  }
  public Long getAvaliableLeave() {
    return avaliableLeave;
  }
  public void setAvaliableLeave(Long avaliableLeave) {
    this.avaliableLeave = avaliableLeave;
  }
	
	
	
	
	
}
