package com.sp.beans;

public class Student {

	private int rollno;
	private String name;
	private Address address;
	
//	using setter method 
//	public int getRollno() {
//		return rollno;
//	}
//	public void setRollno(int rollno) {
//		this.rollno = rollno;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//	using constructor
	public Student(int rollno, String name, Address address) {
		this.rollno= rollno;
		this.name= name;
		this.address= address;
	}
	public void display() {
		System.out.println("rollno :"+rollno);
		System.out.println("name :"+name);
		System.out.println("address :"+address);
	}
}
