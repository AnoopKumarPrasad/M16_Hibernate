package com.cg.service;

import com.cg.entities.College;
import com.cg.entities.Placement;


public interface ICollegeService {
	public College addCollege(College college);
	public College updateCollege(College college);
	public College searchCollegeById(int id);
	public College deleteCollege(College college);
	public Placement schedulePlacement(Placement placement);
	

}
