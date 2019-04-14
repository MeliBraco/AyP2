
public class veterinaria {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		animal animal1 = new animal("logan","ovejero",20,"perro");
		animal animal2 = new animal("Marta","siames",1,"gato");		

		System.out.println(animal1.getDatos());
		System.out.println(animal2.getDatos());
			
	}
}

class animal{

	private final String nombre; //una vez ingresado el nombre no quiero que se pueda modificar
	private String tipoDeAnimal;
	private String raza;
	private int edad;
	private int id;
	private static int NextId = 1; //atributo de la clase, utilizado por todos los objetos 
	

	public animal(String nombre,String raza,int edad,String tipoDeAnimal){
	
		this.nombre= nombre;
		this.tipoDeAnimal=tipoDeAnimal; 
		this.edad = edad;
		this.raza =raza;
		
		generarLista();
	}

	private void generarLista(){
		
		id = NextId;
		NextId++;
	}
	
	public String getDatos(){
		return " NUMERO IDENTIFICATORIO: "+id+" Tipo de animal: " +tipoDeAnimal+ " Raza: " +raza+
				" Nombre del animal: "+nombre+ " edad: "+edad;
	}
	
	
	public void setRaza(String cambRaza){
		this.raza =cambRaza;
	}
	public void setEdad(int cambEdad){
		this.edad =cambEdad;
	}
	public void setTipo(String cambTipo){
		this.tipoDeAnimal =cambTipo;
	}
		
}

	
