package com.sunjray.osdma.SMwarehouseAController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.SMwarehouseAModel.SerProPersonalDtls;
import com.sunjray.osdma.SMwarehouseARepository.SerProPersonalDtlsRepository;

@RestController
@RequestMapping("wa")
public class SerProPersonalDtlsController {

	@Autowired
	private SerProPersonalDtlsRepository serProPersonalDtlsRepository;

	@GetMapping("/fetch-service-provider")
	public List<SerProPersonalDtls> getAllSerProPersonalDtls() {
		return serProPersonalDtlsRepository.findAll();
	}

}
