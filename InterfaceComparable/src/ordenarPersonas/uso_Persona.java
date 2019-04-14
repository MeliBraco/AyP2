package ordenarPersonas;
import java.util.Arrays;


public class uso_Persona {

	public static void main(String[] args) {
		
		Persona[] misPersonas = new Persona[4];
		
		misPersonas[0] = new Persona("marta",20,36901352);
		misPersonas[1] = new Persona("logan",12,39878279);
		misPersonas[2] = new Persona("maria",87,20901352);
		misPersonas[3] = new Persona("josefina",78, 12000569);

		Arrays.sort(misPersonas);
		
		for(Persona p: misPersonas){
			System.out.println(p.getDatos());
		}

	}

}
