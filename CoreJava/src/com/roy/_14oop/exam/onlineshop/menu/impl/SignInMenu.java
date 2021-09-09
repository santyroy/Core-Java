package com.roy._14oop.exam.onlineshop.menu.impl;


import com.roy._14oop.exam.onlineshop.configs.ApplicationContext;
import com.roy._14oop.exam.onlineshop.entities.User;
import com.roy._14oop.exam.onlineshop.menu.Menu;
import com.roy._14oop.exam.onlineshop.services.UserManagementService;
import com.roy._14oop.exam.onlineshop.services.impl.DefaultUserManagementService;

import java.util.Scanner;

public class SignInMenu implements Menu {

	private ApplicationContext context;
	private UserManagementService userManagementService;

	{
		context = ApplicationContext.getInstance();
		userManagementService = DefaultUserManagementService.getInstance();
	}

	@Override
	public void start() {
		printMenuHeader();
		Scanner sc = new Scanner(System.in);

		System.out.print("Please, enter your email: ");
		String userEmail = sc.next();

		System.out.print("Please, enter your password: ");
		String userPassword = sc.next();

		User user = userManagementService.getUserByEmail(userEmail);
		if (user != null && user.getPassword().equals(userPassword)) {
			System.out.printf("Glad to see you back %s %s", user.getFirstName(),
					user.getLastName() + System.lineSeparator());
			context.setLoggedInUser(user);
		} else {
			System.out.println("Unfortunately, such login and password doesnt exist");
		}
		context.getMainMenu().start();
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** Sign In *****");
	}

}
