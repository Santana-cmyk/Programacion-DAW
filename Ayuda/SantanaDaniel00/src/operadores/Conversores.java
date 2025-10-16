package operadores;

public class Conversores {

	public static void main(String[] args) {
		
		byte monederoPequenyo = 10;
		int monederoMediano = 10000;
		long monederoGrande = 10000001;
		
		//monederoGrande = monederoMediano; //conversión automática
		//monederoMediano = monederoPequenyo;
		
		monederoPequenyo = (byte) monederoMediano;  //cast
		
		System.out.println("Monedero pequeño " + monederoPequenyo);
		System.out.println("Monedero mediano " + monederoMediano);
		System.out.println("Monedero grande " + monederoGrande);


	}

}
