package interfaceGrafica2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

@SuppressWarnings("serial")
public class Ventana  extends JFrame{

	public Ventana(){
		
		setVisible(true);
		setResizable(true);
	
	}
	//AÑADIR ELEMENTOS A LA VENTA
	
	public void determinarTamañoPorDefault(boolean porDefault){
		
		if(porDefault == true){
			Toolkit pantalla = Toolkit.getDefaultToolkit();
			Dimension dimension = pantalla.getScreenSize();
			setLocation(dimension.width/4, dimension.height/4);
			setSize(dimension.width/2, dimension.height/2);
		
		}else{
			setBounds(400,250,500,500);
		}
	}
	public void añadirMenu(){
		
		JMenuBar mb=new JMenuBar();
		setJMenuBar(mb);
		
		JMenu menu1=new JMenu("Preferencias"); //JMenu se añade a JMenuBar
		mb.add(menu1);

		JMenuItem color1=new JMenuItem("Rojo");//JMenuItem se añade JMenu
		menu1.add(color1);
		JMenuItem color2=new JMenuItem("Verde");//JMenuItem se añade JMenu
		menu1.add(color2);
		JMenuItem color3=new JMenuItem("Azul");//JMenuItem se añade JMenu
		menu1.add(color3);

		JMenu menu2=new JMenu("Opciones"); //JMenu se añade a JMenuBar   
		mb.add(menu2);

		JMenuItem añadir = new JMenuItem("Añadir");
		menu2.add(añadir);
		JMenuItem editar = new JMenuItem("Editar");
		menu2.add(editar);
		JMenuItem eliminar = new JMenuItem("Elimiar");
		menu2.add(eliminar);
		
	}

}


