package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {

	Scanner teclado = new Scanner(System.in);
	
	
	System.out.print("Nombre: ");
	String nombre = teclado.nextLine();
	
	System.out.print("Apellidos: ");
    String apellidos = teclado.nextLine();
	
	System.out.print("Edad: ");
	int edad = teclado.nextInt();
	
	System.out.print("Salario deseado: ");
	double salario = teclado.nextDouble();
	
		if (salario > 30000 || edad > 45) {
			System.out.println("Lo sentimos pero no cumple nuestro perfil");
		} else {
			System.out.println("Años de experiencia: ");
			int años = teclado.nextInt();
			System.out.println("Proyectos trabajados anteriormente: ");
			int proyectos = teclado.nextInt();
			
			if (años > 2 && proyectos > 3) {
				System.out.println("Enhorabuena, usted ha sido contratado");
			} else {
				System.out.println("Lo sentimos pero no cumple nuestro perfil");

			}
		} 
			
		}
	} 

