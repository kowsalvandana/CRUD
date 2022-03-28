package com.sree.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private Integer Sid;
	private String Sname;
	private String Address;
	private String Course;
	private double Fee;
	private String Year;
	
	public Student() {
		super();
		
	}
	
	public Student(Integer sid, String sname, String address, String course, double fee, String year) {
		super();
		Sid = sid;
		Sname = sname;
		Address = address;
		Course = course;
		Fee = fee;
		Year = year;
	}
	public Integer getSid() {
		return Sid;
	}
	public void setSid(Integer sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public double getFee() {
		return Fee;
	}
	public void setFee(double fee) {
		Fee = fee;
	}
	public String getYear() {
		return Year;
	}
	public void setYear(String year) {
		Year = year;
	}

	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + ", Address=" + Address + ", Course=" + Course + ", Fee="
				+ Fee + ", Year=" + Year + "]";
	}
	
	
	}
