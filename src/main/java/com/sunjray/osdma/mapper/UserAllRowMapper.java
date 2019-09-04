package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.HRmodel.User;

public class UserAllRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User u = null;
		u = new User();
		System.out.println("hhhhh" + rs.getString("email"));
		u.setEmail(rs.getString("email"));
		u.setName(rs.getString("name"));
		u.setUserId(rs.getLong("user_id"));
		u.setSentStatus(rs.getString("sent_status"));

		u.setReceivedStatus(rs.getString("received_status"));
		return u;
	}

}
