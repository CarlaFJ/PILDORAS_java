import java.util.*;
public class Bucles_tres18 {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner (System.in);
		
		int aleatorio=(int)(Math.random()*100);
		
		int numero=0;
		int intentos=0;
		
		/* do...while, Permite que aunque no se cumpla la condición 
		 el código se ejecute al menos una vez */
		
		/* Ya que aunque el número aleatorio sea 0 (no cumpliría la condición de ser 
		 * distinto de 0) el código se ejecutará al menos una vez */
		
		do {
			intentos++;	
			System.out.println("Introduce un número");
			numero=entrada.nextInt();
			
			if(aleatorio<numero) {
				System.out.println("Más bajo");
			}
			
			else if(aleatorio>numero){
				System.out.println("Más alto");
			}
			
		}while(numero!=aleatorio);
		
		System.out.println("Correcto. Lo has conseguido en " + intentos+ " intentos");
		
		
		
		
		
		
		
		
	}

}
