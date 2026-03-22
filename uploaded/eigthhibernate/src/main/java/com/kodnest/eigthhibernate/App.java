package com.kodnest.eigthhibernate;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
       Department department = new Department("IT", "5th FLOOR");
       
       Employee employee1 = new Employee("Omkar", "50000", department);
       Employee employee2 = new Employee("Utkarsh", "60000", department);
       Employee employee3 = new Employee("Harsh", "70000", department);
       Employee employee4 = new Employee("Sahil", "30000", department);
       
       ArrayList<Employee> emplist = new ArrayList<Employee>();
       emplist.add(employee1);
       emplist.add(employee2);
       emplist.add(employee3);
       emplist.add(employee4);
       
       department.setEmployees(emplist);
       
       
       SessionFactory factory = new Configuration().configure().buildSessionFactory();
       
       Session session = factory.openSession();
       
       Transaction transaction = session.beginTransaction();
       
      session.persist(department);
      
      transaction.commit();
      session.close();
      factory.close();
 
    }
}
