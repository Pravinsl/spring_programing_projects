package com.saprograming.SpringJdbcCrudOperations;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.saprograming.beans.Student;
import com.saprograming.mappers.StudentRowMapper;
import com.saprograming.resources.SpringConfigFile;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

//     ----------------INSERT OPERATION--------------------

//		int std_rollno = 103;
//		String std_name = "vani";
//		float std_marks = 90.5f;
//
//		String insert_sql_querry = "INSERT INTO student values(?,?,?)";
//
//		int count = jdbcTemplate.update(insert_sql_querry, std_rollno, std_name, std_marks);
//
//		if (count > 0) {
//			System.out.println("Values inserted successfully");
//		} else {
//			System.out.println("insertion failed");
//		}

//       -----------------UPDATE OPERATION ---------------------
//       float std_marks = 98.3f;
//       int std_rollno = 101;
//
//       String update_sql_query = "UPDATE student SET std_marks = ? WHERE std_rollno = ?";
//       int count = jdbcTemplate.update(update_sql_query, std_marks, std_rollno);
//
//       if (count > 0) {
//           System.out.println("Update successful");
//       } else {
//           System.out.println("Update failed");
//       }

//		--------------------- SELECT OPRATION --------------------
//		String select_sql_query="SELECT * FROM student";
//		List <Student> std_list =jdbcTemplate.query(select_sql_query, new StudentRowMapper());
//		for(Student std : std_list) {
//			System.out.println("rollno :"+std.getRollno());
//			System.out.println("name :"+std.getName());
//			System.out.println("marks :"+std.getMarks());
//			System.out.println("-------------------");
//		}
//		
//		--------------------- SELECT OPRATION 2 --------------------
//		int std_rollno = 103;
//		
//		String select_sql_query="SELECT * FROM student WHERE std_rollno = ?";
//		List <Student> std_list =jdbcTemplate.query(select_sql_query, new StudentRowMapper(),std_rollno);
//		for(Student std : std_list) {
//			System.out.println("rollno :"+std.getRollno());
//			System.out.println("name :"+std.getName());
//			System.out.println("marks :"+std.getMarks());
//			System.out.println("-------------------");
//		}
		
		
//		--------------------- SELECT OPRATION 2 --------------------
		int std_rollno = 103;

		String select_sql_query = "SELECT * FROM student WHERE std_rollno = ?";
		Student std = jdbcTemplate.queryForObject(select_sql_query, new StudentRowMapper(), std_rollno);
		
		
		System.out.println("rollno :" + std.getRollno());
		System.out.println("name :" + std.getName());
		System.out.println("marks :" + std.getMarks());
	}
}
