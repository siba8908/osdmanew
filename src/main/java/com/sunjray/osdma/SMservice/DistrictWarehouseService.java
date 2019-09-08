package com.sunjray.osdma.SMservice;

import java.util.List;

import com.sunjray.osdma.dto.DistrictWarehouseProductDTO;

public interface DistrictWarehouseService {

	List<DistrictWarehouseProductDTO> getAllProductList();

	List<DistrictWarehouseProductDTO> getStockOutProductList();

	void addStorageLocation(DistrictWarehouseProductDTO productDTO);

}
