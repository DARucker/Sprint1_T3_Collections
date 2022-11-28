package n1_exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class App {

	List <Month> months = new ArrayList<>();
	Set<Month> hashset = new HashSet<>();
	Iterator<Month> it;
	
	public static void main(String[] args) {
		App app = new App();
		app.ManipularArray();
		}
		
		public void ManipularArray() {

			// 1
			System.out.println(" 1 Carga datos en el Array ");
			months.add(new Month("enero"));
			months.add(new Month("febrero"));
			months.add(new Month("marzo"));
			months.add(new Month("abril"));
			months.add(new Month("mayo"));
			months.add(new Month("junio"));
			months.add(new Month("julio"));
			months.add(new Month("septiembre"));
			months.add(new Month("octubre"));
			months.add(new Month("noviembre"));
			months.add(new Month("diciembre"));
			
			for (Month mes : months) {
				System.out.print(mes.getNombre() + " ");
			}
			imprimirSeparador();

			// 2
			System.out.println(" 2 Agregamos agosto ");
			months.add(7, new Month("agosto"));
			for (Month mes : months) {
				System.out.print(mes.getNombre() + " ");
			}
			imprimirSeparador();

			// 3
			System.out.println(" 3 Agregamos 2 datos repetidos para probar HashSet");
			months.add(10, new Month("octubre"));
			months.add(11, new Month("marzo"));

			for (Month mes : months) {
				System.out.print(mes.getNombre() + " ");
			}
			imprimirSeparador();

			// 4
			System.out.println(" 4 recorremos e imprimimos el HashSet y verificamos la eliminacion de repetidos");
			for (Month month : months) {
				hashset.add(month);
			}
			for (Month month : hashset) {
				System.out.print(month.getNombre() + " ");
			}
			imprimirSeparador();

			// 5
			System.out.println("5 Probamos el iterador recorriendo el hashset");
			it = hashset.iterator();
			while (it.hasNext()) {
				System.out.print(it.next().getNombre() + " ");
			}
			imprimirSeparador();

			// 6
			System.out.println("6 Utilizamos el iterador para quitar agosto");
			it = hashset.iterator();
			String mesAEliminar = "agosto";
			while (it.hasNext()) {
				if(it.next().getNombre().equals("agosto")) {
					it.remove();
				}
			}
			imprimirSeparador();

			// 7
			System.out.println("7 Imprimimos la nueva lista sin el mes eliminado en el paso anterior");
			for (Month month : hashset) {
				System.out.print(month.getNombre() + " ");
			}
		}

		public void imprimirSeparador() {
			System.out.println(" ");
			System.out.println(" --- ");
		}
		
	}
	

