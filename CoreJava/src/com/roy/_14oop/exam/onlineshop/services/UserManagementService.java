package com.roy._14oop.exam.onlineshop.services;


import com.roy._14oop.exam.onlineshop.entities.User;

public interface UserManagementService {

	String registerUser(User user);
	
	User[] getUsers();

	User getUserByEmail(String userEmail);

}
