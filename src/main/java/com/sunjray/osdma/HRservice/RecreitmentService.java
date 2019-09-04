package com.sunjray.osdma.HRservice;

import java.util.List;

import javax.servlet.http.HttpSession;


import com.sunjray.osdma.HRmodel.User;



public interface RecreitmentService {

	public String addUser(User u);

	public Iterable<User> getUsers();

	void deleteUser(User user);
	
	List<User> findAllActiveUser();

	int saveUser(User user,HttpSession session);

	/* public List<> showPayroll(); */
	

	 
	

}
