//package com.hibernate.learning_hibernate;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Date;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
///**
// * Hello world!
// *
// */
//public class App 
//{
//    public static void main( String[] args ) throws IOException
//    {
//        System.out.println( "Hello World!" );
//        SessionFactory factory = new Configuration().configure().buildSessionFactory();
//        System.out.println(factory);
//        
//        Student s1 = new Student(104,"nj", "shirdi");
//        
//        Address address = new Address();
//        address.setCity("Pune");
//        address.setAddressId(103);
//        address.setStreet("Street 3");
//        address.setOpen(true);
//        address.setX(10.11);
//        address.setAddedDate(new Date());
//        
//        //inserting image
//        FileInputStream fis = new FileInputStream("/Users/neeraj/Downloads/400-22-5-country-colour-1-1360br-football-nivia-original-imaf746mud9cxqgh.jpeg");
//        byte[] data = new byte[fis.available()];
//        fis.read(data);
//        address.setImage(data); 
//        
//        
//  
//        Session session = factory.openSession();
//        
//        session.beginTransaction();
//    
//        session.save(s1);
//        session.save(address);
//        
//        session.getTransaction().commit();
//        
//    }
//}
