package n1_exercici1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Month {

	private String name = "";
	List<String> months = new ArrayList<>();
	List<String> monthsIterator = new ArrayList<>();
	Set<String> hashset = new HashSet<>();
	Iterator<String> it;

	public static void main(String[] args) {

		Month m = new Month();
		m.ManipularArray();

	}

	public void ManipularArray() {

		// Carga datos en el Array
		months.addAll(Arrays.asList("enero", "febrero", "marzo", "abril", "mayo", "Junio", "Julio", "septiembre",
				"octubre", "noviembre", "diciembre"));
		System.out.println(" 1 Carga datos en el Array ");
		for (String mes : months) {
			System.out.print(mes + " ");
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" --- ");

		// Agregamos agosto
		months.add(7, "agosto");
		System.out.println(" 2 Agregamos agosto ");
		for (String mes : months) {
			System.out.print(mes + " ");
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" --- ");

		// Agregamos 2 datos repetidos para probar HashSet
		System.out.println(" 3 Agregamos 2 datos repetidos para probar HashSet");
		months.add(10, "octubre");
		months.add(11, "marzo");

		for (String month : months) {
			System.out.print(month + " ");
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" --- ");

		// Cargamos los datos en el HashSet e imprimimos para verificar eliminacion de
		// repetidos
		System.out.println(" 4 recorremos e imprimimos el HashSet y verificamos la eliminacion de repetidos");
		for (String month : months) {
			hashset.add(month + " ");
		}
		System.out.println("Tamaño del HashSet: " + hashset.size());
		for (String month : hashset)
			System.out.print(month + " ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" --- ");
		
		// Creamos un iterator e imprimimos el Array
		System.out.println("5 Probamos el iterador recorriendo el hashset");
		int contador = 0;
		it = hashset.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");

		}
		
	}

}
