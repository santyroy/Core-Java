package com.roy._18collections.list.hw;

public class MyDefaultListDemo {

	public static void main(String[] args) {

		MyList list = new DefaultMyList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		System.out.println(list.toString());
		System.out.println(list.size());
		System.out.println(list.contains("b"));
		System.out.println(list.contains("g"));

		MyList list2 = new DefaultMyList();
		list2.add("b");
		list2.add("c");
//		list2.add("f");

		System.out.println(list.containsAll(list2));
		list.remove("a");
		System.out.println(list.toString());
		list.remove("c");
		System.out.println(list.toString());
		System.out.println(list.size());
		list.clear();
		System.out.println(list.size());
		System.out.println(list.toString());
	}

}
