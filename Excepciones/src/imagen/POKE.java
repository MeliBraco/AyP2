package imagen;

import java.awt.Graphics;
import java.awt.Image;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;



public class POKE {


	public static void main(String[] args) {


		JFrame ventana = new JFrame();
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setBounds(250, 50, 700, 800);

		laminaConImagen lamina = new laminaConImagen();
		ventana.add(lamina);

	}
}

class laminaConImagen extends JPanel{

	public void paintComponent(Graphics g){

		super.paintComponent(g);
		g.drawString("Mi primer lamina con imagenes, utilizando excepciones", 75, 15);//titulo

		//incorporacion de imagen
		try {
			Image imagen = ImageIO.read(new File ("src/imagen/niña2.png"));
			g.drawImage(imagen, 100, 50, null);
		}catch (IOException e) {
			System.out.print("La imagen no se encuentra");
		}
	}
}



