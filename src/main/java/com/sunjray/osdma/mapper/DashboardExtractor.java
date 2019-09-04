package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.sunjray.osdma.AMmodel.AMDashboard;

public class DashboardExtractor implements ResultSetExtractor<List<AMDashboard>>{

	public List<AMDashboard> extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		List<AMDashboard> getAllDetails = null;
		getAllDetails = new ArrayList<AMDashboard>();
		AMDashboard dashboard = null;
		while (rs.next()) {
			dashboard = new AMDashboard();
			dashboard.setDate(rs.getDate("approval_date"));
			dashboard.setRaisedFor(rs.getLong("raised_for"));
			dashboard.setSiteCode(rs.getString("site_code"));
			dashboard.setTypeOfWork(rs.getString("stage_name"));
			dashboard.setAmountRequested(rs.getDouble("amount"));
			dashboard.setPurpose(rs.getString("purpose"));
			dashboard.setApprovedAmount(rs.getDouble("approved_amount"));
			dashboard.setRemark(rs.getString("remark"));
			getAllDetails.add(dashboard);
		}
		return getAllDetails;
	}

}

