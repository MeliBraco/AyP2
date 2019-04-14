
public class Jefe extends Empleado {

	private double incentivo;
	
	public Jefe(String nombre,int sueldo,int dia,int mes, int año){
		
		super(nombre,sueldo,dia,mes-1,año);
		
	}
	
	//metodos propios de la clase jefe mas todos lo que heredo de la clase empleado
	public void otorgarIncentivo(double aumento){
		
		this.incentivo = aumento;
	}
	public double getSueldo(){
		
		double sueldoJefe = super.getSueldo();
		//super + metodo hace referencia al  metodo de la clase
		//padre cuando se denominan igual (se pisa)
		return sueldoJefe + incentivo;
	}
}
