package com.sathya.hibernate.dao;

public class OneToManyBidirectionalDAOFactory {
	
	public static OneToManyBidirectionalDAO getIObject(){
		return new OneToManyBidirectionalDAOImpl();
	}

}
