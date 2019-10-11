package com.sunjray.osdma.HRrepository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sunjray.osdma.HRmodel.EmployeeAttendance;
import com.sunjray.osdma.util.CommonUtil;
import com.sunjray.osdma.util.QueryConstant;

@Repository
public class HrShowAttendanceDAOImpl implements HrShowAttendanceDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<EmployeeAttendance> getAttendance(int month, int year) {
		return jdbcTemplate.query(QueryConstant.DISPLAY_ATTENDANCE, new RowMapper<EmployeeAttendance>() {
			@Override
			public EmployeeAttendance mapRow(ResultSet rs, int rownumber) throws SQLException {
				EmployeeAttendance att = new EmployeeAttendance();
				att.setEmployeeCode(CommonUtil.checkNullValue(rs.getString(1)));
				att.setDay1(CommonUtil.checkNullValue(rs.getString(2)));
				att.setDay2(CommonUtil.checkNullValue(rs.getString(3)));
				att.setDay3(CommonUtil.checkNullValue(rs.getString(4)));
				att.setDay4(CommonUtil.checkNullValue(rs.getString(5)));
				att.setDay5(CommonUtil.checkNullValue(rs.getString(6)));
				att.setDay6(CommonUtil.checkNullValue(rs.getString(7)));
				att.setDay7(CommonUtil.checkNullValue(rs.getString(8)));
				att.setDay8(CommonUtil.checkNullValue(rs.getString(9)));
				att.setDay9(CommonUtil.checkNullValue(rs.getString(10)));
				att.setDay10(CommonUtil.checkNullValue(rs.getString(11)));
				att.setDay11(CommonUtil.checkNullValue(rs.getString(12)));
				att.setDay12(CommonUtil.checkNullValue(rs.getString(13)));
				att.setDay13(CommonUtil.checkNullValue(rs.getString(14)));
				att.setDay14(CommonUtil.checkNullValue(rs.getString(15)));
				att.setDay15(CommonUtil.checkNullValue(rs.getString(16)));
				att.setDay16(CommonUtil.checkNullValue(rs.getString(17)));
				att.setDay17(CommonUtil.checkNullValue(rs.getString(18)));
				att.setDay18(CommonUtil.checkNullValue(rs.getString(19)));
				att.setDay19(CommonUtil.checkNullValue(rs.getString(20)));
				att.setDay20(CommonUtil.checkNullValue(rs.getString(21)));
				att.setDay21(CommonUtil.checkNullValue(rs.getString(22)));
				att.setDay22(CommonUtil.checkNullValue(rs.getString(23)));
				att.setDay23(CommonUtil.checkNullValue(rs.getString(24)));
				att.setDay24(CommonUtil.checkNullValue(rs.getString(25)));
				att.setDay25(CommonUtil.checkNullValue(rs.getString(26)));
				att.setDay26(CommonUtil.checkNullValue(rs.getString(27)));
				att.setDay27(CommonUtil.checkNullValue(rs.getString(28)));
				att.setDay28(CommonUtil.checkNullValue(rs.getString(29)));
				att.setDay29(CommonUtil.checkNullValue(rs.getString(30)));
				att.setDay30(CommonUtil.checkNullValue(rs.getString(31)));
				att.setDay31(CommonUtil.checkNullValue(rs.getString(32)));
				att.setTotalPresent(rs.getInt(33));
				return att;
			}
		}, month, year);
	}

}
