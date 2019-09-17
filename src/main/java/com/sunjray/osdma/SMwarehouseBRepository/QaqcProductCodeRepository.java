package com.sunjray.osdma.SMwarehouseBRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunjray.osdma.PCenumeration.Status;
import com.sunjray.osdma.PCmodel.MasterProduct;
import com.sunjray.osdma.SMmodel.QaqcProductCode;

public interface QaqcProductCodeRepository extends JpaRepository<QaqcProductCode, Long>{

	List<QaqcProductCode> findByProductStatus(Status intransit);

	List<QaqcProductCode> findByMasterProduct(MasterProduct masterProduct);

}
