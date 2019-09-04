package com.sunjray.osdma.SMwarehouseAController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.SMwarehouseAModel.QaqcMaterialCode;
import com.sunjray.osdma.SMwarehouseARepository.QaqcMaterialCodeRepository;

@RestController
@RequestMapping("wa")
public class QaqcMaterialCodeController {

	@Autowired
	private QaqcMaterialCodeRepository qaqcMaterialCodeRepository;

	@GetMapping("/fetch-stock-out-material")
	public List<QaqcMaterialCode> fetchStockOutMaterial() {
		return qaqcMaterialCodeRepository.findAll();
	}

}
