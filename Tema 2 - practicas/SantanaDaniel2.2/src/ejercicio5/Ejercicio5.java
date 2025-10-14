/*
 * Descripción:
 * 
 * Este programa pide dos números al usuario y luego le deja elegir qué operación quiere hacer:
 * suma, resta, multiplicación o división. Después muestra el resultado en pantalla.
 * 
 * Autor: Daniel Santana Bueno
 * Fecha: 11/10/25
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca un valor: ");
		double num1 = teclado.nextDouble();
		System.out.print("Introduzca un valor 2: ");
		double num2 = teclado.nextDouble();
		
		System.out.println("Indique la operación que quiere realizar (Inserte un número:) ");
		System.out.println("(1) Suma");
		System.out.println("(2) Resta");
		System.out.println("(3) Multiplicación");
		System.out.println("(4) División");

		
		
		int opcion = teclado.nextInt();
		
		
		if (opcion  != 1 && opcion != 2 && opcion !=3 && opcion!=4) {
			System.out.println("Error. Inserte uno de los números indicados");
		} else if (opcion == 1) {
			double suma = num1 +num2;
			System.out.println(num1 + " + " + num2 + " = "+ suma);
			
		} else if (opcion == 2) {
			double resta = num1-num2;
			System.out.println(num1 + " - " + num2 + " = "+ resta);
			
		} else if (opcion == 3) {
			double multiplica = num1*num2;
			System.out.println(num1 + " x " + num2 + " = "+ multiplica);
			
		} else if (opcion == 4) {
			double divide = num1/num2;
			System.out.println(num1 + " / " + num2 + " = "+ divide);
		}
		

		
		
	}

}
