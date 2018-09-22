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
		person.setPersonId(1040);
		person.setPersonName("Damian");
		
		Passport passport = new Passport();
		//passport.setPassportNo(9180);   ===> here no need to set this values
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(2019, 8, 20);       //set date to 20-Sep-2019
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
