package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();

		Question q1 = new Question();
		q1.setQuestionId(101);
		q1.setQuestion("What is java?");

		Answer a1 = new Answer();
		a1.setAnswerId(201);
		a1.setAnswer("Java is a programming language");
		q1.setAnswer(a1);

		Question q2 = new Question();
		q2.setQuestionId(102);
		q2.setQuestion("What is Pune?");

		Answer a2 = new Answer();
		a2.setAnswerId(202);
		a2.setAnswer("Pune is a city");
		q2.setAnswer(a2);

		Session s = factory.openSession();
		Transaction transaction = s.beginTransaction();
		s.save(q1);
		s.save(q2);
		s.save(a1);
		s.save(a2);
		transaction.commit();
		s.close();
		factory.close();
	}
}
