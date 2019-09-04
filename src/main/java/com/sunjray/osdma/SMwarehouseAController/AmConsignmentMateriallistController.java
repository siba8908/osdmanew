package com.sunjray.osdma.SMwarehouseAController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.SMwarehouseAModel.AmConsignmentMateriallist;
import com.sunjray.osdma.SMwarehouseARepository.AmConsignmentMateriallistRepository;

@RestController
@RequestMapping("wa")
public class AmConsignmentMateriallistController {

	@Autowired
	private AmConsignmentMateriallistRepository amConsignmentMateriallistRepository;

	@GetMapping("/fetch-consignment-material-list")
	public List<AmConsignmentMateriallist> getAllConsignmentMateriallist() {
		return amConsignmentMateriallistRepository.findAll();
	}

}
