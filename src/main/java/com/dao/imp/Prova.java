package com.dao.imp;

import com.dao.ImpiegatoDao;
import com.dao.RuoloDao;
import com.dao.StoricoDao;
import com.model.Impiegato;
import com.model.Storico;

public class Prova {

	public static void main(String[] args) {
	StoricoDao n = new StoricoDaoImpl();
	Storico m = new Storico();
	ImpiegatoDao l =new ImpiegatoDaoImpl();
	RuoloDao k = new RuoloDaoImp();
	
	m.setRuolo(k.find(1));
	m.setImpiegato(l.find(1));
	m .setDatafine("02/02/2022");
	m.setDatainizio("02/02/2015");
	
	n.allFind();
	//l.eliminare(1);
	Impiegato d = new Impiegato();
	d.removeStorico(m);

	
	}

}
