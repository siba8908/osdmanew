package com.sunjray.osdma.HRcontroller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.sunjray.osdma.HRmodel.TrainingDetails;
import com.sunjray.osdma.HRmodel.User;
import com.sunjray.osdma.HRservice.TrainingService;
import com.sunjray.osdma.constants.AppConstants;

@Controller
@RequestMapping("hr")

public class TrainingDetailsController {
	
	@Autowired
	private TrainingService trainingService;
	@Autowired
	Gson gson;
	
	//TrainingDetails
	@RequestMapping(value= "/hr-training-details",method=RequestMethod.GET)
	public ModelAndView showTrainee(){

		List<TrainingDetails> trainee = trainingService.showTrainee();
	
		return new ModelAndView ("HR/training-details", "trainee", trainee);
	}
	
	//InsertDetails
	@RequestMapping(value= "/training_details_ajax",method=RequestMethod.POST)
	public  @ResponseBody String addTrainingDetails(@RequestBody List<TrainingDetails> type) {
		
		TrainingDetails tdetails = new TrainingDetails();
		try {
			for(int i=0;type.size()>i;i++) {
				tdetails.setTypesOfTraining(type.get(i).getTypesOfTraining());
				tdetails.setCurrentDate(type.get(i).getCurrentDate());
				tdetails.setEmployeeId(type.get(i).getEmployeeId());
				trainingService.addTrainingDetails(tdetails);
			}
			return  gson.toJson(AppConstants.INSERTSUCESSMSG);
		}
		catch(Exception e) {
			return  gson.toJson(AppConstants.ERRORMSG);
		}			
	}
	
	//VIEW TRAINING DETAILS
	@RequestMapping(value= "/hr-view-training-details",method=RequestMethod.GET)
	public ModelAndView dashboard(){
		return new ModelAndView ("HR/hr-view-training-details");
	}
	
	//VIEW TRAINING DETAILS 
	@RequestMapping(value= "/hr-view-training-details_ajax",method=RequestMethod.GET)
	public @ResponseBody Iterable<TrainingDetails> viewTrainingDetails(HttpSession session){

		return trainingService.viewTrainingDetails();
	}
	
	
}