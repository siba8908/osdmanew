package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import com.sunjray.osdma.AMmodel.AMDailyExpence;

public class DailyExtractor implements ResultSetExtractor<List<AMDailyExpence>> {

	@Override
	public List<AMDailyExpence> extractData(ResultSet rs) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		List<AMDailyExpence> dailyDetails = null;
		dailyDetails = new ArrayList<AMDailyExpence>();
		AMDailyExpence ex = null;
		while (rs.next()) {
			ex = new AMDailyExpence();
			ex.setTransactionId(rs.getString("transaction_id"));
			ex.setAmount(rs.getDouble("amount"));
			dailyDetails.add(ex);
		}
		return dailyDetails;
	}

}
