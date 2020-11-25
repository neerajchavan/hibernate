package com.hibernate.learning_hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        System.out.println(factory);
        
        Student s1 = new Student(103,"nick2", "shirdi");
        
        Address address = new Address();
        address.setCity("Barcelona");
        address.setAddressId(102);
        address.setStreet("Street 1");
        address.setOpen(true);
        address.setX(10.11);
        address.setAddedDate(new Date());
        
  
        Session session = factory.openSession();
        
        session.beginTransaction();
    
        session.save(s1);
        session.save(address);
        
        session.getTransaction().commit();
        
    }
}
