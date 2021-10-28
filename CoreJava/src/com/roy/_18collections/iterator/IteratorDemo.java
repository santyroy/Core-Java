package com.roy._18collections.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorDemo {

	public static void main(String[] args) {

		List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

		System.out.println("==== Iterator Demo ====");

		Iterator<Integer> iterator = integers.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Here the iterator has reached the end of the integer list
		System.out.println("==== Iterator - can't be reset automatically ==== ");
		if (!iterator.hasNext()) {
			System.out.println("If we are at this section that means there is no other element in our iterator");
		}

		// we can use the same variable and re-initialize the iterator
		iterator = integers.iterator();

		System.out.println("==== Iterator - remove demo ====");
		while (iterator.hasNext()) {
			int nextInt = iterator.next();
			if (nextInt % 2 == 0) {
				iterator.remove();
			}
		}
		System.out.println(integers);

//		System.out.println("==== Iterator - remove - IllegalStateException demo ====");
//		iterator = integers.iterator();
//		iterator.remove(); // remove() method should be only used AFTER next() method

//		System.out.println("==== Iterator - remove - ConcurrentModificationException demo ====");
//		// This is also called fail-fast iterator where two thread cannot modify the
//		// same collection simultaneously - ArrayList
//		iterator = integers.iterator();
//		while (iterator.hasNext()) {
//			// iterator.remove() method should be only used AFTER next() method
//			// remove() method should be only called using iterator object
//			integers.remove(0);
//			// If the collection is modified after the creation of iterator we get
//			// ConcurrentModificationException
//			int nextInt = iterator.next();
//			System.out.println(nextInt);
//		}

		// Fail Safe collection copies the internal data structure
		// and iterates over the copied data structure.
		// Any structural modification done to the original data structure doesn't
		// effect the copied data structure.
		// So original data structure is changed
		System.out.println("==== Iterator - Fail-Safe iterator demo ====");
		List<Integer> threadSafeList = new CopyOnWriteArrayList<>(integers);
		iterator = threadSafeList.iterator();
		// here even after initialization of iterator we are modifying the list
		// still there won't be ConcurrentModificationException
		threadSafeList.add(100);
		while (iterator.hasNext()) {
			threadSafeList.remove(0);
			int nextInt = iterator.next();
			System.out.println(nextInt);
		}
		System.out.println(threadSafeList);
		/*
		 * Output: 1 3 5 [100]
		 */

		// Here the iterator can reflect some but not all of the changes made to the
		// original list afte the iterator has been initialized
		System.out.println("==== Iterator - Weakly-Consistent iterator demo ====");
		Collection<Integer> deque = new ConcurrentLinkedDeque<>(integers);
		iterator = deque.iterator();
		// here even after initialization of iterator we are modifying the list
		// still there won't be ConcurrentModificationException
		deque.add(100);
		while (iterator.hasNext()) {
			deque.remove(0);
			int nextInt = iterator.next();
			System.out.println(nextInt);
		}
		System.out.println(deque);
		/*
		 * output:
		 * 1 3 5 100 
		 * [1, 3, 5, 100]
		 */

	}

}
