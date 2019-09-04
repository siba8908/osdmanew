package com.sunjray.osdma.HRcontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
/*
 * @priyanka
 * date-6/26/2019
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.sunjray.osdma.HRmodel.UtilisationResources;
import com.sunjray.osdma.HRservice.UtilisationResourcesService;


@Controller
@RequestMapping("hr")
public class UtilisationResourcesController {

	@Autowired
	Gson gson;
	@Autowired
	
	private UtilisationResourcesService utilisationResourcesServiceObj;
	List<UtilisationResources> utilisationList=null;
	
	@RequestMapping(value = "resourcesUtilisation",method = RequestMethod.GET)
	public ModelAndView utilisationResources(){
		return new ModelAndView("HR/hr_utilisation_resources");
	}
	
	@RequestMapping(value="show_hrUtilisationResources_ajax",method = RequestMethod.POST)
	public @ResponseBody List<UtilisationResources> getListOfUtilisationResources(){
		System.out.println("getListOfUtilisationResources method");
		return utilisationResourcesServiceObj.getAllUtilisationResources();
	}
	
	@RequestMapping(value="assign_Status_ajax",method=RequestMethod.POST)
	public @ResponseBody String setStatus(@RequestBody  List<UtilisationResources> utilisationStatus){
		String message=null;
		message=utilisationResourcesServiceObj.insertAllStatus(utilisationStatus);
		return gson.toJson(message);
	}
	
	@RequestMapping(value = "resourcesUtilisationReport",method = RequestMethod.GET)
	public ModelAndView utilisationResourcesReport(){
		return new ModelAndView("Reports/hr_utilisation_resources");
	}

	@RequestMapping(value = "resourcesUtilisationReport_ajax",method = RequestMethod.GET)
	public @ResponseBody List<UtilisationResources> showUtilisationResourcesReport(){
		System.out.println("ddddddddddddddd");
		return utilisationResourcesServiceObj.getAllUtilisationResourcesReport();
	}

}
