package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.HRmodel.User;

public class UserStatusRowMapper implements RowMapper<User> {
	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user=null;
		user=new User();
		user.setName(rs.getString("name"));
		user.setEmail(rs.getString("email"));
		user.setSentStatus(rs.getString("sent_status"));
		
		user.setReceivedStatus(rs.getString("recived_status"));
		return user;
	}
}
