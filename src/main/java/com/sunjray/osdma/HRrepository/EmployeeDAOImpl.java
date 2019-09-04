package com.sunjray.osdma.HRrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunjray.osdma.HRmodel.EmployeeList;
import com.sunjray.osdma.mapper.EmployeeListRowMapper;
import com.sunjray.osdma.mapper.EmployeeLeaveRowMapper;
import com.sunjray.osdma.util.QueryConstant;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Iterable<EmployeeList> getEmployeelist() {
		
		return jdbcTemplate.query(QueryConstant.DISPLAYALL_EMPLOYEE,new EmployeeListRowMapper());
	}

}
