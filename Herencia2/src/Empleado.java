import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {

	private String nombre;
	private double sueldo;
	private Date fechaIngreso;
	private int id;
	private static int idSiguiente = 1;
	
	public Empleado(String nombre,int sueldo,int dia,int mes, int año){
		
		this.nombre = nombre;
		this.sueldo = sueldo;
		
		GregorianCalendar fecha = new GregorianCalendar(año,mes-1,dia);
		this.fechaIngreso = fecha.getTime();
		
		objetosCreados();
	}
	public Empleado(String nombre){
		
		this(nombre,1000,1,1,1);
	}
	
	
	public String getNombre(){
		return nombre + " ID: " +id;
	}
	public  double getSueldo(){
		return  sueldo;
	}
	public Date getFechaDeIngreso(){
		return fechaIngreso;
	}
	public void aumentarSueldo(Double porcentaje){
		
		double aumento = (this.sueldo*porcentaje)/100;
		sueldo= sueldo + aumento;
	}
	private void objetosCreados(){
		
		id =idSiguiente;
		idSiguiente++;
	}
	

}
