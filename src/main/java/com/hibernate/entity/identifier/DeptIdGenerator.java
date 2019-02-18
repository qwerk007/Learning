package com.hibernate.entity.identifier;

import java.io.Serializable;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class DeptIdGenerator  implements IdentifierGenerator{

	@Override
	public Serializable generate(SessionImplementor session, Object object) throws HibernateException {
		
		Random rand = new Random();
		return "DEPT-"+rand.nextInt();
	}

}
