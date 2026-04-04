
public class Cadenasdos8 {

	public static void main(String[] args) {
		
		String frase= "(Hoy es un gran día para no aprender Java) ";
		
		System.out.println(frase + "tiene " + frase.length() + " letras ");
		
		String frase_resumen= frase.substring(1, 24);
		String frase_resumendos= frase.substring(28, 41);
	
		/* substring empieza a contar desde 0, el primer número indica posición dónde quiero 
		 * empezar a extraer esa posición incluída, y el otro parámetro indica la posición 
		 * del carácter que no quiero extraer
		 * 
		 * */
		
		System.out.println(frase_resumen + " " + frase_resumendos + " y estudiar mucho :)");

		
		
	}

}
