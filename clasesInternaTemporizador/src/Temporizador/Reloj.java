package Temporizador;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import java.util.*;



public class Reloj {


	private int intervalo;
	private boolean sonido;

	public Reloj(int intervalo, boolean sonido){

		this.intervalo = intervalo;
		this.sonido = sonido;
	}

	public void iniciar(){

		dameHora evento = new dameHora();
		Timer miTemporizador = new Timer(intervalo, evento);
		miTemporizador.start();
	}
	public void mostrarCuadro(){
		JOptionPane.showMessageDialog(null, " Para detener presione aceptar");
	}
	public void apagar(){
		System.exit(0);
	}


	
			private class dameHora implements ActionListener{
		
				public void actionPerformed(ActionEvent evento) {
		
					Date hora = new Date ();
					System.out.println("Devuelve la hora cada 5sg"+hora);
					
					if(sonido == true){
						Toolkit.getDefaultToolkit().beep();
		
					}
				}
			}



}
