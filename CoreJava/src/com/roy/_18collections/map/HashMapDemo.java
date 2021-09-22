package com.roy._18collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<Employee, Integer> map = new HashMap<>();
		map.put(new Employee("A"), 1);
		map.put(new Employee("B"), 2);
		map.put(new Employee("C"), 3);
		map.put(new Employee("D"), 4);
		map.put(new Employee("E"), 5);
		map.put(new Employee("F"), 6);
		map.put(new Employee("G"), 7);
		map.put(new Employee("H"), 8);
		map.put(new Employee("I"), 9);
		map.put(new Employee("J"), 10);
		map.put(new Employee("K"), 11);
		map.put(new Employee("L"), 12);
		
		
		map.remove(new Employee("A"));
		map.remove(new Employee("B"));
		map.remove(new Employee("C"));
		map.remove(new Employee("D"));
		map.remove(new Employee("E"));
		map.remove(new Employee("F"));
		map.remove(new Employee("G"));
		map.remove(new Employee("H"));
		map.remove(new Employee("I"));
		map.remove(new Employee("J"));
	}

}
