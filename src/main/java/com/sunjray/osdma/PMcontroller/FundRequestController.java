package com.sunjray.osdma.PMcontroller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.PCenumeration.Status;
import com.sunjray.osdma.PCmodel.PmFundRequest;
import com.sunjray.osdma.PCrepository.PmFundRequestRepository;
import com.sunjray.osdma.dto.AppResponse;
import com.sunjray.osdma.util.HeaderUtil;

@RestController
@RequestMapping("/pm")
public class FundRequestController {
	
	@Autowired
	private PmFundRequestRepository pmFundRequestRepository;
	
	
	@GetMapping("/fetch-pending-fund-requistion")
	public List<PmFundRequest> getPendingFundRequestForRequisition() {
		return pmFundRequestRepository.findByStatus(Status.PENDING);
	}
	
	@PostMapping("/update-pm-fund-requests")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<AppResponse> registerAccount(@Valid @RequestBody List<PmFundRequest> pmFundRequests) throws URISyntaxException {
		pmFundRequestRepository.saveAll(pmFundRequests);
		return ResponseEntity.created(new URI("pm/update-pm-fund-requests"))
	            .headers(HeaderUtil.createEntityCreationAlert("PmFundRequest", "created"))
	            .body(new AppResponse("success"));
	}
	
	@GetMapping("/fetch-all-fund-request-for-requisition")
	public List<PmFundRequest> getAllFundRequestForRequisition() {
		return pmFundRequestRepository.findAll();
	}
}
