package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.AMmodel.ConsingementTrackP2A;
import com.sunjray.osdma.AMmodel.Consinment;

public class Trackingp2aRowMapper implements RowMapper<ConsingementTrackP2A> {

	@Override
	public ConsingementTrackP2A mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		ConsingementTrackP2A conp2a = new ConsingementTrackP2A();
		conp2a.setConsignmentNo(rs.getInt("consignment_no"));
		conp2a.setActArrivalDate(rs.getDate("actual_arrival"));
		conp2a.setExpArrivalDate(rs.getDate("expected_arrival"));
		conp2a.setPickupDate(rs.getDate("pickup_date"));
		conp2a.setGodownReciveDate(rs.getDate("godown_recive_Date"));
		return conp2a;
	}

}
