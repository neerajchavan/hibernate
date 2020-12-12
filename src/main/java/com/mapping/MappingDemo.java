package com.mapping;

import java.util.ArrayList;
import java.util.List;

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
		a1.setQuestion(q1);

		Answer a2 = new Answer();
		a2.setAnswerId(202);
		a2.setAnswer("Java is an object oriented programming language");
		a2.setQuestion(q1);

		List<Answer> aList = new ArrayList<Answer>();
		aList.add(a1);
		aList.add(a2);

		q1.setAnswers(aList);

		Session s = factory.openSession();
		Transaction transaction = s.beginTransaction();
		s.save(q1);
		s.save(a1);
		s.save(a2);

		transaction.commit();

		// Early / Lazy Loading
		Question q = s.get(Question.class, 101);
		System.out.println("Question ID : " + q.getQuestionId());
		System.out.println("Question : " + q.getQuestion());
		
		s.close();
		factory.close();
	}
}
