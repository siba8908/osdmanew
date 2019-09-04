package com.sunjray.osdma.PCservice;

import java.util.List;

import javax.validation.Valid;

import com.sunjray.osdma.PCmodel.PcMaterialRequest;

public interface MaterialRequestService {

	void saveMaterialRequest(@Valid List<PcMaterialRequest> materialRequest);

}
