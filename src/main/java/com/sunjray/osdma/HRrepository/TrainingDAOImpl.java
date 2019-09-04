package com.sunjray.osdma.HRrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunjray.osdma.HRmodel.TrainingDetails;
import com.sunjray.osdma.mapper.TrainingDetailsExtractor;
import com.sunjray.osdma.mapper.TrainingExtractor;
import com.sunjray.osdma.util.QueryConstant;
@Repository
public class TrainingDAOImpl implements TrainingDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<TrainingDetails> showTrainee() {
		
		return jdbcTemplate.query(QueryConstant.SHOW_ALL_EMP_NAME_BY_EMPLOYEEID, new TrainingExtractor());
	
	}

	@Override
	public int addTrainingDetails(TrainingDetails type) {
	
		return jdbcTemplate.update(QueryConstant.INSERT_TYPE, type.getEmployeeId(), type.getTypesOfTraining(), type.getCurrentDate());
	
	}

	@Override
	public List<TrainingDetails> viewTrainingDetails() {

		return jdbcTemplate.query(QueryConstant.VIEW_TRAINING_DETAILS, new TrainingDetailsExtractor());
	}
	
}
