package com.sunjray.osdma.HRrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.sunjray.osdma.mapper.ExperienceCertificateRowMapper;

import com.sunjray.osdma.HRmodel.CommonLetterData;
import com.sunjray.osdma.util.QueryConstant;

@Repository
public class CommonLetterDataDAOImpl implements CommonLetterDataDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public CommonLetterData fetchEmployeeExperienceDetailsByEmployeeCode(String employeeCode)
	{
		
		CommonLetterData experienceCertificate=null;
		System.out.println("ExperienceCertificateDAOIMPL started....");
		experienceCertificate=jdbcTemplate.queryForObject(QueryConstant.GET_EMPLOYEE_EXPERIENCE_DETAILS, new ExperienceCertificateRowMapper(),employeeCode);
		
	
		System.out.println("ExperienceCertificateDAOIMPL end....");

		return experienceCertificate;
	}
	
}
