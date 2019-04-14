package EntradaDeDatos;

import java.io.*;

public class IngresarFichero {


	public static void main(String[] args) {

		try {
			muestraContenido("src/EntradaDeDatos/importar.txt");
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static  void muestraContenido(String archivo)throws IOException {

		//escribe dentro del archivo
		FileWriter escribir= new FileWriter (archivo);
		escribir.write("mi primer programa importando archivos");
		escribir.close();
		
		//lee el archivo
		FileReader flujoArchivo = new FileReader(archivo);
		BufferedReader lector = new BufferedReader(flujoArchivo);
		String Texto = lector.readLine();
		System.out.println("El Archivo ingresado por parametro: " +archivo+ " Contiene : " +Texto);
	}
}
