package com.sunjray.osdma.HRrepository;


import com.sunjray.osdma.HRmodel.CommonLetterData;

public interface CommonLetterDataDAO {
	public CommonLetterData fetchEmployeeExperienceDetailsByEmployeeCode(String employeeCode);
	
}
