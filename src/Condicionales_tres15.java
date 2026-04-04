import javax.swing.*;
import java.util.*;
public class Condicionales_tres15 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner (System.in);
		
		System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Circulo");

		int figura=entrada.nextInt();
		
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
			
			
		}
		
		entrada.close();
		
	}

}
