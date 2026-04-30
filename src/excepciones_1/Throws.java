package excepciones_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throws {


	public static void main(String[] args) {
	
	pedirDatos();

	

	}
	
	//Esto no tiene mucho sentido ya que el mismo método lanza la excepción y el propio método la captura

	static void pedirDatos() throws InputMismatchException {
		try {

			Scanner entrada = new Scanner(System.in);

			System.out.println("Introduce tu nombre por favor ");

			String nombre_usuario = entrada.nextLine();

			System.out.println("Introduce tu edad por favor");

			int edad = entrada.nextInt();

			System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + (edad + 1) + " años");

		} catch (InputMismatchException e) {

			System.out.println("¿Qué carajo has introducido en la edad?");
		}

		System.out.println("Terminado");
	}

}
	
