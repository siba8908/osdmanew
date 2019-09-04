package com.sunjray.osdma.qaqcModel;

import java.io.Serializable;

import lombok.Data;
@Data
public class Component implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3757249934440522139L;
	
	private Integer componentId;
	private String componentName;
	private String quantity;
	private Integer productId;
	
}
