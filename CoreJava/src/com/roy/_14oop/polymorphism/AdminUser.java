package com.roy._14oop.polymorphism;

public class AdminUser extends User {

	private final String userGroup = "admin";
	
	@Override
	public void validateAccessRights() {
		System.out.println("I'm an admin user. I can do whatever I want in the system.");
	}

	@Override
	public AccountInformation getProfileInformation(Profile profile) {
//		userGroup = "default";
//		profile = new UserProfile();
		return new AccountInformation();
	}

}
