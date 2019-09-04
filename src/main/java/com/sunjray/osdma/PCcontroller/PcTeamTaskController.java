package com.sunjray.osdma.PCcontroller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

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

import com.sunjray.osdma.PCmodel.PmTeamTaskMap;
import com.sunjray.osdma.PCservice.PmTeamTaskService;
import com.sunjray.osdma.dto.AppResponse;
import com.sunjray.osdma.util.HeaderUtil;

@RestController
@RequestMapping("pc")
public class PcTeamTaskController {
	@Autowired
	private PmTeamTaskService pmTeamTaskService;

	@PostMapping("/update-pm-team-task")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<AppResponse> registerAccount(@Valid @RequestBody PmTeamTaskMap pmTeamTaskMap) throws URISyntaxException {
		pmTeamTaskService.update(pmTeamTaskMap);
		return ResponseEntity.created(new URI("/pc/update-pm-team-task"))
	            .headers(HeaderUtil.createEntityCreationAlert("TeamTask", "created"))
	            .body(new AppResponse("success"));
	}
	
	
	@GetMapping("/get-work-status")
	public List<Map<String, String>> getAllWorkStatus() {
		return pmTeamTaskService.getAllWorkStatus();
	}
}
