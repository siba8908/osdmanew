package com.sunjray.osdma.HRmodel;

import lombok.Data;

@Data
public class AddressDetails {
	
	private String presentVillage;
	private Integer presentPincode;
	
  public String getPresentVillage() {
    return presentVillage;
  }
  public void setPresentVillage(String presentVillage) {
    this.presentVillage = presentVillage;
  }
  public Integer getPresentPincode() {
    return presentPincode;
  }
  public void setPresentPincode(Integer presentPincode) {
    this.presentPincode = presentPincode;
  }

	
}
