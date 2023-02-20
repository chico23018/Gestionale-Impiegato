package com.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.conezione.jpa;
import com.dao.StoricoDao;
import com.model.Impiegato;
import com.model.Ruolo;
import com.model.Storico;

public class StoricoDaoImpl implements StoricoDao {
	private EntityManager em = jpa.getEntityManagerFactory().createEntityManager();


	public void inseri(Storico n) {
		EntityTransaction t = em.getTransaction();
		
		t.begin();

		em.persist(n);

		t.commit();

	}

	public void update(Storico n) {
		EntityTransaction t = em.getTransaction();
		t.begin();

		em.merge(n);

		t.commit();

	}

	public void eliminare(int id) {
		EntityTransaction t = em.getTransaction();
		t.begin();
		Storico res = em.find(Storico.class, id);
		em.remove(res);
		t.commit();

	}

	public List<Storico> allFind() {
		Query q = em.createNamedQuery("Storico.findAll");
		System.out.println("dentroooo");
		List<Storico> res = q.getResultList();
		System.out.println(res);
		return res;
	}

	public Storico find(int id) {
		Storico res = em.find(Storico.class, id);
		if (res != null) {
			System.out.println(res);
		} else {
			System.out.println("Storico non trovato");
		}
		return res;
	}

}
