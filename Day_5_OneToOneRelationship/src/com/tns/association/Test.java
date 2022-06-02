package com.tns.association;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory =  Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Employee employee = new Employee();
		employee.setEmployeeName("shiwa");
		
		Address ad = new Address();
		ad.setAddressId(5);
		ad.setAddressLine1("Shankarhpeth");
		ad.setAddressLine2("Subhash road");
		ad.setPincode(400035);
		ad.setState("MH");
	
		
		//ad.setEmployeeId(employee);
		
		employee.setAddress(ad);
		
		
		em.persist(employee);	
		//em.persist(ad);
		
		System.out.println("Row Inserted");
		
		em.getTransaction().commit();
		
		em.close();
		factory.close();
		
		
		
	}

}