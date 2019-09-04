package com.sunjray.osdma.PCserviceimpl;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.sunjray.osdma.PCmodel.PcMaterialRequest;
import com.sunjray.osdma.PCrepository.MaterialRequestRepository;
import com.sunjray.osdma.PCservice.MaterialRequestService;

@Service
public class MaterialRequestServiceImpl implements MaterialRequestService {
	@Resource
	private MaterialRequestRepository materialRequestRepository;

	@Override
	public void saveMaterialRequest(@Valid List<PcMaterialRequest> materialRequest) {
		materialRequestRepository.saveAll(materialRequest);
	}

}
