package com.sunjray.osdma.PCserviceimpl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.sunjray.osdma.PCenumeration.Status;
import com.sunjray.osdma.PCmodel.PmFundRequest;
import com.sunjray.osdma.PCrepository.PmFundRequestRepository;
import com.sunjray.osdma.PCservice.PmFundRequestService;
import com.sunjray.osdma.constants.AWSConstants;
import com.sunjray.osdma.util.CommonUtil;
import com.sunjray.osdma.util.FileUploadUtility;

@Service
public class PmFundRequestServiceImpl implements PmFundRequestService {
	
	@Resource
	PmFundRequestRepository PmFundRequestRepository;
	
	@Resource
	FileUploadUtility fileUploadUtility;

	@Override
	public void save(@Valid List<PmFundRequest> pmFundRequests) {

		pmFundRequests.forEach(fundRequest->{
			fundRequest.setStatus(Status.PENDING);
			fundRequest.setCreatedDate(new Date());
		});
		
		PmFundRequestRepository.saveAll(pmFundRequests);
	}

	@Override
	public List<PmFundRequest> getFundRequestForRequisition() {
		return PmFundRequestRepository.findByBillIsNullAndApprovedAmountNotNull();
	}

	@Override
	public PmFundRequest updateBill(@Valid PmFundRequest fundRequest) {
		String imagePath = "";
		if (null != fundRequest.getBill()) {
			String fileName = "pm-fund-requisition-bill" + "_" + CommonUtil.fetchTimeInMilliSeconds() + AWSConstants.AWS_FILE_FORMAT;
			imagePath = fileUploadUtility.saveImage(fileName, fundRequest.getBill(), "");
		}
		fundRequest.setBill(imagePath);
		return PmFundRequestRepository.saveAndFlush(fundRequest);
	}

}
