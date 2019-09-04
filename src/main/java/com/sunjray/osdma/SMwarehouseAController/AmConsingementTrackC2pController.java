package com.sunjray.osdma.SMwarehouseAController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.SMwarehouseAModel.AmConsingementTrackC2p;
import com.sunjray.osdma.SMwarehouseARepository.AmConsingementTrackC2pRepository;

@RestController
@RequestMapping("wa")
public class AmConsingementTrackC2pController {
	@Autowired
	private AmConsingementTrackC2pRepository amConsingementTrackC2pRepository;

	@GetMapping("/fetch-consignment-no")
	public List<AmConsingementTrackC2p> getAllConsignmentTrackP2a() {
		return amConsingementTrackC2pRepository.findAll();
	}
}
