package com.hibernate.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hibernate.entity.Address;
import com.hibernate.entity.Users;
import com.hibernate.utility.HibernateUtil;


public class TestUsers {

	public static void main(String[] args) {
		
		/*
		 * Users user = new Users(); user.setId(1); user.setFirstName("Ravi");
		 * user.setLastName("Gupta"); Address address = new Address();
		 * address.setAddress("K Street"); address.setCity("Noida");
		 * address.setCountry("India"); user.setAddress(address);
		 */
		 Session session = HibernateUtil.getSessionFactory().openSession();
		 
		 session.beginTransaction(); 
		 List user = session.createQuery("FROM Users").list(); 
		 for(Iterator it =  user.iterator(); it.hasNext();) {
			 Users users = (Users)it.next();
			 users.toString();
			 
		 }
		 System.out.println(user.toString());
		
		 System.out.println("Done");

	}

	
	
}
