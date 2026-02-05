package com.kodnest.secondHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
       
    	Configuration configuration = new Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	
    	SessionFactory factory = configuration.buildSessionFactory();
    	
    	 Session session =  factory.openSession();
    	 
    	 Transaction transaction = session.beginTransaction();
    	 
    	Student ref =  session.get(Student.class, 1);
    	
    	System.out.println(ref.id +" " + ref.name + " " +ref.marks + " " + ref.email);
    	
    	transaction.commit();
    	session.close();
    	factory.close();
    }
}
