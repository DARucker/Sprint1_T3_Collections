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
	
		Set<Restaurant> listaRestaurant = new HashSet<>();

		listaRestaurant.add(new Restaurant("abc", 1)); // 1
		listaRestaurant.add(new Restaurant("abc", 2)); // 2
		listaRestaurant.add(new Restaurant("abcd", 1)); // 3
		listaRestaurant.add(new Restaurant("ddd", 1)); // 4
		listaRestaurant.add(new Restaurant("ddd", 3)); // 5
		listaRestaurant.add(new Restaurant("ddd", 3)); // 6
		listaRestaurant.add(new Restaurant("DDD", 2)); // 7
		listaRestaurant.add(new Restaurant("add", 2)); // 8
		listaRestaurant.add(new Restaurant("abc", 1)); // 9
		listaRestaurant.add(new Restaurant("ABC", 1)); // 10
		listaRestaurant.add(new Restaurant("abc", 1)); // 11
		listaRestaurant.add(new Restaurant("abc", 6)); // 12

		
		TreeSet<Restaurant> treeSet = new TreeSet<Restaurant>(new Comparator<Restaurant>() {
			@Override
			public int compare(Restaurant o1, Restaurant o2) {
				int res=0;
					if(o1.getNombre().compareToIgnoreCase(o2.getNombre()) < 0) {
						res = -1;	
					}else if(o1.getNombre().compareToIgnoreCase(o2.getNombre()) > 0) {
						res = 1;	
					}else if(o1.getNombre().compareToIgnoreCase(o2.getNombre()) == 0 ){
							if(o1.getPuntuacion() > (o2.getPuntuacion())){
								res = -1;
							}else if (o1.getPuntuacion() < (o2.getPuntuacion())){
								res = 1;
							}}
								return res;
			}});
		
		for (Restaurant restaurant : listaRestaurant) {
			treeSet.add(restaurant);
		}
		
		int orden = 1;
		for (Restaurant restaurant2 : treeSet) {
			System.out.println("orden: " + orden + ", nombre: " + restaurant2.getNombre() + ", puntacion: " + restaurant2.getPuntuacion());
			orden++;
		}
			
		}

	}
	


