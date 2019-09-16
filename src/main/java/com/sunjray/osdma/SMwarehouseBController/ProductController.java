package com.sunjray.osdma.SMwarehouseBController;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.PCenumeration.Status;
import com.sunjray.osdma.SMmodel.QaqcProductCode;
import com.sunjray.osdma.SMwarehouseBRepository.QaqcProductCodeRepository;
import com.sunjray.osdma.dto.AppResponse;
import com.sunjray.osdma.util.HeaderUtil;

@RestController
@RequestMapping("wb")
public class ProductController {
	@Autowired
	private QaqcProductCodeRepository qaqcProductCodeRepository;

	@GetMapping("/fetch-product-list")
	public List<QaqcProductCode> getAllProducts() {
		return qaqcProductCodeRepository.findByProductStatus(Status.INTRANSIT);
	}

	@GetMapping("/fetch-wb-stock-in")
	public List<QaqcProductCode> getStockInProducts() {
		return qaqcProductCodeRepository.findByProductStatus(Status.RECEIVED);
	}

	@PostMapping("/update-product-stock")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<AppResponse> updateProductStock(@RequestBody QaqcProductCode qaqcProductCode)
			throws URISyntaxException {
		qaqcProductCodeRepository.save(qaqcProductCode);
		return ResponseEntity.created(new URI("/wb/update-product-stock"))
				.headers(HeaderUtil.createEntityCreationAlert("updateProductStock", "created"))
				.body(new AppResponse("success"));
	}
}
