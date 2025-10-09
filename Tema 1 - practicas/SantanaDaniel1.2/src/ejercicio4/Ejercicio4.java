/*
 * Descripción: Ejercicio 4 Tipos Enumerados
 * Autor: Daniel Santana
 * Fecha: 26/09/25
 */

package ejercicio4;

public class Ejercicio4 {
	 	
		//Creamos un tipo enumerado
		
		public enum Tamaños {PEQUEÑO, MEDIANA, GRANDE, EXTRAGRANDE};

	public static void main(String[] args) {
		
		//Creamos las variables
		
		Tamaños pantalon = Tamaños.PEQUEÑO ;
		Tamaños gorro = Tamaños.MEDIANA ;
		Tamaños camiseta = Tamaños.GRANDE ;
		Tamaños chaqueta = Tamaños.EXTRAGRANDE ;
		
		//Mostramos por consola el valor de las variables

		System.out.println("El tamaño del pantalón es: " + pantalon);
		System.out.println("El tamaño del gorro es: " + gorro);
		System.out.println("El tamaño de la camiseta es: " + camiseta);
		System.out.println("El tamaño de la chaqueta es: " + chaqueta);
		
		
	}

}
