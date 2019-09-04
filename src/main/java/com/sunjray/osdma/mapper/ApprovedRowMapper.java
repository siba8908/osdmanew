package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.AMmodel.AMDashboard;

public class ApprovedRowMapper implements RowMapper<AMDashboard> {

	@Override
	public AMDashboard mapRow(ResultSet rs, int rowNum) throws SQLException {
	
		AMDashboard am= new AMDashboard();
		am.setDate(rs.getDate("approval_date"));
		System.out.println(rs.getDate("approval_date"));
		am.setRaisedFor(rs.getLong("raised_for"));
		am.setSiteCode(rs.getString("site_code"));
		System.out.println(rs.getString("site_code"));
		am.setTypeOfWork(rs.getString("stage_name"));
		am.setAmountRequested(rs.getDouble("amount"));
		am.setPurpose(rs.getString("purpose"));
		am.setApprovedAmount(rs.getDouble("approved_amount"));
		
		am.setRemark(rs.getString("remark"));
		return am;
	}

}
