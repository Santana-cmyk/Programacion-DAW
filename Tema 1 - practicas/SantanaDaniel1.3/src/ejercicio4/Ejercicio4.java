/*
 * Descripción: Usos de los métodos ceil, floor y round de la clase Math (Redondeos)
 * Autor: Daniel Santana Bueno
 * fecha: 06/10/2025
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner  teclado = new Scanner(System.in);
		
		System.out.print("Dime un decimal:" ); //Solicitamos un valor
		double valor = teclado.nextDouble(); 	//Lo guardaremos en un double
		
		double  floor = Math.floor(valor); //Establecemos los métodos de Math
		double ceil = Math.ceil(valor); //Redondea al numero más arriba
		double round = Math.round(valor); //Esto redondea a entero
		
		
		System.out.println(valor + " con el método floor de la clase Math es: " + floor); //Redondea abajo
		System.out.println(valor + " con el método ceil de la clase Math es: " + ceil); //Redondea arriba
		System.out.println(valor + " con el método round de la clase Math es: " + round); //Redondea con un entero

		
	}

}
