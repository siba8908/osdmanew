package com.sunjray.osdma.PCrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunjray.osdma.PCmodel.EmployeePersonalDetails;
import com.sunjray.osdma.PCmodel.MasterTeam;
import com.sunjray.osdma.PCmodel.Project;
import com.sunjray.osdma.PCmodel.ResourceUtilisation;

public interface ResourceUtilisationRepository extends JpaRepository<ResourceUtilisation, Long>  {

	List<ResourceUtilisation> findByProjectAndStatus(Project project, String status);

	List<ResourceUtilisation> findByMasterTeamAndStatus(MasterTeam masterTeam, String status);

	ResourceUtilisation findByMasterTeamAndEmployeePersonalDetails(MasterTeam masterTeam,
			EmployeePersonalDetails employeePersonalDetails);

}
