package com.project.p1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeDao {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Likith");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();

		Employee e=new Employee(4,"raj","raj@gmail.com",21,"male");
		
		
		
		et.begin();
		em.persist(e);
		et.commit();
		
	}
	
}
