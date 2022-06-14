package com.cg.repository;

import javax.persistence.EntityManager;

import com.cg.entities.Admin;


public class IAdminRepositoryImpl implements AdminRepository {
	private EntityManager entityManager;
	public IAdminRepositoryImpl() {
		entityManager=JPAUtil.getEntityManager();
	}

	@Override
	public Admin addNewAdmin(Admin admin) {
		entityManager.persist(admin);
		return admin;
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		entityManager.merge(admin);
		return admin;
	}

	@Override
	public Admin deleteAdmin(int id) {
		entityManager.remove(id);
		return null;
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();	
	}

	@Override
	public Admin findAdmin(int id) {
		Admin admin = entityManager.find(Admin.class, id);
		return admin;
	}
}
