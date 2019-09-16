package com.sunjray.osdma.SMController;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.SMservice.DistrictWarehouseService;
import com.sunjray.osdma.dto.AppResponse;
import com.sunjray.osdma.dto.DistrictWarehouseProductDTO;
import com.sunjray.osdma.dto.DwStockOutReportDTO;

@RestController
@RequestMapping("dw")
public class DistrictWarehouseController {
	
	@Resource
	DistrictWarehouseService districtWarehouseService;
	
	@GetMapping("/fetch-products")
	public List<DistrictWarehouseProductDTO> getAllProductList() {
		return districtWarehouseService.getAllProductList();
	}
	
	
	@GetMapping("/fetch-stockout-products")
	public List<DistrictWarehouseProductDTO> getStockOutProductList() {
		return districtWarehouseService.getStockOutProductList();
	}
	
	@PostMapping("/add-storage-location")
	public ResponseEntity<AppResponse> addStorageLocation(@RequestBody DistrictWarehouseProductDTO productDTO) {
		districtWarehouseService.addStorageLocation(productDTO);
		return ResponseEntity.ok().body(new AppResponse("success"));
	}
	
	@GetMapping("/fetch-products-report")
	public List<DistrictWarehouseProductDTO> getAllProductReportList() {
		return districtWarehouseService.getAllProductReportList();
	}
	
	@GetMapping("/fetch-stock-out-report")
	public List<DwStockOutReportDTO> getAllStockOutReport() {
		return districtWarehouseService.getAllStockOutReportList();
	}
	
	@GetMapping("/fetch-stock-in-report")
	public List<DistrictWarehouseProductDTO> getAllStockInProductsReport() {
		return districtWarehouseService.getAllStockInProductsReport();
	}
}
