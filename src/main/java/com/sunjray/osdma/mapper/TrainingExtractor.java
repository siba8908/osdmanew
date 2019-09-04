package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.sunjray.osdma.HRmodel.TrainingDetails;

public class TrainingExtractor implements ResultSetExtractor<List<TrainingDetails>>{
	
	@Override
	public List<TrainingDetails> extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		List<TrainingDetails> showList = null;
		showList = new ArrayList<TrainingDetails>();
		TrainingDetails trainee = null;
		while (rs.next()) {

			trainee = new TrainingDetails();
			trainee.setEmployeeId(rs.getLong("employee_id"));
			trainee.setFirstName(rs.getString("first_name"));
			trainee.setLastName(rs.getString("last_name"));
			showList.add(trainee);
		}
		return showList;
	}
	
}	
