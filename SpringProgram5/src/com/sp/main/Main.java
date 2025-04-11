package com.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.beans.Student;

public class Main {
    public static void main(String[] args) {
        String config_file_loc = "com/sp/resource/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config_file_loc);

        // Get the student bean
        Student std = (Student) context.getBean("stdId");
        std.display();
    }
}
