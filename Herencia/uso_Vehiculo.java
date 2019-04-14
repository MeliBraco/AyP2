import javax.swing.JOptionPane;


public class uso_Vehiculo {

	
	public static void main (String[]arg){
		
		Coche renault = new Coche();
	
		System.out.println("INFORMACION BASE:" + renault.getInformacion());
		renault.setColor(JOptionPane.showInputDialog("Introduce el color del coche"));
		System.out.println(renault.getColor());
		renault .tieneAsientosDeCuero(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
		System.out.println(renault.getAsientosDeCuero());
		renault.tieneClimatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
		System.out.println(renault.getClimatizador());
		
		
		Camioneta miFurgoneta = new Camioneta(200);
		
		System.out.println(miFurgoneta.getInformacion()); //es la misma informacion que hereda del coche
		//mas los metodos y atributos propios
		System.out.print(miFurgoneta.getCarga());
		
	}
}
