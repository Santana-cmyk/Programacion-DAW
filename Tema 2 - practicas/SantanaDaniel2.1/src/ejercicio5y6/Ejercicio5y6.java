/*
 * Descripción: Petición de datos del alumno junto con su nota académica. Filtrado de notas.
 * Autor: Daniel Santana Bueno
 * Curso 1ºDAW
 */
package ejercicio5y6;

import java.util.Scanner;

public class Ejercicio5y6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Nombre: ");
		String nombre = teclado.nextLine();
		System.out.print("Apellidos: ");
		String apellidos = teclado.nextLine();
		System.out.print("Ciclo formativo: ");
		String ciclo = teclado.nextLine();
		System.out.print("Nota académica: ");
		int nota = teclado.nextInt();
		
		if (nota < 0 || nota > 10) {
			System.out.print("La nota académica indicada es incorrecta. ");
		} else {
			String calificacion ;
			
			if (nota < 5) {
				calificacion = " (Insuficiente)";
			} else if (nota < 6) {
				calificacion = " (Aprobado)";

			} else if (nota < 7 ) {
				calificacion = " (Bien)";

			} else if (nota < 9) {
				calificacion = " (Notable)";
				
			} else if  (nota == 9) {
				calificacion = " (Sobresaliente)";
			} else {
				calificacion = " (Matrícula de honor)";
			}
			
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellidos);
			System.out.println("Ciclo formativo: "+ ciclo);
			System.out.println("Nota académica: "+ nota + " " + calificacion);

		}
	}

}
