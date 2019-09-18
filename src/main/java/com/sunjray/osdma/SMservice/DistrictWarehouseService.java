package com.sunjray.osdma.SMservice;

import java.util.List;

import com.sunjray.osdma.dto.WarehouseProductDTO;
import com.sunjray.osdma.dto.DwStockOutReportDTO;

public interface DistrictWarehouseService {

	List<WarehouseProductDTO> getAllProductList();

	List<WarehouseProductDTO> getStockOutProductList();

	void addStorageLocation(WarehouseProductDTO productDTO);

	List<WarehouseProductDTO> getAllProductReportList();

	List<DwStockOutReportDTO> getAllStockOutReportList();

	List<WarehouseProductDTO> getAllStockInProductsReport();

}
