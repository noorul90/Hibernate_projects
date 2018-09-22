package com.sathya.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.hibernate.model.Cheque;
import com.sathya.hibernate.model.CreditCard;
import com.sathya.hibernate.util.HibernateUtil;

public class PaymentDAOImpl implements PaymentDAO {

	@Override
	public void saveCard(CreditCard card) {
	  SessionFactory factory = HibernateUtil.getSessionFactory();
	  Session session = factory.openSession();
	  Transaction tx = session.beginTransaction();
	  session.save(card);
	  tx.commit();
	  session.close();
	  System.out.println("card details saved in database");

	}

	@Override
	public void saveCheque(Cheque cheque) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		  Session session = factory.openSession();
		  Transaction tx = session.beginTransaction();
		  session.save(cheque);
		  tx.commit();
		  session.close();
		  System.out.println("cheque details saved in database");

	}

}
