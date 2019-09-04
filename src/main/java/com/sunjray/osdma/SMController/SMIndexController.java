package com.sunjray.osdma.SMController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("dw")
public class SMIndexController {

	@RequestMapping("/sm-district-warehouse-dashboard")
	ModelAndView smDashboard() {
		return new ModelAndView ("SM/sm-district-warehouse-dashboard");
	}
	
	
	@RequestMapping("/sm-district-warehouse-product-list")
	ModelAndView smWarehouseProductList() {
		return new ModelAndView ("SM/sm-district-warehouse-product-list");
	}
	
	
	@RequestMapping("/sm-district-warehouse-stocks")
	ModelAndView smWarehouseStocks() {
		return new ModelAndView ("SM/sm-district-warehouse-stocks");
	}

}
