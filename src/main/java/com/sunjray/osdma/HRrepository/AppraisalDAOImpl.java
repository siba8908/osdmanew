package com.sunjray.osdma.HRrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunjray.osdma.HRmodel.EmployeeBean;
import com.sunjray.osdma.mapper.AppraisalRowMapper;
import com.sunjray.osdma.util.QueryConstant;

@Repository
public class AppraisalDAOImpl implements AppraisalDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public EmployeeBean getAllDetailsByEmpId(Long employeeId) {
		
		return jdbcTemplate.queryForObject(QueryConstant.GET_DETAILS_BY_EMPLOYEE_ID, new AppraisalRowMapper(),employeeId);
	
	}

}
