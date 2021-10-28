package com.roy._18collections.map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo extends LinkedHashMap<Integer, String> {

	private int capacity = 3;

	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<Integer, String> eldest) {
		if (size() > this.capacity) {
			return true;
		}

		return false;
	}
	
	public static void main(String[] args) {
		LinkedHashMapDemo map = new LinkedHashMapDemo();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		
		// here the eldest entry is {1, "one"} which is removed when new entry is added
		// and the size becomes more than capacity
		map.put(4, "four");
		
		System.out.println(map); 
	}

}


/*
 * 
 * 
     * Constructs an empty {@code LinkedHashMap} instance with the
     * specified initial capacity, load factor and ordering mode.
     *
     * @param  initialCapacity the initial capacity
     * @param  loadFactor      the load factor
     * @param  accessOrder     the ordering mode - {@code true} for
     *         access-order, {@code false} for insertion-order
     * @throws IllegalArgumentException if the initial capacity is negative
     *         or the load factor is nonpositive
     *
    public LinkedHashMap(int initialCapacity,
                         float loadFactor,
                         boolean accessOrder) {
        super(initialCapacity, loadFactor);
        this.accessOrder = accessOrder;
    }
 * 
 */
