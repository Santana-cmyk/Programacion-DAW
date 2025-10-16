package entradaDatos;

import java.util.Scanner;

public class PeticionDeDatos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int edadAlumno;
		System.out.print("Dame tú edad:");
		edadAlumno = teclado.nextInt();
		System.out.println("La edad es: " + edadAlumno);
		
		teclado.nextLine(); // Despues de pedir valor numérico y antes de pedir cadena de caracteres.
		String nombre;
		System.out.println("Dime tú nombre:");
		nombre = teclado.nextLine();
		System.out.println("Tu nombre es :" + nombre);
		
		System.out.println("Dime tú peso:");
		double peso;
		peso = teclado.nextDouble();
		System.out.println("Tu peso es: " + peso);

		
	}

}
