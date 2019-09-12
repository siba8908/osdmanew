package com.sunjray.osdma.SMwarehouseBController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("wb")
public class WBIndexController {

	@RequestMapping(value = "/sm-warehouse-b-product-list", method = RequestMethod.GET)
	public ModelAndView smWarehouseBProfuctList() {
		return new ModelAndView("WAREHOUSE-B/sm-warehouse-b-product-list");
	}

	@RequestMapping(value = "/sm-warehouse-b-stocks", method = RequestMethod.GET)
	public ModelAndView smWarehouseBStockIn() {
		return new ModelAndView("WAREHOUSE-B/sm-warehouse-b-stocks");
	}

}
