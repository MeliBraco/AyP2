
public class Coche {

	private int ruedas;
	private int ancho;
	private int largo;
	private int motor;
	private int pesoPlataforma;
	
	private String color;
	
	private boolean tieneClimatizador;
	private boolean tieneAsientosDeCuero;
	
	public Coche(){
		
		//informacion que no varia. Igual a todos los ejemplares
		ruedas =4;
		ancho=300;
		largo= 2000;
		motor = 16000;
		pesoPlataforma = 500;
	}

	public String getInformacion(){
		return " Ruedas: " +ruedas+ " Largo: " +largo + " Ancho: " +ancho+
				" Tipo De Motor: " + motor + " El peso de la plataforma es de: "
				+ pesoPlataforma;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public String getColor(){
		return "El color es: " +color;
	}
	public void tieneClimatizador(String tieneClimatizador){
		
		if(tieneClimatizador.equals("si")){
			this.tieneClimatizador = true;
		}else{
			this.tieneClimatizador = false;
		}
	}
	public String getClimatizador(){
		
		if(this.tieneClimatizador == true){
			return "El coche tiene climatizador";
		}else{
			return "El coche no tiene climatizador";
		}
	}
	public boolean tieneAsientosDeCuero(String tieneAsientoDeCuero){
		
		if(tieneAsientoDeCuero.equals("si")){
			this.tieneAsientosDeCuero = true;
		}else{
			this.tieneAsientosDeCuero = false;
		}
		return this.tieneAsientosDeCuero;
	}
	public String getAsientosDeCuero(){

		if(this.tieneAsientosDeCuero == true){
			return "El coche  tiene Asientos De Cuero";
		}else{
			return "El coche no tiene Asientos De Cuero";
		}
	}
	
}
