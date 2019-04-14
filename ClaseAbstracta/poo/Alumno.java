package poo;

public class Alumno extends Persona{
	
	private int legajo;
	private String carrera;
	
	public Alumno(String nombre,int legajo,String carrera){
	
		super(nombre);
		this.legajo = legajo;
		this.carrera = carrera;
	}

	public String getDescripcion(){
		return "NUMERO DE LEGAJO: "+legajo+ " / CARRERA: "+carrera;
		
	}
	
	public int getLegajo(){
		return legajo;
	}
	public String getCarrera(){
		return carrera;
	}
}
