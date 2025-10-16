/*
 * Descripción: ejemplos de tipos de variables
 * Autor: Daniel Santana
 * Fecha: 22/09/25
 */
package tiposVariables;

public class EjemplosTipos {

	public static void main(String[] args) {
		int numAlumnos; // Declaramos la variable numAlumnos
		numAlumnos = 0;
		System.out.println("Valor de la variable: " + numAlumnos);
		
		numAlumnos = 12;
		System.out.println("Valor de la variable: " + numAlumnos);
		
		double alturaAlumno = 1.75; 
		System.out.println("Altura del alumno: " + alturaAlumno +" cm");
		
		char letraDni;
		letraDni = 'a';
		System.out.println("Letra Dni: " + letraDni);

		String nombreAlumno = "Daniel";
		System.out.println("Nombre del alumno: " + nombreAlumno);
		
		final int MAXIMO_NUMERO_ALUMNOS = 25; // Declaramos una constante
		System.out.println("El número máximo de alumnos es: " + MAXIMO_NUMERO_ALUMNOS);
		
		final String GRUPO = "DAW 1º";
		System.out.println("Grupo del alumno: " + GRUPO);

		
		


	}

}
