package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.HRmodel.AddEmployeeDetails;
import com.sunjray.osdma.HRmodel.AddressDetails;
import com.sunjray.osdma.HRmodel.DistrictDetails;
import com.sunjray.osdma.HRmodel.EmployeePersonalDetails;
import com.sunjray.osdma.HRmodel.CommonLetterData;
import com.sunjray.osdma.HRmodel.StateDetails;

public class ExperienceCertificateRowMapper implements RowMapper<CommonLetterData> {
	@Override
	public CommonLetterData mapRow(ResultSet rs, int rowNum) throws SQLException {
		 CommonLetterData experienceCertificateObj=null;
		 
		experienceCertificateObj=new CommonLetterData(); 
		EmployeePersonalDetails employeePersonalDetailsObj=new EmployeePersonalDetails();
		AddressDetails addressDetailsObj=new AddressDetails();
		DistrictDetails districtDetailsObj=new DistrictDetails();
		StateDetails stateDetailsObj =new StateDetails();
		AddEmployeeDetails addEmployeeDetailsObj=new AddEmployeeDetails();
		
		System.out.println("ExperienceCertificateRowMa........");
		
		employeePersonalDetailsObj.setFirstName(rs.getString(1));
		employeePersonalDetailsObj.setLastName(rs.getString(2));
		experienceCertificateObj.setEmployeePersonalDetails(employeePersonalDetailsObj);
		//experienceCertificateObj.setRecipientLastName(rs.getString(2));
		addressDetailsObj.setPresentVillage(rs.getString(3));
		addressDetailsObj.setPresentPincode(rs.getInt(4));
		experienceCertificateObj.setAddressDetails(addressDetailsObj);
		//experienceCertificateObj.setPresentVillage(rs.getString(3));
		//experienceCertificateObj.setPincode(rs.getInt(4));
		stateDetailsObj.setPresentState(rs.getString(5));
		experienceCertificateObj.setStateDetails(stateDetailsObj);
		districtDetailsObj.setPresentDistrict(rs.getString(6));
		experienceCertificateObj.setDistrictDetails(districtDetailsObj);
		addEmployeeDetailsObj.setJoinDate(rs.getDate(7));
		addEmployeeDetailsObj.setEmpCode(rs.getString("employee_code"));
		experienceCertificateObj.setAddEmployeeDetails(addEmployeeDetailsObj);
		
		
		
		System.out.println("ExperienceCertificateRowMaend........");
		return experienceCertificateObj;
	}
}
