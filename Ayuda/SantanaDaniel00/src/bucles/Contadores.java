package bucles;

import java.util.Scanner;

public class Contadores {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int contador;

		System.out.println ("Cuenta atrás desde 100 hasta 0, de 10 en 10.");
		contador= 100;
		
		while (contador >=0 ) { 
		    System.out.print (contador + " ");
		    contador -= 10; 
		}
		System.out.println ();
		
	}
	
	
	
	
	

}
