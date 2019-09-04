package com.sunjray.osdma.dto;

public class ConsignmentLogisticDTO {
	private Integer logAsignmentId;
	private Integer consignmentId;
	private Integer consignmentNo;
	private Integer logisticId;
	private String vechileNo;
	private String lrNo;
	private String ewayBilNo;
	private String expArrival;
	private String pickupDate;
	private String status;
	private String actualArrival;
	private String itemNames;
	private Integer quantity;
	
	

	public String getItemNames() {
		return itemNames;
	}

	public void setItemNames(String itemNames) {
		this.itemNames = itemNames;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getLogAsignmentId() {
		return logAsignmentId;
	}

	public void setLogAsignmentId(Integer logAsignmentId) {
		this.logAsignmentId = logAsignmentId;
	}

	public Integer getConsignmentId() {
		return consignmentId;
	}

	public void setConsignmentId(Integer consignmentId) {
		this.consignmentId = consignmentId;
	}

	public Integer getConsignmentNo() {
		return consignmentNo;
	}

	public void setConsignmentNo(Integer consignmentNo) {
		this.consignmentNo = consignmentNo;
	}

	public Integer getLogisticId() {
		return logisticId;
	}

	public void setLogisticId(Integer logisticId) {
		this.logisticId = logisticId;
	}

	public String getVechileNo() {
		return vechileNo;
	}

	public void setVechileNo(String vechileNo) {
		this.vechileNo = vechileNo;
	}

	public String getLrNo() {
		return lrNo;
	}

	public void setLrNo(String lrNo) {
		this.lrNo = lrNo;
	}

	public String getEwayBilNo() {
		return ewayBilNo;
	}

	public void setEwayBilNo(String ewayBilNo) {
		this.ewayBilNo = ewayBilNo;
	}

	public String getExpArrival() {
		return expArrival;
	}

	public void setExpArrival(String expArrival) {
		this.expArrival = expArrival;
	}

	public String getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(String pickupDate) {
		this.pickupDate = pickupDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getActualArrival() {
		return actualArrival;
	}

	public void setActualArrival(String actualArrival) {
		this.actualArrival = actualArrival;
	}

}
