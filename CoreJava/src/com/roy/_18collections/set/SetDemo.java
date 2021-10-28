package com.roy._18collections.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		System.out.println("Add 1: " + set.add(1));
		System.out.println("Add 1: " + set.add(1));
		System.out.println("Add 2: " + set.add(2));
		System.out.println("Add 3: " + set.add(3));
		System.out.println(set);

		System.out.println("==== Demo - objects without hashCode and equals ====");
		Set<User> users = new HashSet<>();
		users.add(new User(1, "John", "Doe", "jd@email.com"));
		users.add(new User(1, "John", "Doe", "jd@email.com"));
		System.out.println(users); // Both the users will be added because there is no hasCode and equals

		System.out.println("==== Demo - objects with hashCode and equals ====");
		Set<UserForHashTable> usersForHashTable = new HashSet<>();
		usersForHashTable.add(new UserForHashTable(1, "John", "Doe", "jd@email.com"));
		usersForHashTable.add(new UserForHashTable(1, "John", "Doe", "jd@email.com"));
		System.out.println(usersForHashTable);
	}

	static class User {
		private int id;
		private String firstName;
		private String lastName;
		private String email;

		public User(int id, String firstName, String lastName, String email) {
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
		}

		@Override
		public String toString() {
			return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
		}

	}

	static class UserForHashTable {
		private int id;
		private String firstName;
		private String lastName;
		private String email;

		public UserForHashTable(int id, String firstName, String lastName, String email) {
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
		}

		@Override
		public int hashCode() {
			return Objects.hash(email, firstName, id, lastName);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			UserForHashTable other = (UserForHashTable) obj;
			return Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName) && id == other.id
					&& Objects.equals(lastName, other.lastName);
		}

		@Override
		public String toString() {
			return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
		}

	}

}
