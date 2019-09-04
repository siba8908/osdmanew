package com.sunjray.osdma.AMcontroller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sunjray.osdma.AMmodel.Consinment;
import com.sunjray.osdma.AMmodel.MaterialPurchase;
import com.sunjray.osdma.AMservice.AccountService;



@Controller
@RequestMapping("am")
public class AccountConsinmentController {
	
	@Autowired
	private AccountService accountService;
	
	
	/*******************Get Consinment ***************/

	@RequestMapping(value= "/addconsinment",method=RequestMethod.GET)
	public ModelAndView consinment(){
		return new ModelAndView ("AM/add-consinment");
	}
	
	/**************save consinment******************/
		
	@RequestMapping(value="/saveconsinment",method=RequestMethod.POST)
	public  @ResponseBody Consinment postTimesheet(@RequestBody Consinment consinment,HttpSession session) 
	{
		 accountService.addConsinment(consinment);
       return consinment;
	}
	
	/******************update track material order**********************/
	
	@RequestMapping(value= "/gettrackmaterial",method=RequestMethod.GET)
	public ModelAndView gettrack(){
		return new ModelAndView ("AM/track-material-order");
	}
	
	/****************** Get All Track Material*************************** */
	
	@RequestMapping(value = "/gettrackdtls")
	public @ResponseBody Iterable<Consinment> getTrackmaterial(HttpSession session) {
		return accountService.findAllMaterial();
	}
	
	/***************************** Update Tracker **************************/
	  
	  @RequestMapping(value = "/updateTrack", method = RequestMethod.POST)
	  public @ResponseBody String upadteTracks(@RequestBody Consinment consinment,HttpSession session) { 
		  System.out.println(consinment.getConsignment_id());
		  int count=accountService.updatetrack(consinment,session);
		  if(count!=0)
		  {
			//System.out.println("bibhu"+user.getUser_id());
		  }
		  
		  return null; 
	  }
	  
	  
	  /******************List track material order for china to port**********************/
		
		@RequestMapping(value= "/getTrackChinatoPort",method=RequestMethod.GET)
		public ModelAndView gettracktochina(){
			return new ModelAndView ("AM/track-material-china-to-port");
		}
		
     /******************List of consignment view details**********************/
		
		@RequestMapping(value= "/viewConsignment",method=RequestMethod.GET)
		public ModelAndView viewConsignmenrdtl(){
			return new ModelAndView ("AM/view-consignment-details");
		}
		
		/****************** Get All Consignment No*************************** */
		
		@RequestMapping(value = "/viewconsignmentdetails")
		public @ResponseBody Iterable<Consinment> getConsignmentNo(HttpSession session) {
			return accountService.findAllConsignmentNo();
		}	
		
		
		
/******************List of consignment view details**********************/
		
		@RequestMapping(value= "/getMaterial",method=RequestMethod.GET)
		public ModelAndView getAddService(){
			ModelAndView mav=new ModelAndView();
			mav.addObject("showConsignmentNo", accountService.getConsNo());
			mav.setViewName("AM/material-purchase");
			return mav;
		}
		
/***************************Add Materials for Purchase	*************************/	
		
		@RequestMapping(value="/addMaterials",method=RequestMethod.POST)
		public  @ResponseBody MaterialPurchase postTimesheet(@RequestBody HashMap<Integer, MaterialPurchase> mp,HttpSession session) 
		{
		
			MaterialPurchase materialPurchase =null;
			materialPurchase=new MaterialPurchase();
			for(int i=0;i<mp.size();i++) {
				materialPurchase.setItemName(mp.get(i).getItemName());
				//System.out.println("Data"+mp.get(0).getItem_name());
				materialPurchase.setSerialNo(mp.get(i).getSerialNo());
				materialPurchase.setQuantity(mp.get(i).getQuantity());
				materialPurchase.setConsignmentId(mp.get(0).getConsignmentId());
				//System.out.println("gggggggggggg"+mp.get(0).getConsinment_id());
				//System.out.println(mp.get(i).getItem_name());
				accountService.addmaterial(materialPurchase);
			}   
	       System.out.println("....DATA....");
	       System.out.println(mp.get(0).getConsignmentId());
	       return materialPurchase;
		} 
}
