/*
 * Descripción: Ejercicio 2
 * Autor: Daniel Santana
 * Fecha: 25/09/25
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

		
		    public static void main(String[] args) {
		        Scanner futbol = new Scanner(System.in);

		        // Solicitar datos al usuario
		        System.out.print("Nombre del equipo: ");
		        String nombreEquipo = futbol.nextLine();

		        System.out.print("Año de fundación: ");
		        String añoFundacion = futbol.nextLine();

		        System.out.print("Nombre del estadio: ");
		        String nombreEstadio = futbol.nextLine();

		        System.out.print("Nombre del capitán: ");
		        String nombreCapitan = futbol.nextLine();

		        // Mostramos  los datos 
		        System.out.println(" Nombre del Equipo: " + nombreEquipo);
		        System.out.println("Fundado en: " + añoFundacion);
		        System.out.println("Estadio: " + nombreEstadio);
		        System.out.println("Capitán: " + nombreCapitan);
		       
		    }
	
	}
