package com.sp.beans;

public class Student {
    private String name;
    private int rollno;
    private String email;

    // Getter and setter methods for the properties

    public void setName(String name) {
        this.name = name;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Display method
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Roll No: " + rollno);
        System.out.println("Student Email: " + email);
    }
}
