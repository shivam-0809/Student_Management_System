package com.jsp.sms.controller;

import java.security.PublicKey;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.sms.model.Student;

public class Admin_Controller {
	static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
	static EntityManager entityManager = entityManagerFactory.createEntityManager();
	static EntityTransaction entityTransaction = entityManager.getTransaction();

	Student student = new Student();

	
	public Student ReadStudentData(int Fetch) {
		return entityManager.find(Student.class, Fetch);
	}
	
	

	
	public boolean RemoveStud(int stud_IdtoRemove) {
		Student student = ReadStudentData(stud_IdtoRemove);
		if (student!= null) {

			entityTransaction.begin();
			entityManager.remove(student);
			entityTransaction.commit();

			return true;

		}
		return false;

	}

	public boolean addStud(Student student) {
		if (student != null) {
			entityTransaction.begin();
			entityManager.persist(student);
			entityTransaction.commit();

			return true;
		}
		return false;
	}


	public boolean UpdateStudentData(int  Updatedata,Student student) {
		Student students = ReadStudentData(Updatedata);

		if (students != null) {
			
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();

			return true;

		}
		return false;		
	}


	
}
