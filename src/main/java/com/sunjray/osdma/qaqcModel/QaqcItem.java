package com.sunjray.osdma.qaqcModel;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
@Data
public class QaqcItem implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2181721277650031375L;
	
	private Integer itemId;
	private String productCode;
	private String barcode;
	private String quality;
	private Date createdDate;
	private Integer createdBy;
	private String remarks;
	private Integer materialId;
	private Component component;
	}
