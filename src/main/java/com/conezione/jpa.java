package com.conezione;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class jpa {
private static final EntityManagerFactory entitymManagerFactory;
	
	static {
		entitymManagerFactory = Persistence.createEntityManagerFactory("Ewallet");
	}
	
	public static EntityManagerFactory getEntityManagerFactory() {
		return entitymManagerFactory;
		
	}

}
