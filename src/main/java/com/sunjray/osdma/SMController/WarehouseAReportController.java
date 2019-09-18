package com.sunjray.osdma.SMController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.SMservice.WarehouseAReportService;
import com.sunjray.osdma.dto.ConsignmentMaterialDTO;
import com.sunjray.osdma.dto.WarehouseProductDTO;

@RestController
@RequestMapping("wa")
public class WarehouseAReportController {
	
	@Autowired
	WarehouseAReportService warehouseAReportService;

	@GetMapping("/fetch-materials-report")
	public List<ConsignmentMaterialDTO> fetchAllMaterialsReport() {
		return warehouseAReportService.fetchAllMaterialsReport();
	}
	
	@GetMapping("/fetch-stock-out-report")
	public List<WarehouseProductDTO> fetchAllStockOutProductsReport() {
		return warehouseAReportService.fetchAllStockOutProductsReport();
	}
}
