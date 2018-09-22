package com.sathya.hibernate.model;

import java.util.Map;

public class Customer {
	
	private int customerId;
	private String customerName;
	private Map items;
	
	//getters & setters
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Map getItems() {
		return items;
	}
	public void setItems(Map items) {
		this.items = items;
	}
	
}
