package com.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@NamedQuery(name="Storico.findAll", query="select u from Storico u")
@Table(name="storico")
public class Storico implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private int idstorico;

	private String datafine;

	private String datainizio;
	

	//bi-directional many-to-one association to Impiegato
	@ManyToOne
	@JoinColumn(name="matricola")
	private Impiegato impiegato;

	//bi-directional many-to-one association to Ruolo
	@ManyToOne
	@JoinColumn(name="idruolo")
	private Ruolo ruolo;

	public Storico() {
	}

	public int getIdstorico() {
		return this.idstorico;
	}

	public void setIdstorico(int idstorico) {
		this.idstorico = idstorico;
	}

	public String getDatafine() {
		return this.datafine;
	}

	public void setDatafine(String datafine) {
		this.datafine = datafine;
	}

	public String getDatainizio() {
		return this.datainizio;
	}

	public void setDatainizio(String datainizio) {
		this.datainizio = datainizio;
	}

	public Impiegato getImpiegato() {
		return this.impiegato;
	}

	public void setImpiegato(Impiegato impiegato) {
		this.impiegato = impiegato;
	}

	public Ruolo getRuolo() {
		return this.ruolo;
	}

	public void setRuolo(Ruolo ruolo) {
		this.ruolo = ruolo;
	}

	@Override
	public String toString() {
		return "Storico [idstorico=" + idstorico + ", datafine=" + datafine + ", datainizio=" + datainizio
				+ ", impiegato=" + impiegato + ", ruolo=" + ruolo + "]";
	}

}