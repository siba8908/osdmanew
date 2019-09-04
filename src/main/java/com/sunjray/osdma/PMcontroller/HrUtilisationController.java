package com.sunjray.osdma.PMcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.PMRepository.HrUtilisationRepository;
import com.sunjray.osdma.PMmodel.HrUtilisation;

@RestController
@RequestMapping("/pm")
public class HrUtilisationController {
	@Autowired
	private HrUtilisationRepository hrUtilisationRepository;

	@GetMapping("/fetch-resource-utilisation")
	public List<HrUtilisation> getAllResourceUtilisation() {
		return hrUtilisationRepository.findAll();
	}

}
