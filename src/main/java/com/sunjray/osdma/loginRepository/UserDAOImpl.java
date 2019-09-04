package com.sunjray.osdma.loginRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunjray.osdma.HRmodel.AppUser;
import com.sunjray.osdma.mapper.LoginRowMapper;
import com.sunjray.osdma.util.QueryConstant;



@Repository
public class UserDAOImpl implements UserDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public AppUser findByUsername(String username) {
		 try {
	            AppUser userInfo = jdbcTemplate.queryForObject(QueryConstant.FIND_USER_NAME,new LoginRowMapper(),username);
	            return userInfo;
	        } catch (EmptyResultDataAccessException e) {
	            return null;
	        }
		//return jdbcTemplate.queryForObject(QueryConstant.FIND_USER_NAME,new LoginRowMapper(),username,password);
	}

}
