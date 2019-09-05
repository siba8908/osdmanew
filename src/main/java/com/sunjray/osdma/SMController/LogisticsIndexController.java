package com.sunjray.osdma.SMController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("lg")
public class LogisticsIndexController {
	
	@RequestMapping("/logistic-dashboard")
	String smLogisticDashboard() {
		return "SM/sm-logistics-dashboard";
	}

	@RequestMapping("/logistics-order-tracking-details")
	String smLogisticOrderTrackingDetails() {
		return "SM/sm-logistics-order-tracking-details";
	}

	@RequestMapping("/logistics-status")
	String smLogisticStatus() {
		return "SM/sm-logistics-status";
	}
}
