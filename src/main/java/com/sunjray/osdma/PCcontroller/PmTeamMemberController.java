package com.sunjray.osdma.PCcontroller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunjray.osdma.PCenumeration.Status;
import com.sunjray.osdma.PCmodel.PmTeamMember;
import com.sunjray.osdma.PCmodel.ResourceUtilisation;
import com.sunjray.osdma.PCrepository.PmTeamMemberRepository;
import com.sunjray.osdma.PCrepository.ResourceUtilisationRepository;

@RestController
@RequestMapping("pc")
public class PmTeamMemberController {
	
	@Resource
	PmTeamMemberRepository pmTeamMemberRepository;
	
	@Resource
	ResourceUtilisationRepository resourceUtilisationRepository;
	
	/**
     * POST  /fetch-team-members : get  PmTeamMembers.
     *
     * @param PmTeamMember 
     * @return the ResponseEntity with status 200 and with body the List of PmTeamMembers
     */
    @PostMapping("/fetch-team-members")
    public List<PmTeamMember> getTeamMemberByTeam(@RequestBody PmTeamMember pmTeamMember) {
        return pmTeamMemberRepository.findByMasterTeam(pmTeamMember.getMasterTeam());
    }
    
    /**
     * POST  /fetch-team-members : get  PmTeamMembers.
     *
     * @param PmTeamMember 
     * @return the ResponseEntity with status 200 and with body of PmTeamMembers
     */
    @PostMapping("/update-team-member")
    public ResponseEntity<PmTeamMember> updateTeamMember(@RequestBody PmTeamMember pmTeamMember) {
    	PmTeamMember updateMember = pmTeamMemberRepository.findByAssignmentIdAndEmployeePersonalDetails(pmTeamMember.getAssignmentId(), pmTeamMember.getEmployeePersonalDetails());
    	updateMember.setEmployeePersonalDetails(pmTeamMember.getUpdateEmployeeDetails());
    	updateMember.setStatus(Status.ACCEPTED);
    	PmTeamMember result =  pmTeamMemberRepository.saveAndFlush(updateMember);
    	
    	
    	ResourceUtilisation updateCurrentResourceDetails = resourceUtilisationRepository.findByMasterTeamAndEmployeePersonalDetails(pmTeamMember.getMasterTeam(), pmTeamMember.getEmployeePersonalDetails());
    	updateCurrentResourceDetails.setStatus("PRESENT & NOTENGAGED");
    	updateCurrentResourceDetails.setUpdatedDate(new Date());
    	resourceUtilisationRepository.saveAndFlush(updateCurrentResourceDetails);
    	
    	ResourceUtilisation updateSelectedResourceDetails = resourceUtilisationRepository.findByMasterTeamAndEmployeePersonalDetails(pmTeamMember.getMasterTeam(), pmTeamMember.getUpdateEmployeeDetails());
    	updateSelectedResourceDetails.setStatus("PRESENT & ENGAGED");
    	updateSelectedResourceDetails.setUpdatedDate(new Date());
    	resourceUtilisationRepository.saveAndFlush(updateSelectedResourceDetails);
    	
        return ResponseEntity.ok().body(result);
    }
	
}
