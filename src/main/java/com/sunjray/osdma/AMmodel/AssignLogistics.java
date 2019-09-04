package com.sunjray.osdma.AMmodel;

import java.util.Date;

public class AssignLogistics {
	private ConsingementTrackC2P consingementTrackC2P;
	public ConsingementTrackC2P getConsingementTrackC2P() {
		return consingementTrackC2P;
	}
	public void setConsingementTrackC2P(ConsingementTrackC2P consingementTrackC2P) {
		this.consingementTrackC2P = consingementTrackC2P;
	}
	public ProPersonalDtls getProPersonalDtls() {
		return proPersonalDtls;
	}
	public void setProPersonalDtls(ProPersonalDtls proPersonalDtls) {
		this.proPersonalDtls = proPersonalDtls;
	}
	private ProPersonalDtls proPersonalDtls;
	public String getVechileNo() {
		return vechileNo;
	}
	public void setVechileNo(String vechileNo) {
		this.vechileNo = vechileNo;
	}
	public String getlRNo() {
		return lRNo;
	}
	public void setlRNo(String lRNo) {
		this.lRNo = lRNo;
	}
	public String getWayBillNo() {
		return wayBillNo;
	}
	public void setWayBillNo(String wayBillNo) {
		this.wayBillNo = wayBillNo;
	}
	public Date getExpectedArrival() {
		return expectedArrival;
	}
	public void setExpectedArrival(Date expectedArrival) {
		this.expectedArrival = expectedArrival;
	}
	private String vechileNo;
	private String lRNo;
	private String wayBillNo;
	private Date expectedArrival;
	
	

}
