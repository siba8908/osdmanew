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

import com.sunjray.osdma.SMwarehouseAModel.WarhouseaMaterialLst;
import com.sunjray.osdma.SMwarehouseARepository.WarhouseaMaterialLstRepository;
import com.sunjray.osdma.dto.AppResponse;
import com.sunjray.osdma.util.HeaderUtil;

@RestController
@RequestMapping("wa")
public class WarhouseaMaterialLstController {
	@Autowired
	private WarhouseaMaterialLstRepository warhouseaMaterialLstRepository;

	@PostMapping("/save-warehouse-a-material-list")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<AppResponse> saveWarehouseAMateriallist(@Valid @RequestBody List<WarhouseaMaterialLst> warhouseaMaterialLst) throws URISyntaxException {
		warhouseaMaterialLstRepository.saveAll(warhouseaMaterialLst);
		return ResponseEntity.created(new URI("/wa/save-warehouse-a-material-list"))
	            .headers(HeaderUtil.createEntityCreationAlert("WarehouseAMateriallist", "created"))
	            .body(new AppResponse("success"));
	}
}
