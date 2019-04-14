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
	//A�ADIR ELEMENTOS A LA VENTA
	
	public void determinarTama�oPorDefault(boolean porDefault){
		
		if(porDefault == true){
			Toolkit pantalla = Toolkit.getDefaultToolkit();
			Dimension dimension = pantalla.getScreenSize();
			setLocation(dimension.width/4, dimension.height/4);
			setSize(dimension.width/2, dimension.height/2);
		
		}else{
			setBounds(400,250,500,500);
		}
	}
	public void a�adirMenu(){
		
		JMenuBar mb=new JMenuBar();
		setJMenuBar(mb);
		
		JMenu menu1=new JMenu("Preferencias"); //JMenu se a�ade a JMenuBar
		mb.add(menu1);

		JMenuItem color1=new JMenuItem("Rojo");//JMenuItem se a�ade JMenu
		menu1.add(color1);
		JMenuItem color2=new JMenuItem("Verde");//JMenuItem se a�ade JMenu
		menu1.add(color2);
		JMenuItem color3=new JMenuItem("Azul");//JMenuItem se a�ade JMenu
		menu1.add(color3);

		JMenu menu2=new JMenu("Opciones"); //JMenu se a�ade a JMenuBar   
		mb.add(menu2);

		JMenuItem a�adir = new JMenuItem("A�adir");
		menu2.add(a�adir);
		JMenuItem editar = new JMenuItem("Editar");
		menu2.add(editar);
		JMenuItem eliminar = new JMenuItem("Elimiar");
		menu2.add(eliminar);
		
	}

}


