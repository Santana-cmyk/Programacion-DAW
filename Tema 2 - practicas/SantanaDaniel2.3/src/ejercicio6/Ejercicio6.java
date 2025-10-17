package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
		 
		int num;
		
			do {
				System.out.println("Ingresa un número: ");
				num = teclado.nextInt();
				
				int resultado = Math.powExact(num, 2);
				System.out.println(num +" al cuadrado es: "+ resultado);
				} while (num >= 0);
		
	
		
		
	}

}
