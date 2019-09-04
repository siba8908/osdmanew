package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.HRmodel.TerminationLetter;

public class TerminationRowMapper implements RowMapper<TerminationLetter> {
	
	@Override
	public TerminationLetter mapRow(ResultSet rs, int rowNum) throws SQLException {
	
		TerminationLetter exit = new TerminationLetter();
		exit.setFirstName(rs.getString("first_name"));
		exit.setLastName(rs.getString("last_name"));
		exit.setPresentVillage(rs.getString("present_village"));
		exit.setDistrictName(rs.getString("district_name"));
		exit.setStateName(rs.getString("state_name"));
		exit.setPresentPin(rs.getString("present_pin"));
	//	exit.setJoinDate(rs.getString(7));
		return exit;
	
	}
}
