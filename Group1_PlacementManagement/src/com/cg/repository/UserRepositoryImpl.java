package com.cg.repository;

import javax.persistence.EntityManager;


import com.cg.entities.User;

public class UserRepositoryImpl implements IUserRepository{
	
	//Step 1: Start JPA LifeCycle
		private EntityManager entityManager;
		public UserRepositoryImpl() 
		{
			entityManager = JPAUtil.getEntityManager();
		}
	//Create operation - Repo/DAO
	
	@Override
	public User addNewUser(User user) {
		entityManager.persist(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		entityManager.merge(user);
		return user;
	}

	@Override
	public User deleteUser(int id) {
		User user = entityManager.find(User.class, id);
		entityManager.remove(user);
		return user;
	}
	@Override
	public void beginTransaction() 
	{
		entityManager.getTransaction().begin();
		
	}
	
	@Override
	public void commitTransaction() 
	{
		entityManager.getTransaction().commit();
		
	}

	@Override
	public User findUser(int id) {
		User user = entityManager.find(User.class, id);
		return user;
	}

}
