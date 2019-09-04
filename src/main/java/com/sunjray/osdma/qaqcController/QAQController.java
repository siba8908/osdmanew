package com.sunjray.osdma.qaqcController;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sunjray.osdma.AMmodel.AMDailyExpence;
import com.sunjray.osdma.AMmodel.MaterialPurchase;
import com.sunjray.osdma.constants.AppConstants;
import com.sunjray.osdma.qaqcModel.MaterialCode;
import com.sunjray.osdma.qaqcModel.QaqcItem;
import com.sunjray.osdma.qaqcservice.QaqcService;
import com.google.gson.Gson;

@Controller
@RequestMapping("qaqc")

public class QAQController {
	
	@Autowired
	Gson gson;
	
	@Autowired
	private QaqcService qaqcService;
	
	
	/*******************Get Consinment ***************/

	@RequestMapping(value= "/getComponents",method=RequestMethod.GET)
	public ModelAndView component(){
		return new ModelAndView ("QAQC/componet-maintainace");
	}
	
	/*******************Get dashboard ***************/
	
	@RequestMapping(value= "/getqaqcdashboard",method=RequestMethod.GET)
	public ModelAndView qaqcDashboard(){
		return new ModelAndView ("QAQC/dashboard");
	}
	
	/*******************Get All Items****************/
	
	@RequestMapping(value = "/getitemdtls")
	public @ResponseBody Iterable<MaterialPurchase> getTrackmaterial(HttpSession session) {
		return qaqcService.getItems();
	}
	
	/**************************Save Items*********************************/
	
	@RequestMapping(value = "/saveItem_details", method = RequestMethod.POST)
	public @ResponseBody String saveItem(@RequestBody QaqcItem qaqcItem,HttpSession session) { 
		int count=qaqcService.saveItemdtls(qaqcItem,session);
		if(count!=0) {
		  
		}
		return gson.toJson(AppConstants.INSERTSUCESSMSG); 
	}
	
	/**************************get component*********************************/
	
	@RequestMapping(value = "/getComponentdtls")
	public @ResponseBody Iterable<MaterialCode> getComponentitem(HttpSession session) {
		return qaqcService.getcomponent();
	}
	
	/***************************** Update product code **************************/
	  
	@RequestMapping(value = "/updateProduct", method = RequestMethod.POST)
	public @ResponseBody String upadteTracks(@RequestBody QaqcItem qaqcItem,HttpSession session) { 
		System.out.println(qaqcItem.getItemId());
		int count=qaqcService.updateProduct(qaqcItem,session);
		if(count!=0)
		{
			//System.out.println("bibhu"+user.getUser_id());
		}
		  
		return null; 
	}
	  
	@RequestMapping(value= "/rejectList",method=RequestMethod.GET)
	public ModelAndView reject(){
		return new ModelAndView ("Reports/qaqc-reject-list-report");
	}
	  
	@RequestMapping(value= "/rejectList_ajax")
	public @ResponseBody Iterable<QaqcItem> getRejectList(HttpSession session) {
		System.out.println("EXPENCES");
		return qaqcService.getRejectList();
	}

}
