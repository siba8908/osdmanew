package com.sunjray.osdma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("pc")
public class PCDashboardController {

	// LOAD DASHBOARD
	@RequestMapping(value = "/pc-dashboard", method = RequestMethod.GET)
	public ModelAndView getPCDetails() {
		return new ModelAndView("PC/pc-dashboard", "dashboard", null);
	}

	// LOAD Site Survey Page
	@RequestMapping(value = "/pc-site-survey", method = RequestMethod.GET)
	public ModelAndView getSiteSurvey() {
		return new ModelAndView("PC/pc-site-survey");
	}

	// LOAD Material Page
	@RequestMapping(value = "/pc-material-request", method = RequestMethod.GET)
	public ModelAndView getMaterialRequest() {
		return new ModelAndView("PC/pc-material-request");
	}

	@RequestMapping("/pc-letter-of-clearance")
	ModelAndView pcletterofclearance() {
		return new ModelAndView("PC/pc-letter-of-clearance");
	}

	@RequestMapping("/pc-team-update")
	ModelAndView pcteamupdate() {
		return new ModelAndView("PC/pc-team-update");
	}

	@RequestMapping("/pc-material-request")
	ModelAndView pcmaterialrequest() {
		return new ModelAndView("PC/pc-material-request");
	}

	@RequestMapping("/pc-material-status")
	ModelAndView pcmaterialstatus() {
		return new ModelAndView("PC/pc-material-status");
	}

	@RequestMapping("/pc-daily-work-status")
	ModelAndView pcdailyworkstatus() {
		return new ModelAndView("PC/pc-daily-work-status");
	}

	@RequestMapping("/pc-fund-Request")
	ModelAndView pcfundRequest() {
		return new ModelAndView("PC/pc-fund-Request");
	}

	@RequestMapping("/pc-fund-requisition-status")
	ModelAndView pcfundrequisitionstatus() {
		return new ModelAndView("PC/pc-fund-requisition-status");
	}

	@RequestMapping("/pc-project-status")
	ModelAndView pcprojectstatus() {
		return new ModelAndView("PC/pc-project-status");
	}

	@RequestMapping("/pc-site-servey-reports")
	ModelAndView pcsiteserveyreports() {
		return new ModelAndView("PC/pc-site-survey-reports");
	}

	@RequestMapping("/pc-fund-requisition-reports")
	ModelAndView pcfundrequisitionreports() {
		return new ModelAndView("PC/pc-fund-requisition-reports");
	}

	@RequestMapping("/pc-letter-of-clearance-reports")
	ModelAndView pcletterofclearancereports() {
		return new ModelAndView("PC/pc-letter-of-clearance-reports");
	}
}
