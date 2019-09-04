package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.AMmodel.Consinment;


public class AccountRowMapper implements RowMapper<Consinment> {

	@Override
	public Consinment mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Consinment con=null;
		con=new Consinment();
		con.setConsignment_id(rs.getInt(1));
		con.setConsingement_no(rs.getInt(2));
		con.setAirwaybill_no(rs.getString(3));
		con.setStatus(rs.getString(4));
		con.setExp_arrival_date(rs.getDate(5));
		con.setAct_arrival_date(rs.getDate(6));
		con.setUpdated_on(rs.getDate(7));
		return con;
	}

}
