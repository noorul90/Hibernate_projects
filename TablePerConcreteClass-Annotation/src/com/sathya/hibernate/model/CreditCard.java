package com.sathya.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="credit_table")

public class CreditCard extends Payment {
	
	//declare properties of class
	
	@Column(name="ccno")
	private long cardNumber;
	
	@Column(name="cctype")
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
