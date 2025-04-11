package com.saprograming.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.saprograming.beans.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student std = new Student();
		std.setRollno(rs.getInt("std_rollno"));
		std.setName(rs.getString("std_name"));
		std.setMarks(rs.getFloat("std_marks"));
		return std;
	}

}
