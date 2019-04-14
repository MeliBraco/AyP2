
public class Camioneta extends Coche{

	//atributos propios de la clase Camioneta
	private int capacidadDeCarga;
	
	public Camioneta(int capacidadDeCarga){
		
		super(); //importamos el constructor de la clase padre(Coche), con sus respectivos atributos
		
		this.capacidadDeCarga = capacidadDeCarga;
	}
	public String getCarga(){
		return "La capacidad de carga es de :" +this.capacidadDeCarga;
	}
	
	
}
