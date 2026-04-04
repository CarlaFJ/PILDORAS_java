import java.util.*;
public class Condicionales_ternario {
	public static void main(String[] args) {
		
		Scanner entrada= new Scanner (System.in);
		
		System.out.println("introduce tu edad");
		
		int edad=entrada.nextInt();		
		
		String resultado=(edad<18)? "Eres menor de edad": "Eres mayor de edad";
		
		System.out.println(resultado);

		
		
	}

}

