package com.sunjray.osdma.HRservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunjray.osdma.HRmodel.User;
import com.sunjray.osdma.HRrepository.HRStatusDao;





@Service
public class RecuirementServImpl implements RecuirementStatusService {
   @Autowired
	HRStatusDao hrstatusDao;

	

	/*
	 * @Override public AddEmployee addEmployee(AddEmployee employee) { // TODO
	 * Auto-generated method stub return hrRepository.save(employee); }
	 */

	
	
	  @Override 
	  public List<User> getUsers() 
	  { 
		  List<User> user=null;
		  user=hrstatusDao.getUsers();
	      return user;
	  }



	  
	  
	/*
	 * @Override public List<Patient> fetchPatientsOrderById() { List<Patient>
	 * patient=null; patient=patientDao.getPatientsOrderById(); return patient; }
	 */

}
