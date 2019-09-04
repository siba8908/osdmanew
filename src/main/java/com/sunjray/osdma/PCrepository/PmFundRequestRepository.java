package com.sunjray.osdma.PCrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunjray.osdma.PCenumeration.Status;
import com.sunjray.osdma.PCmodel.PmFundRequest;

public interface PmFundRequestRepository extends JpaRepository<PmFundRequest, Long> {

	List<PmFundRequest> findByBillIsNullAndApprovedAmountNotNull();

	List<PmFundRequest> findByStatus(Status pending);

}
