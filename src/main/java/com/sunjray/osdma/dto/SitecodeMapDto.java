package com.sunjray.osdma.dto;

public class SitecodeMapDto {
	private long siteCodeId;
	private String siteCode;
	private String siteName;
	private double longitude;
	private double latitude;

	public long getSiteCodeId() {
		return siteCodeId;
	}

	public void setSiteCodeId(long siteCodeId) {
		this.siteCodeId = siteCodeId;
	}

	public String getSiteCode() {
		return siteCode;
	}

	public void setSiteCode(String siteCode) {
		this.siteCode = siteCode;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	@Override
	public String toString() {
		return "SitecodeMapDto [siteCodeId=" + siteCodeId + ", siteCode=" + siteCode + ", siteName=" + siteName
				+ ", longitude=" + longitude + ", latitude=" + latitude + "]";
	}

}
