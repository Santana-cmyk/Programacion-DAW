/* 
 * Descripción: Solicitud de datos al usuario y calculos de salario.
 * Autor: Daniel Santana bueno
 * Fecha: 01/10/25
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		//Solicitamos los datos al usuario.
		
		System.out.print("Dígame su nombre: ");
        String  nombre = datos.nextLine();
        
		System.out.print("Dígame sus apellidos: ");
		String apellidos = datos.nextLine();
		
		System.out.print("Indique su fecha de nacimiento: ");
		String fecha = datos.nextLine();
		
		System.out.print("Indique su salario bruto: ");
		double salariobruto = datos.nextDouble();
		
		System.out.print("¿Cuántos años lleva trabajando en la empresa?: ");
		int anios = datos.nextInt();


        //A partir de los datos, vamos a calcular el salario neto y mostrar una ficha del usuario

		double IRPF = 0.15; //Declaro el IRPF
		double salarioneto = salariobruto - IRPF; //Declaramos la variable y la operación.
		
		double aumento = salarioneto * 0.02 * anios; //Declaramos el aumento del 2% por años trabajados.
		double salariototal = salarioneto + aumento; // Declaramos el salario más el aumento.
		
		System.out.println("Estimad@ " + nombre+ " " + apellidos + ", su salario bruto es de: " + salariobruto + "euros, "+
		"teniendo en cuenta un IRPF del 15% su salario neto es: " + salarioneto +" euros");
		
		System.out.println("Debido a sus " + anios + " años trabajando en la empresa, su salario se "
		+ "incrementará un 2% por cada año. El aumento es de " + aumento + " y el salario total es " + salariototal);

		
		
	}

}
