package com.sunjray.osdma.SMserviceimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sunjray.osdma.SMdao.DistrictWarehouseDao;
import com.sunjray.osdma.SMservice.DistrictWarehouseService;
import com.sunjray.osdma.dto.DistrictWarehouseProductDTO;

@Service
public class DistrictWarehouseServiceImpl implements DistrictWarehouseService {
	
	@Resource
	DistrictWarehouseDao districtWarehouseDao;

	@Override
	public List<DistrictWarehouseProductDTO> getAllProductList() {
		return districtWarehouseDao.findAllProductList();
	}

	@Override
	public List<DistrictWarehouseProductDTO> getStockOutProductList() {
		return districtWarehouseDao.findStockOutProductList();
	}

	@Override
	public void addStorageLocation(DistrictWarehouseProductDTO productDTO) {
		 districtWarehouseDao.addStorageLocation(productDTO);
		
	}

}
