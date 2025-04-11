package com.sp.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sp.beans.Address;
import com.sp.beans.Student;

@Configuration
//@ComponentScan("com.sp.beans") // this is used when you are pass the object in the context.getBean("student");
public class SpringConfigFile {

	@Bean
	public Address createAddrObj() {
//		value provide by the constructor 
		Address addr = new Address(100, "chandigah", 12345);
		
//		this values are provide to the getter or setter method
//		addr.setHouseno(100);
//		addr.setCity("delhi");
//		addr.setPincode(12345);
		return addr;
	}
	@Bean
	public Student CreateStdObj() {
		Student std = new Student(101,"varun",createAddrObj());
//		std.setRollno(101);
//		std.setName("deepak");
//        std.setAddress(createAddrObj());
        
		return std;
	}
}
