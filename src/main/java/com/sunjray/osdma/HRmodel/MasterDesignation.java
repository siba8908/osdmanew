package com.sunjray.osdma.HRmodel;

import java.io.Serializable;

import lombok.Data;
@Data
public class MasterDesignation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int designationId;
	private String designationName;
	public int getDesignationId() {
		return designationId;
	}
	public void setDesignationId(int designationId) {
		this.designationId = designationId;
	}
	public String getDesignationName() {
		return designationName;
	}
	public void setDesignationName(String designationName) {
		this.designationName = designationName;
	}

}
