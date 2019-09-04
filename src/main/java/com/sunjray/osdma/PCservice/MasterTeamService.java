package com.sunjray.osdma.PCservice;

import java.util.List;

import com.sunjray.osdma.PCmodel.MasterTeam;
import com.sunjray.osdma.dto.TeamMemberDTO;

public interface MasterTeamService {

	MasterTeam createTeamWithMembers(TeamMemberDTO teamMemberDTO);

	List<TeamMemberDTO> findByMasterTeam(MasterTeam masterTeam);

}
