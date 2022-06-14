package com.cg.service;

import java.util.Scanner;

import com.cg.entities.Admin;
import com.cg.repository.IAdminRepositoryImpl;

public class AdminServiceImpl implements IAdminService{
	private IAdminRepositoryImpl dao;
	
	Scanner s=new Scanner(System.in);
		

		public AdminServiceImpl() {
			dao=new IAdminRepositoryImpl();
		}


	@Override
	public Admin addNewAdmin(Admin admin) {
		dao.beginTransaction();
		dao.addNewAdmin(admin);
		dao.commitTransaction();
		return admin;

	}

	@Override
	public Admin updateAdmin(Admin admin) {
		dao.beginTransaction();
		dao.updateAdmin(admin);
		dao.commitTransaction();
		return admin;

	}

	@Override
	public Admin login(Admin admin) {
		System.out.println("Enetr the admin name:");
		String uname=s.nextLine();
		System.out.println("Enter the Password :");
		String upsw=s.nextLine();
		System.out.println("Id: "+ admin.getId());
		Admin admin1 = this.findAdmin(admin);
		if(admin1 != null && uname.equals(admin1.getName()) && upsw.equals(admin1.getPassword())) {
			return admin;
			
		}
		else {
			System.out.println("Invalid admin name or password :");
			return null;
		}

	}

	@Override
	public boolean logOut() {
		return false;

	}


	@Override
	public Admin findAdmin(Admin admin) {
		try {
			dao.beginTransaction();
			return dao.findAdmin(admin.getId());
			} catch (Exception  ex) {
				throw ex;
			} finally {
				dao.commitTransaction();
			}
		}
}

