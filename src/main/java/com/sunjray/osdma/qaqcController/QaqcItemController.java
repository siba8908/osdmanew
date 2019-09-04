package com.sunjray.osdma.qaqcController;
 
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; 
 import org.springframework.web.bind.annotation.RequestMapping; 
 import org.springframework.web.bind.annotation.RequestMethod;
 import org.springframework.web.servlet.ModelAndView;

import com.sunjray.osdma.qaqcservice.QAQCMaterialCodService;


 @Controller
 @RequestMapping("qaqc")
 public class QaqcItemController {
	 

	  @Autowired 
	  private QAQCMaterialCodService hrService;

 
 @RequestMapping(value= "/getProduct",method=RequestMethod.GET) 
 public ModelAndView getAddService(){ 
  ModelAndView mav=new ModelAndView();
  mav.addObject("showProductCode", hrService.getProduct_Code());
 mav.setViewName("QAQC/qaqc-material-coding");
 return mav; 
 }
 
 }

