package com.hibernate.learning_hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        //get()
        Student student = (Student)session.get(Student.class, 104);
        System.out.println("Student object using get:" +student);

        //load
        Student student2 = (Student)session.load(Student.class, 103);
        System.out.println("Student object using load :" +student2);

    }
}
