package com.sunjray.osdma.SMdaoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sunjray.osdma.SMdao.DistrictWarehouseDao;
import com.sunjray.osdma.dto.DistrictWarehouseProductDTO;
import com.sunjray.osdma.util.CommonUtil;

@Repository
public class DistrictWarehouseDaoImpl implements DistrictWarehouseDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	private static final String FETCH_PRODUCT_LIST = "SELECT mp.product_name, qpc.product_code_gen, qpc.product_status, wbp.quantity FROM osdma.t_os_warhouseb_product_list wbp left outer join osdma.t_os_qaqc_product_code qpc on wbp.qaqc_id = qpc.productcode_id left outer join osdma.t_os_master_product mp on qpc.product_id = mp.product_id order by wbp.product_list_id desc";

	private static final String FETCH_STOCK_OUT_PRODUCT_LIST = "SELECT mp.product_name, qpc.product_code_gen, wbs.mat_request_id, wbs.quantity,wbs.wh_b_stock_out_id, wbs.stroge_location FROM osdma.t_os_warhouseb_stock_out wbs left outer join osdma.t_os_qaqc_product_code qpc on wbs.product_code_id = qpc.productcode_id left outer join osdma.t_os_master_product mp on qpc.product_id = mp.product_id order by wbs.mat_request_id desc";

	private static final String UPDATE_STORAGE_LOCATION = "update osdma.t_os_warhouseb_stock_out set stroge_location = ? where wh_b_stock_out_id = ?";
	
	@SuppressWarnings("unchecked")
	@Override
	public List<DistrictWarehouseProductDTO> findAllProductList() {
		List<DistrictWarehouseProductDTO> productsList = new ArrayList<>();
		List<Object[]> results = entityManager.createNativeQuery(FETCH_PRODUCT_LIST).getResultList();

		results.stream().forEach(record -> {

			DistrictWarehouseProductDTO product = new DistrictWarehouseProductDTO();
			product.setProductName(CommonUtil.checkNullValue(record[0]));
			product.setProductCode(CommonUtil.checkNullValue(record[1]));
			product.setStatus(CommonUtil.checkNullValue(record[2]));
			product.setQuantity((Integer) record[3]);

			productsList.add(product);
		});
		return productsList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DistrictWarehouseProductDTO> findStockOutProductList() {
		List<DistrictWarehouseProductDTO> productsList = new ArrayList<>();
		List<Object[]> results = entityManager.createNativeQuery(FETCH_STOCK_OUT_PRODUCT_LIST).getResultList();

		results.stream().forEach(record -> {

			DistrictWarehouseProductDTO product = new DistrictWarehouseProductDTO();
			product.setProductName(CommonUtil.checkNullValue(record[0]));
			product.setProductCode(CommonUtil.checkNullValue(record[1]));
			product.setRequestId((Integer)record[2]);
			product.setQuantity((Integer) record[3]);
			product.setStockOutId((Integer) record[4]);
			product.setStorageLocation(CommonUtil.checkNullValue(record[5]));
			
			productsList.add(product);
		});
		return productsList;
	}

	@Override
	@Transactional
	public Boolean addStorageLocation(DistrictWarehouseProductDTO productDTO) {
		int result = entityManager.createNativeQuery(UPDATE_STORAGE_LOCATION).setParameter(1, productDTO.getStorageLocation()).setParameter(2, productDTO.getStockOutId()).executeUpdate();
		return result == 1;
	}
}
