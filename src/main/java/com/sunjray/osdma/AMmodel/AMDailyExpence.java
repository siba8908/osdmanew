package com.sunjray.osdma.AMmodel;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
@Data
public class AMDailyExpence implements Serializable {

	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
	private String transactionId;
	private Double amount;
	private String accountHead; 
	private String transctionPurpose; 
	private String paymentType; 
	private String bankTransId; 
	private String remarks; 
	private Date transactionDate;
	private String cashFlow;
	
}
