package interfaceGrafica2;

import javax.swing.JFrame;


public class uso_marco {

	public static void main(String[] args) {
	
		Ventana ventana = new Ventana();

		ventana.setTitle("Probando Interfaces Graficas");
		ventana.a�adirMenu();
		ventana.determinarTama�oPorDefault(true);
		
			Lamina lamina = new Lamina();
			ventana.add(lamina);
				
				lamina.a�adirTitulo();
				lamina.a�adirEtiqueta();
				lamina.a�adirBotones();
				lamina.a�adirCampoDeTexto();
				
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
