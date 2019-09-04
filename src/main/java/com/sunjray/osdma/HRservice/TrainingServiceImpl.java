package com.sunjray.osdma.HRservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunjray.osdma.HRmodel.TrainingDetails;
import com.sunjray.osdma.HRrepository.TrainingDAO;
@Service
public class TrainingServiceImpl implements TrainingService{

	@Autowired
	private TrainingDAO trainingDAO;

	@Override
	public List<TrainingDetails> showTrainee() {
		// TODO Auto-generated method stub
		return trainingDAO.showTrainee();
	}
	
	@Override
	public int addTrainingDetails(TrainingDetails type) {
		// TODO Auto-generated method stub	
		return trainingDAO.addTrainingDetails(type);
	}

	@Override
	public List<TrainingDetails> viewTrainingDetails() {
		// TODO Auto-generated method stub
		return trainingDAO.viewTrainingDetails();
	}
	
}
