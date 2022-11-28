package n2_exercici2;

import java.util.TreeSet;

import n2_exercici2.Restaurant;

public class App {

	// La clase Restaurant del ejercicio anterior se agrega a un TreeSet para
	// ordenar por nombre (ascendente) y puntuación (descendente).

	public static void main(String[] args) {

		TreeSet<Restaurant> treeSet = new TreeSet<Restaurant>();

		treeSet.add(new Restaurant("abc", 1)); // 1
		treeSet.add(new Restaurant("abc", 2)); // 2
		treeSet.add(new Restaurant("abcd", 1)); // 3
		treeSet.add(new Restaurant("ddd", 1)); // 4
		treeSet.add(new Restaurant("ddd", 3)); // 5
		treeSet.add(new Restaurant("ddd", 3)); // 6
		treeSet.add(new Restaurant("DDD", 2)); // 7
		treeSet.add(new Restaurant("add", 2)); // 8
		treeSet.add(new Restaurant("abc", 1)); // 9
		treeSet.add(new Restaurant("ABC", 1)); // 10
		treeSet.add(new Restaurant("abc", 1)); // 11
		treeSet.add(new Restaurant("abc", 6)); // 12

		int orden = 1;
		for (Restaurant restaurant : treeSet) {
			System.out.println("orden: " + orden + ", nombre: " + restaurant.getNombre() + ", puntacion: "
					+ restaurant.getPuntuacion());
			orden++;
		}

	}
}
