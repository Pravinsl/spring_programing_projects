package com.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sp.beans.Student;

public class Main {
    public static void main(String[] args) {
        // Correctly specify the location of the Spring configuration file
        String config_loc = "com/sp/resources/applicationContext.xml"; // Relative path from the classpath

        // Initialize the ApplicationContext by passing the configuration location
        ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);

        // Retrieve the bean and use it
        Student std = (Student) context.getBean("stdId");// object creation new type
        std.display(); // Call the display method (make sure it's defined in Student)
        
        System.out.println("-------------------");
        Student std1 = (Student) context.getBean("stdId1");
        std1.display(); // Call the display method (make sure it's defined in Student)
    }
}

//1.spring-beans-xxx.jar
//2.spring-core-xxx.jar
//3.spring-context-xx.jar
//4.common-logging-xx.jar
//5.spring-expression-xxx.jar