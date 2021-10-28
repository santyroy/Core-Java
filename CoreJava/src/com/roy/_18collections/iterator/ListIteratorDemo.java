package com.roy._18collections.iterator;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * This has more features than iterator. As an iterator can traverse forward,
 * ListIterator can traverse in backward direction as well.
 */

public class ListIteratorDemo {

	public static void main(String[] args) {

		List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

		ListIterator<Integer> listIterator = integers.listIterator();
		listIterator = integers.listIterator(2); // creates iterator from 2nd index of list

		System.out.println("Previous: " + listIterator.previous()); // 2

		/*
		 * Replaces the last element returned by next or previous with the specified
		 * element (optional operation). This call can be made only if neither remove
		 * nor add have been called after the last call to next or previous.
		 */
		listIterator.set(20);
		System.out.println(integers);
		System.out.println("Next element after set(20): " + listIterator.next()); // 20

		/*
		 * he element is inserted immediately before the element that would be returned
		 * by next, if any, and after the element that would be returned by previous, if
		 * any.
		 */
		listIterator.add(21);
		System.out.println(integers);
		System.out.println("Next element after set(21): " + listIterator.previous()); // 21

		/*
		 * Removes from the list the last element that was returned by next or previous.
		 */
		listIterator.remove();
		System.out.println(integers);

	}

}
