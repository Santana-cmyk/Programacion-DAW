/*Descripción: Pedir dos números y con el if ver cual es menor o mayor que el otro.
 * Autor: Daniel Santana Bueno
 * Curso: 1ºDAW
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("escribe un numero: ");
		double num1 = teclado.nextDouble();
		System.out.println("escribe un segundo numero: ");
		double num2 = teclado.nextDouble();
		
		if (num1>num2) {
			System.out.println(num1 + " es mayor que " + num2);

		} else {
			if (num1<num2) {
				System.out.println(num1 + " es menor que " + num2);
			} else {
				System.out.println("Es igual");
			}
		}
		
		


	}

}
