package com.sunjray.osdma.SMwarehouseAController;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.SMwarehouseAModel.WarhouseaStockOut;
import com.sunjray.osdma.SMwarehouseARepository.WarhouseaStockOutRepository;
import com.sunjray.osdma.dto.AppResponse;
import com.sunjray.osdma.util.HeaderUtil;

@RestController
@RequestMapping("wa")
public class WarhouseaStockOutController {

	@Autowired
	private WarhouseaStockOutRepository warhouseaStockOutRepository;

	@PostMapping("/save-stock-out-items")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<AppResponse> saveStockOutItems(@Valid @RequestBody List<WarhouseaStockOut> warhouseaStockOut) throws URISyntaxException {
		warhouseaStockOutRepository.saveAll(warhouseaStockOut);
		return ResponseEntity.created(new URI("/wa/save-stock-out-items"))
	            .headers(HeaderUtil.createEntityCreationAlert("LetterClearance", "created"))
	            .body(new AppResponse("success"));
	}

}
