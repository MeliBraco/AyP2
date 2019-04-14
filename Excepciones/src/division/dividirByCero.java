package division;


public class dividirByCero {

	public static void main(String[] args) {
		
		try{
			dividir(15,0);
		}catch(ArithmeticException e){
			System.out.print(e);
		}
		
	}

	public static void dividir(int numerador, int denominador)throws ArithmeticException{
		
		double resultado = numerador/denominador;
		System.out.print(resultado);
	}
}
