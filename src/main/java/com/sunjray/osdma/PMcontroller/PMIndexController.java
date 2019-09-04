package com.sunjray.osdma.PMcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("pm")
public class PMIndexController {

	@RequestMapping(value = "/pm-create-site-code", method = RequestMethod.GET)
	public ModelAndView pmcreatesitecode() {
		return new ModelAndView("PM/pm-create-site-code");
	}

	@RequestMapping(value = "/pm-site-location", method = RequestMethod.GET)
	public ModelAndView pmsitelocation() {
		return new ModelAndView("PM/pm-site-location");
	}

	@RequestMapping(value = "/pm-create-team", method = RequestMethod.GET)
	public ModelAndView pmcreateteam() {
		return new ModelAndView("PM/pm-create-team");
	}

	@RequestMapping(value = "/pm-create-project", method = RequestMethod.GET)
	public ModelAndView pmcreateproject() {
		return new ModelAndView("PM/pm-create-project");
	}

	@RequestMapping(value = "/pm-create-task", method = RequestMethod.GET)
	public ModelAndView pmcreatetask() {
		return new ModelAndView("PM/pm-create-task");
	}

	@RequestMapping(value = "/pm-create-assign-task", method = RequestMethod.GET)
	public ModelAndView pmcreateassigntask() {
		return new ModelAndView("PM/pm-create-assign-task");
	}

	@RequestMapping(value = "/pm-Daily-work-status", method = RequestMethod.GET)
	public ModelAndView pmDailyworkstatus() {
		return new ModelAndView("PM/pm-Daily-work-status");
	}

	@RequestMapping(value = "pm-fund-requisition", method = RequestMethod.GET)
	public ModelAndView pmfundrequisition() {
		return new ModelAndView("PM/pm-fund-requisition");
	}

	@RequestMapping(value = "/pm-resourse-utilisation", method = RequestMethod.GET)
	public ModelAndView pmresourseutilisation() {
		return new ModelAndView("PM/pm-resourse-utilisation");
	}

}
