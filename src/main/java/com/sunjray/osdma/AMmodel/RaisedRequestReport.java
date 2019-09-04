package com.sunjray.osdma.AMmodel;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
@Data
public class RaisedRequestReport  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long providerId;
	private String billNo;
	private Double billAmount;
	private String siteCode;
	private Date billDate;
	
	
}
