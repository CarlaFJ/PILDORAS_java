import java.util.*;
public class Bucles_dos17 {

	public static void main(String[] args) {
		
	
		//Random genera números decimales por eso hay que multiplicarlo
	
		Scanner entrada= new Scanner (System.in);
		
		int aleatorio=(int)(Math.random()*100)+1; //casting (int). Importante el uso del parentésis
		//el +1 es importante para generar un número comprendido entre 1 y 100
		
		int numero=0;
		int intentos=0;
		
		// "!=" siginifica: distinto de..
		while(numero!=aleatorio) {
		intentos++;	
		System.out.println("Introduce un número");
		numero=entrada.nextInt();
		
			if(aleatorio<numero) {
			System.out.println("Más bajo");
			}
		
			else if(aleatorio>numero){
			System.out.println("Más alto");
			}
		
		
		}
		
		System.out.println("Correcto, lo has conseguido en " +intentos+ " intentos");
		
		entrada.close();

	}

}
