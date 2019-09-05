package com.sunjray.osdma.SMController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("logistics")
public class LogisticsIndexController {
	
	@RequestMapping("/sm-logistics-dashboard")
	String smLogisticDashboard() {
		return "SM/sm-logistics-dashboard";
	}

	@RequestMapping("/sm-logistics-order-tracking-details")
	String smLogisticOrderTrackingDetails() {
		return "SM/sm-logistics-order-tracking-details";
	}

	@RequestMapping("/sm-logistics-status")
	String smLogisticStatus() {
		return "SM/sm-logistics-status";
	}
}
