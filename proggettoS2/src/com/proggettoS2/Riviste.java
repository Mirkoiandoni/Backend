package com.proggettoS2;

public class Riviste extends Elementi {

	private Periodicitá Periodicitá;

	public Riviste(String iSBN, String titolo, Integer annoPubblicazione, Integer numeroPagine,
			com.proggettoS2.Periodicitá periodicitá) {
		super(iSBN, titolo, annoPubblicazione, numeroPagine);
		Periodicitá = periodicitá;
	}

	public Periodicitá getPeriodicitá() {
		return Periodicitá;
	}

	public void setPeriodicitá(Periodicitá periodicitá) {
		Periodicitá = periodicitá;
	}

	@Override
	public String toString() {
		return "Riviste [Periodicitá=" + Periodicitá + ", ISBN=" + ISBN + ", titolo=" + titolo + ", annoPubblicazione="
				+ annoPubblicazione + ", numeroPagine=" + numeroPagine + "]";
	}
	
	
	
	
}
