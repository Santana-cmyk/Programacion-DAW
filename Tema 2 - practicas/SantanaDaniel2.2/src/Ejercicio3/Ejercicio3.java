/*
 * Descripción:
 * Este programa pide una nota del 1 al 10 y te dice si es Insuficiente, Bien, Notable o Sobresaliente.
 * Si la nota no está entre 1 y 10, te avisa que es incorrecta.
 * 
 * Autor: Daniel Santana Bueno
 * Fecha: 11/10/25
 */
package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Tu nota: ");
		int nota = teclado.nextInt();
		
		switch (nota) {
			case 1,2,3,4:
				System.out.print("Insuficiente");
				break;
			case 5,6:
				System.out.print("Bien");
				break;
			case 7,8:
				System.out.print("Notable");
				break;
			case 9,10:
				System.out.print("Sobresaliente");
				break;
			default:
				System.out.println("Nota incorrecta");
				

			
	
		}
	}

}
