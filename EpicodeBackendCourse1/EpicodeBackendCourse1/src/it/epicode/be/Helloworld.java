package it.epicode.be;

public class Helloworld {

public static void main (String[] args)
		{
		// Stampa a console  la frase
		System.out.println("This is my first Epicode Java Project!");
		System.out.println(molt (10,20)); 
		System.out.println(concatena("Mirko", 27)) ; 
		}


int numl = 10; 
int num2 = 20;
public static int  molt( int num1 ,int num2 ) { 
	int result = num1 * num2;
return result;

 }

public static String concatena (String x, int y) {
String result = x + y;
return result;
}



}