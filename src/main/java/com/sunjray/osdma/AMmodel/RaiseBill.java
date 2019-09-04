package com.sunjray.osdma.AMmodel;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
@Data
public class RaiseBill implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String siteName;
	private String remarks;
	
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	public Long getSiteCodeId() {
		return siteCodeId;
	}
	public void setSiteCodeId(Long siteCodeId) {
		this.siteCodeId = siteCodeId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Date getSiteDate() {
		return siteDate;
	}
	public void setSiteDate(Date siteDate) {
		this.siteDate = siteDate;
	}
	private Long siteCodeId;
	private Double amount;
	private Date siteDate;
	

}
