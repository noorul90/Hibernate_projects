package com.sathya.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.hibernate.model.Book;
import com.sathya.hibernate.util.HibernateUtil;

public class BookDAOImpl implements BookDAO {

	public void saveBook(Book b) {
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(b);
		tx.commit();
		session.close();
		System.out.println("object is saved to database");

	}

	public Book readBook(int bookId) {
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Object o = session.get(Book.class, bookId);
		Book book = (Book)o;
		session.close();
		return book;
		
	}

}
