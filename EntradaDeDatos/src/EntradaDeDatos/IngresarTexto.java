package EntradaDeDatos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IngresarTexto {

	
	public static void main(String[]args){
		
		InputStreamReader flujoLectura = new InputStreamReader(System.in);
		BufferedReader lector = new BufferedReader(flujoLectura);
		
		System.out.print("ingrese un Texto:");
		
		try {
			String Texto = lector.readLine();
			System.out.print(Texto.length());   //contabiliza la cantidad de letras que tiene la palabra ingresada con los espacios
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
