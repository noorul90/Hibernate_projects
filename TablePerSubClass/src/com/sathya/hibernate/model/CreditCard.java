package com.sathya.hibernate.model;

public class CreditCard extends Payment {
	
	//declare properties of class
	private long cardNumber;
	private String cardType;
	
	//generate getters & setters
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
}
