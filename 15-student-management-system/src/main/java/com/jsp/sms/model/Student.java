package com.jsp.sms.model;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;

@javax.persistence.Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Stud_id;
	
	@Column(nullable =false)
	private String Stud_name;
	
	@Column(unique = true)
	private long Stud_ContactNo;
	
	@Column(nullable =false)
	private String Stud_Address;
	
	@Column(nullable =false)
	private String Stud_Branch;
	
	@Column(updatable = false)
	private boolean Student_gender;
	
	@Column(nullable = false)
	private String Email;
	
	@Column(unique = true)
	private long Stud_Pass;

//	public Student() {
//		super();
//	}

	public long getStud_Pass() {
		return Stud_Pass;
	}

	

	public void setStud_Pass(long stud_Pass) {
		Stud_Pass = stud_Pass;
	}

	public Student() {
		
	}

	public int getStud_id() {
		return Stud_id;
	}

	public void setStud_id(int stud_id) {
		Stud_id = stud_id;
	}

	public String getStud_name() {
		return Stud_name;
	}

	public void setStud_name(String stud_name) {
		Stud_name = stud_name;
	}

	public long getStud_ContactNo() {
		return Stud_ContactNo;
	}

	public void setStud_ContactNo(long stud_ContactNo) {
		Stud_ContactNo = stud_ContactNo;
	}

	public String getStud_Address() {
		return Stud_Address;
	}

	public void setStud_Address(String stud_Address) {
		Stud_Address = stud_Address;
	}

	public String getStud_Branch() {
		return Stud_Branch;
	}

	public void setStud_Branch(String stud_Branch) {
		Stud_Branch = stud_Branch;
	}

	public boolean isStudent_gender() {
		return Student_gender;
	}

	public void setStudent_gender(boolean student_gender) {
		Student_gender = student_gender;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}



	public void setStud_ContactNo(double updatePhoneNo) {
		// TODO Auto-generated method stub
		
	}
	
	

}





