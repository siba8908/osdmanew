
package com.sunjray.osdma.HRcontroller;
 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.ResponseBody; 
import org.springframework.web.servlet.ModelAndView;

import com.sunjray.osdma.HRmodel.TerminationLetter;
import com.sunjray.osdma.HRservice.TerminationService;

@Controller
@RequestMapping("hr")
 
public class TerminationController {
 
	@Autowired 
	private TerminationService terminationService;
	
	//TERMINATION_LETTER
	@RequestMapping(value= "/terminationletter",method=RequestMethod.GET) 
	public ModelAndView employeeTermination() {
		//HttpSession session = request.getSession();
		//session.setAttribute("uname", "Mamta");
		return new ModelAndView("HR/hr-termination-letter"); 
	}
	
	//SHOW ALL DETAILS OF EMPLOYEE
	@RequestMapping(value= "/termination", method=RequestMethod.POST)
	public @ResponseBody TerminationLetter getTerminationDetails(@RequestBody TerminationLetter exit) {
	 
		return terminationService.getTerminationDetailsByEmployeeId(exit.getEmployeeId());
	} 
}
