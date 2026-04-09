package com.kodnest.sixthhibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, price, noOfPages for Book");
        Book book = new Book(sc.next(), sc.nextInt(), sc.nextInt());
        
        System.out.println("Enter name, gender, age, address for Author");
        Author author = new Author(sc.next(),sc.next(), sc.nextInt(),sc.next());
        
        book.setAuthor(author);
        
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        
        Transaction transaction = session.beginTransaction();
        
        session.persist(book);
        
        transaction.commit();
        session.close();
        factory.close();
        sc.close();
        
    }
}
