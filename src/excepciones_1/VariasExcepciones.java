package excepciones_1;

import javax.swing.JOptionPane;

public class VariasExcepciones {

	public static void main(String[] args) {
		
		//No controladas
		
		try {
		division();

		}catch(ArithmeticException e) {
			
			System.out.println("No se puede dividir entre 0");		
			
			System.out.println("Se ha generado un error de este tipo: " + e.getClass().getName());
		
		}catch (NumberFormatException e) {
			
			System.out.println("Solo se pueden introducir números");
			System.out.println(e.getMessage());
		}
		
	}
	
	static void division() {
		int num1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo"));
		
		int num2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor"));
		
		System.out.println("el resultado es: " + num1/num2);

	}

}
