package n1_exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class App {

	private List<Integer> primeraLista = new ArrayList<>();
	private List<Integer> segundaLista = new ArrayList<>();
	private Iterator<Integer> it;

	public static void main(String[] args) {
		App app = new App();
		app.Nivel1Exercici2();
	}

	public void Nivel1Exercici2() {

		// 1 Creamos y rellenamos primera lista

		System.out.println("Creamos y rellenamos la primera lista");
		primeraLista.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

		for (Integer i : primeraLista) {
			System.out.print(" " + i);
		}

		separador();

		// 2 Creamos y rellenamos la segunda lista
		System.out.println("Creamos y rellenamos la segunda lista");
		int tamanio = primeraLista.size();

		for (int j = 0; j < tamanio; j++) {
			segundaLista.add(primeraLista.get(tamanio - j - 1));
		}
		for (Integer k : segundaLista) {
			System.out.print(" " + k);
		}

		separador();

		// 3 Ahora leemos e insertamos los elementos de la primera lista en la
		// segunda pero utilizando un iterator

		System.out.println("Agregamos nuevamente los elementos de la primera fila, pero con un iterator");
		System.out.println("Imprimimos la lista con los elementos agregados en los pasos 2 y 3");
		it = primeraLista.iterator();

		while (it.hasNext()) {
			segundaLista.add(it.next());
		}

		// imprimimos la lista con los elementos agregados en los pasos 2 y 3
		for (Integer k : segundaLista) {
			System.out.print(" " + k);
		}

	}

	public void separador() {

		System.out.println("");
		System.out.println("---");
		System.out.println("   ");
	}

}
