package com.sunjray.osdma.PCcontroller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.PCmodel.PmFundRequest;
import com.sunjray.osdma.PCservice.PmFundRequestService;
import com.sunjray.osdma.dto.AppResponse;
import com.sunjray.osdma.util.HeaderUtil;

@RestController
@RequestMapping("pc")
public class PmFundRequestController {
	
	@Autowired
	private PmFundRequestService pmFundRequestService;
	
	private final Logger log = LoggerFactory.getLogger(PmFundRequestController.class);
	

	/**
	 * POST /save-pm-fund-request : save all request.
	 *
	 * @return the ResponseEntity with status 201 (OK) and status message
	 */
	@PostMapping("/save-pm-fund-requests")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<AppResponse> registerAccount(@Valid @RequestBody List<PmFundRequest> pmFundRequests) throws URISyntaxException {
		pmFundRequestService.save(pmFundRequests);
		return ResponseEntity.created(new URI("pc/save-pm-fund-request"))
	            .headers(HeaderUtil.createEntityCreationAlert("PmFundRequest", "created"))
	            .body(new AppResponse("success"));
	}
	
	
	/**
	 * GET /fetch-fund-request-for-requisition : get all the PmFundRequest.
	 *
	 * @return the ResponseEntity with status 200 (OK) and the list of
	 *         PmFundRequest in body
	 */
	@GetMapping("/fetch-fund-request-for-requisition")
	public List<PmFundRequest> getFundRequestForRequisition() {
		log.debug("REST request to get all LetterTypeMaster");
		return pmFundRequestService.getFundRequestForRequisition();
	}
	
	/**
     * POST  /colors : Create a new color.
     *
     * @param color the color to create
     * @return the ResponseEntity with status 201 (Created) and with body the new color, or with status 400 (Bad Request) if the color has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/save-pm-fund-request")
    public ResponseEntity<PmFundRequest> updateBill(@Valid @RequestBody PmFundRequest fundRequest) throws URISyntaxException {
        log.debug("REST request to save PmFundRequest : {}", fundRequest);
        PmFundRequest result = pmFundRequestService.updateBill(fundRequest);
        return ResponseEntity.created(new URI("/api/save-pm-fund-request/" + result.getFundReqId()))
            .headers(HeaderUtil.createEntityCreationAlert("PmFundRequest", result.getFundReqId().toString()))
            .body(result);
    }
	
	

}
