import java.util.*;
public class Scanner10 {

	public static void main(String[] args) {
		
		 
		Scanner entrada= new Scanner (System.in);
		
		System.out.println("Introduce tu nombre y tu edad por favor (en ese orden) ");
		
		
		//Hay que utilizar el objeto perteneciente a la clase Scanner delante del método (entrada)
		 String nombre_usuario = entrada.nextLine();
		 
		 int edad_usuario = entrada.nextInt();
		 
		 System.out.println( "Hola " + nombre_usuario + " tu nombre tiene " + nombre_usuario.length() + " letras " + 
		 "y el año que viene tendrás " + ( ++edad_usuario) + " años");
		 
		 entrada.close();
	}

}
