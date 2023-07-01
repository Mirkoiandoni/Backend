package com.progettos1;

import interfaccia.Iluce;
import interfaccia.Ivolume;

public class Video extends ElementoMultimediale implements Ivolume, Iluce {
	
	public int luce;

	int volume ;
	int durata ;
	public Video(String titolo, int durata , int volume, int luce ) {
		super(titolo, durata, volume );
		
		this.luce = luce;
		
	}
	
	public int Alzaluce() {
		return luce++ ;
	}
	
	public int abbassaluce () {
	return luce --; 
	
	}
		
	public int AlzaVolume() {
	return volume++ ;
		
	}		
	public int abbassaVolume() {
	return volume-- ;
			
	}
	
	@Override
    public void play() {
        for (int i = 0; i < this.durata; i++) {
            System.out.print(this.titolo);
        for (int x = 0; x < this.volume; x++) {
                System.out.print("!");
            }
        System.out.println();
        }
    }
	public void show() {
        for (int i = 0; i < this.luce; i++) {
            System.out.print(this.titolo);
            for (int l = 0; l < this.luce; l++) {
                System.out.print("*");
            }
        System.out.println();
        }
    }
};




		
