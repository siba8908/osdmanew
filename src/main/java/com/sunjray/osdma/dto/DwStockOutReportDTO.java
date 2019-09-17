package com.sunjray.osdma.dto;

public class DwStockOutReportDTO {

	private String productName;
	private String productCode;
	private Integer quantity;
	private String fromLocation;
	private String toLocation;
	private String outwardDate;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getFromLocation() {
		return fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	public String getToLocation() {
		return toLocation;
	}

	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}

	public String getOutwardDate() {
		return outwardDate;
	}

	public void setOutwardDate(String outwardDate) {
		this.outwardDate = outwardDate;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	

}
