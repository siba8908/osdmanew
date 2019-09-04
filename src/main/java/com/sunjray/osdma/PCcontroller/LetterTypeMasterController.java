package com.sunjray.osdma.PCcontroller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.PCmodel.LetterTypeMaster;
import com.sunjray.osdma.PCservice.LetterTypeMasterService;



@RestController
@RequestMapping("pc")
public class LetterTypeMasterController {
	
	private final Logger log = LoggerFactory.getLogger(LetterTypeMasterController.class);
	
	@Resource
	LetterTypeMasterService letterTypeMasterService;
	
	
	/**
	 * GET /score-farmer-final-risks : get all the scoreFarmerFinalRisks.
	 *
	 * @return the ResponseEntity with status 200 (OK) and the list of
	 *         scoreFarmerFinalRisks in body
	 */
	@GetMapping("/fetch-letter-type-master")
	public List<LetterTypeMaster> getAllScoreFarmerFinalRisks() {
		log.debug("REST request to get all LetterTypeMaster");
		return letterTypeMasterService.findAll();
	}
}
