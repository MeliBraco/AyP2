package Char;

public class ContabilizarCaracteres {

	public static void main(String[]arg){
		
		String MiCadena = new String("Estoy aprendiendo sobre excepciones");
		char letraSegunPocision;
		
		try{
			letraSegunPocision = MiCadena.charAt(80);
			System.out.print(letraSegunPocision);
		}catch(IndexOutOfBoundsException e){
			System.out.print("No existe una letra en la pocsison indicada " + e);
		}
	}
	
	
}
