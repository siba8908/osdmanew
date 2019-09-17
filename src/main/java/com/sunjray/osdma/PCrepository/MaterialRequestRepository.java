package com.sunjray.osdma.PCrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunjray.osdma.PCenumeration.Status;
import com.sunjray.osdma.PCmodel.PcMaterialRequest;

public interface MaterialRequestRepository extends JpaRepository<PcMaterialRequest, Long> {

	List<PcMaterialRequest> findByStatus(Status approved);

}
