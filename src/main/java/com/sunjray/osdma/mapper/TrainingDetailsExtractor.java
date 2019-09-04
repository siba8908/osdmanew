package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import com.sunjray.osdma.HRmodel.TrainingDetails;

public class TrainingDetailsExtractor implements ResultSetExtractor<List<TrainingDetails>> {

	@Override
	public List<TrainingDetails> extractData(ResultSet rs) throws SQLException, DataAccessException {

		List<TrainingDetails> viewList = null;
		viewList = new ArrayList<TrainingDetails>();
		TrainingDetails tdetails = null;
		while (rs.next()) {

			tdetails = new TrainingDetails();
			tdetails.setEmployeeId(rs.getLong("employee_id"));
			tdetails.setFirstName(rs.getString("first_name"));
			tdetails.setLastName(rs.getString("last_name"));
			tdetails.setEmpName(rs.getString("first_name") +" "+ rs.getString("last_name"));
			tdetails.setTypesOfTraining(rs.getString("types_of_training"));
			tdetails.setCurrentDate(rs.getString("created_date"));
			viewList.add(tdetails);
		}
		return viewList;

	}

}
