package com.sunjray.osdma.PMcontroller;

import java.net.URI;
import java.net.URISyntaxException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.PMRepository.SiteLocationRepository;
import com.sunjray.osdma.PMmodel.SiteLocation;
import com.sunjray.osdma.dto.AppResponse;
import com.sunjray.osdma.util.HeaderUtil;

@RestController
@RequestMapping("/pm")
public class SiteLocationController {
	@Autowired
	private SiteLocationRepository siteLocationRepository;

	@PostMapping("/save-site-location")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<AppResponse> saveSiteLocation(@Valid @RequestBody SiteLocation siteLocation) throws URISyntaxException {
	   siteLocationRepository.save(siteLocation);
	   return ResponseEntity.created(new URI("/pm/save-site-location"))
	            .headers(HeaderUtil.createEntityCreationAlert("SiteLocation", "created"))
	            .body(new AppResponse("success"));
	}
}
