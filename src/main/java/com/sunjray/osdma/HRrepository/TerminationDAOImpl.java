package com.sunjray.osdma.HRrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunjray.osdma.HRmodel.CompanyDetails;
import com.sunjray.osdma.HRmodel.TerminationLetter;
import com.sunjray.osdma.mapper.CompanyDetailsRowMapper;
import com.sunjray.osdma.mapper.TerminationRowMapper;
import com.sunjray.osdma.util.QueryConstant;
@Repository
public class TerminationDAOImpl implements TerminationDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public TerminationLetter getTerminationDetailsByEmployeeId(Long employeeId) {
		
		TerminationLetter exit = null;
		exit = jdbcTemplate.queryForObject(QueryConstant.GET_TERMINATION_DETAILS, new TerminationRowMapper(), employeeId);
		return exit;
	
	}

	public CompanyDetails fetchCompanyDetails() {
		
		return jdbcTemplate.queryForObject(QueryConstant.GET_COMPANY_NAME,new CompanyDetailsRowMapper());
	
	}
}
