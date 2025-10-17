package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
		 int num, numPositivos = 0, numNegativos = 0, sumaPositivos = 0, sumaNegativos = 0, ceros = 0;
	     double mediaPositivos = 0.0, mediaNegativos = 0.0;

		for (int contador=1; contador <=10; contador++) {
			System.out.println("Ingrese el valor "+contador+" :");
			num = teclado.nextInt();
			
			if (num>0) {
				sumaPositivos= sumaPositivos + num;
				numPositivos= numPositivos+1;
			} else if (num<0) {
				sumaNegativos= sumaNegativos + num;
				numNegativos= numNegativos+1;
			} else {
				ceros = ceros + 1;
			}
			
		} if (numPositivos > 0) {
		    mediaPositivos =  sumaPositivos / numPositivos;
			System.out.println("Media Positiva: "+mediaPositivos);
			
		}  if(numNegativos>0) {
			mediaNegativos = sumaNegativos / numNegativos;
			System.out.println("Media Negativa: "+mediaNegativos);
		}
		
		System.out.println("Número de ceros: "+ceros);
		



	}

}
