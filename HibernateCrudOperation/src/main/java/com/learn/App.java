package com.learn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        
    	Configuration cfg = new Configuration();
    	cfg.configure("/com/learn/config/hibernate.cfg.xml");
    	
    	
    	SessionFactory sessionFactory;
    	Session session;
    	Transaction transaction;
    	
    	
    	
    }
    
    
    
    
}
