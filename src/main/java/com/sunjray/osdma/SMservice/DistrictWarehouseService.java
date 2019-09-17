package com.sunjray.osdma.SMservice;

import java.util.List;

import com.sunjray.osdma.dto.DistrictWarehouseProductDTO;
import com.sunjray.osdma.dto.DwStockOutReportDTO;

public interface DistrictWarehouseService {

	List<DistrictWarehouseProductDTO> getAllProductList();

	List<DistrictWarehouseProductDTO> getStockOutProductList();

	void addStorageLocation(DistrictWarehouseProductDTO productDTO);

	List<DistrictWarehouseProductDTO> getAllProductReportList();

	List<DwStockOutReportDTO> getAllStockOutReportList();

	List<DistrictWarehouseProductDTO> getAllStockInProductsReport();

}
