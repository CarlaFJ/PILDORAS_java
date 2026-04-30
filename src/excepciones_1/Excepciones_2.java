package excepciones_1;

import javax.swing.JOptionPane;

public class Excepciones_2 {

	public static void main(String[] args) {

		String email = JOptionPane.showInputDialog("Introduce email");

		try {
			examinaMail(email);

		} catch (Exception e) {
			System.out.println("El email es incorrecto");
			e.printStackTrace();
		}
	}

	static void examinaMail(String email) throws Longitud_email_erroneo {
		int arroba = 0;

		boolean punto = false;

		if (email.length() <= 3) {
			// Lanzar una excepción manualmente aunque esta no tenga nada que ver
			// throw new ArrayIndexOutOfBoundsException();

			// Lanzar una excepción manualmente y propia
			throw new Longitud_email_erroneo("noooo");

		}

		for (int i = 0; i < email.length(); i++) {

			if (email.charAt(i) == '@') {
				arroba++;
			}

			if (email.charAt(i) == '.') {
				punto = true;
			}
		}

		if (arroba == 1 & punto == true) {
			System.out.println("Email correcto");
		}

		else {
			System.out.println("No es correcto");

		}

	}

}

class Longitud_email_erroneo extends Exception {

	// Creamos la clase de la excepcion propia que herede en este caso de exception
	// (comprobado) pero también se podría de RuntimeException (no comprobado)

	// Hacemos dos constructores, el segundo sirve para personalizar el mensaje del
	// error

	public Longitud_email_erroneo() {
	}

	public Longitud_email_erroneo(String mensaje_error) {

		super(mensaje_error);

	}

}
