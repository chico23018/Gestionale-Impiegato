package com.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@NamedQuery(name="Ruolo.findAll", query="select u from Ruolo u")
@Table(name="ruolo")
public class Ruolo implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	private int idruolo;

	private String descrizione;

	//bi-directional many-to-one association to Storico
	@OneToMany(mappedBy="ruolo")
	private List<Storico> storicos;

	public Ruolo() {
	}

	public int getIdruolo() {
		return this.idruolo;
	}

	public void setIdruolo(int idruolo) {
		this.idruolo = idruolo;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public List<Storico> getStoricos() {
		return this.storicos;
	}

	public void setStoricos(List<Storico> storicos) {
		this.storicos = storicos;
	}

	public Storico addStorico(Storico storico) {
		getStoricos().add(storico);
		storico.setRuolo(this);

		return storico;
	}

	public Storico removeStorico(Storico storico) {
		getStoricos().remove(storico);
		storico.setRuolo(null);

		return storico;
	}

	@Override
	public String toString() {
		return "Ruolo [idruolo=" + idruolo + ", descrizione=" + descrizione + "]";
	}
}