package com.sunjray.osdma.PMcontroller;

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

import com.sunjray.osdma.PCmodel.PmTeamTaskMap;
import com.sunjray.osdma.PCrepository.PmTeamTaskRepository;
import com.sunjray.osdma.dto.AppResponse;
import com.sunjray.osdma.util.HeaderUtil;

@RestController
@RequestMapping("/pm")
public class PmTeamTaskController {
	@Autowired
	private PmTeamTaskRepository pmTeamTaskRepository;
	
	@PostMapping("/save-assign-task")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<AppResponse> saveAssignTask(@Valid @RequestBody List<PmTeamTaskMap> pmTeamTaskMap) throws URISyntaxException {
		pmTeamTaskRepository.saveAll(pmTeamTaskMap);
		return ResponseEntity.created(new URI("/pm/save-assign-task"))
	            .headers(HeaderUtil.createEntityCreationAlert("AssignTask", "created"))
	            .body(new AppResponse("success"));
	}
}
