package com.cg.repository;

import javax.persistence.EntityManager;

import com.cg.entities.Certificate;

public class CertificateRepositoryImpl implements ICertificateRepository{
	
	//Step 1: Start JPA LifeCycle
		private EntityManager entityManager;
		public CertificateRepositoryImpl() 
		{
			entityManager = JPAUtil.getEntityManager();
		}
		
		//Create operation - Repo/DAO
		
	@Override
	
	public Certificate addCertificate(Certificate certificate) {
		entityManager.persist(certificate);
		return certificate;
	}
	
	//Next Step
	
	@Override
	public Certificate updateCertificate(Certificate certificate) {
		entityManager.merge(certificate);
		return certificate;
	}

	@Override
	public Certificate searchCertificate(int id) {
		Certificate certificate = entityManager.find(Certificate.class, id);
		return certificate ;
	}

	@Override
	public Certificate deleteCertificate(int certificateId) {
		Certificate certificate = entityManager.find(Certificate.class, certificateId);
		entityManager.remove(certificate);
		return certificate ;
		
		
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();	
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();	
	}

}
