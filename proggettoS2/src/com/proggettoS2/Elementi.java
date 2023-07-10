package com.proggettoS2;

public class Elementi {

	public String ISBN;
	public String titolo;
	public Integer annoPubblicazione;
	public Integer  numeroPagine;
	
	public Elementi(String iSBN, String titolo, Integer annoPubblicazione, Integer numeroPagine) {
		super();
		ISBN = iSBN;
		this.titolo = titolo;
		this.annoPubblicazione = annoPubblicazione;
		this.numeroPagine = numeroPagine;
		
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Integer getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public void setAnnoPubblicazione(Integer annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}

	public Integer getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(Integer numeroPagine) {
		this.numeroPagine = numeroPagine;
	}

	@Override
	public String toString() {
		return "Elementi [ISBN=" + ISBN + ", titolo=" + titolo + ", annoPubblicazione=" + annoPubblicazione
				+ ", numeroPagine=" + numeroPagine + "]";
	}
	
	
	
}


