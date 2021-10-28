package com.roy._18collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*
 * Map is based of HashTable
 * Big O notation O(1) - constant (best case), O(n) - worst case
 */

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(2, "two");
		map.put(1, "one");
		map.put(3, "three");
		map.put(4, null);

		// === Get element from map ===
		System.out.println("Get element from map - get(1): " + map.get(1));

		// === Iterate over map keys ===
		System.out.println("Iterating over map keys demo: ");
		for (Integer key : map.keySet()) {
			System.out.println(key);
		}

		// === Iterate over map entries ===
		System.out.println("Iterating over map entries demo: ");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Entry key: " + entry.getKey() + "\tEntry value: " + entry.getValue());
		}

		// === getOrDefault Demo ===
		System.out.println("getOrDefault method demo with key 4: " + map.getOrDefault(4, "default value"));
		System.out.println("getOrDefault method demo with key 5: " + map.getOrDefault(5, "default value"));

		// === putIfAbsent Demo ===
		// This works if key is not present or key has a null value associated with it
		map.putIfAbsent(4, "four");
		System.out.println("After putIfAbsent method was called for key 4: " + map.get(4));

		// === HashTable Demo ===

		Map<User, Product> userProductMap = new HashMap<>();

		User user = new User(1, "John", "Smith", "password", "john.smith@email.com");
		Product product = new Product(1, "product name 1", "product category 1", 99.99);

		userProductMap.put(user, product);

		User userCopy = new User(1, "John", "Smith", "password", "john.smith@email.com");
		System.out.println("Get product by user from map: " + userProductMap.get(userCopy)); // null

		System.out.println("user hashCode: " + user.hashCode());
		System.out.println("userCopy hashCode: " + userCopy.hashCode());

		// == Using UserForHashTable class ===
		Map<UserForHashTable, Product> userforHashTableProductMap = new HashMap<>();

		UserForHashTable user1 = new UserForHashTable(2, "Marie", "Jones", "mj", "marie.jones@email.com");

		userforHashTableProductMap.put(user1, product);

		UserForHashTable user1Copy = new UserForHashTable(2, "Marie", "Jones", "mj", "marie.jones@email.com");
		
		System.out.println("Get product by user1 with hashCode() and equals() ovveriden " + "from map: "
				+ userforHashTableProductMap.get(user1Copy)); // actual product

		System.out.println("user hashCode: " + user1.hashCode());
		System.out.println("userCopy hashCode: " + user1Copy.hashCode());
		
		user1Copy.setEmail("mj@email.com");

		System.out.println("Get Product from map when user email is changed: " + userforHashTableProductMap.get(user1Copy));
	}

}

class User {
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

class Product {
	private int id;
	private String name;
	private String category;
	private double price;

	public Product(int id, String name, String category, double price) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}

}

class UserForHashTable {
	private int id;
	private String firstName;
	private String lastName;
	private String password;
	private String email;

	public UserForHashTable(int id, String firstName, String lastName, String password, String email) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", password=" + password
				+ ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, firstName, id, lastName, password);
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
				&& Objects.equals(lastName, other.lastName) && Objects.equals(password, other.password);
	}

}
