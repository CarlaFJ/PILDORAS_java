import javax.swing.*;
public class Bucles_for20 {
	public static void main(String[] args) {
		
		String nombre= JOptionPane.showInputDialog("Introduce tu nombre");
		
		String apellidos= JOptionPane.showInputDialog("Introduce tus apellidos");
		
		String edad= JOptionPane.showInputDialog("Introduce tu edad");
		int edad_usuario= Integer.parseInt(edad);
		
		for(int i=0; i<10; i++) {
			
		System.out.println(nombre);	
		
		System.out.println(apellidos);
			
		}
		
		for(int i=10; i>0; i--) {
			
		System.out.println(edad_usuario+1);
			
		}

		
	}

}
