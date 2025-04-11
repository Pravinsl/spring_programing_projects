package com.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.beans.Student;
import com.sp.resource.SpringConfigFile;

public class Main {
	public static void main(String[] args) {
		//String resourcefilepath = "com/sp/resource/applicationContext.xml";
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

		Student std= (Student) context.getBean("student");
		std.display();
	}

}
