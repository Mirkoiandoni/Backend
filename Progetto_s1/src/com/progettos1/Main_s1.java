package com.progettos1;

import java.util.Scanner;

public class Main_s1 {
	static Scanner scanner = new Scanner (System.in);
;
	public static void main(String[] args ) {
		
		System.out.println("titolo : ");
		String titoloA = scanner.next();
		
		System.out.println("Durata : ");
		int durataA = scanner.nextInt();
		
		System.out.println("Volume : ");
		int volumeA = scanner.nextInt();
		
		
		RegistrazioneAudio a = new RegistrazioneAudio (titoloA,durataA,volumeA);
		a.AlzaVolume();
		System.out.println(a.titolo +" "+ a.volume);
		a.abbassaVolume();
		System.out.println(a.titolo +" "+ a.volume );
		a.play();
				
		System.out.println("titolo : ");
		String titoloB = scanner.next();
		
		System.out.println("Durata : ");
		int durataB = scanner.nextInt();
		
		System.out.println("Volume : ");
		int volumeB = scanner.nextInt();
		
		System.out.println("luce");
		int luceB = scanner.nextInt();
		
		
		Video vd = new Video (titoloB,durataB,volumeB,luceB);
		a.AlzaVolume();
		System.out.println(vd.titolo +""+ vd.volume);
		a.abbassaVolume();
		System.out.println(vd.titolo +""+ vd.volume);
		vd.play();
		
		vd.Alzaluce();
        System.out.println(vd.titolo + " " + vd.luce);
        vd.abbassaluce();
        System.out.println(vd.titolo + " " + vd.luce);
        vd.show();
				
        
        System.out.println("titolo immagine:");
		String titoloC = scanner.next();
		
		System.out.println("luce");
		int luceC = scanner.nextInt();
        
		immagine im = new immagine (titoloC,luceC);
		im.Alzaluce();
		System.out.println(im.titolo +" "+ a.volume);
		im.abbassaluce();
		System.out.println(im.titolo +" "+ a.volume);
		
		im.show();
		
		}
	
}
