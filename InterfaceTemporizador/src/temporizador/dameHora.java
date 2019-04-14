package temporizador;


import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class dameHora implements  ActionListener  {

	
	
	public void actionPerformed(ActionEvent evento) {
		
		Date hora = new Date();
		System.out.println("Te devuelvo la hora cada 5sg: "+hora);
		Toolkit.getDefaultToolkit().sync();
		
	}

	
	
}
