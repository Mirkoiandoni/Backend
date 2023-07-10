package com.proggettoS2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class mainS2 {
	
	private static Logger logger = LoggerFactory.getLogger(mainS2.class);

	static List <Elementi> NuovaLista  = new ArrayList<Elementi>();
	
	public static void  main (String[] args) {
 		

		Riviste riviste1 = new Riviste ("8374","Giallo Zafferano ", 2006,50,Periodicitá.SETTIMANALE);
		Riviste riviste2 = new Riviste ("4344","Aeronautica & Difesa. ", 1999,39,Periodicitá.MENSILE);
		libri libro1 = new libri ("4355","Il signore degli anelli", 1954,701,"Tolkien","Fantasy");
		libri libro2 = new libri ("43464","Le cronache di Narnia", 1969,349," C. S. Lewis","Fantasy");
	
		addToCatalogo (riviste1);
		
	}
public static void addToCatalogo (Elementi c) { 
	NuovaLista.add(c);
	
} 
	

public static void removeFromCatalogo(String ISBN) {
	List<Elementi> rem = NuovaLista.stream()
			.filter(p-> p.ISBN==ISBN)
			.collect (Collectors.toList());
			rem.forEach(p-> NuovaLista.remove(p));
			
		
}

	
	
}
	

