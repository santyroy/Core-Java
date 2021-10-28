package com.roy._18collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {

		// Priority Queue stores/sorts elements according to the priority set
		// like either natural ordering or elements class which implements
		// Comparable Interface or supply Comparator instance,
		// otherwise PriorityQueue would throw ClassCastException
		Queue<Integer> queue = new PriorityQueue<>();

		queue.offer(2);
		queue.offer(8);
		queue.offer(3);
		queue.offer(1);
		queue.offer(10);

		System.out.println("Get head of the head and remove element: " + queue.poll()); // 1
		System.out.println("Size of the queue after poll(): " + queue.size()); // 4
		System.out.println("peek(): " + queue.peek()); // 2
		System.out.println("Size of the queue after poll(): " + queue.size()); // 4

		// This example throws ClassCastException
//		Queue<Product> products = new PriorityQueue<>();
//		products.offer(new Product("Shoes"));
		// java.lang.ClassCastException: class com.roy._18collections.queue.Product
		// cannot be cast to class java.lang.Comparable

		// Using custom Comparator
		Comparator<Product> productComparator = new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		Queue<Product> products = new PriorityQueue<>(productComparator);
		products.offer(new Product("Shoes"));
		products.offer(new Product("Jeans"));
		products.offer(new Product("Shirts"));
		products.offer(new Product("Hat"));
		products.offer(new Product("T-Shirts"));

		for (Product p : products) {
			System.out.println(p.getName());
		}

	}
}

class Product {
	private String name;

	public Product(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
