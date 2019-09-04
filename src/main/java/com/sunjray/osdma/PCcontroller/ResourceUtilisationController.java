package com.sunjray.osdma.PCcontroller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.PCmodel.ResourceUtilisation;
import com.sunjray.osdma.PCrepository.ResourceUtilisationRepository;

@RestController
@RequestMapping("pc")
public class ResourceUtilisationController {
	
	@Resource
	ResourceUtilisationRepository resourceUtilisationRepository;
	
	private final String NOTENGEGED = "PRESENT & NOTENGAGED";
	
	/**
     * POST  /fetch-members-for-team-update : get  ResourceUtilisations.
     *
     * @param ResourceUtilisation 
     * @return the ResponseEntity with status 200 and with body the List of ResourceUtilisation
     */
	@PostMapping("/fetch-members-for-team-update")
    public List<ResourceUtilisation> getMemberForTeamUpdate(@RequestBody ResourceUtilisation resourceUtilisation) {
        return resourceUtilisationRepository.findByMasterTeamAndStatus(resourceUtilisation.getMasterTeam(), NOTENGEGED);
    }
}
