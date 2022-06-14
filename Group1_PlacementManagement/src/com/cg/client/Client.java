package com.cg.client;

import java.time.LocalDate;
import com.cg.entities.Certificate;
import com.cg.entities.Placement;
import com.cg.entities.Student;
import com.cg.entities.User;
import com.cg.service.CertificateServiceImpl;
import com.cg.service.ICertificateService;
import com.cg.service.IPlacementService;
import com.cg.service.IStudentService;
import com.cg.service.PlacementServiceImpl;
import com.cg.service.StudentServiceImpl;
import com.cg.entities.Admin;

//SuppressWarnings("unused")
public class Client {

	public static void main(String[] args) 
	{
		
	
		//Creating an object of all entity files
		
	
		// Create
		
		Student student=new Student();
		
		 //Student Instances
		student.setName("Anoop");
		student.setCollege("RGU University");
		student.setRoll(25);
		student.setQualification("Btech");
		student.setCourse("CSE");
		student.setYear(2020);
		student.setHallTicketNo(1002);
		
		
		
		/*
		 //Placement Instances
		  
	    //Placement placement=new Placement();
	     //IPlacementService service=new PlacementServiceImpl();
	     
		placement.setId(105);
		placement.setName("Prateyncha Rathod");
		placement.setCollege("Nagpur University");
		placement.setDate(LocalDate.now());
		placement.setQualification("IT");
		placement.setYear(2020);
		service.addPlacement(placement);
		System.out.println("New Placement added successfully to database");
		*/
		
		//Certificate Instances
		Certificate certificate = new Certificate();
		certificate.setYear(2020);
		certificate.setCollege("Pune University");
		
		//One to One 
		student.setCertificate(certificate);
		certificate.setStudent(student);
		
		IStudentService service=new StudentServiceImpl();
		service.addStudent(student);
		
		System.out.println("One Student and One Certificate added successfully to database");
		;
		
		//Retrieve
		/*
		student = service.searchStudentById(101);
		System.out.println("ID is :"+student.getId());
		System.out.println("Roll No. is :"+student.getRoll());
		System.out.println("College Name is :"+student.getCollege());
		*/
		
		/*
		//Update
		student = service.searchStudentById(104);
		student.setName("Amey Banarase");
		service.updateStudent(student);
		System.out.println("Update is Successfully");*/
		
		
		/*placement = service.searchPlacementById(105);
		placement.setName("Prateyncha Rathod");
		service.updatePlacement(placement);
		System.out.println("Update is Successfully");*/
		
		
		/*
		//Delete
		student = service.searchStudentById(101);
		service.deleteStudent(student);
		System.out.println("Delete Successfully");
		*/
		
	}

}
