package com.sunjray.osdma.PCcontroller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.PCmodel.ProjProdMap;
import com.sunjray.osdma.PCrepository.ProjectProductMapRepository;

@RestController
@RequestMapping("pc")
public class ProjectProductMapController {
	@Resource
	private ProjectProductMapRepository projectProductMapRepository;

	@GetMapping("/fetch-material-status")
	public List<ProjProdMap> getAllProduct() {
		return projectProductMapRepository.findAll();
	}

}
