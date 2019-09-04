package com.sunjray.osdma.loginservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import com.sunjray.osdma.HRmodel.AppUser;
import com.sunjray.osdma.loginRepository.RoleDAO;
import com.sunjray.osdma.loginRepository.UserDAO;




@Service
public class UserServiceImpl implements  UserDetailsService {
	
	@Autowired
	private UserDAO userDAO;
	@Autowired
	private RoleDAO roleDAO;
	
	@Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		  System.out.println("User! " + userName);
        AppUser appUser = userDAO.findByUsername(userName);
 
        if (appUser == null) {
            System.out.println("User not found! " + userName);
            throw new UsernameNotFoundException("User " + userName + " was not found in the database");
        }
 
        System.out.println("Found User: " + appUser);
 
        // [ROLE_USER, ROLE_ADMIN,..]
        List<String> roleNames = roleDAO.getRoleNames(appUser.getUser_id());
        System.out.println("..........."+roleNames.size());
        List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
        if (roleNames != null) {
            for (String role : roleNames) {
            	System.out.println(role);
                // ROLE_USER, ROLE_ADMIN,..
                GrantedAuthority authority = new SimpleGrantedAuthority(role);
                grantList.add(authority);
            }
        }

        UserDetails userDetails = (UserDetails) new User(appUser.getUsername(), //
                appUser.getPassword(), grantList);
 
        return userDetails;
    }
}

