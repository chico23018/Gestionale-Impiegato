package com.dao;

import java.util.List;

import com.model.Ruolo;

public interface RuoloDao {
	
		public void inseri(Ruolo n);
		public void update(Ruolo n);
		public void eliminare (int id);
		public List<Ruolo> allFind();
		public Ruolo find(int id);
}
