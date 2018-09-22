package com.sathya.hibernate.dao;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.hibernate.model.Customer;
import com.sathya.hibernate.model.Item;
import com.sathya.hibernate.util.HibernateUtil;

public class OneToManyDAOImpl implements OneToManyDAO {
	
	 //logic to insert one customer(parent) record along with two items(childs) records in database

	@Override
	public void saveCustomer() {            
		
		Customer c1 = new Customer();
		c1.setCustomerId(102);
		c1.setCustomerName("Amit");
		
		Item i1 = new Item();
		i1.setItemId(9003);
		i1.setItemName("Apperal");
		i1.setPrice(2000);
		
		Item i2 = new Item();
		i2.setItemId(9004);
		i2.setItemName("Gadget");
		i2.setPrice(5000);
		
		//add child object to collection type Set
		Set items = new HashSet();
		items.add(i1);
		items.add(i2);
		
		//set collection to parent class
		c1.setItems(items);
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(c1);
		tx.commit();
		session.close();
		
	}
	
	
	 //logic to read customer(parent) record on console (for test of fetching strategies)
	
	@Override
	public void selectCustomer(){         
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		
/*		//for "select" and "subselect" fetching strategy we use HQL
		Query query = session.createQuery("from Customer c");                            */
		
		//for "join" fetching strategy we use Criteria
		Criteria crit = session.createCriteria(Customer.class);
		
		List list = crit.list();
		Iterator it = list.iterator();
		while(it.hasNext()){
			Customer c = (Customer)it.next();
		}
		session.close();
		
	}

}
