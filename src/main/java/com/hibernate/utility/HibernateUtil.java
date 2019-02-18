package com.hibernate.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory ;
	
	static {
        Properties props = new Properties();

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("/home/ravi/git/Learning/src/main/resources/hibernate.properties");
			props.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        Configuration configuration = new Configuration();
        //configuration.addFile("D:\\HostingProjects\\HibernateTest\\build\\classes\\student.hbm.xml");
    	//Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(com.hibernate.entity.Users.class);
        configuration.addAnnotatedClass(com.hibernate.entity.identifier.TableIdentifier.class);
        configuration.addAnnotatedClass(com.hibernate.entity.Department.class);
        configuration.addAnnotatedClass(com.hibernate.entity.association.Student.class);
        configuration.addAnnotatedClass(com.hibernate.entity.association.Subjects.class);
    	configuration.setProperties(props);
    	StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        sessionFactory = configuration.buildSessionFactory(builder.build());
     }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}