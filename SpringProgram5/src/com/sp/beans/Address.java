package com.sp.beans;

public class Address {

	private int houseno;
	private String city;
	private int pincode;
	
//	using setter method 
//	public void setHouseno(int houseno) {
//		this.houseno = houseno;
//	}
//	public void setName(String city) {
//		this.city = city;
//	}
//	public void setPincode(int pincode) {
//		this.pincode = pincode;
//	}
//	using constructor
	public Address(int houseno, String city, int picode) {
		this.houseno= houseno;
		this.city= city;
		this.pincode= pincode;
		
	}
	@Override
	public String toString() {
		return "#"+houseno+", "+city+"- "+pincode;
	}
}
