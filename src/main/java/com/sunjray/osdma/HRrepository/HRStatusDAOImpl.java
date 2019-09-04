package com.sunjray.osdma.HRrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunjray.osdma.HRmodel.User;
import com.sunjray.osdma.mapper.UserAllRowMapper;
import com.sunjray.osdma.mapper.UserStatusRowMapper;
import com.sunjray.osdma.util.QueryConstant;

@Repository
public class HRStatusDAOImpl implements HRStatusDao {

	@Autowired
	private JdbcTemplate jt;
	
	
	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		List<User> userList=null;
		userList=jt.query(QueryConstant.GET_USER, new UserAllRowMapper());
		return userList;
	}

	/*
	 * @Override public Iterable<User> getAllEmployee() { List<User> userList =
	 * null; userList = jt.query(QueryConstant.GET_USER_STATUS, new
	 * UserStatusRowMapper()); return userList; }
	 */
	 
	
	

}
