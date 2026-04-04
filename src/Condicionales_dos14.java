import java.util.*;
public class Condicionales_dos14 {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner (System.in);
		System.out.println("Introduce tu edad por favor");

		int edad=entrada.nextInt();
		
		if (edad<=12) {
		
			System.out.println("Eres un niño");
		}
		
		else if (edad<18) {
			System.out.println("Eres un adolescente");
		}
		
		else if (edad<40){
			System.out.println("Eres un adulto joven");
		}
		
		else if (edad<60){
			System.out.println("Eres un adulto maduro");
		}
		
		else if (edad<=110){
			System.out.println("Eres un anciano");
				
		}
		
		else if (edad>110){
			System.out.println("Esa edad es por ahora humanamente imposible de alcanzar");
		}
		
		entrada.close();
		
	}

}
