package com.sunjray.osdma.PMcontroller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.PCmodel.PcMaterialRequest;
import com.sunjray.osdma.PCrepository.MaterialRequestRepository;

@RestController
@RequestMapping("/pm")
public class PmMaterialRequestController {

	@Resource
	private MaterialRequestRepository materialRequestRepository;

	@GetMapping("/fetch-material-request")
	public List<PcMaterialRequest> fetchMaterialRequest() {
		return materialRequestRepository.findAll();
	}
}
