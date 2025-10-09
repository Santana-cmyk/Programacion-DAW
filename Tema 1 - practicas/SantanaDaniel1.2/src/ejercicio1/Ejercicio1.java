/*
 * Descripción: Ejercicio 1 
 * Autor: Daniel Santana
 * Fecha: 25/09/25
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner peticion = new Scanner(System.in);
		
		String nombre = "Daniel";
		System.out.println("Tú nombre: ");
		nombre = peticion.nextLine();
		System.out.println("Tú nombre es: " + nombre);
		
		
		String apellidos = "Santana Bueno";
		System.out.println("Tus apellidos: ");
		nombre = peticion.nextLine();
		System.out.println("Tus apellidos son: " + apellidos);
		
		int edad = 20;
		System.out.println("Dame tú edad: ");
		edad = peticion.nextInt();
		System.out.println("Tienes " + edad + " años");
		
		
		peticion.nextLine();
		String direccion = "Calle Oso";
		System.out.println("Dame tú dirección: ");
		direccion = peticion.nextLine();
		System.out.println("Tú dirección es la siguiente: " + direccion);
		
		double altura = 1.83;
		System.out.println("Dame tú altura: ");
		altura = peticion.nextDouble();
		System.out.println("Tu altura es: " + altura + " cm");
		
		double peso = 100.5;
		System.out.println("Dame tú peso");
		peso = peticion.nextDouble();
		System.out.println("Tú peso es: " + peso + " kg");
		
	
	}

}
