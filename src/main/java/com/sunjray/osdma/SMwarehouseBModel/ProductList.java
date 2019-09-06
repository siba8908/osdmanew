package com.sunjray.osdma.SMwarehouseBModel;

import lombok.Data;

@Data
public class ProductList {

	private String productList;
	private String productCode;
	private String productName;
	private int quantity;
	private String stock;
	private String location;
	private String remark;

	public String getProductList() {
		return productList;
	}

	public void setProductList(String productList) {
		this.productList = productList;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "ProductList [productList=" + productList + ", productCode=" + productCode + ", description="
				+ productName + ", quantity=" + quantity + ", stock=" + stock + ", location=" + location + ", remark="
				+ remark + "]";
	}

}
