import javax.swing.*;
public class Bucles_for_factorial23 {

	public static void main(String[] args) {
		

		int resultado=1;
		
		int numero=Integer.parseInt(JOptionPane.showInputDialog("introduce un número"));
		
		for (int i=numero; i>0; i--) {
			
			resultado=resultado*i;
			
		}
		
		System.out.println("El factorial de "+ numero + " es " + resultado);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
