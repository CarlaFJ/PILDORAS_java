package poo;

public class Uso_coche {

	public static void main(String[] args) {
		
		coche Renault= new coche(); //INSTANCIAR UNA CLASE. RENAULT ES UN EJEMPLAR DE CLASE COCHE
		
		System.out.println(Renault.dime_largo());
		
		System.out.println("El peso del coche es: " + Renault.getPeso());
		
	}

}
