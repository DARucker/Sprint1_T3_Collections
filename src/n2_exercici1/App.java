package n2_exercici1;

import java.util.HashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Restaurant restaurante = new Restaurant();
		Set<Restaurant> listaRestaurant = new HashSet<>();
		
		listaRestaurant.add(new Restaurant("abc", 1));
		listaRestaurant.add(new Restaurant("abc", 2));
		listaRestaurant.add(new Restaurant("abcd", 1));
		listaRestaurant.add(new Restaurant("abc", 1));

		for (Restaurant restaurant : listaRestaurant) {
			System.out.println(restaurant);
		}
	
	}

}
