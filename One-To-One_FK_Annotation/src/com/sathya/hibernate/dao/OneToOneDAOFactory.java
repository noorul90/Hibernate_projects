package com.sathya.hibernate.dao;


public class OneToOneDAOFactory {
	
	public static OneToOneDAO  getInstance(){
		return new OneToOneDAOImpl();
	}

}
