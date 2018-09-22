package com.sathya.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cheque_table")

public class Cheque extends Payment {
	
	//declare class property

	@Column(name="chno")
	private long chequeNumber;
	
	@Column(name="chtype")
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
