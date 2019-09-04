package com.sunjray.osdma.PCcontroller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.PCmodel.SiteSurvey;
import com.sunjray.osdma.PCservice.SiteSurveyService;
import com.sunjray.osdma.dto.AppResponse;
import com.sunjray.osdma.util.HeaderUtil;

@RestController
@RequestMapping("pc")
public class SiteSurveyController {
	@Autowired
	private SiteSurveyService siteSurveyService;

	@PostMapping("/save-site-survey")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<AppResponse> saveSiteSurvey(@Valid @RequestBody List<SiteSurvey> siteSurvey) throws URISyntaxException {
		siteSurveyService.save(siteSurvey);
		return ResponseEntity.created(new URI("/pc/save-site-survey"))
	            .headers(HeaderUtil.createEntityCreationAlert("SiteSurvey", "created"))
	            .body(new AppResponse("success"));
	}
	
	@GetMapping("/fetch-site-survey")
	public List<SiteSurvey> getAllSiteSurvey() {
		return siteSurveyService.findAll();
	}

}
