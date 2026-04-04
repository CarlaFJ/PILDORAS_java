import java.util.*;
public class Condicionales13 {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner (System.in);
		
		System.out.println("Introduce tu edad por favor");
		
		int edad=entrada.nextInt();
		
		if(edad>=18 && edad<104) {
			System.out.println("Eres mayor de edad");
		}
		
		else if(edad<18) {
			System.out.println("Eres menor de edad");
		}
		
			else {
			System.out.println("Es humanamente imposible");
		}

		
		entrada.close();
		
	}

}
