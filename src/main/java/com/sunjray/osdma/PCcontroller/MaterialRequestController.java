package com.sunjray.osdma.PCcontroller;

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

import com.sunjray.osdma.PCmodel.PcMaterialRequest;
import com.sunjray.osdma.PCservice.MaterialRequestService;
import com.sunjray.osdma.dto.AppResponse;
import com.sunjray.osdma.util.HeaderUtil;

@RestController
@RequestMapping("pc")
public class MaterialRequestController {
	@Autowired
	private MaterialRequestService materialRequestService;

	@PostMapping("/save-material-request")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<AppResponse> saveMaterialRequest(@Valid @RequestBody List<PcMaterialRequest> materialRequest) throws URISyntaxException {
		materialRequestService.saveMaterialRequest(materialRequest);
		return ResponseEntity.created(new URI("/pc/save-material-request"))
	            .headers(HeaderUtil.createEntityCreationAlert("MaterialRequest", "created"))
	            .body(new AppResponse("success"));
	}
	
	@GetMapping("/fetch-pc-material-status")
	public List<PcMaterialRequest> getAllProduct() {
		return materialRequestService.findAll();
	}
}
