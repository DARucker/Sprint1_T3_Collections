package n1_exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Month {

	private List<String> months = new ArrayList<>();
	private Set<String> hashset = new HashSet<>();
	private Iterator<String> it;

	public void ManipularArray() {

		// 1
		System.out.println(" 1 Carga datos en el Array ");
		months.addAll(Arrays.asList("enero", "febrero", "marzo", "abril", "mayo", "Junio", "Julio", "septiembre",
				"octubre", "noviembre", "diciembre"));
		for (String mes : months) {
			System.out.print(mes + " ");
		}
		imprimirSeparador();

		// 2
		System.out.println(" 2 Agregamos agosto ");
		months.add(7, "agosto");
		for (String mes : months) {
			System.out.print(mes + " ");
		}
		imprimirSeparador();

		// 3
		System.out.println(" 3 Agregamos 2 datos repetidos para probar HashSet");
		months.add(10, "octubre");
		months.add(11, "marzo");

		for (String month : months) {
			System.out.print(month + " ");
		}
		imprimirSeparador();

		// 4
		System.out.println(" 4 recorremos e imprimimos el HashSet y verificamos la eliminacion de repetidos");
		for (String month : months) {
			hashset.add(month + " ");
		}
		for (String month : hashset) {
			System.out.print(month + " ");
		}
		imprimirSeparador();

		// 5
		System.out.println("5 Probamos el iterador recorriendo el hashset");
		it = hashset.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		imprimirSeparador();

		// 6
		System.out.println("6 Utilizamos el iterador para quitar agosto");
		it = hashset.iterator();
		String mesAEliminar = "agosto";
		while (it.hasNext()) {
			String mes = (String) it.next().toString().trim();
			boolean prueba = mes.equals(mesAEliminar);

			if (mes.equals(mesAEliminar)) {
				it.remove();
			}
		}
		imprimirSeparador();

		// 7
		System.out.println("7 Imprimimos la nueva lista sin el mes eliminado en el paso anterior");
		for (String string : hashset) {
			System.out.print(string + " ");
		}
	}

	public void imprimirSeparador() {
		System.out.println(" ");
		System.out.println(" --- ");
	}
}
