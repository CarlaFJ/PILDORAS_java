package excepciones_1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Areas_peso {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner (System.in);
		
		System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Circulo");
		
		try{

		int figura=entrada.nextInt();
		
		entrada.close();
		
		}catch(Exception e) {
			
			System.out.println("Ha ocurrido un error");
			
		}finally {
			
			//De esta forma nos aseguramos q siempre se va a cerra la conexión con Scanner
			entrada.close();
			
		}
		
		switch (figura){
		
		case 1: 
			int lado= Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			System.out.println("El área del cuadrado es " + Math.pow(lado,2));
			 break;
			 
		case 2:
			int base= Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			int altura= Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			
			System.out.println("El área del rectángulo es " + base*altura);
			break;
			
		case 3:
			base= Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			altura= Integer.parseInt(JOptionPane.showInputDialog("introduce la altura"));
			int multiplicacion= base*altura;
			
		// No he declarado nuevas variables porque he reciclado las que ya existían
			
			System.out.println("El área del triángulo es "+ multiplicacion/2);
			break;
			
		case 4:
			int radio= Integer.parseInt(JOptionPane.showInputDialog("Introduce la radio"));
			System.out.print("El área del circulo es ");
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
			break;
			
		default: 
			System.out.println("La opción no es correcta");
		}
	
	//........................................................................................................................
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
		
		System.out.println("Si eres un hombre tu peso ideal es: " + (altura-110) + " Kg");
		
		System.out.println("Si eres una mujer tu peso ideal es: " + (altura-120) + " Kg");

		
		
		
	}
	
	static int figura;

}
