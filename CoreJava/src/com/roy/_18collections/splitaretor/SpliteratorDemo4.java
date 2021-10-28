package com.roy._18collections.splitaretor;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.TreeSet;

public class SpliteratorDemo4 {

	public static void main(String[] args) {

		// Create an array list
		ArrayList<Integer> al1 = new ArrayList<>();
		// Add values in the list.
		al1.add(1);
		al1.add(-2);
		al1.add(3);
		al1.add(-4);
		// Getting Spliterator object
		Spliterator<Integer> splitr = al1.spliterator();
		// Print getComparator
		// It returns null if the source is SORTED in a natural order.
		// Otherwise, if the source is not SORTED, throws IllegalStateException.
//		System.out.println("" + splitr.getComparator()); // IllegalStateException

		SortedSet<Test> set = new TreeSet<>((o1, o2) -> o1.str.compareTo(o2.str));
		set.add(new Test("two"));
		set.add(new Test("one"));
		Spliterator<Test> s = set.spliterator();
		System.out.println(s.getComparator());
		System.out.println(set);

	}

	private static class Test {
		private final String str;

		private Test(String str) {
			this.str = str;
		}

		@Override
		public String toString() {
			return "Test{str='" + str + "'}";
		}
	}
}
