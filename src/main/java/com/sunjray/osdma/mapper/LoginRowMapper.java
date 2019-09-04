package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.HRmodel.AppUser;



public class LoginRowMapper implements RowMapper<AppUser> {

	@Override
	public AppUser mapRow(ResultSet rs, int rowNum) throws SQLException {
		AppUser use=null;
		use=new AppUser();
		use.setUser_id(rs.getLong("user_id"));
		use.setUsername(rs.getString(2));
		use.setPassword(rs.getString(3));
		return use;
	}




}
