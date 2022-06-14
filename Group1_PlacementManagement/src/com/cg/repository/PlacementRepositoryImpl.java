package com.cg.repository;

import javax.persistence.EntityManager;
import com.cg.entities.Placement;


public class PlacementRepositoryImpl implements IPlacementRepository {
	
	//Step 1: Start JPA LifeCycle
	private EntityManager entityManager;
	
	public PlacementRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}
	//Create operation - Repo/DAO
	
	@Override
	public void beginTransaction() 
	{
		entityManager.getTransaction().begin();	
	}
	
	@Override
	public Placement addPlacement(Placement placement) 
	{
		entityManager.persist(placement);
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) 
	{
		entityManager.merge(placement);
		return placement;
	}

	@Override
	public Placement searchPlacementById(int id) 
	{
		Placement placement = entityManager.find(Placement.class, id);
		return placement;
	}

	@Override
	public Placement cancelplacement(Placement placement) {
		entityManager.remove(placement);
		return placement;
	}
	@Override
	public void commitTransaction() 
	{
		entityManager.getTransaction().commit();
		
	}

	@Override
	public Placement schedulePlacement(Placement placement) {
		return this.findPlacementbyName(placement.getName());
	}

	@Override
	public Placement findPlacementbyName(String placementName) {
		return entityManager.find(Placement.class, placementName);
	
	}

}
