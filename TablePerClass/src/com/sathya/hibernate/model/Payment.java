package com.sathya.hibernate.model;

import java.util.Date;

public abstract class Payment {
	
	private int paymentId;
	private double amount;
	private Date paymentDate;
	
	//generate getters & setters
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	
}
