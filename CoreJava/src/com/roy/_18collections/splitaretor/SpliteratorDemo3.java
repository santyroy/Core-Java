package com.roy._18collections.splitaretor;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorDemo3 {

	public static void main(String[] args) {

		List<String> fruitList = Arrays.asList("Mango", "Banana", "Apple");
		Spliterator<String> splitr = fruitList.spliterator();
		System.out.println("List of Fruit name-");
		
		// we need to call spliterator for each of the next elements
//		splitr.tryAdvance(f -> System.out.println(f));
//		splitr.tryAdvance(f -> System.out.println(f));
//		splitr.tryAdvance(f -> System.out.println(f));

		// OR better to use while loop
		while (splitr.tryAdvance((num) -> System.out.println("" + num)));
	}

}
