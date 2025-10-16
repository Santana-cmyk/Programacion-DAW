package estructuraIF;

import java.util.Scanner;

public class IFpreguntas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Aciertos: ");
		int aciertos = teclado.nextInt();
		System.out.println("Fallos: ");
		int fallos = teclado.nextInt();

		if (aciertos + fallos > 20) {
			System.out.println("Datos erróneos");
		} else {
			double nota = aciertos - 0.5 * fallos - 0.25;
			System.out.println("tu nota es: " + nota);
		}
		
		
		
	}  
}
