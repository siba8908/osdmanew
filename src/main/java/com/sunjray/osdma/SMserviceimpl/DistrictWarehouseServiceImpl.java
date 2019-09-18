package com.sunjray.osdma.SMserviceimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sunjray.osdma.SMdao.DistrictWarehouseDao;
import com.sunjray.osdma.SMservice.DistrictWarehouseService;
import com.sunjray.osdma.dto.WarehouseProductDTO;
import com.sunjray.osdma.dto.DwStockOutReportDTO;

@Service
public class DistrictWarehouseServiceImpl implements DistrictWarehouseService {
	
	@Resource
	DistrictWarehouseDao districtWarehouseDao;

	@Override
	public List<WarehouseProductDTO> getAllProductList() {
		return districtWarehouseDao.findAllProductList();
	}

	@Override
	public List<WarehouseProductDTO> getStockOutProductList() {
		return districtWarehouseDao.findStockOutProductList();
	}

	@Override
	public void addStorageLocation(WarehouseProductDTO productDTO) {
		 districtWarehouseDao.addStorageLocation(productDTO);
		
	}

	@Override
	public List<WarehouseProductDTO> getAllProductReportList() {
		return districtWarehouseDao.getAllProductReportList();
	}

	@Override
	public List<DwStockOutReportDTO> getAllStockOutReportList() {
		return districtWarehouseDao.getAllStockOutReportList();
	}

	@Override
	public List<WarehouseProductDTO> getAllStockInProductsReport() {
		return districtWarehouseDao.getAllStockInProductsReport();
	}

}
