package com.cg.service;

import com.cg.entities.Placement;
import com.cg.repository.PlacementRepositoryImpl;


public class PlacementServiceImpl implements IPlacementService
{
	// Step 1; Establishing connection between Service and Repo
	private PlacementRepositoryImpl dao;
	
	public PlacementServiceImpl() 
	{
		dao = new PlacementRepositoryImpl();
	}
	
	//Step 2: Service calls to perform CRUD Operation
	@Override
	public Placement addPlacement(Placement placement)
	{
		dao.beginTransaction();
		dao.addPlacement(placement);
		dao.commitTransaction();

		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement)
	{
		dao.beginTransaction();
		dao.updatePlacement(placement);
		dao.commitTransaction();
		return placement;
	}

	@Override
	public Placement searchPlacementById(int id)
	{
		Placement placement = dao.searchPlacementById(id);
		return placement;
	}

	@Override
	public Placement cancelPlacement(Placement placement) {
		dao.beginTransaction();
		dao.cancelplacement(placement);
		dao.commitTransaction();
		return placement;
	}

	@Override
	public Placement schedulePlacement(Placement placement) {
		dao.beginTransaction();
		dao.schedulePlacement(placement);
		dao.commitTransaction();
		return placement;
	}

}
