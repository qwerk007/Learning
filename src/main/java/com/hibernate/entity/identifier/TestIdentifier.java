package com.hibernate.entity.identifier;

import org.hibernate.Session;

import com.hibernate.entity.Department;
import com.hibernate.utility.HibernateUtil;

public class TestIdentifier {
	
	
	public static void main(String s[]) {
		
		/*
		 * TableIdentifier tab = new TableIdentifier(); tab.TableName = "Id";
		 */
		
		Department seq = new Department();
		seq.setDepartmentHead("RAVI");
		seq.setDepartmentName("CSE");
		Session ses = HibernateUtil.getSessionFactory().openSession();
		 ses.beginTransaction();
		 ses.save(seq);
		 ses.getTransaction().commit();
		 ses.close();
	}

}
