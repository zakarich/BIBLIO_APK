package com.gestion.dao;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtile {
private static SessionFactory factory=null; 
	
	public static SessionFactory getSessionFactory(){ 
		ServiceRegistry registre=new StandardServiceRegistryBuilder().configure().build();
		factory=new MetadataSources(registre).buildMetadata().buildSessionFactory(); 
		return factory;
		}
}
