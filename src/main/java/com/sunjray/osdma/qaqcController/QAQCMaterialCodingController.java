package com.sunjray.osdma.qaqcController;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.sunjray.osdma.constants.AppConstants;
import com.sunjray.osdma.qaqcModel.MaterialCode;
import com.sunjray.osdma.qaqcModel.QaqcItem;
import com.sunjray.osdma.qaqcservice.QAQCMaterialCodService;
import com.google.gson.Gson;

@Controller
@RequestMapping("qaqc")
public class QAQCMaterialCodingController {
	
	
	  @Autowired 
	  private QAQCMaterialCodService hrService;
	  @Autowired 
	  private Gson gson;
	  


		@RequestMapping(value = "/MaterialCoding", method = RequestMethod.GET)
		public ModelAndView QAQC_Material_Coding() {
			
			//List<QAQCMaterialCod> material = hrService.showMaterial();
			ModelAndView mav=new ModelAndView();
			mav.addObject("showProductCode", hrService.getProduct_Code());
			mav.addObject("showProductName", hrService.getProduct_Name());
			 mav.setViewName("QAQC/qaqc-material-coding");
			 return mav;
		/* return new ModelAndView("QAQC/QAQC_Material_Coding","material", material); */
		}

		@RequestMapping(value = "/QAQCMaterialCod_ajax", method = RequestMethod.POST)
		public @ResponseBody String matcod(@RequestBody HashMap<Integer, MaterialCode> u )
		{
			try {
			//System.out.println("JJJJJJJJJJJJJJJJJJJ");
			//Integer lm=0;
			//String returnText = "";
			System.out.println(u.size());
			for(int i=0;i<u.size();i++) {
			//System.out.println(u.get(i).getImei_no());
			
		   hrService.QAQCMaterialCod(u.get(i));
		    //System.out.println(lm);
			}
			
			//return lm;
			return gson.toJson(AppConstants.INSERTSUCESSMSG);
		}catch(Exception e) {
			return gson.toJson(AppConstants.ERRORMSG);
		}
			
		}
		@RequestMapping(value= "/material-checked-report",method=RequestMethod.GET)
		public ModelAndView reject(){
			return new ModelAndView ("Reports/qaqc-material-checked-report");
		}
		  
		@RequestMapping(value= "/material-checked-report_ajax")
		public @ResponseBody Iterable<QaqcItem> getMaterialCheckedList(HttpSession session) {
			System.out.println("EXPENCES");
			return hrService.getMaterialCheckedList();
		}
}

