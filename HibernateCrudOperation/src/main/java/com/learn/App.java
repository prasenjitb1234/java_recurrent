package com.learn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.learn.entities.User;

public class App 
{
    public static void main( String[] args )
    {
    	
    	User user1 = new User();
    	user1.setId(1);
    	user1.setName("prasenjit");
    	user1.setEmail("prasenjit@gmail.com");
    	user1.setPassword("12345");
    	user1.setGender("male");
    	user1.setCity("Mumbai");
    	
        
    	Configuration cfg = new Configuration();
    	cfg.configure("/com/learn/config/hibernate.cfg.xml");
    	
    	
    	SessionFactory sessionFactory = cfg.buildSessionFactory();
    	Session session = sessionFactory.openSession();
    	Transaction transaction = session.beginTransaction();
    	
    	try {
    		session.save(user1);
        	transaction.commit();
    	}
    	catch(Exception e) {
    		transaction.rollback();
    		e.printStackTrace();
    	}
    	
    	
    }
    
    
    
    
}
