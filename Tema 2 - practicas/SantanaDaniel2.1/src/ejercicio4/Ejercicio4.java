/*
 * Descripción: Petición de datos para establecer ciertas condiciones, realización de medias y sumas.
 * Autor: Daniel Santana Bueno
 * Curso 1ºDAW
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
			
		System.out.print("Nombre: ");
		String nombre = teclado.nextLine();
		System.out.print("Apellidos: ");
		String apellidos = teclado.nextLine();

		System.out.print("Importe gastado 1: ");
		int importe1 = teclado.nextInt();

		System.out.print("Importe gastado 2: ");
		int importe2 = teclado.nextInt();

		System.out.print("Importe gastado 3: ");
		int importe3 = teclado.nextInt();

		System.out.print("Importe gastado 4: ");
		int importe4 = teclado.nextInt();

		
		
		if (importe1 < 0 || importe2 < 0 || importe3 < 0 || importe4 < 0) {
			System.out.println("Datos erróneos, los valores negativos no valen.");
		} else {
			double suma = importe1 + importe2 + importe3 + importe4;
			double media = (importe1 + importe2 + importe3 + importe4) / 4;
			
			System.out.println("Importe medio: " + media);
			
			if (suma >= 300) {
				System.out.println("¡Ha alcanzado los 300 euros este mes! Se ha ganado un descuento de 50 €.");
			} else {
				System.out.println("Lo sentimos pero sus compras no han alcanzado los 300 euros este mes, no dispone de descuento.");

			}
		}
	
		
		
	}	
	

}
