package Vectores;

public class array1 {

	public static void main(String[] args) {
		final int TAMANYO = 20;
		
		int[] numeros; //Declaramos array de enteros
		numeros = new int[TAMANYO]; // Instanciamos el array
		
		for (int posicion = 0; posicion < 20; posicion++) {
			numeros[posicion] = (int) (Math.random()*50); // Inicializamos a cero todas las posiciones
		}
		
		for (int posicion=0; posicion<20; posicion++) {
			System.out.println("El valor de la posición "+ posicion+" es: "+numeros[posicion]);
		}
	}

}
