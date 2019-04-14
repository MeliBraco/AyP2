package ordenarPersonas;

import java.util.*;


public class sort {
	
	//valores primitivos

	public void ordenAscendente(){
		List<Integer> lista = new LinkedList <Integer>();
		Collections.sort(lista);
	}
	
	public void ordenDescendente(){
		
		List<Integer> lista = new LinkedList <Integer>();
		Comparator<Integer> comparador = Collections.reverseOrder();
		Collections.sort(lista, comparador);
	
	}
	
}
