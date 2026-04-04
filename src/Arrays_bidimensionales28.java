
public class Arrays_bidimensionales28 {

	public static void main(String[] args) {
		
		/*int [][] matrix= {
				{10,15,18,19,21},
				{14,65,85,97,23},
				{17,14,89,59,12},
				{22,11,16,43,69},
		};*/
		
		//Esa sería la forma de acortar el código pero haciendo lo mismo que abajo
		
		int [][] matrix=new int [4][5];
		
		/*Declaro las dos matrices, la primera columna de números pertenece al [4] y la segunda [5]*/
		
		matrix [0][0]=15;
		matrix [0][1]=34;
		matrix [0][2]=19;
		matrix [0][3]=4;
		matrix [0][4]=16;
		
		matrix [1][0]=10;
		matrix [1][1]=53;
		matrix [1][2]=17;
		matrix [1][3]=19;
		matrix [1][4]=7;
		
		matrix [2][0]=46;
		matrix [2][1]=78;
		matrix [2][2]=66;
		matrix [2][3]=32;
		matrix [2][4]=3;
		
		matrix [3][0]=67;
		matrix [3][1]=87;
		matrix [3][2]=94;
		matrix [3][3]=92;
		matrix [3][4]=55;
		
		/*El primero for recorrerá los cuatro valores de la primera matriz "i" y el segundo
		 * for los 5 valores de la segunda "j"*/
		
		
		/*for (int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {*/
		
		
		//Ahora se va a utilizar el for each
		
		for(int[]fila:matrix ) {
			System.out.println();
			
			
			for(int z:fila) {
				System.out.print(z +" ");
				
			}
		}
			
		
				

		
			
			
	
	//System.out.println("Valor almacenado en 1,3: " + matrix[1][3]);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
