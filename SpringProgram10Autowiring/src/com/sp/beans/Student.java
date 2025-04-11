package com.sp.beans;

import javax.security.auth.Subject;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private String name;
	private int rollno;
	@Autowired
	private Address address;
	@Autowired
	private Subjects subjects;
	
//	public Subjects getSubjects() {
//		return subjects;
//	}
//	public void setSubjects(Subjects subjects2) {
//		this.subjects = subjects2;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	when we use the @Autowired annotation then we don't use the getter and setter methods
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void display() {
		System.out.println("name :"+name);
		System.out.println("rollno :"+rollno);
		System.out.println("address :"+address);
		System.out.println("Subject :"+subjects);
	}
	
//	@Override
//	public String toString() {
//		return ;
//	}
}
