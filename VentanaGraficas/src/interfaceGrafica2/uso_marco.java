package interfaceGrafica2;

import javax.swing.JFrame;


public class uso_marco {

	public static void main(String[] args) {
	
		Ventana ventana = new Ventana();

		ventana.setTitle("Probando Interfaces Graficas");
		ventana.añadirMenu();
		ventana.determinarTamañoPorDefault(true);
		
			Lamina lamina = new Lamina();
			ventana.add(lamina);
				
				lamina.añadirTitulo();
				lamina.añadirEtiqueta();
				lamina.añadirBotones();
				lamina.añadirCampoDeTexto();
				
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
