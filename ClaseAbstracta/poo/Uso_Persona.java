package poo;

public class Uso_Persona {

	
	public static void main (String[] arg){
		
		
		Persona[] misPersonas = new Persona[2];
		misPersonas[0] = new Empleado("Ana Lopez", 200, 4,9,1985);
		misPersonas[1] = new Alumno("maria Gonzalez", 36987, "Ing.Sistemas");
		
		for(Persona p: misPersonas){
			System.out.println(p.getNombre()+ ", "+ p.getDescripcion() );
		}
	}
}
