package arrays;

public class uso_Vector {

	public static void main(String[] args) {
		
		String[] nombre = new String[5];
		
		try{
		nombre[0] = "Logan";
		nombre[1] = "Marta";
		nombre[2] = "Sebastian";
		nombre[3] = "Belen";
		nombre[4] = "Melina";
		nombre[5] = "Melina";
		
			for(String s: nombre ){
				System.out.println(s);
			}
			
		}catch(IndexOutOfBoundsException e){
			System.out.print("pocision ingresada fuera de rango");
		}
	}
}
