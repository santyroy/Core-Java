package com.roy._18collections.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapSortingDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(2, "two");
		map.put(1, "one");
		map.put(3, "three");

		System.out.println("=== Sorting Map by Comparable Key ===");
		List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
		
		Collections.shuffle(list);
		System.out.println("Entries before sorting by keys : " + list);
		list.sort(Map.Entry.comparingByKey());
		System.out.println("Entries after sorting by keys : " + list);

		// === Sorting Map by Comparable Key with TreeMap ===
		Map<Integer, String> sortedMap = new TreeMap<>(map);
		System.out.println("Elements in TreeMap: " + sortedMap);
		
		// === Sorting Map by Comparable Value ===
		Collections.shuffle(list);
		System.out.println("Entries before sorting by values: " + list);
		list.sort(Map.Entry.comparingByValue());
		System.out.println("Entries after sorting by value: " +  list);
		
		// === create an Entries map
		Map<Integer, String> map2 = Map.ofEntries(list.toArray(Map.Entry[]::new));
		System.out.println(map2);
	}

}
