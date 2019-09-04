package com.sunjray.osdma.PCrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunjray.osdma.PCmodel.MasterStationType;
import com.sunjray.osdma.PCmodel.MasterWorkStage;
import com.sunjray.osdma.PCmodel.ProjProdMap;

public interface ProjectProductMapRepository extends JpaRepository<ProjProdMap, Integer> {

	List<ProjProdMap> findByMasterStationTypeAndMasterWorkStage(MasterStationType masterStationType,
			MasterWorkStage masterWorkStage);

}
