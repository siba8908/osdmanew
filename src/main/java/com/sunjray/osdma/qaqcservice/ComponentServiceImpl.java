package com.sunjray.osdma.qaqcservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunjray.osdma.qaqcModel.Component;
import com.sunjray.osdma.qaqcRepository.ComponentDao;

@Service
public class ComponentServiceImpl implements ComponentService {
	
	 @Autowired
	   private ComponentDao adao;
	
	@Override
	public Iterable<Component> getComponent(String images) {
		// TODO Auto-generated method stub
		Iterable<Component> ur=null;
		ur=adao.findAllComponent(images);
		return ur;
	}

}
