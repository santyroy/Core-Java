package com.roy._18collections.hw;

import java.util.Comparator;

public class CustomProductComparator implements Comparator<Product> {

	@Override
	public int compare(Product product1, Product product2) {
		int res = 0;
		// sort by category name
		res = product1.getCategoryName().compareTo(product2.getCategoryName());
		
		// if category same sort by price
		if (res == 0) {
			res = (int) (product1.getPrice() - product2.getPrice());

			// if price same sort by product name
			if (res == 0) {
				res = product1.getProductName().compareTo(product2.getProductName());
			}
		}

		return res;
	}

}
