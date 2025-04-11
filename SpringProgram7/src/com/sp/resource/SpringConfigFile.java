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
		Address addr = new Address();
		addr.setHouseno(100);
		addr.setCity("delhi");
		addr.setPincode(12345);
		return addr;
	}
	@Bean
	public Student CreateStdObj() {
		Student std = new Student();
		std.setRollno(101);
		std.setName("deepak");
        std.setAddress(createAddrObj());
        
		return std;
	}
}
