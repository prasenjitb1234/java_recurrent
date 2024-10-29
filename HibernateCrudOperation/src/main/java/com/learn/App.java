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

//    	User user3 = new User();
//    	user3.setName("Peter Parker"); 
//    	user3.setEmail("peter.parker@gmail.com");
//    	user3.setPassword("webslinger2023");
//    	user3.setGender("male");
//    	user3.setCity("New York");


        
    	Configuration cfg = new Configuration();
    	cfg.configure("/com/learn/config/hibernate.cfg.xml");
    	
    	
    	SessionFactory sessionFactory = cfg.buildSessionFactory();
    	Session session = sessionFactory.openSession();
    	Transaction transaction = session.beginTransaction();
    	
    	// --------Insert Operation ------- 
//    	try {
//    		session.save(user3);
//        	transaction.commit();
//        	
//        	System.out.println("USER DETAILS ADDED SUCCESSFULLY");
//    	}
//    	catch(Exception e) {
//    		transaction.rollback();
//    		e.printStackTrace();
//    		System.out.println("USER DETAILS NOT ADDED DUE TO SOME ERROR");
//    	}
//    	********************
    	// --------- select operation ---------
    	
//    	try {
//    		// retrives data of user with id 1 in database . >>'1L' is added cause Long data type in User entity
//    		User user = session.get(User.class, 1L);
//    		
//    		if(user != null) {
//    			System.out.println(user.getId());
//        		System.out.println(user.getName());
//        		System.out.println(user.getEmail());
//        		System.out.println(user.getPassword());
//        		System.out.println(user.getGender());
//        		System.out.println(user.getCity());
//    		}
//    		else {
//    			System.out.println("User Not Found !");
//    		}
//    		
//    		
//    		
//    	}
//    	catch(Exception e) {
//    		e.printStackTrace()
//    	}
     	
//    	***********
    	
    	// --------Update  Operation ------- 
    	
    	// updating city for id 2 
    	
//    	User user = session.get(User.class, 2L);
//    	user.setCity("Lahore");
//    	
//    	try {
//    		session.saveOrUpdate(user);
//        	transaction.commit();
//        	
//        	System.out.println("USER DETAILS Updated SUCCESSFULLY !");
//    	}
//    	catch(Exception e) {
//    		transaction.rollback();
//    		e.printStackTrace();
//    		System.out.println("USER DETAILS NOT Updaed DUE TO SOME ERROR !");
//    	}
    	
    	
//    	************
    	// Delete Operation 
    	
    	User user = new User();
    	user.setId(3L);
    	
    	try {
    		session.delete(user);
        	transaction.commit();
        	
        	System.out.println("USER DETAILS Deleted SUCCESSFULLY !");
    	}
    	catch(Exception e) {
    		transaction.rollback();
    		e.printStackTrace();
    		System.out.println("USER DETAILS NOT Deleted DUE TO SOME ERROR !");
    	}
    	
//    	**********
    	
//    	Okay We finished CRUD operations in hibernate 
    	
    	
    	
    	
    	
    	
    	
    }
    
}
