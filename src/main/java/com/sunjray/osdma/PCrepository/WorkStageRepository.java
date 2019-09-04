package com.sunjray.osdma.PCrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunjray.osdma.PCmodel.MasterWorkStage;

public interface WorkStageRepository extends JpaRepository<MasterWorkStage, Long> {

}
