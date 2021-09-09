package com.roy._14oop.exam.onlineshop.menu.impl;

import com.roy._14oop.exam.onlineshop.configs.ApplicationContext;
import com.roy._14oop.exam.onlineshop.menu.Menu;

import java.util.Scanner;

public class ChangePasswordMenu implements Menu {
	
	private ApplicationContext context;
	
	{
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		printMenuHeader();
		Scanner sc = new Scanner(System.in);
		String userInput = sc.next();
		context.getLoggedInUser().setPassword(userInput);
		System.out.println("Your password has been successfully changed");
		new MainMenu().start();
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** CHANGE PASSWORD *****");
		System.out.print("Enter new password: ");
	}

}
