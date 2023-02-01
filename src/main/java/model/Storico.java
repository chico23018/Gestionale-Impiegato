package model;



public class Storico {
	
	private int idStorico;
	private int matricola;
	private String idRuolo;
	private String datainizio;
	private String dataFine ;
	
	public int getMatricola() {
		return matricola;
	}
	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}
	public String getIdRuolo() {
		return idRuolo;
	}
	public void setIdRuolo(String idRuolo) {
		this.idRuolo = idRuolo;
	}
	public String getDatainizio() {
		return datainizio;
	}
	public void setDatainizio(String datainizio) {
		this.datainizio = datainizio;
	}
	public String getDataFine() {
		return dataFine;
	}
	public void setDataFine(String i) {
		this.dataFine = i;
	}
	public int getIdStorico() {
		return idStorico;
	}
	public void setIdStorico(int idStorico) {
		this.idStorico = idStorico;
	}
	@Override
	public String toString() {
		return "Storico [idStorico=" + idStorico + ", matricola=" + matricola + ", idRuolo=" + idRuolo + ", datainizio="
				+ datainizio + ", dataFine=" + dataFine + "]";
	}
	
	
	
}
