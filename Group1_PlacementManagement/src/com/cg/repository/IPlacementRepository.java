package com.cg.repository;

import com.cg.entities.Placement;

public interface IPlacementRepository 
{
	public Placement addPlacement(Placement placement);
	public Placement updatePlacement(Placement placement);
	public Placement searchPlacementById(int id);
	public Placement cancelplacement(Placement placement);
	public Placement schedulePlacement(Placement placement);
	public Placement findPlacementbyName(String placementName);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
	
}
