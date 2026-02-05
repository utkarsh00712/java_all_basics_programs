package com.kodnest.seventhhibernate;

import java.util.ArrayList;
import java.util.List;
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
       System.out.println("Enter the name of the courses");
       Course course1 = new Course(sc.next());
       Course course2 = new Course(sc.next());
       Course course3 = new Course(sc.next());
       
       System.out.println("Enter the name, email and Phone of Student");
       
       KodnestStudent kodnestStudent = new KodnestStudent(sc.next(),sc.next(),sc.next());
       course1.setKodnestStudent(kodnestStudent);
       course2.setKodnestStudent(kodnestStudent);
       course3.setKodnestStudent(kodnestStudent);
       
     List<Course> courseList = new ArrayList<Course>();
     courseList.add(course1);
     courseList.add(course2);
     courseList.add(course3);
       
     kodnestStudent.setCourses(courseList);
     
     SessionFactory factory = new Configuration().configure().buildSessionFactory();
       Session session = factory.openSession();
       
       Transaction transaction = session.beginTransaction();
       
       session.persist(kodnestStudent);
       
       transaction.commit();
       
       session.close();
       factory.close();
       sc.close();
    }
}
