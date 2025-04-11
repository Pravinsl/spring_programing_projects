package com.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("deepak")
	private String name;
	@Value("12")
	private int rollno;
	@Value("75.55f")
	private float marks;
	
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollon() {
		return rollno;
	}
	public void setRollon(int rollno) {
		this.rollno = rollno;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	public void display() {
		System.out.println("name :"+ name);
		System.out.println("rollno :"+rollno);
		System.out.println("marks :"+marks);
		
	}
}
