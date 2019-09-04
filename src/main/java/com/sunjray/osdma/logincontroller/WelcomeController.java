package com.sunjray.osdma.logincontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sunjray.osdma.HRmodel.AppUser;
import com.sunjray.osdma.loginservice.UserServiceImpl;



@Controller
public class WelcomeController {
	
	@Autowired
	UserServiceImpl userService;
		
	@RequestMapping(value={"", "/", "login"},method=RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout){
				ModelAndView model = new ModelAndView();
				if (error != null) {
					model.addObject("error", "Invalid username and password!");
				}

				if (logout != null) {
					model.addObject("msg", "You've been logged out successfully.");
				}
				model.setViewName("login");

				return model;
		//return new ModelAndView ("login");
	}
	
	
	/*
	 * @RequestMapping(value= "/login",method=RequestMethod.POST) public String
	 * loginpost(@ModelAttribute("user")User user,Model model , RedirectAttributes
	 * attributes){ User userlogin =
	 * userService.findByUsername(user.getUsername(),user.getPassword()); return
	 * "HR/dashboard"; }
	 */
}
