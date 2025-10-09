/*
 * Descripción: Intercambio de los valores
 * Autor: Daniel Santana Bueno
 * fecha: 03/10/2025
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un valor: "); //Le pedimos los valores al usuario
		int num1 = teclado.nextInt();
		
		System.out.println("Dame un segundo valor: ");
		int num2 = teclado.nextInt();
		
		//Ahora intercambiamos los valores
		
		 int intercambio = num1;
	     num1 = num2;
	     num2 = intercambio;
	      
	     System.out.println("Después del intercambio:");
	     System.out.println("num1 = " + num1);
	     System.out.println("num2 = " + num2);
		
		
	}

}
