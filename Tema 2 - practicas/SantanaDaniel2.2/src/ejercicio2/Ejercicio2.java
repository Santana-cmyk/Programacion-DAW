/*
 * Descripción:
 * 
 * El programa simula una entrevista de trabajo. Pide tus datos personales, edad y salario deseado.
 * Si cumples con el perfil, te pregunta por tu experiencia y proyectos. Según eso, te dice si te contratan
 * y qué salario te darían.
 * 
 * Autor: Daniel Santana Bueno
 * Fecha: 10/10/25
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.print("Nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.print("Apellidos: ");
	    String apellidos = teclado.nextLine();
		
		System.out.print("Edad: ");
		int edad = teclado.nextInt();
		
		System.out.print("Salario deseado: ");
		double salario = teclado.nextDouble();
		
			if (salario > 30000 || edad > 45) {
				System.out.println("Lo sentimos pero no cumple nuestro perfil");
			} else {
				System.out.println("Años de experiencia: ");
				int años = teclado.nextInt();
				System.out.println("Proyectos trabajados anteriormente: ");
				int proyectos = teclado.nextInt();
				
				if (años > 2 && proyectos > 3) {
					System.out.println("Enhorabuena, usted ha sido contratado");
						if (años > 5 && proyectos > 5) {
							System.out.println("Se le asignará un salario anual de 30.000€");
						} else {
							System.out.println("Se le asignará un salario anual de 25.000€");
						}
				} else {
					System.out.println("Lo sentimos pero no cumple nuestro perfil");

				}
			}

	}

}
