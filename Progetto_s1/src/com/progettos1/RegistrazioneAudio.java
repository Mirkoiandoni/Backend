package com.progettos1;

import com.progettos1.ElementoMultimediale;
import interfaccia.Ivolume;

public class RegistrazioneAudio extends ElementoMultimediale implements Ivolume{

	public RegistrazioneAudio(String titolo, int durata, int volume) {
		super(titolo, durata, volume);
		
	}
	public int AlzaVolume() {
		return volume ++ ;
	}
	public int abbassaVolume () {
		return volume --;
};
public void play () { 
	for(int i = 0 ; i<this.durata; i++) {
		System.out.print(this.titolo);
		for (int y=0; y<this.volume; y++) {
			System.out.print("!");
	}
		System.out.println();
	}
	
}
}