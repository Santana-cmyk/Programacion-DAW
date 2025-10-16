package estructuraIF;

import java.util.Scanner;

public class condicionalSwitch {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	
		System.out.print("Nota: ");
		int nota = teclado.nextInt();
		
		switch (nota) {
			case 0,1,2,3,4: {
				System.out.println ("insuficiente");
		        break;
			}    
		    case 5,6: {
		    	System.out.println ("Bien");
			    break;
		    }  
		    case 7,8: {
		    	System.out.println ("Notable");
			    break;
		    }
		    case 9,10: {
		    	System.out.println ("Sobresaliente");
			    break;
		    }
		     default: {
				    System.out.println ("Nota no válida");
		     }      
		    	 	
		}
	}
	

}
