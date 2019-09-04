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

import com.sunjray.osdma.PCmodel.Project;
import com.sunjray.osdma.PCrepository.ProjectRepository;
import com.sunjray.osdma.dto.AppResponse;
import com.sunjray.osdma.util.HeaderUtil;

@RestController
@RequestMapping("/pm")
public class ProjectController {
	@Autowired
	private ProjectRepository projectRepository;
	
	@GetMapping("/fetch-project")
	public List<Project> getAllProjects() {
		return projectRepository.findAll();
	}
	
	@PostMapping("/save-project")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<AppResponse> saveProject(@Valid @RequestBody Project project) throws URISyntaxException {
		projectRepository.save(project);
		return ResponseEntity.created(new URI("/pm/save-project"))
	            .headers(HeaderUtil.createEntityCreationAlert("Project", "created"))
	            .body(new AppResponse("success"));
	}
}
