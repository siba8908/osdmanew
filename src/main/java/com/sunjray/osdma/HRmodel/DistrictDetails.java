package com.sunjray.osdma.HRmodel;

import lombok.Data;

@Data
public class DistrictDetails {
		
	private Integer districtId;
	private String presentDistrict;
  public Integer getDistrictId() {
    return districtId;
  }
  public void setDistrictId(Integer districtId) {
    this.districtId = districtId;
  }
  public String getPresentDistrict() {
    return presentDistrict;
  }
  public void setPresentDistrict(String presentDistrict) {
    this.presentDistrict = presentDistrict;
  }

}
