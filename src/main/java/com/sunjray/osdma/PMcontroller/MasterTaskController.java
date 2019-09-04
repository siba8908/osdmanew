package com.sunjray.osdma.PMcontroller;

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

import com.sunjray.osdma.PCmodel.MasterTask;
import com.sunjray.osdma.PCrepository.MasterTaskRepository;
import com.sunjray.osdma.dto.AppResponse;
import com.sunjray.osdma.util.HeaderUtil;

@RestController
@RequestMapping("/pm")
public class MasterTaskController {
	@Autowired
	private MasterTaskRepository masterTaskRepository;

	@PostMapping("/save-master-task")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<AppResponse> saveMasterTask(@Valid @RequestBody List<MasterTask> masterTask) throws URISyntaxException {
		masterTaskRepository.saveAll(masterTask);
		return ResponseEntity.created(new URI("/pm/save-master-task"))
	            .headers(HeaderUtil.createEntityCreationAlert("MasterTask", "created"))
	            .body(new AppResponse("success"));
	}

	@GetMapping("/fetch-master-task")
	public List<MasterTask> getAllMasterTask() {
		return masterTaskRepository.findAll();
	}
	
	@PostMapping("/update-master-task")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<AppResponse> updateMasterTask(@Valid @RequestBody MasterTask masterTask) throws URISyntaxException {
		masterTaskRepository.saveAndFlush(masterTask);
		return ResponseEntity.created(new URI("/pm/update-master-task"))
	            .headers(HeaderUtil.createEntityCreationAlert("UpdateMasterTask", "created"))
	            .body(new AppResponse("success"));
	}

}
