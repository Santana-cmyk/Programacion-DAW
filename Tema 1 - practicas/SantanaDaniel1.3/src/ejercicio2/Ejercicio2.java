/*
 * Descripción: Ejercicio 2, transformamos euros a pesetas y viceversa.
 * Autor: Daniel Santana Bueno
 * Fecha: 01/10/2025
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner dinero = new Scanner(System.in);
		
		final double cambio = 166.386; //Declaramos el cambio de divisas
		
		System.out.print("¿Cuantos euros tienes?: "); //Pedimos los euros
		double euros = dinero.nextDouble();
		
		double eurosApesetas = euros*cambio; //Escribimos la operación matemática para cambiar de euros a pesetas
		
		System.out.println(euros + " en pesetas son: " + eurosApesetas + " pesetas"); //Mostramos por pantalla la conversión
		
		System.out.print("¿Cuantas pesetas tienes?: ");
		double pesetas = dinero.nextDouble();
		
		double pesetasAeuros = pesetas/cambio;
		
		System.out.println(pesetas + " en euros son: " + pesetasAeuros + " euros");

		
		

	}

}
