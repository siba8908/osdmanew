package com.sunjray.osdma.SMwarehouseAController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.PCenumeration.Quality;
import com.sunjray.osdma.SMwarehouseAModel.QaqcItems;
import com.sunjray.osdma.SMwarehouseARepository.QaqcItemsRepository;

@RestController
@RequestMapping("wa")
public class QaqcItemsController {

	@Autowired
	private QaqcItemsRepository qaqcItemsRepository;

	@GetMapping("/fetch-defective-items")
	public List<QaqcItems> getAllDefectiveItems() {
		return qaqcItemsRepository.findByQuality(Quality.faulty);
	}

	@GetMapping("/fetch-stock-in")
	public List<QaqcItems> fetchStockIn() {
		//System.out.println("kk");
		return qaqcItemsRepository.findAll();
	}

}
