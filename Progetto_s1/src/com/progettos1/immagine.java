package com.progettos1;

import com.progettos1.ElementoMultimediale;

import interfaccia.Iluce;
import interfaccia.Ivolume;

public class immagine  implements Iluce{

	public String titolo;
	private int luce;
	
	public immagine (String titolo, int luce )	{
		this.titolo = titolo;
		this.luce = luce;
		
	}
	
	public int Alzaluce() {
		return luce++ ;
	}
	public int abbassaluce () {
		return luce --;
};
public void show () { 
	for(int i = 0 ; i<2; i++) {
		System.out.println(this.titolo);
		for (int y=0; y<this.luce; y++) {
			System.out.println("!");
		}
	}
}
}