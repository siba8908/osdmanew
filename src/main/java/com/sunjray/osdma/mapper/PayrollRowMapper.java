package com.sunjray.osdma.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sunjray.osdma.HRmodel.Deduction;

public class PayrollRowMapper implements RowMapper<Deduction> {

	@Override
	public Deduction mapRow(ResultSet rs, int rowNum) throws SQLException {
	
		Deduction d=new Deduction();
		d.setEmployeeId(rs.getLong(6));
		d.setEsi(rs.getDouble(7));
		d.setFullName(rs.getString(1)+rs.getString(2));
		/*d.setFirstName(rs.getString(1));
		d.setLastName(rs.getString(2));*/
		d.setBonus(rs.getDouble(13));
		System.out.println(rs.getDouble(13));
		d.setPf(rs.getDouble(9));
		d.setTds(rs.getDouble(10));
		d.setCaluSalary(rs.getDouble(12));
		d.setSalary(rs.getDouble(5));
		d.setDepartmentName(rs.getString(4));
		d.setWorkOnHolidays(rs.getDouble(11));
		d.setEmployeeCode(rs.getString(3));
		d.setLoan(rs.getDouble(8));
		return d;
	}

}
