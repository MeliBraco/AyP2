package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado extends Persona {

	
	private double sueldo;
	private Date fechaIngreso;
	private int id;
	private static int idSiguiente = 1;
	
	
	
	public Empleado (String nombre,int sueldo,int dia,int mes, int año){
		
		super(nombre);
		this.sueldo = sueldo;
		
		GregorianCalendar fecha = new GregorianCalendar(año,mes-1,dia);
		this.fechaIngreso = fecha.getTime();
		
		objetosCreados();
	}
	
	
	//metodos abstractos heredados de la clase padre
	
	public String getDescripcion(){
		return "ID: " +id+  " / FECHA DE INGRESO: " + fechaIngreso +   " /  SUELDO : "+ sueldo;
	}
	
	
	public int getId(){
		return id;
	}
	public  double getSueldo(){
		return  sueldo;
	}
	public Date getFechaDeIngreso(){
		return fechaIngreso;
	}
	public void aumentarSueldo(Double porcentaje){
		
		double aumento = (this.sueldo*porcentaje)/100;
		sueldo = sueldo + aumento;
	}
	private void objetosCreados(){
		
		id =idSiguiente;
		idSiguiente++;
	}
	
	
	
}
