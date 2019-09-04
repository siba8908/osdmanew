package com.sunjray.osdma.HRrepository;

import java.util.List;

import com.sunjray.osdma.HRmodel.TrainingDetails;

public interface TrainingDAO {

	List<TrainingDetails> showTrainee();

	int addTrainingDetails(TrainingDetails type);

	List<TrainingDetails> viewTrainingDetails();

}
