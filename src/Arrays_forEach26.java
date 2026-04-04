import javax.swing.*;
public class Arrays_forEach26 {

	public static void main(String[] args) {
		

		/*String[] paises= {"España", "Bolivia", "Canada", "Francia"};*/
		
		String[] paises= new String[5];
		
		for(int i=0;i<5; i++) {
			paises[i]=JOptionPane.showInputDialog("Introduce un país "+ (i+1));
		}
		
		for(String países2: paises) {
			
			System.out.println("País: "+ países2);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
