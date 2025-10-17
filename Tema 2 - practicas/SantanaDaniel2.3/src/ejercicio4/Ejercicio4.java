package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);

	        int num, suma = 0, contador = 0;
	        double media = 0;

	        
	        System.out.println("Dame un número (0 para terminar):");
	        num = teclado.nextInt();
	        
	        suma = num;

	        if (num >= 0) {
	          while (num != 0) {
	        	System.out.println("Otro: ");
	  	        num = teclado.nextInt();
		        contador=contador+1;
		        suma = suma+num;
		        media = (suma+num)/contador;
	          } 
		        System.out.println("La suma es: "+suma);
		        System.out.println("La media es: "+media);
	        } else {
	            System.out.println("Error");
	        }
	}

}
