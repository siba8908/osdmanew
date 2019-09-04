package com.sunjray.osdma.PCservice;

import java.util.List;

import javax.validation.Valid;

import com.sunjray.osdma.PCmodel.PmFundRequest;

public interface PmFundRequestService {

	void save(@Valid List<PmFundRequest> pmFundRequests);

	List<PmFundRequest> getFundRequestForRequisition();

	PmFundRequest updateBill(@Valid PmFundRequest fundRequest);

}
