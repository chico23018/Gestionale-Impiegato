package com.dao;

import java.util.List;

import com.model.Impiegato;

public interface ImpiegatoDao {
public void inseri(Impiegato n);
public void update(Impiegato n);
public void eliminare (int id);
public List<Impiegato> allFind();
public Impiegato find(int id);
}
