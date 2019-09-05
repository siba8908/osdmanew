package com.sunjray.osdma.PCcontroller;

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

import com.sunjray.osdma.PCmodel.LetterClearance;
import com.sunjray.osdma.PCservice.LetterClearanceService;
import com.sunjray.osdma.dto.AppResponse;
import com.sunjray.osdma.util.HeaderUtil;

@RestController
@RequestMapping("pc")
public class LetterClearanceController {
	@Autowired
	private LetterClearanceService letterClearanceService;

	@PostMapping("/save-letter-clearance")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<AppResponse> registerAccount(@RequestBody List<LetterClearance> letterClearances) throws URISyntaxException {
		letterClearanceService.save(letterClearances);
		return ResponseEntity.created(new URI("/pc/save-letter-clearance"))
	            .headers(HeaderUtil.createEntityCreationAlert("LetterClearance", "created"))
	            .body(new AppResponse("success"));
	}
	
	@GetMapping("/fetch-letter-clearance")
	public List<LetterClearance> getLetterClearance() {
		return letterClearanceService.getLetterClearance();
	}
}
