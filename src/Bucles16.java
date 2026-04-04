import javax.swing.*;
public class Bucles16 {

	public static void main(String[] args) {
	
		
		String clave= "Carla";
		
		// La string clave y password son diferentes
		String password ="";
		
		while (clave.equals(password)==false) {
			
			password= JOptionPane.showInputDialog("Introduce la contraseña, por favor");
		
		
		// Si clave y password siguen siendo diferentes se imprimirá lo de abajo, sino saltará fuera del while
		
		if (clave.equals(password)== false) {
			System.out.println("Contraseña incorrecta"); }
		
		}

		System.out.println("Contraseña correcta, acceso permitido");
	
		
	}

}
