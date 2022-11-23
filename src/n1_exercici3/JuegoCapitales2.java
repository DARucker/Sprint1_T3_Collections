package n1_exercici3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class JuegoCapitales2 {

	private Map<String, String> capitales = new HashMap<>();
	private Map<Integer, String> capitalesOrden = new HashMap<>();
	private Set<Integer> listaAleatoria;
	private FileReader fileReader;
    private BufferedReader bufferedReader;
	private String linea;
	private String spliter = " ";
	private String nombre;
	private final String RUTA = "src\\n1_exercici3\\";

	public void LeerLinea() {

		try {

			fileReader = new FileReader(RUTA + "countries.txt");
			bufferedReader = new BufferedReader(fileReader);
			int claveNumerica = 0;

			while ((linea = bufferedReader.readLine()) != null) {

				if (!linea.isEmpty()) {
					String[] campo = linea.split(spliter);
					capitales.put(campo[0], campo[1]);
					capitalesOrden.put(claveNumerica, campo[0]);
					claveNumerica++;
				}
			}
		} catch (IOException e) {e.printStackTrace();}
	}

	public void ListaAleatoria() {
		listaAleatoria = new HashSet<Integer>();
		while (listaAleatoria.size() < 10) {
			listaAleatoria.add((int) (Math.random() * 50));
		}
	}

	public void pedirNombre() {

		nombre = capturarString("Por favor ingrese su nombre: ");
		System.out.println("Hola " + nombre);
		System.out.println("Ahora vamos a jugar el juego de las capitales europeas.");
		System.out.println("Te diré 10 países y deberás contestar su capital");
		System.out.println("Empecemos");
	}

	public void jugar() {

		int jugadaNumero = 1;
		int puntaje = 0;

		for (Integer lA : listaAleatoria) {

			String pais = capitalesOrden.get(lA);
			System.out.println("-----");
			System.out.println("Jugada numero" + jugadaNumero + " pais: " + pais);
			String respuesta = capturarString("Ahora ingresa su capital: ");
			String capital = capitales.get(pais);
			System.out.println("capital " + capital);
			if (capital.equalsIgnoreCase(respuesta)) {
				puntaje++;
			}
			System.out.println("puntaje: " + puntaje);
			jugadaNumero++;
		}
		System.out.println("****");
		System.out.println("Felicitaciones " + nombre + ", tu puntaje fue de: " + puntaje + " puntos!");
		System.out.println("Fin del juego");

		guardarArchivo(nombre, puntaje);
	}

	private void guardarArchivo(String nombre, int puntaje) {

		String contenidoArchivo = nombre + "," + puntaje + "\r\n";
		File file = new File(RUTA + "classificacio.txt");
		try {
			if (!file.exists()) {
				file.createNewFile();
				FileWriter fileWriter = new FileWriter(file);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				bufferedWriter.write(contenidoArchivo);
				bufferedWriter.close();
			} else {
				FileWriter fileWriter = new FileWriter(file, true);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				bufferedWriter.write(contenidoArchivo);
				bufferedWriter.close();
			}

			System.out.println("Archivo de puntaje guardado.");

		} catch (IOException e) {e.printStackTrace();}
	}

	public static String capturarString(String mensaje) {
		Scanner teclado = new Scanner(System.in);
		String respuesta;
		System.out.println(mensaje);
		respuesta = teclado.nextLine();

		return respuesta;
	}

}