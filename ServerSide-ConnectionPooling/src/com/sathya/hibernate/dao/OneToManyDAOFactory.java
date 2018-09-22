package com.sathya.hibernate.dao;

public class OneToManyDAOFactory {
	
	public static OneToManyDAO getInstance(){
		return new OneToManyDAOImpl();
	}

}
