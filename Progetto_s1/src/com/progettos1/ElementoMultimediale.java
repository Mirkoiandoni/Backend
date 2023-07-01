package com.progettos1;

public abstract class ElementoMultimediale {

	public String titolo;
	protected int durata;
	 protected int volume;
	
	
	 public abstract void play();
	
	
	
	public ElementoMultimediale(String titolo, int durata, int volume) {
		super();
		this.titolo = titolo;
		this.durata = durata;
		this.volume = volume;
	}


	


	public int getDurata() {
		return durata;
	}


	public void setDurata(int durata) {
		this.durata = durata;
	}


	public int getVolume() {
		return volume;
	}


	public void setVolume(int volume) {
		this.volume = volume;
	}


	
}
