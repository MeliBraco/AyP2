package ordenarPersonas;

public class Persona implements Comparable<Persona> {

	private int dni;
	private int edad;
	private String nombre;
	
	public Persona(String nombre,int edad,int dni){
	
		this.edad = edad;
		this.dni = dni;
		this.nombre=nombre;
	}
	
	public String getDatos(){
		return "NOMBRE: " +nombre +" EDAD: "+edad+ " DNI: "+dni;
	}
	public int getEdad(){
		return this.edad;
	}

	@Override
	public int compareTo(Persona persona) {

		return (this.getEdad() - persona.getEdad());
	}
}