package com.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.conezione.jpa;
import com.model.Impiegato;
import javax.persistence.Query;

public class ImpiegatoDaoImpl1 {
public static void main(String[] args) {
	Impiegato n = new Impiegato();
	n.setNome("karen");
	n.setCognome("martinez");
	n.setCodicefiscale("cstknv");
	ImpiegatoDaoImpl1 u = new ImpiegatoDaoImpl1();
	u.create(n);;




}
public void create(Impiegato u) {
	
	EntityManager em = jpa.getEntityManagerFactory().createEntityManager();
	
	EntityTransaction t = em.getTransaction();
	t.begin();
	
	em.persist(u);

	t.commit();
}
public Impiegato find(int id) {
EntityManager em = jpa.getEntityManagerFactory().createEntityManager();
	
	 /* Query q = em.createQuery(
	  "SELECT c.cognome FROM Impiegato c WHERE c.nome = :matricola").setParameter("matricola", id); 
	 // Impiegato res = (Impiegato) q.getSingleResult();
	 String res = (String) q.getSingleResult();*/
	Impiegato res = em.find(Impiegato.class, id);
	 System.out.println( res);
	if (res != null) {
		System.out.println(res);
	} else {
		System.out.println("Impiegato cerca non esiste");
	}
	
	
	return res;
}
}
