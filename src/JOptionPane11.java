import javax.swing.*; 
public class JOptionPane11 {

	public static void main(String[] args) {
		
		String nombre_usuario= JOptionPane.showInputDialog("Introduce tu nombre por favor ");

		String edad = JOptionPane.showInputDialog("Introduce tu edad por favor");
		
		int edad_usuario =Integer.parseInt(edad);
		
		System.out.println("Hola " + nombre_usuario + " tu nombre empieza por " + nombre_usuario.charAt(0)  + 
				" y el año que viene tendrás " + (edad_usuario + 1) + " años " );
	}

}
