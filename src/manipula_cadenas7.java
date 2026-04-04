
public class manipula_cadenas7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre= "Carla";
		
		//System.out.println("Mi nombre es " + nombre);

		System.out.println("Mi nombre tiene " +nombre.length() + " letras");
		
		System.out.println("La primera letra de " + nombre + " es " + nombre.charAt(0));
		//Empieza a contar por el 0
		
		int ultima_letra;
		
		ultima_letra= nombre.length();
		
		System.out.println("Y la última letra de mi nombre es " + nombre.charAt(ultima_letra-1));
	}
	

}
