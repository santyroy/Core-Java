package com.roy._14oop.exam.onlineshop.services;


import com.roy._14oop.exam.onlineshop.entities.Order;

public interface OrderManagementService {

	void addOrder(Order order);

	Order[] getOrdersByUserId(int userId);
	
	Order[] getOrders();

}
