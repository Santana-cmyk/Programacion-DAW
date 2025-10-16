package bucles;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un número");
		 int num = teclado.nextInt();
		 int contador = 1;
		 int suma = num;
		
		while (num != 0 && contador != 2) {
			System.out.println("Dame un número");
			num = teclado.nextInt();
			contador = contador + 1; //contador++
			suma = suma + num; // acumulador

		}
		System.out.println("La suma es: " + suma);
	}
		
		/*
		 * System.out.println("Introduce el inicio: ");
		 * int inicio = teclado.nextInt(); 
			System.out.println("Introduce el fin: ");
			int fin = teclado.nextInt(); 
			
			int contador = inicio;
			
			
			while (contador >= fin) {
				System.out.print(" "+ contador+" ");
			contador = contador-1;
		 */
		
		

}
			
			
	


