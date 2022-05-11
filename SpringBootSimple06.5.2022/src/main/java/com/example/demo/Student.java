package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Student {
@Autowired
Course course;
	private int sid;
	private String sname;
	//Constructor without argument
	public Student() {
		super();
	}
	//Constructor with argument
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	//Setter and Getter method
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	//ToString method
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	public void display() {
		System.out.println("Student display method");
	}

		
	}


