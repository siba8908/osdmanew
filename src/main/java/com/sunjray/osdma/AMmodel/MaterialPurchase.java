package com.sunjray.osdma.AMmodel;

import java.io.Serializable;

import lombok.Data;
@Data
public class MaterialPurchase implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3281287037443179314L;
	
	private Integer materialId;
	private String itemName;
	private String serialNo;
	private Integer quantity;
	private Integer consignmentId;
	private ConsingementTrackC2P cong;
	
}
