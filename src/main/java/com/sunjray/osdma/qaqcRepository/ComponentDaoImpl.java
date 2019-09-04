package com.sunjray.osdma.qaqcRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunjray.osdma.mapper.MasterComponentMapper;
import com.sunjray.osdma.qaqcModel.Component;
import com.sunjray.osdma.util.QueryConstant;




@Repository
public class ComponentDaoImpl implements ComponentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	 @Override
		public Iterable<Component> findAllComponent(String images) {
			
			 return jdbcTemplate.query(QueryConstant.DISPLAYALL_COMPONENT,new MasterComponentMapper(),images);
		}

}
