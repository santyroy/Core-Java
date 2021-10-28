package com.roy._18collections.hw;

public class User {

	private int id;
	private String firstName;
	private String lastName;
	private String password;
	private String email;

	public User(int id, String firstName, String lastName, String password, String email) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", password=" + password
				+ ", email=" + email + "]";
	}

}
