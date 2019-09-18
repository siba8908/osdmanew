package com.sunjray.osdma.SMwarehouseAController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("wa")
public class WarehouseAIndexController {

	@RequestMapping(value="/sm-warehouse-a-dashboard", method = RequestMethod.GET)
	ModelAndView smWarehouseADashboard() {
		return new ModelAndView ("WAREHOUSE-A/sm-warehouse-a-dashboard");
	}

	@RequestMapping("/sm-warehouse-a-defective-material")
	ModelAndView smWarehouseADefectiveMaterial() {
		return new ModelAndView ("WAREHOUSE-A/sm-warehouse-a-defective-material");
	}

	@RequestMapping("/sm-warehouse-a-material-list")
	ModelAndView smWarehouseAMaterialList() {
		return new ModelAndView ("WAREHOUSE-A/sm-warehouse-a-material-list");
	}

	@RequestMapping("/sm-warehouse-a-upload-bill")
	ModelAndView smWarehouseAUploadBill() {
		return new ModelAndView ("WAREHOUSE-A/sm-warehouse-a-upload-bill");
	}

	@RequestMapping("/sm-warehouse-a-stocks")
	ModelAndView smWarehouseAStocks() {
		return new ModelAndView ("WAREHOUSE-A/sm-warehouse-a-stocks");
	}
	
	@RequestMapping("/warehouse-a-materials-report")
	ModelAndView smWarehouseAMaterialsReport() {
		return new ModelAndView ("WAREHOUSE-A/sm-wa-materials-report");
	}
	
	@RequestMapping("/warehouse-a-stock-in-report")
	ModelAndView smWarehouseAStockInReport() {
		return new ModelAndView ("WAREHOUSE-A/sm-wa-stock-in-report");
	}
	
	@RequestMapping("/warehouse-a-stock-out-report")
	ModelAndView smWarehouseAStockOutReport() {
		return new ModelAndView ("WAREHOUSE-A/sm-wa-stock-out-report");
	}

}
