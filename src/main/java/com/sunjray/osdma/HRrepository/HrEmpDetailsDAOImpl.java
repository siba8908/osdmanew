package com.sunjray.osdma.HRrepository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sunjray.osdma.HRmodel.EmployeeEducationBean;
import com.sunjray.osdma.HRmodel.EmpoloyeeExperienceBean;
import com.sunjray.osdma.HRmodel.SingleEmpDetails;

import com.sunjray.osdma.HRmodel.User;
import com.sunjray.osdma.mapper.DistRowMapper;
import com.sunjray.osdma.mapper.QaqcItemsMapper;
import com.sunjray.osdma.mapper.StateRowMapper;
import com.sunjray.osdma.util.QueryConstant;


@Repository
public class HrEmpDetailsDAOImpl implements HrEmpDetailsDAO {

	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
@Transactional
	public int addemp(SingleEmpDetails empDetails) {
		// TODO Auto-generated method stub
		
		int count=0;
		/*System.out.println("name"+empDetails.getFirstName());*/
		count = jdbcTemplate.update(QueryConstant.EMP_PERSONAL_DETAILS, empDetails.getFirstName(),empDetails.getLastName(),empDetails.getFatherName(),empDetails.getDob(),empDetails.getGender(),empDetails.getContactNo(),empDetails.getReligion(),empDetails.getAdharNo(),empDetails.getMaritalStatus(),empDetails.getInsurancePolicyNo());
		
		/*System.out.println("count::"+empDetails.getEmpEducation().size());*/
		count = jdbcTemplate.update(QueryConstant.EMP_EMERGENCY_DETAILS, empDetails.getContactPerson(), empDetails.getRelationship(), empDetails.getRelContactNo(), empDetails.getBloodGroup());
		count = jdbcTemplate.update(QueryConstant.EMP_ADDRESS, empDetails.getVillage(), empDetails.getPost(), empDetails.getStation(), empDetails.getDist(), empDetails.getState(),empDetails.getPin() );
		
		EmployeeEducationBean empEduDetailsObj=null;
		List<EmployeeEducationBean> edL=empDetails.getEmpEducation();
		//System.out.println("Size::"+edL.size());
		Iterator<EmployeeEducationBean> educationList=edL.iterator();
		while(educationList.hasNext())
		{
			empEduDetailsObj=educationList.next();
			System.out.println("Iterator::"+empEduDetailsObj.getEducation());
		
			count = jdbcTemplate.update(QueryConstant.EMP_EDUCATION_DETAILS, empEduDetailsObj.getEducation(), empEduDetailsObj.getEducationUniversity(), empEduDetailsObj.getPassingYear(), empEduDetailsObj.getPercent());
		
		}
		
		EmpoloyeeExperienceBean empDetailsObj=null;
		List<EmpoloyeeExperienceBean> exL=empDetails.getEmpExperience();
		Iterator<EmpoloyeeExperienceBean> experienceList=exL.iterator();
		while(experienceList.hasNext())
		{
			empDetailsObj=experienceList.next();
			
			count = jdbcTemplate.update(QueryConstant.EMP_EXPERIENCE_INFORMATION,empDetailsObj.getOrganisationName(),empDetailsObj.getDesignation(),empDetailsObj.getJoiningDate(),empDetailsObj.getRelievingDate(),empDetailsObj.getOrgContactNo());
			
		}
		
		count = jdbcTemplate.update(QueryConstant.EMP_ACCOUNT_DETAILS, empDetails.getAccountHolderName(), empDetails.getAccountNo(), empDetails.getBankName(), empDetails.getIfscCode());
		System.out.println(count+".............");
		return count;
	  
	}

	@Override
	public List<SingleEmpDetails> getState() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(QueryConstant.DISPLAY_STATE,new StateRowMapper());
	}

	
	@Override
	public List<SingleEmpDetails> getDist() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(QueryConstant.DISPLAY_DIST,new DistRowMapper());
	}
	
	


}
