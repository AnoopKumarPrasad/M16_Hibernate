package com.cg.repository;

import com.cg.entities.Certificate;
import com.cg.entities.Student;

public interface IStudentRepository {
	
	public Student addStudent(Student student);
	public Student updateStudent(Student student);
	public Student searchStudentById(int id);
	public Student searchStudentByHallTicket(int hallTicketNo);
	public  boolean deleteStudent(int studentId);
	
	public Certificate addCertificate(Certificate certificate);
	public Certificate updateCertificate(Certificate certificate);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
}
