package com.sunjray.osdma.qaqcModel;

import java.io.Serializable;

import lombok.Data;

@Data
public class MaterialCode implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long materialCodeId;
	private String productId;
	private String componentId;
	private Integer itemId;
	private String createdDate;
	private String simProvider;
	private String phoneNo;
	private String imeiNo;
	private String workstatus;
	private Component component;
	private QaqcItem qaqcItem;

	public Long getMaterialCodeId() {
		return materialCodeId;
	}

	public void setMaterialCodeId(Long materialCodeId) {
		this.materialCodeId = materialCodeId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getComponentId() {
		return componentId;
	}

	public void setComponentId(String componentId) {
		this.componentId = componentId;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getSimProvider() {
		return simProvider;
	}

	public void setSimProvider(String simProvider) {
		this.simProvider = simProvider;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getImeiNo() {
		return imeiNo;
	}

	public void setImeiNo(String imeiNo) {
		this.imeiNo = imeiNo;
	}

	public String getWorkstatus() {
		return workstatus;
	}

	public void setWorkstatus(String workstatus) {
		this.workstatus = workstatus;
	}

	public Component getComponent() {
		return component;
	}

	public void setComponent(Component component) {
		this.component = component;
	}

	public QaqcItem getQaqcItem() {
		return qaqcItem;
	}

	public void setQaqcItem(QaqcItem qaqcItem) {
		this.qaqcItem = qaqcItem;
	}

}
