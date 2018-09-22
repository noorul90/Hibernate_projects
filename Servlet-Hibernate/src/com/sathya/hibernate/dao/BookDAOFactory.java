package com.sathya.hibernate.dao;

public class BookDAOFactory {
	
	public static BookDAO getInstance(){
		return new BookDAOImpl();
	}

}
