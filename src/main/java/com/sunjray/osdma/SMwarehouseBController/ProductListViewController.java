package com.sunjray.osdma.SMwarehouseBController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("wb")
public class ProductListViewController {

	@RequestMapping(value = "/sm-warehouse-b-product-list", method = RequestMethod.GET)
	public ModelAndView smWarehouseBProfuctList() {
		return new ModelAndView("WAREHOUSE-B/sm-warehouse-b-product-list");
	}

	@RequestMapping(value = "/sm-warehouse-b-stocks", method = RequestMethod.GET)
	public ModelAndView smWarehouseBStockIn() {
		return new ModelAndView("WAREHOUSE-B/sm-warehouse-b-stocks");
	}

	@RequestMapping(value = "/wb-dashboard", method = RequestMethod.GET)
	public ModelAndView smwarehousebdashboard() {
		return new ModelAndView("WAREHOUSE-B/sm-warehouse-b-dashboard");
	}

	@RequestMapping(value = "/sm-warehouse-b-material-coding", method = RequestMethod.GET)
	public ModelAndView smwarehousebmaterialcoding() {
		return new ModelAndView("WAREHOUSE-B/sm-warehouse-b-material-coding");
	}

}
