package com.sunjray.osdma.PMRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sunjray.osdma.PCmodel.EmployeePersonalDetails;

public interface EmployeePersonalDetailsRepository extends JpaRepository<EmployeePersonalDetails, Long> {

	@Query("select emp FROM EmployeePersonalDetails emp LEFT OUTER JOIN HrAddedEmployee addedEmp on addedEmp.employeeId = emp.employeeId JOIN addedEmp.designation desg  where desg.designation = :desination")
	List<EmployeePersonalDetails> findByEmployeeDesignation(@Param("desination")String desination);

}
