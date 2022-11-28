package n2_exercici2;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant> {

	private String nombre;
	private int puntuacion;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public Restaurant(String nombre, int puntuacion) {
		this.nombre = nombre;
		this.puntuacion = puntuacion;
	}

	public Restaurant(String nombre) {
		this.nombre = nombre;
	}

	public Restaurant() {
	}
	
	@Override
	public int compareTo(Restaurant restaurant) {
		int res = 0;
		if (this.nombre.compareToIgnoreCase(restaurant.getNombre()) < 0) {
			res = -1;
		} else if (this.nombre.compareToIgnoreCase(restaurant.getNombre()) > 0) {
			res = 1;
		} else if (this.nombre.compareToIgnoreCase(restaurant.getNombre()) == 0) {
			if (this.puntuacion > (restaurant.getPuntuacion())) {
				res = -1;
			} else if (this.puntuacion < (restaurant.getPuntuacion())) {
				res = 1;
			}
		}
		return res;
	}
}
