 package com.sp.resource;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.Subject;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.sp.beans.Address;
import com.sp.beans.Student;
import com.sp.beans.Subjects;

//@Configuration
@Component
public class SpringConfigFile {

	@Bean
	public Address createAddrObj() {
		Address addr = new Address();
		addr.setHouseno(102);
		addr.setCity("delhi");
		addr.setPincode(123);
		return addr;
	}
	@Bean
	public Subjects createSubObj() {
		Subjects subj = new Subjects();
		
		List<String> subject_list = new ArrayList<String>();
		subject_list.add("java");
		subject_list.add("Python");
		subject_list.add("c++");
		
		subj.setSubjects(subject_list);
		return subj;
		
	}
	@Bean
	public Student createStdObj() {
		
		Student std = new Student();
		std.setName("deepak");
		std.setRollno(101);
		//std.setAddress(createAddrObj());// manually DI
//		std.setSubjects(createSubObj());// manually DI
		return std;
	}
	
	
}
