package com.sunjray.osdma.HRmodel;

import java.io.Serializable;
import java.sql.Date;

import lombok.Data;
@Data
public class LeaveManagement implements Serializable  {
		
	private static final long serialVersionUID = 1L;
		
		private String employeeCode;
	
		private Date fromDate;
	
	    private Date toDate;
			
		private String leaveType;
		 
		private Long leaveTaken;
				

}
