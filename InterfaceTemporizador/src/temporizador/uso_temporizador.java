package temporizador;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class uso_temporizador {

	public static void main(String[] args) {
		
		dameHora reloj = new dameHora();
		Timer miTemporizador = new Timer(5000, reloj);
		
		miTemporizador.start();
		JOptionPane.showMessageDialog(null, "Pulsar aceptar para detener");
		System.exit(0);

	}
}
