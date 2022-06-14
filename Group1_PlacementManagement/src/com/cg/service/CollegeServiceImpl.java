package com.cg.service;

import com.cg.entities.College;
import com.cg.entities.Placement;
import com.cg.repository.CollegeRepositoryImpl;
import com.cg.repository.ICollegeRepository;

public class CollegeServiceImpl implements ICollegeService{

	// Step 1; Establishing connection between Service and Repository
			private ICollegeRepository dao;
			
			public CollegeServiceImpl()
			{
				dao = new CollegeRepositoryImpl();
			}
			
	//Step 2: Service calls to perform CRUD Operation
	
	@Override
	public College addCollege(College college) {
		dao.beginTransaction();
		dao.addCollege(college);
		dao.commitTransaction();

		return college;
	}

	@Override
	public College updateCollege(College college) {
		dao.beginTransaction();
		dao.updateCollege(college);
		dao.commitTransaction();
		return college;
	}

	@Override
	public College searchCollegeById(int id) {
		College college = dao.searchCollegeById(id);
		return college;
	}

	@Override
	public College deleteCollege(College college) {
		dao.beginTransaction();
		dao.deleteCollege(college);
		dao.commitTransaction();
		return college;
	
	}


	@Override
	public Placement schedulePlacement(Placement placement) {
		dao.beginTransaction();
		dao.schedulePlacement(placement);
		dao.commitTransaction();
		return placement;
	}

	

}
