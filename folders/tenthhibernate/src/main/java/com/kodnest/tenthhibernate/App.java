package com.kodnest.tenthhibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
        Session session = factory.openSession();
        
        Transaction transaction = session.beginTransaction();
        
        String hql = "from KodnestStudent where id > 1";
        Query<KodnestStudent> query =session.createQuery(hql,KodnestStudent.class);
        
       List<KodnestStudent> studentList =query.getResultList();
       
//       System.out.println(studentList);
       for(KodnestStudent ref : studentList) {
    	   System.out.println(ref);
       }
       transaction.commit();
       session.close();
       factory.close();
    }
}
