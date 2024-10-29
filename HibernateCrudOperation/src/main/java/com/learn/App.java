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
    	
//    	User user1 = new User();
//    	user1.setId(1);
//    	user1.setName("prasenjit");
//    	user1.setEmail("prasenjit@gmail.com");
//    	user1.setPassword("12345");
//    	user1.setGender("male");
//    	user1.setCity("Mumbai");
    	
//    	 User user2 = new User();
//    	 user2.setName("Wanda Maximoff"); 
//    	 user2.setEmail("wanda.maximoff@example.com");
//    	 user2.setPassword("hexmagic456");
//    	 user2.setGender("female");
//    	 user2.setCity("Westview");

    	User user3 = new User();
    	user3.setName("Peter Parker"); 
    	user3.setEmail("peter.parker@gmail.com");
    	user3.setPassword("webslinger2023");
    	user3.setGender("male");
    	user3.setCity("New York");


        
    	Configuration cfg = new Configuration();
    	cfg.configure("/com/learn/config/hibernate.cfg.xml");
    	
    	
    	SessionFactory sessionFactory = cfg.buildSessionFactory();
    	Session session = sessionFactory.openSession();
    	Transaction transaction = session.beginTransaction();
    	
    	try {
    		session.save(user3);
        	transaction.commit();
    	}
    	catch(Exception e) {
    		transaction.rollback();
    		e.printStackTrace();
    	}
    	
    	
    }
    
    
    
    
}
