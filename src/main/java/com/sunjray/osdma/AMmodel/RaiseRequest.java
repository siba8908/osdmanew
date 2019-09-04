package com.sunjray.osdma.AMmodel;

import java.io.Serializable;

import lombok.Data;

@Data
public class RaiseRequest implements Serializable{
	private static final long serialVersionUID = 6589129842329530954L;
	private ProPersonalDtls proPersonalDtls;
	
	private ServProBill servProBill;
	private SiteCode siteCode;
	private PmFundRequest pmFundRequest;
  
}
