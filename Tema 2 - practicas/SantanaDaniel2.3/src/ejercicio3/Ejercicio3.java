package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int contador=100;

		do {
			System.out.println(contador);
			contador = contador -1;
		}	while (contador >0);		
	}

}
