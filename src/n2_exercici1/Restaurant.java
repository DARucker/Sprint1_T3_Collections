package n2_exercici1;

import java.util.Objects;

public class Restaurant {

	
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
		super();
		this.nombre = nombre;
		this.puntuacion = puntuacion;
	}
	
	public Restaurant() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Restaurant [nombre=" + nombre + ", puntuacion=" + puntuacion + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombre, puntuacion);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		return Objects.equals(nombre, other.nombre) && puntuacion == other.puntuacion;
	}
	
}
