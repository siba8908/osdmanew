package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.AMmodel.Consinment;

public class Trackingc2pRowMapper implements RowMapper<Consinment> {


	@Override
	public Consinment mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Consinment con = new Consinment();
		con.setConsingement_no(rs.getInt("consignment_no"));
		con.setAirwaybill_no(rs.getString("airwaybill_no"));
		con.setStatus(rs.getString("status"));
		con.setExp_arrival_date(rs.getDate("exp_arrival_date"));
		con.setAct_arrival_date(rs.getDate("act_arrival_date"));
		con.setUpdated_on(rs.getDate("updated_on"));
		return con;
	}	
}
