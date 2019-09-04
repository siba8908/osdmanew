package com.sunjray.osdma.HRrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunjray.osdma.HRmodel.User;
import com.sunjray.osdma.mapper.EmailSerchRowMapper;
import com.sunjray.osdma.mapper.UserAllRowMapper;
import com.sunjray.osdma.mapper.UserRowMapper;
import com.sunjray.osdma.util.QueryConstant;

@Repository
public class RecreitmentDAOImpl implements RecreitmentDAO {

	

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	

	@Override
	public void addUser(String email, String name,String status) {
	    System.out.println("DAO");
		int count= jdbcTemplate.update(QueryConstant.INSERT_USER,email,name,status);
		System.out.println("++++==="+count); 
	}
	
	@Override
	public int search(User u) {		
			List<User>user=	jdbcTemplate.query(QueryConstant.SEARCH_EMAIL,new EmailSerchRowMapper(),u.getEmail());
			System.out.println("Size:"+user.size());
				if(user.size()> 0) {
				return 1;
				}
				else
					return 0;
	}

	@Override
	public Iterable<User> findAll() {
		
		return jdbcTemplate.query(QueryConstant.DISPLAY_USER_LIST,new UserRowMapper());
	}

	@Override
	public void deleteUser(User user) {
		System.out.println("status"+user.getStatus());
		jdbcTemplate.update(QueryConstant.DELETE_USER,user.getStatus(),user.getUserId());
		
	}


	@Override
	public List<User> findAllActiveUser() {
		
		return jdbcTemplate.query(QueryConstant.DISPLAYALL_USER_LIST,new UserAllRowMapper());
	}

	@Override
	public int saveUser(User user) {
		
		return jdbcTemplate.update(QueryConstant.UPDATE_USER,user.getEmail(),user.getName(),user.getUserId());
	}

	
}
