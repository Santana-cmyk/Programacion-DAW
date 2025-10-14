/*
 * Descripción:
 * Este programa es como una mini entrevista de trabajo. Primero te pide tu nombre, apellidos, edad
 * y el salario que te gustaría ganar. Si tu edad es menor o igual a 45 y el salario que pides es
 * menor o igual a 30.000€, entonces te pregunta cuántos años de experiencia tienes y cuántos proyectos
 * has hecho. Si tienes más de 2 años de experiencia y más de 3 proyectos, te contratan. Si no, te dicen
 * que no cumples el perfil.
 *
 * Autor: Daniel Santana Bueno
 * Fecha: 10/10/25
 */
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

