package com.sunjray.osdma.AMmodel;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class ConsingementTrackP2A implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2308472549171552477L;
	private Integer consignmentId;
	private Integer consignmentNo;
	private Date pickupDate;
	private Date godownReciveDate;
	private Date expArrivalDate;
	private Date actArrivalDate;
	/* private Consinment con; */
}
