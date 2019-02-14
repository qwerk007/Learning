package com.hibernate.test;

import org.hibernate.Session;

import com.hibernate.entity.Person;
import com.hibernate.utility.HibernateUtil;

public class TestMain {
  public static void main(String[] args) {
	 Person person = new Person();
	 person.setId(1);
	 person.setName("Concretepage");
	 Session session = HibernateUtil.getSessionFactory().openSession();
	 session.beginTransaction();
	 session.save(person);
	 session.getTransaction().commit();
	 session.close();
	 System.out.println("Done");
  }
}