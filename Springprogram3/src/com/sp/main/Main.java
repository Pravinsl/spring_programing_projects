package com.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.beans.Student;

public class Main {
	public static void main(String[] args) {
		//String resourcefilepath = "com/sp/resource/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sp/resource/applicationContext.xml");

		Student std= (Student) context.getBean("student");
		std.display();
	}

}
