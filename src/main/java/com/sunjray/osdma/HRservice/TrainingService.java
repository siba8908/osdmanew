package com.sunjray.osdma.HRservice;

import java.util.List;

import com.sunjray.osdma.HRmodel.TrainingDetails;

public interface TrainingService {

	List<TrainingDetails> showTrainee();

	int addTrainingDetails(TrainingDetails type);

	List<TrainingDetails> viewTrainingDetails();
		
}
