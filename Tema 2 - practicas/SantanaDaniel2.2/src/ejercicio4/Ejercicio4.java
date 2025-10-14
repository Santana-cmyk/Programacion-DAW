package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
		
		System.out.print("Tu nota en programación: ");
		double nota1 = teclado.nextDouble();
		System.out.print("Tu nota en base de datos: ");
		double nota2 = teclado.nextDouble();
		System.out.print("Tu nota en lenguaje de marcas: ");
		double nota3 = teclado.nextDouble();
		System.out.print("Tu nota en sistemas informáticos: ");
		double nota4 = teclado.nextDouble();
		
		double media = (nota1+nota2+nota3+nota4)/4;
		
		
		double redondeoArriba = Math.ceil(media);
		double redondeoAbajo = Math.floor(media);
		
		if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 ||
	        nota3 < 0 || nota3 > 10 || nota4 < 0 || nota4 > 10) {
	            System.out.println("Error: Las notas deben estar entre 0 y 10.");
		} else {
				System.out.println("Tu nota media redondeada hacia arriba: " + redondeoArriba);
				System.out.println("Tu nota media redondeada hacia abajo: " + redondeoAbajo);
				
			if (media > 8) {
				System.out.println("Puedes acceder a los estudios realizados.");
			} else { 
				System.out.println("La nota media no es suficiente para realizar los estudios que desea");
			}
		}
					

	}

}
