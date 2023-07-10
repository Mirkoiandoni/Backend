package com.proggettoS2;

public class libri extends Elementi {

	public String Autore;
	public String Genere;
	
	
	
	public libri(String iSBN, String titolo, Integer annoPubblicazione, Integer numeroPagine, String autore,
			String genere) {
		super(iSBN, titolo, annoPubblicazione, numeroPagine);
		Autore = autore;
		Genere = genere;
	}
	public String getSutore() {
		return Autore;
	}
	public String getAutore() {
		return Autore;
	}
	public void setAutore(String autore) {
		Autore = autore;
	}
	public String getGenere() {
		return Genere;
	}
	public void setGenere(String genere) {
		Genere = genere;
	}
	@Override
	public String toString() {
		return "libri [Autore=" + Autore + ", Genere=" + Genere + ", ISBN=" + ISBN + ", titolo=" + titolo
				+ ", annoPubblicazione=" + annoPubblicazione + ", numeroPagine=" + numeroPagine + "]";
	}
	
	
	
	
}
