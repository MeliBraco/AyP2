package interfaceGrafica2;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class Lamina extends JPanel{

	
	public void paintComponent(Graphics grafico){
		
		super.paintComponents(grafico);
		
		//STRING
		grafico.drawString("PROBANDO PROGRAMA: ", 160, 115);
		
		Graphics2D grafico2D = (Graphics2D) grafico;

		//RECTANGULO
		Rectangle2D rectangulo = new Rectangle2D.Double(99, 250, 300, 150);
		grafico2D.setPaint(Color.BLUE);
		grafico2D.fill(rectangulo);
		//ELIPSE
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		Color colorElipse = new Color(100,150,200);
		grafico2D.setPaint(colorElipse);
		grafico2D.fill(elipse);
		
		
	}

	public void añadirEtiqueta(){
		
		JTextField etiqueta  = new JTextField();
		etiqueta.setText("  DATOS ");
		etiqueta.setColumns(50);
		add(etiqueta);
	}
	public void añadirBotones(){
		
		JButton aceptar = new JButton("aceptar");
		add(aceptar);
		JButton cancelar = new JButton("cancelar");
		add(cancelar);
		
	}		
	public void añadirCampoDeTexto(){
	
		JTextArea cuadroDeTexto = new JTextArea(10,40);
		cuadroDeTexto.setText("INTODUZCA LA INFORMACION NECESARIA:");
		cuadroDeTexto.setEditable(true);
		cuadroDeTexto.setColumns(50);
		cuadroDeTexto.setLineWrap(true);
		cuadroDeTexto.setWrapStyleWord(true);
		add(cuadroDeTexto);
	}
	public void añadirTitulo(){
		
		JLabel titulo= new JLabel();
		titulo.setText("Hola Mundo");
		add(titulo);
	}
}
