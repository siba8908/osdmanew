package com.sunjray.osdma.HRmodel;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class OfferLetterData {
	
	//private Integer empCode;
	private CompanyDetails companydetails;
	List<MasterDesignation> designationlist;
	
	
  public CompanyDetails getCompanydetails() {
    return companydetails;
  }
  public void setCompanydetails(CompanyDetails companydetails) {
    this.companydetails = companydetails;
  }
  public List<MasterDesignation> getDesignationlist() {
    return designationlist;
  }
  public void setDesignationlist(List<MasterDesignation> designationlist) {
    this.designationlist = designationlist;
  }

}
