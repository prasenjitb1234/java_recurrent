package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.test.entities.User;

@SpringBootApplication
public class SpringbootWithHibernate1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWithHibernate1Application.class, args);
		
		
		Configuration cfg = new Configuration();
		
		cfg.configure("/com/test/config/hibernate.cfg.xml");
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
//		Transaction transaction = session.beginTransaction(); 
		
		User user = session.get(User.class, 1);
		System.out.println(user.getName());
		System.out.println(user.getEmail());
		
		
		
		
		
	}

}
