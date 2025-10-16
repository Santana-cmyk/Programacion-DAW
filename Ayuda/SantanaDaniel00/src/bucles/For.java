package bucles;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

	
		/*
		 * System.out.println("Ingrese un valor");
		 * int num = teclado.nextInt();
		
		for (int contador=10; contador >=1; contador--) {
			System.out.println(num + " multiplicado por " + contador+" = "+ num*contador);
		}
		 */
		
		System.out.print("Ingrese un valor inicial: ");
		int num1 = teclado.nextInt();
		System.out.print("Ingrese un valor final: ");
		int num2 = teclado.nextInt();
		
		for (int contador = num1; contador <= num2; contador++ ) {
			System.out.println("Analizando el valor "+ contador);
			if (contador % 5 == 0) {
				System.out.println(contador + " es múltiplo de 5 ");
			}
		}
	}

}
