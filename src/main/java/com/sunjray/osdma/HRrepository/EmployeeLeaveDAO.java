package com.sunjray.osdma.HRrepository;

import com.sunjray.osdma.HRmodel.Leave;

public interface EmployeeLeaveDAO {

	Iterable<Leave> findAllLeave();
}
