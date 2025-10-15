package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un número: ");
		 int num1 = teclado.nextInt();
		System.out.println("Dame otro número: ");
		 int num2 = teclado.nextInt();
		System.out.println("Otro: ");
		 int num3 = teclado.nextInt();
		 
		 
		 int suma = num1+num2+num3;
		 double media = suma/3;
		
		 while (num1 >0 || num2>0||num3>0) { 
			 System.out.println("La suma es: " +suma);
			 System.out.println("La media es: " +media);
		 }
	}

}
