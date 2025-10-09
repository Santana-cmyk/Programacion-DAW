/*
 * Descripción: Utilización del if y else para saber si un alumno cumple distintas condiciones.
 * Autor: Daniel Santana Bueno
 * Curso 1ºDAW
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.print("Edad: ");
		int edad = teclado.nextInt();
		
		System.out.print("nota académica: ");
		double nota = teclado.nextDouble();
		
		

		if (nota >= 0 && nota <= 10) {
			if (edad > 18 && nota > 7) {
			System.out.println( nombre + ", usted ha sido admitido en el curso, cumple las condiciones requeridas.");
			
			} else { System.out.println(nombre + ", lo sentimos, no ha sido admitido en el curso ya que no cumple los requisitos mínimos.");
		
			}
			
		} else {
			System.out.println("La nota no es válida, escriba una correcta.");
		}

	}
	
}
