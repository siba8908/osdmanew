package com.sunjray.osdma.qaqcRepository;

import com.sunjray.osdma.qaqcModel.Component;

public interface ComponentDao {

	Iterable<Component> findAllComponent(String images);

}
