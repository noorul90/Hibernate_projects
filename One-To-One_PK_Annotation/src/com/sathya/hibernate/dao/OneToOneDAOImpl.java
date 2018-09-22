package com.sathya.hibernate.dao;

import java.util.Calendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.hibernate.model.Passport;
import com.sathya.hibernate.model.Person;
import com.sathya.hibernate.util.HibernateUtil;

public class OneToOneDAOImpl implements OneToOneDAO {

	@Override
	public void savePassport() {
		
		Person person = new Person();
		person.setPersonId(1012);
		person.setPersonName("John");
		
		Passport passport = new Passport();
		//passport.setPassportNo(9082);
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(2019, 10, 22);       //set date to 22-NOV-2019
		java.util.Date  date = calendar.getTime();
		
		passport.setExpiryDate(date);
		passport.setPerson(person);
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(passport);
		tx.commit();
		session.close();

	}

}
