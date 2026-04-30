package excepciones_1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Excepciones_1 {

	public static void main(String[] args) {
		

		try {
			File archivo = new File ("imagen.jpg");
			BufferedImage imagen = ImageIO.read(archivo);
			
			System.out.println("Imagen cargada correctamente");
			
		} catch (IOException e){
			System.out.println("Error: no se pudo cargar la imagen");
			System.out.println("Detalle: " + e.getMessage());
		}
		
	}

}
