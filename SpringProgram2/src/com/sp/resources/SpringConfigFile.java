package com.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sp.beans.Student;

// configuration create here using the annotation
@Configuration
public class SpringConfigFile {

	// bean object creation 
	@Bean

	public Student stdId1() {
		Student std = new Student();
		std.setName("kamal");
		std.setEmail("komal12@gmail.com");
		std.setRollno(103);
		return std  ;
	}
//	 for 3 way 
//	 @Bean("stdObj")
//	public Student createStdBeanObj() {
//		Student std = new Student ();
//		std.setName(null);
//		std.setRollno(0);
//		std.setName(null);
//		return null;
//	}
}
