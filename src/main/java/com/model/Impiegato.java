package com.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@NamedQuery(name="Impiegato.findAll", query="select u from Impiegato u")
@Table(name="impiegato")
public class Impiegato implements Serializable {
	@Id
	private int matricola;
	private String nome;
	private String cognome;
	private String codicefiscale;

	



	//bi-directional many-to-one association to Storico
	@OneToMany(mappedBy="impiegato")
	private List<Storico> storicos;

	public Impiegato() {
	}

	public int getMatricola() {
		return this.matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public String getCodicefiscale() {
		return this.codicefiscale;
	}

	public void setCodicefiscale(String codicefiscale) {
		this.codicefiscale = codicefiscale;
	}

	public String getCognome() {
		return this.cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Storico> getStoricos() {
		return this.storicos;
	}

	public void setStoricos(List<Storico> storicos) {
		this.storicos = storicos;
	}
	public Storico addStorico(Storico storico) {
		getStoricos().add(storico);
		storico.setImpiegato(this);

		return storico;
	}

	public Storico removeStorico(Storico storico) {
		getStoricos().remove(storico);
		storico.setImpiegato(null);

		return storico;
	}

	@Override
	public String toString() {
		return "Impiegato [matricola=" + matricola + ", codicefiscale=" + codicefiscale + ", cognome=" + cognome
				+ ", nome=" + nome + "]";
	}

}
