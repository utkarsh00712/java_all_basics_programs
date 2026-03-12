package com.kodnest.ThirdHibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int id = sc.nextInt();
      SessionFactory factory =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
      
      Session session = factory.openSession();
      
      Transaction transaction = session.beginTransaction();
      
        Student obj = session.get(Student.class, id);
        
        if(obj != null) {
        	session.remove(obj);
        	System.out.println("Data deleted Successfuly");
        } else {
        	System.out.println("Student doesnot exist");
        }
        
        transaction.commit();
        
        session.close();
        factory.close();
    }
}
