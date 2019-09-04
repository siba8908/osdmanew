package com.sunjray.osdma.HRrepository;

import java.util.List;

import com.sunjray.osdma.HRmodel.User;

public interface RecreitmentDAO {


	void addUser(String email, String name, String status);

	Iterable<User> findAll();

	void deleteUser(User user);

	

	List<User> findAllActiveUser();

	int saveUser(User user);

	int search(User u);
}
