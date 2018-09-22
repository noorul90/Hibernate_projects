package com.sathya.hibernate.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class Passport {
	
	@Id
	@GenericGenerator(name="g1" , strategy="foreign" , parameters = @Parameter(name="property" , value="person"))
	@Column(name="pno")
	@GeneratedValue(generator="g1")
	private int passportNo;
	
	@Temporal(TemporalType.DATE)
	@Column(name="expdate")
	private Date expiryDate;
	
	@OneToOne(targetEntity=com.sathya.hibernate.model.Person.class , cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
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
