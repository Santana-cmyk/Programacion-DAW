/*
 * Descripción: Como funciona el operador condicional
 * Autor: Daniel Santana
 * Fecha: 26/09/25
 */

package operadores;

import java.util.Scanner;

public class EjOperCondicional {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		System.out.println("Dime tu nombre: ");
		nombre = teclado.nextLine();
		/*int longitud = nombre.length();
		System.out.println("Numero de caracteres: " + longitud);
		*/
		/*String mayusculas;
		mayusculas = nombre.toUpperCase();
		System.out.println("Mi nombre en mayúsculas: " + mayusculas);
		*/
		
		
		
		String minusculas = nombre.toLowerCase();
		System.out.println("Mi nombre en minúsculas: " + minusculas);
		
		boolean esPepe;
		nombre = nombre.toLowerCase();
		esPepe =nombre.equals("pepe");
		System.out.println(esPepe);
		
		/*int edad;
		System.out.println("Dime tu edad: ");
		edad = teclado.nextInt();
		
		String mayorEdad;
		mayorEdad = (edad > 18) ? "Eres mayor de edad": "Eres menor de edad";
		
		System.out.println(mayorEdad);
		*/
	 }	

}
