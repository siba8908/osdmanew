package com.sunjray.osdma.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.PCmodel.MasterStationType;
import com.sunjray.osdma.PCmodel.MasterTeam;
import com.sunjray.osdma.PCmodel.MasterWorkStage;
import com.sunjray.osdma.PCmodel.PmTeamTaskMap;
import com.sunjray.osdma.PCmodel.ProjProdMap;
import com.sunjray.osdma.PCmodel.Sitecode;
import com.sunjray.osdma.PCmodel.WorkStatus;
import com.sunjray.osdma.PCrepository.MasterTeamRepository;
import com.sunjray.osdma.PCrepository.PmTeamTaskRepository;
import com.sunjray.osdma.PCrepository.ProjectProductMapRepository;
import com.sunjray.osdma.PCrepository.SitecodeRepository;
import com.sunjray.osdma.PCrepository.StationTypeRepository;
import com.sunjray.osdma.PCrepository.WorkStageRepository;
import com.sunjray.osdma.PCservice.WorkStatusService;

@RestController
public class CommonController {
	@Autowired
	private SitecodeRepository sitecodeRepository;

	@Autowired
	private StationTypeRepository stationTypeRepository;

	@Resource
	MasterTeamRepository masterTeamRepository;

	@Autowired
	private WorkStageRepository workStageRepository;

	@Autowired
	private PmTeamTaskRepository pmTeamTaskRepository;

	@Resource
	WorkStatusService workStatusService;

	@Resource
	private ProjectProductMapRepository projectProductMapRepository;

	@GetMapping("/fetch-site-code")
	public List<Sitecode> getAllSitecode() {
		return sitecodeRepository.findAll();
	}

	@GetMapping("/fetch-station-type")
	public List<MasterStationType> getAllStationType() {
		return stationTypeRepository.findAll();
	}

	/**
	 * GET /fetch-teams : get all the MasterTeams.
	 *
	 * @return the ResponseEntity with status 200 (OK) and the list of MasterTeams
	 *         in body
	 */
	@GetMapping("/fetch-teams")
	public List<MasterTeam> getAllTeams() {
		return masterTeamRepository.findAll();
	}

	@GetMapping("/fetch-work-stage")
	public List<MasterWorkStage> getAllMasterWorkStage() {
		return workStageRepository.findAll();
	}

	@GetMapping("/fetch-pm-team-task")
	public List<PmTeamTaskMap> getAllTeamTask() {
		return pmTeamTaskRepository.findAll();
	}

	@GetMapping("/fetch-work-status")
	public List<WorkStatus> getAllMasterWorkStatus() {
		return workStatusService.findAll();
	}

	@PostMapping("/fetch-mapped-product")
	public List<ProjProdMap> getAllProductMappedByProject(@Valid @RequestBody ProjProdMap projProdMap) {
		return projectProductMapRepository.findByMasterStationTypeAndMasterWorkStage(projProdMap.getMasterStationType(),
				projProdMap.getMasterWorkStage());
	}
}
