package com.jsp.sms.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.sms.model.Student;

public class Student_Controller {
	static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgsql");
	static EntityManager entityManager = entityManagerFactory.createEntityManager();
	static EntityTransaction entityTransaction = entityManager.getTransaction();
	
	Student student = new Student();
	
	
	public Student ReadMyInfo(int Fetch) {
		return entityManager.find(Student.class, Fetch);
	}
	

	
	public boolean UpdateStudentContNadd(int  Updatedata,Student student) {
		Student students = ReadMyInfo(Updatedata);

		if (students != null) {
			
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();

			return true;

		}
		return false;		
	}
}
