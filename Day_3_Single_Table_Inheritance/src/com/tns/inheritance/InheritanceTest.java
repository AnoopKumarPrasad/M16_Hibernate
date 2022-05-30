package com.tns.inheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create an employee1
		Employee emp=new Employee();
		emp.setName("Pratik");
		emp.setSalary(35000);
		em.persist(emp);
		
		//create an employee1
		Employee emp1=new Employee();
		emp1.setName("Shagufta");
		emp1.setSalary(45000);
		em.persist(emp1);
		
		//create an employee1
		Manager mg=new Manager();
		mg.setName("Vipul");
		mg.setSalary(65000);
		mg.setDeptName("Information Technology");
		em.persist(mg);
		
		em.getTransaction().commit();
		System.out.println("Added Employees and Manager Successfully");
		em.close();
		factory.close();
		
	}

}