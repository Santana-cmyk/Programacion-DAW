/*
 * 
 * 
 */
package bucles;

import java.util.Scanner;

public class Repetir {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//int numero,contador = 0, suma = 0;
		
		//do { 
		//	System.out.println("Dame ún número: (0 para terminar) ");
		//	numero =teclado.nextInt();
		//	 if (numero !=0) {
		//		 contador = contador +1;
		//	 }
		//	suma = suma + numero;
			
	//	} while (numero !=0);
		
		//contador = contador -1; //Resto 1 al contador para no contar el 0
	//	System.out.println("La suma es: " + suma + " la cantidad de numeros es: " + contador);
		
		
		
		
			
			
			System.out.println("Introduce el inicio: ");
			 int inicio = teclado.nextInt();
			
			System.out.println("Introduce el fin: ");
			int fin = teclado.nextInt(); 
			int contador;
			
			if (inicio <= fin){ //secuencia creciente
				System.out.println("Secuencia desde " + inicio + " hasta " + fin);
				contador = inicio;
				do {
					System.out.print(" "+ contador);
					contador = contador +1;
				} while (contador <= fin);
				
			} else { 			//Secuencia decreciente
				contador = fin;
				do {
					System.out.print(" "+ contador);
					contador = contador -1;
				} while (contador >=inicio);
			}
				 
			
			
			
	}
	
	

}
