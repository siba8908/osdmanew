package com.sunjray.osdma.SMrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunjray.osdma.SMmodel.ConsignmentLogistic;

public interface ConsignmentLogisticRepository extends JpaRepository<ConsignmentLogistic, Long> {

	//List<ConsignmentLogistic> findAllOrderByLogAsignmentIdDesc();

}
