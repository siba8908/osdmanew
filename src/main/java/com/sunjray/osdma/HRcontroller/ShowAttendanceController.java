package com.sunjray.osdma.HRcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sunjray.osdma.HRmodel.Attendance;
import com.sunjray.osdma.HRmodel.EmployeeAttendance;
import com.sunjray.osdma.HRservice.HrShowAttendanceService;

@Controller
@RequestMapping("pm")
public class ShowAttendanceController {

	@Autowired
	HrShowAttendanceService hrShowAttendanceService;

	@RequestMapping(value = "/showAttendance", method = RequestMethod.POST)
	public @ResponseBody List<EmployeeAttendance> getAttendance(@RequestBody Attendance json) {
		List<EmployeeAttendance> attendance = new ArrayList<>();
		try {
			attendance = hrShowAttendanceService.getAttendance(json.getMonth(), json.getYear());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return attendance;

	}
}
