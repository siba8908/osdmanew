package com.sunjray.osdma.loginservice;

import com.sunjray.osdma.HRmodel.AppUser;

public interface UserService {
	
	AppUser findByUsername(String username,String password);

}
