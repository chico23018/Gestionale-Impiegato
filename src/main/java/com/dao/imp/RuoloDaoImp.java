package com.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.conezione.jpa;
import com.dao.RuoloDao;
import com.model.Impiegato;
import com.model.Ruolo;

public class RuoloDaoImp implements RuoloDao {
	private EntityManager em = jpa.getEntityManagerFactory().createEntityManager();

	public void inseri(Ruolo n) {
		EntityTransaction t = em.getTransaction();
		t.begin();

		em.persist(n);

		t.commit();
	}

	public void update(Ruolo n) {
		EntityTransaction t = em.getTransaction();
		t.begin();

		em.merge(n);

		t.commit();

	}

	public void eliminare(int id) {
		EntityTransaction t = em.getTransaction();
		t.begin();
		Ruolo res = em.find(Ruolo.class, id);
		em.remove(res);
		t.commit();

	}

	public List<Ruolo> allFind() {
		Query q = em.createNamedQuery("Ruolo.findAll");
		System.out.println("dentroooo");
		List<Ruolo> res = q.getResultList();
		System.out.println(res);
		return res;
		
	}

	public Ruolo find(int id) {
		Ruolo res = em.find(Ruolo.class, id);
		if (res != null) {
			System.out.println(res);
		} else {
			System.out.println("Ruolo non trovato");
		}
		return res;
	}

	

}
