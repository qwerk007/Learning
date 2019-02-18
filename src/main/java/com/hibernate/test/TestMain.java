package com.hibernate.test;

import org.hibernate.Session;

import com.hibernate.entity.Address;
import com.hibernate.entity.Person;
import com.hibernate.entity.Users;
import com.hibernate.utility.HibernateUtil;

public class TestMain {
  public static void main(String[] args) {
	 Users user  = new Users();
	 user.setId(1);
	 user.setFirstName("Ravi");
	 user.setLastName("Gupta");
	 Address address = new Address();
	 address.setAddress("K Street");
	 address.setCity("Noida");
	 address.setCountry("India");
	 user.setAddress(address);
	 Session session = HibernateUtil.getSessionFactory().openSession();
	 session.beginTransaction();
	 session.save(user);
	 session.getTransaction().commit();
	 session.close();
	 System.out.println("Done");
  }
}