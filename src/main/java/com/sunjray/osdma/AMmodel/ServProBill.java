package com.sunjray.osdma.AMmodel;

import java.util.Date;

import lombok.Data;

@Data
public class ServProBill {
	private Integer billId;
	private String billNo;
	private Integer providerId;
	private Double billAmount;
	private Date billDate;
	private Date paymentDate;
	private Double paymentAmount;
	private Integer createdBy;
	private Integer siteCodeId;
	private ProPersonalDtls pro;

}
