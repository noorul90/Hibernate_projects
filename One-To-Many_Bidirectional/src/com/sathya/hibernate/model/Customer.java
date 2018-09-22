package com.sathya.hibernate.model;

import java.util.Set;

public class Customer {
	
	private int customerId;
	private String customerName;
	private Set items;
	
	//setters & getters
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
	public Set getItems() {
		return items;
	}
	public void setItems(Set items) {
		this.items = items;
	}
	

}
