package com.sunjray.osdma.AMmodel;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
@Data
public class AMDashboard  implements Serializable 
{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Date date;	
	private Long raisedFor;
	private String siteCode;	
	private String typeOfWork;	
	private Double amountRequested;	
	private String purpose;	
	private Double approvedAmount;	
	private String remark;
	private String transactionId;
	
}
