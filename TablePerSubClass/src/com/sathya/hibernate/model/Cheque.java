package com.sathya.hibernate.model;

public class Cheque extends Payment {
	
	//declare class property
	private long chequeNumber;
	private String chequeType;
	
	//generate getters and setters
	public long getChequeNumber() {
		return chequeNumber;
	}
	public void setChequeNumber(long chequeNumber) {
		this.chequeNumber = chequeNumber;
	}
	public String getChequeType() {
		return chequeType;
	}
	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	}

}
