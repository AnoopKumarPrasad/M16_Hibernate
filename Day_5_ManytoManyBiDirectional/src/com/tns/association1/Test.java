package com.tns.association1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
					EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
					EntityManager em=factory.createEntityManager();
					em.getTransaction().begin();
					
					//create an employee1
					Employee emp=new Employee();
					emp.setName("Netrangi");
					em.persist(emp);
					
					Employee emp1=new Employee();
					emp1.setName("Ankita");
					em.persist(emp1);
					
					//create an employee1
					Department mg=new Department();
					mg.setDeptId(11);
					mg.setDept_name("Information Technology");
					emp.setDept(mg);
					emp1.setDept(mg);
					em.persist(mg);
					
					em.getTransaction().commit();
					System.out.println("Added Employees and Manager Successfully");
					em.close();
					factory.close();
					
				}

			


	

}
