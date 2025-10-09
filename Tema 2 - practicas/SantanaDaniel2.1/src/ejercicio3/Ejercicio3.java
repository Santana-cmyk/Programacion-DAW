/*
 * Descripción: Utilización del if y else para saber si un alumno es admitido en un curso.
 * Autor: Daniel Santana Bueno
 * Curso 1ºDAW
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Indique su edad: ");
		int edad = teclado.nextInt();
		teclado.nextLine(); 

		if (edad < 18) {
			System.out.println("No tiene la edad requerida para realizar estos estudios.");
		} else {
			System.out.print("Nombre: ");
			String nombre = teclado.nextLine();

			System.out.print("Apellidos: ");
			String apellidos = teclado.nextLine();
			
			System.out.println("Nombre: "+nombre);
			System.out.println("Apellidos: "+apellidos);
			System.out.println("Edad: "+edad);
			System.out.println("Usted ha sido admitido");
		} 
	}

}
