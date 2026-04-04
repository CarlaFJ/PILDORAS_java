import java.util.*;

public class Uso_switch_moderno {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce día de la semana , por favor");
		
		String dia_semana=entrada.nextLine();
		
		String resultado=switch(dia_semana) {
		
		case "Lunes", "lunes"->"Laborable";
		
		case "Martes", "martes"->"Laborable";
		
		case "Miércoles", "miercoles"->"Laborable";
		
		case "Jueves", "jueves"->"Laborable";
		
		case "Viernes", "viernes"->"Laborable";
		
		// case "Lunes", "Martes", ... ->"Laborable";
		
		default->{
		
			System.out.println("Procesando...");
			yield "Festivo";
			
		}
		
		};
		
		System.out.println(resultado);
		
		entrada.close();
		

	}

}
