import javax.swing.*;
public class Bucles_for21 {

	public static void main(String[] args) {
		
		boolean arroba=false;
		String email= " ";
		
		while(arroba==false) {
			email= JOptionPane.showInputDialog("Introduce email");
		
			for (int i=0; i<email.length(); i++) {
				
				if(email.charAt(i)=='@') {
					arroba=true;
					break; }
				}
				
			}
		
		if(arroba==true) {
			System.out.println("Email correcto");
		}

	}

}
