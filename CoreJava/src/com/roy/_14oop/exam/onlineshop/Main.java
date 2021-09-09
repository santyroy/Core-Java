package com.roy._14oop.exam.onlineshop;


import com.roy._14oop.exam.onlineshop.menu.Menu;
import com.roy._14oop.exam.onlineshop.menu.impl.MainMenu;

public class Main {

	public static final String EXIT_COMMAND = "exit";

	public static void main(String[] args) {
		Menu mainMenu = new MainMenu();
		mainMenu.start();
	}
	
}
