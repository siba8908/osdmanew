package com.sunjray.osdma.HRmodel;
import java.io.Serializable;



public class Attendance implements Serializable {
	
	
	 /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
	
    //private int attedance_id;
	private String employeeCode;
	private String attendeeDate;
	private String attendeeDay;
	private String status;
	private int month;
	private int year;
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getAttendeeDate() {
		return attendeeDate;
	}
	public void setAttendeeDate(String attendeeDate) {
		this.attendeeDate = attendeeDate;
	}
	public String getAttendeeDay() {
		return attendeeDay;
	}
	public void setAttendeeDay(String attendeeDay) {
		this.attendeeDay = attendeeDay;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	
}
