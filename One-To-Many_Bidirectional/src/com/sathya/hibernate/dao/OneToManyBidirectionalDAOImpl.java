package com.sathya.hibernate.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.hibernate.model.Customer;
import com.sathya.hibernate.model.Item;
import com.sathya.hibernate.util.HibernateUtil;

public class OneToManyBidirectionalDAOImpl implements OneToManyBidirectionalDAO {

	@Override
	public void saveItem() {
		
		Customer c1 = new Customer();
		c1.setCustomerId(181);
		c1.setCustomerName("Pulkit");
		
		Item i1 = new Item();
		i1.setItemId(4001);
		i1.setItemName("Mobile");
		i1.setPrice(2000);
		
		Item i2 = new Item();
		i2.setItemId(4002);
		i2.setItemName("Laptop");
		i2.setPrice(3500);
		
		i1.setCustomer(c1);
		i2.setCustomer(c1);
		
		Set items = new HashSet();
		items.add(i1);
		items.add(i2);
		c1.setItems(items);
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(i1);
		tx.commit();
		session.close();
		
	}

}
