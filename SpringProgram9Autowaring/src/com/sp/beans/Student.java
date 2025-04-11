package com.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private String name;
	private int rollno;
	@Autowired
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	when we use the @Autowired annotation then we don't use the gett
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
	}
	
//	@Override
//	public String toString() {
//		return ;
//	}
}
