package com.dao;

import java.util.List;

import com.model.Storico;

public interface StoricoDao {
	public void inseri(Storico n);
	public void update(Storico n);
	public void eliminare (int id);
	public List<Storico> allFind();
	public Storico find(int id);
}
