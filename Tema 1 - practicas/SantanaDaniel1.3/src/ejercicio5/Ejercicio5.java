/*
 * Descripción: Uso de funciones math para realizar distintas 
 * operaciones como potencias o raíces cuadradas
 * Autor: Daniel Santana Bueno
 * fecha: 06/10/2025
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Solicito al usuario los valores.
		
		System.out.println("Escribe un numero: "); 
		double num1 = teclado.nextDouble();
	
		System.out.println("Escribe otro numero: ");
		double num2 = teclado.nextDouble();
		
		
		double numeromenor = Math.min(num1, num2); //Vemos cual valor es menor
		System.out.println("El menor de los dos es: " + numeromenor);
		
		double potencia = Math.pow(num1, num2); //Calculamos potencias
		System.out.println(num1 + " elevado a " + num2 + " es: " + potencia);
		
		double raizcuadrada = Math.sqrt(num1); //Calculamos raíz cuadrada del primer valor
		System.out.println("La raíz cuadrada de " + num1 + " es: " + raizcuadrada);
		
		double random = Math.random() * num2; //Esta función nos va a genera un numero entre 0 y el segundo valor.
		System.out.println("Valor random de " + num2 + ": " + random);
	}

}
