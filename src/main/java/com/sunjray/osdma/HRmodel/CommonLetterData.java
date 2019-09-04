package com.sunjray.osdma.HRmodel;

import lombok.Data;

@Data
public class CommonLetterData {
	private EmployeePersonalDetails employeePersonalDetails;
	public EmployeePersonalDetails getEmployeePersonalDetails() {
		return employeePersonalDetails;
	}

	public void setEmployeePersonalDetails(EmployeePersonalDetails employeePersonalDetails) {
		this.employeePersonalDetails = employeePersonalDetails;
	}

	private CompanyDetails companyDetails;
	public CompanyDetails getCompanyDetails() {
		return companyDetails;
	}

	public void setCompanyDetails(CompanyDetails companyDetails) {
		this.companyDetails = companyDetails;
	}
	
	private AddressDetails addressDetails;
	public AddressDetails getAddressDetails() {
		return addressDetails;
	}

	public void setAddressDetails(AddressDetails addressDetails) {
		this.addressDetails = addressDetails;
	}
	private DistrictDetails districtDetails;
	public DistrictDetails getDistrictDetails() {
		return districtDetails;
	}

	public void setDistrictDetails(DistrictDetails districtDetails) {
		this.districtDetails = districtDetails;
	}
	private StateDetails stateDetails;
	public StateDetails getStateDetails() {
		return stateDetails;
	}

	public void setStateDetails(StateDetails stateDetails) {
		this.stateDetails = stateDetails;
	}
	private AddEmployeeDetails addEmployeeDetails;
	public AddEmployeeDetails getAddEmployeeDetails() {
		return addEmployeeDetails;
	}

	public void setAddEmployeeDetails(AddEmployeeDetails addEmployeeDetails) {
		this.addEmployeeDetails = addEmployeeDetails;
	}
}
