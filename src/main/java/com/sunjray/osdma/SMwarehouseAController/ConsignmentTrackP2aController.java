package com.sunjray.osdma.SMwarehouseAController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.SMwarehouseAModel.ConsignmentTrackP2a;
import com.sunjray.osdma.SMwarehouseARepository.ConsignmentTrackP2aRepository;

@RestController
@RequestMapping("wa")
public class ConsignmentTrackP2aController {

	@Autowired
	private ConsignmentTrackP2aRepository consignmentTrackP2aRepository;

	@GetMapping("/fetch-consignment-track")
	public List<ConsignmentTrackP2a> getAllConsignmentTrackP2a() {
		return consignmentTrackP2aRepository.findAll();
	}

}
