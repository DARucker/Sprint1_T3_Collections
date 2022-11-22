package n2_exercici2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import n2_exercici1.Restaurant;

public class App {

	public static void main(String[] args) {
	
//		Restaurant restaurante = new Restaurant();
		Set<Restaurant> listaRestaurant = new HashSet<>();

		listaRestaurant.add(new Restaurant("abc", 1));
		listaRestaurant.add(new Restaurant("abc", 2));
		listaRestaurant.add(new Restaurant("abcd", 1));
		listaRestaurant.add(new Restaurant("ddd", 1));
		listaRestaurant.add(new Restaurant("ddd", 3));
		listaRestaurant.add(new Restaurant("ddd", 2));
		listaRestaurant.add(new Restaurant("add", 2));
		listaRestaurant.add(new Restaurant("abc", 1));
		
		TreeSet<Restaurant> treeSet = new TreeSet<Restaurant>(new Comparator<Restaurant>() {
			@Override
			public int compare(Restaurant o1, Restaurant o2) {
				return o1.getNombre().compareTo(o2.getNombre());
			}});
		
		for (Restaurant restaurant : listaRestaurant) {
			System.out.println(restaurant);
			restaurant.setNombre(restaurant.getNombre() + "#" + restaurant.getPuntuacion());
			treeSet.add(restaurant);
		}
		
		System.out.println("****");
		
		for (Restaurant restaurant2 : treeSet) {
			System.out.println(restaurant2);
			//String nombreOrdenado = restaurant2.getNombre().split(regex)
		}
			
		}

	}
	


