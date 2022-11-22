package n2_exercici2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import n2_exercici1.Restaurant;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant restaurante = new Restaurant();
		Set<Restaurant> listaRestaurant = new HashSet<>();
		List<Restaurant> listaOrdenada = new ArrayList<>();
		
		listaRestaurant.add(new Restaurant("abc", 1));
		listaRestaurant.add(new Restaurant("abc", 2));
		listaRestaurant.add(new Restaurant("abcd", 1));
		listaRestaurant.add(new Restaurant("ddd", 1));
		listaRestaurant.add(new Restaurant("ddd", 3));
		listaRestaurant.add(new Restaurant("ddd", 2));
		listaRestaurant.add(new Restaurant("add", 2));
		listaRestaurant.add(new Restaurant("abc", 1));

		for (Restaurant restaurant : listaRestaurant) {
			System.out.println("set" + restaurant);
			//listaOrdenada.add(restaurant);
		
		TreeSet<Restaurant> treeSet = new TreeSet(listaRestaurant);	
			
		for (Restaurant restaurant2 : treeSet) {
			System.out.println(restaurant2);
		}
			//for (Restaurant restaurant2 : listaOrdenada) {
				//System.out.println("list " + restaurant2);
			//}
			
		}
	}

}
