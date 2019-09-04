package com.sunjray.osdma.PCserviceimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sunjray.osdma.PCmodel.LetterTypeMaster;
import com.sunjray.osdma.PCrepository.LetterTypeMasterRepository;
import com.sunjray.osdma.PCservice.LetterTypeMasterService;

@Service
public class LetterTypeMasterServiceImpl implements LetterTypeMasterService {

	@Resource
	LetterTypeMasterRepository letterTypeMasterRepository;
	
	@Override
	public List<LetterTypeMaster> findAll() {
		return letterTypeMasterRepository.findAll();
	}

}
