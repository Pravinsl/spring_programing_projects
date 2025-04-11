package com.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sp.beans.Student;
import com.sp.resources.SpringConfigFile;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student std =  (Student) context.getBean("stdId1");
		std.display();
		// Second way to call the student class
//		Student std = context.getBean(Student.class);
//		std.display();
//		3rd way
//		Student std = (Student)context.getBean("stdObj");
//		std.display();
	}
}
