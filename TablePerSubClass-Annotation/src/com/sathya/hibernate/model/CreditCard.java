package com.sathya.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="credit_table")
@PrimaryKeyJoinColumn(name="pid")
public class CreditCard extends Payment {
	
	//declare properties of class
	@Column(name="ccno")
	private long cardNumber;
	
	@Column(name="cctype" , length=8)
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
