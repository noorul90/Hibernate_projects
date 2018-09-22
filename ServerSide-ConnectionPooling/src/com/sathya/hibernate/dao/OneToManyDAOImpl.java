package com.sathya.hibernate.dao;

import java.util.HashSet;
import java.util.Set;

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
		c1.setCustomerId(108);
		c1.setCustomerName("Ravi");
		
		Item i1 = new Item();
		i1.setItemId(9010);
		i1.setItemName("micromax");
		i1.setPrice(42000);
		
		Item i2 = new Item();
		i2.setItemId(9011);
		i2.setItemName("iphone");
		i2.setPrice(7000);
		
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
	
	//logic to insert a new item(child details) to existing custumer(parent details) in database
	
	@Override
	public void addAnotherItem(){    
		
		Item i3 = new Item();
		i3.setItemId(9005);
		i3.setItemName("Book");
		i3.setPrice(450);
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Customer c1 = (Customer)session.get(Customer.class, 101);
		Set items = c1.getItems();
		Transaction tx = session.beginTransaction();
		items.add(i3);
		tx.commit();
		session.close();
		
	}
	
	 //logic to delete an existing item(child) from database
	
	@Override
	public void removeItem(){             
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Customer c1 = (Customer)session.get(Customer.class, 101);
		Set items = c1.getItems();
		Item i3= (Item)session.get(Item.class, 9005);
		Transaction tx = session.beginTransaction();
		items.remove(i3);
		tx.commit();
		session.close();
		
	}
	
	 //logic to read customer(parent) record along with item(child) record on console (test of lazy attributes)
	
	@Override
	public void readCustomer(){         
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Customer c1 = (Customer)session.get(Customer.class, 101);
		session.close();
		
	}
	
	 //logic to remove customer(parent) record from database
	
	@Override
	public void removeCustomer(){     
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Customer c1 = (Customer)session.get(Customer.class, 101);
		Transaction tx = session.beginTransaction();
		session.delete(c1);
		tx.commit();
		session.close();
		
	}

}
