package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.test.entities.User;



public class App {
	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setId(1);
		user1.setName("prasenjit");
		user1.setEmail("prasenjit@gmail.com");
		user1.setPassword("12345");
		user1.setGender("male");
		user1.setCity("mumbai");
		
		
//_____ ____ ____ ________ ______ ______ ____ _________ ______________ ______
		
		Configuration cfg = new Configuration();
		
		 cfg.configure("/com/test/config/hibernate.cfg.xml");
		 
		 SessionFactory sessionFactory = cfg.buildSessionFactory();
		 Session session = sessionFactory.openSession();
		 Transaction transaction = session.beginTransaction();
		
		
		 try {
			 session.save(user1);
			 transaction.commit();
			 System.out.println("User Details saved Successfully");
			 
		 }
		 catch(Exception e) {
			 transaction.rollback();
			 e.printStackTrace();
			 System.out.println("USER DETAILS NOT ADDED DUE TO SOME ERROR");
		 }
		
		
		
		
		
	}
}
