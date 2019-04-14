package EntradaDeDatos;

import java.io.*;

public class IngresarEntero {

	public static void main(String[] args) {

		InputStreamReader flujoLectura = new InputStreamReader(System.in);
		BufferedReader lector = new BufferedReader(flujoLectura);

		int x;
		String datoIngresado;
		System.out.println( "Ingrese un entero" );

		try  {
			datoIngresado = lector.readLine();                 // puede lanzar IOException
			x = Integer.parseInt(datoIngresado);              // puede lanzar NumberFormatException 
			System.out.print("la mitad del valor ingresado es: " + x/2);

		}catch(IOException e ){ 
			System.out.println( e ); 
		}
		catch(NumberFormatException e ){ 
			
			System.out.println( e ); 
		}
	}
}
