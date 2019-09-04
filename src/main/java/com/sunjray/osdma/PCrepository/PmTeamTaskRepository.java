package com.sunjray.osdma.PCrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunjray.osdma.PCmodel.PmTeamTaskMap;

public interface PmTeamTaskRepository extends JpaRepository<PmTeamTaskMap, Integer> {

}
