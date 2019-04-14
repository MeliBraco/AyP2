
public class uso_Trabajadores {

	public static void main(String[] args) {
	
		
		Empleado[] misEmpleados = new Empleado[2];
		misEmpleados[0] = new Empleado("juan Perez",1000,20,5,2011);
		misEmpleados[1] = new Empleado("antonia Perez",5000,20,5,2011);

		//for each 
		for(Empleado e : misEmpleados){//le aumenta el suledo a todos los trabajadores
			e.aumentarSueldo(5.0);
		}
		for(Empleado e : misEmpleados){ //muestra datos de todos los trabajadores
			System.out.println("NOMBRE: " +e.getNombre()+ " SUELDO: "
					+e.getSueldo()+ " FECHA INGRESO: "+e.getFechaDeIngreso());
		}
	
		Jefe [] misJefes = new Jefe[2];
		//si quiero otorgarle un incentivo a un jefe en particular y no a todos
		//debo declarar un array de esta manera para poder acceder al objeto 
		//en particular
		Jefe jefe1 = new Jefe("melina braconaro",70000,30,2,1993);
		misJefes[0] = jefe1;
		Jefe jefe2 = new Jefe("sebastian braconaro",80000,4,4,2000);
		misJefes[1] = jefe2;

		jefe1.otorgarIncentivo(500);

		for(Jefe j : misJefes){
			System.out.println("NOMBRE: " +j.getNombre()+ " SUELDO: "
					+j.getSueldo()+ " FECHA INGRESO: "+j.getFechaDeIngreso());
		}


		
		//Empleado empleado1 = new Empleado("juan Perez",1000,20,5,2011);
		//empleado1.aumentarSueldo(10.0);
		//System.out.print(empleado1.getNombre());
		//System.out.print(" / "+ empleado1.getSueldo());
		//System.out.println(" / "+ empleado1.getFechaDeIngreso());
		
		
		//Jefe jefe1= new Jefe("Melina Braconaro", 20000,12,11,1993);
		//System.out.print(jefe1.getNombre());
		//jefe1.otorgarIncentivo(500);
		//System.out.print(" / " + jefe1.getSueldo());
		//System.out.println(" / " + jefe1.getFechaDeIngreso());
	}

}
