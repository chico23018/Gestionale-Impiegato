package com.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.conezione.jpa;
import com.dao.ImpiegatoDao;
import com.model.Impiegato;

public class ImpiegatoDaoImpl implements ImpiegatoDao {
	private EntityManager em = jpa.getEntityManagerFactory().createEntityManager();

	public void inseri(Impiegato n) {
		EntityManager em = jpa.getEntityManagerFactory().createEntityManager();

		EntityTransaction t = em.getTransaction();
		t.begin();

		em.persist(n);

		t.commit();

	}

	public void update(Impiegato n) {
		EntityManager em = jpa.getEntityManagerFactory().createEntityManager();

		EntityTransaction t = em.getTransaction();
		t.begin();

		em.merge(n);

		t.commit();
	}

	public void eliminare(int id) {
		EntityManager em = jpa.getEntityManagerFactory().createEntityManager();

		EntityTransaction t = em.getTransaction();
		t.begin();

		Impiegato res = em.find(Impiegato.class, id);
		em.remove(res);

		t.commit();
	}

	public List<Impiegato> allFind() {
		EntityManager em = jpa.getEntityManagerFactory().createEntityManager();

		Query q = em.createNamedQuery("Impiegato.findAll");
		System.out.println("dentroooo");
		List<Impiegato> res = q.getResultList();
		System.out.println(res);
		return res;

	}

	public Impiegato find(int id) {
		EntityManager em = jpa.getEntityManagerFactory().createEntityManager();
		/*
		 * Query q = em.createQuery(
		 * "SELECT c FROM Impiegato c WHERE c.matricola = :matricola").setParameter("matricola", id); 
		 * Impiegato res = (Impiegato) q.getSingleResult();
		 */
		Impiegato res = em.find(Impiegato.class, id);
		if (res != null) {
			System.out.println(res);
		} else {
			System.out.println("Impiegato cerca non esiste");
		}
		return res;
	}

}
