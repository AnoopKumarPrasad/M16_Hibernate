package com.cg.service;

import com.cg.entities.User;

public interface IUserService {
	
	public User addNewUser(User user);
	public User updateUser(User user);
	public User login(User user);
	User findUser(User user);
	public boolean logOut();
	

}
