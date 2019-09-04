package com.sunjray.osdma.loginRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunjray.osdma.util.QueryConstant;
@Repository
public class RoleDAOImpl implements RoleDAO {
@Autowired
private JdbcTemplate jdbcTemplate;
	@Override
	public List<String> getRoleNames(Long userId) {
		 System.out.println(userId);
		
		List<String> roles = jdbcTemplate.queryForList(QueryConstant.GET_ROLE_LIST,new Object[] { userId }, String.class);
		 System.out.println("Daoimp-l"+roles);
		return roles;
	}

}
