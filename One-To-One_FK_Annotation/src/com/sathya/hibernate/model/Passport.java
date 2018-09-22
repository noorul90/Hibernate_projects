package com.sathya.hibernate.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Passport {
	
	@Id
	@Column(name="pno")
	private int passportNo;
	
	@Temporal(TemporalType.DATE)
	@Column(name="expdate")
	private Date expiryDate;
	
	@ManyToOne(targetEntity=com.sathya.hibernate.model.Person.class , cascade=CascadeType.ALL)
	@JoinColumn(name="pid_fk" , unique=true , nullable=false)
	private Person person;
	
	//setters & getters
	public int getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	

}
