package Temporizador;



public class uso_temporizador {

	public static void main(String[] args) {
		
		Reloj reloj = new Reloj(2000, true);
		reloj.iniciar();
		reloj.mostrarCuadro();
		reloj.apagar();
	}
}
