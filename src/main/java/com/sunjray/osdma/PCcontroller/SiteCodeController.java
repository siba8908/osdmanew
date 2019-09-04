package com.sunjray.osdma.PCcontroller;

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

import com.sunjray.osdma.PCmodel.Sitecode;
import com.sunjray.osdma.PCrepository.SitecodeRepository;
import com.sunjray.osdma.dto.AppResponse;
import com.sunjray.osdma.util.HeaderUtil;

@RestController
@RequestMapping("/pm")
public class SiteCodeController {

	@Autowired
	private SitecodeRepository sitecodeRepository;

	@PostMapping("/save-site-code")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<AppResponse> saveSitecode(@Valid @RequestBody List<Sitecode> sitecode) throws URISyntaxException {
		sitecodeRepository.saveAll(sitecode);
		return ResponseEntity.created(new URI("/pm/save-site-code"))
	            .headers(HeaderUtil.createEntityCreationAlert("Sitecode", "created"))
	            .body(new AppResponse("success"));
	}

}
