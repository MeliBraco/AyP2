package figuras;



import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;

public class uso_figuras {

	public static void main(String[] args) {
	
		Ventana ventana = new Ventana();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			Lamina lamina = new Lamina();
			ventana.add(lamina);
	
		
	}

}



@SuppressWarnings("serial")
class Ventana extends JFrame{
	
	public Ventana(){
		
		setVisible(true);
		setResizable(false);
		setBounds(380,200,800,600);
		
	}
	
}



@SuppressWarnings("serial")
class Lamina extends JPanel{
	
	public Lamina (){
		
		añadirTitulo();
	}
	
	private void añadirTitulo(){
		
		JLabel titulo = new JLabel();
		titulo.setText("Figuras Geometricas realizadas con Graphics2D");
		Font fuente = new Font("Arial", 2, 15);
		titulo.setFont (fuente);
		add(titulo);
	}
	
	public void paintComponent(Graphics figuras){

		super.paintComponents(figuras);
		Graphics2D figuras2D = (Graphics2D) figuras;

		//RECTANGULO
		Rectangle2D rectangulo = new Rectangle2D.Double(40, 70, 220, 150);
		figuras2D.setPaint(Color.MAGENTA);
		figuras2D.draw(rectangulo);
		
		//ELIPSE
		Ellipse2D elipse = new Ellipse2D.Double(300,70,150,150);
		figuras2D.setPaint(Color.CYAN.darker().darker());
		figuras2D.fill(elipse);

		//ARCO
		Arc2D arco = new Arc2D.Double(500,70,150,150,120,120,Arc2D.OPEN);
		figuras2D.setPaint(Color.RED);
		figuras2D.draw(arco);
		
		//LINEA
		Line2D linea = new Line2D.Double(600,70,700,200);
		figuras2D.setPaint(Color.BLUE);
		figuras2D.draw(linea);
		
		//RECTANGULO REDONDEADO
		RoundRectangle2D rectanguloRedondeado = new  RoundRectangle2D.Double(40, 250, 220, 150, 50, 50);
		figuras2D.setPaint(Color.ORANGE.brighter().brighter());
		figuras2D.fill(rectanguloRedondeado);
	}
	
}