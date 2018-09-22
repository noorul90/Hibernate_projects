package com.sathya.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="cheque_table")
@PrimaryKeyJoinColumn(name="pid")
public class Cheque extends Payment {
	
	//declare class property
	@Column(name="chno")
	private long chequeNumber;
	
	@Column(name="chtype" , length=8)
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
