package com.sunjray.osdma.PMcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sunjray.osdma.PCmodel.Sitecode;
import com.sunjray.osdma.PCrepository.SitecodeRepository;
import com.sunjray.osdma.dto.SitecodeMapDto;

@Controller
@RequestMapping("pm")
public class PMIndexController {
	
	@Autowired
	private SitecodeRepository sitecodeRepository;

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

	@RequestMapping(value = "/pm-project-status-report", method = RequestMethod.GET)
	public ModelAndView pmreport() {
		return new ModelAndView("PM/pm-project-status-report");
	}

	@RequestMapping(value = "/pm-map", method = RequestMethod.GET)
	public ModelAndView pmmap(Model model) {
		List<Sitecode> sitecodeList=sitecodeRepository.findAll();
		List<SitecodeMapDto> sitecodeMap=new ArrayList<>();
		sitecodeList.forEach(item->{
			SitecodeMapDto sitecodeMapDto=new SitecodeMapDto();
			sitecodeMapDto.setSiteCodeId(item.getSitecodeId());
			sitecodeMapDto.setSiteCode(item.getSiteCode());
			sitecodeMapDto.setSiteName(item.getSiteName());
			if(!item.getSiteLocation().isEmpty()) {
				sitecodeMapDto.setLongitude(Double.parseDouble(item.getSiteLocation().stream().findFirst().get().getLongitude()));
				sitecodeMapDto.setLatitude(Double.parseDouble(item.getSiteLocation().stream().findFirst().get().getLattitude()));
			}
			sitecodeMap.add(sitecodeMapDto);
		});
		System.out.println(sitecodeMap);
		model.addAttribute("siteCodeLocation", sitecodeMap);
		return new ModelAndView("PM/pm-map");
	}

	@RequestMapping(value = "/pm-fund-requisition-reports", method = RequestMethod.GET)
	public ModelAndView pmfundrequisitionreport() {
		return new ModelAndView("PM/pm-fund-requisition-reports");
	}

	@RequestMapping(value = "/pm-material-request-report", method = RequestMethod.GET)
	public ModelAndView pmmaterialrequisitionreport() {
		return new ModelAndView("PM/pm-material-request-report");
	}
	
	@RequestMapping(value = "/hr-attendance", method = RequestMethod.GET)
	public ModelAndView hrattendance() {
		return new ModelAndView("PM/hr-attendance");
	}
	
}
