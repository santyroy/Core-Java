package com.roy._18collections.map;

import java.util.NavigableMap;
import java.util.TreeMap;

import com.roy._18collections.hw.CustomProductComparator;
import com.roy._18collections.hw.DefaultProduct;
import com.roy._18collections.hw.Product;
import com.roy._18collections.hw.User;


/*
 * TreeMap is based on Red-Black Self Balanced Binary Tree
 * Big O (log n)
 */
public class TreeMapDemo {

	public static void main(String[] args) {

		NavigableMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "one");
		treeMap.put(5, "five");
		treeMap.put(2, "two");
		treeMap.put(4, "four");
		treeMap.put(3, "three");

		System.out.println("Get first entry: " + treeMap.firstEntry());
		System.out.println("Lower entry for 3: " + treeMap.lowerEntry(3));
		System.out.println("Floor entry for 3: " + treeMap.floorEntry(3));
		System.out.println("Higher entry for 3: " + treeMap.higherEntry(3));
		System.out.println("Ceiling entry for 3: " + treeMap.ceilingEntry(3));

		System.out.println("Sorted treeMap: " + treeMap);
		System.out.println("Descending order: " + treeMap.descendingMap());

		NavigableMap<Product, User> productUserMap = new TreeMap<>(new CustomProductComparator());
		productUserMap.put(new DefaultProduct(2, "Woodland", "Shoes", 23.56),
				new User(1, "John", "Doe", "johndoe", "john@email.com"));
		productUserMap.put(new DefaultProduct(1, "Polo", "T-shirt", 15.3),
				new User(2, "Mark", "Henry", "markhenry", "mark@email.com"));

		System.out.println("*********** Demo keys are sorted according to Comparator (category) **********");

		for (Product product : productUserMap.keySet()) {
			System.out.println(product);
		}

	}

}
