package com.sunjray.osdma.PCrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunjray.osdma.PCmodel.WorkStatus;

public interface WorkStatusRepository extends JpaRepository<WorkStatus, Long> {

	List<WorkStatus> findByOrderByStatusDateDesc();

}
