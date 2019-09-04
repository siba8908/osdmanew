package com.sunjray.osdma.SMwarehouseAController;

import java.net.URI;
import java.net.URISyntaxException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.SMwarehouseAModel.ServProBill;
import com.sunjray.osdma.SMwarehouseAService.ServProBillService;
import com.sunjray.osdma.dto.AppResponse;
import com.sunjray.osdma.util.HeaderUtil;

@RestController
@RequestMapping("wa")
public class ServProBillController {

	@Autowired
	private ServProBillService servProBillService;
	
	@PostMapping("/save-service-provider-bill")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<AppResponse> saveServiceProviderBill(@Valid @RequestBody ServProBill servProBill) throws URISyntaxException {
		servProBillService.save(servProBill);
		return ResponseEntity.created(new URI("/wa/save-service-provider-bill"))
	            .headers(HeaderUtil.createEntityCreationAlert("LetterClearance", "created"))
	            .body(new AppResponse("success"));
	}

}
