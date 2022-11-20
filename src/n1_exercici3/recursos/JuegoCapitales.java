package n1_exercici3.recursos;

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

public class JuegoCapitales {

	Map<String, String> capitales = new HashMap<>();
	Map<Integer, String> capitalesOrden = new HashMap<>();
	Set<Integer> listaAleatoria;
	FileReader fileReader;
	BufferedReader bufferedReader;
	String linea;
	String spliter = " ";
	String nombre;
	
	public void LeerLinea() {

		try {

			fileReader = new FileReader("C:\\Users\\Dario\\git\\Sprint1_Tasca3\\src\\n1_exercici3\\recursos\\countries.txt");
			bufferedReader = new BufferedReader(fileReader);
			int claveNumerica=0;
			
			while ((linea = bufferedReader.readLine()) != null) {
				
				if (!linea.isEmpty()) {
					String[] campo = linea.split(spliter);
					capitales.put(campo[0], campo[1]);
					capitalesOrden.put(claveNumerica, campo[0]);
					claveNumerica++;
				}
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println(capitales.entrySet());
		System.out.println(capitalesOrden.entrySet());
		
		for (Entry<String, String> s : capitales.entrySet()) {
			System.out.println("Lista original. Pais: " + s.getKey() + " capital " + s.getValue());
		}
		
		for (Entry<Integer, String> i : capitalesOrden.entrySet()) {
			System.out.println("Lista ordinal. Orden: " + i.getKey() + " Pais " + i.getValue());
	}
}
	
	public void ListaAleatoria() {

		listaAleatoria = new HashSet<Integer>();			
		
		while(listaAleatoria.size() < 10) {
		
			listaAleatoria.add((int) (Math.random()*50));
		}
		for (Integer integer : listaAleatoria) {
			System.out.println("Lista Aleatoria " + integer);
		}
	}
	
	public void pedirNombre() {
	
	nombre = capturarString("Por favor ingrese su nombre: ");
	System.out.println("Hola " + nombre);
	System.out.println("Ahora vamos a jugar el juego de las capitales europeas.");
	System.out.println("Te diré 10 países y deberás contestar su capital");
	System.out.println("Empecemos");
	System.out.println(" ");
	
	}
			
	public void jugar() {
		
		int jugadaNumero=1;
		int puntaje=0;
		
		for (Integer lA : listaAleatoria) {
			
			String pais = capitalesOrden.get(lA);
			System.out.println("Jugada numero" + jugadaNumero + " pais: " + pais);
			System.out.println();
			String respuesta = capturarString("Ahora ingresa su capital: ");
			String capital = capitales.get(pais);
			System.out.println("capital " + capital);
				if(capital.equalsIgnoreCase(respuesta)) {
					puntaje++;
				}
			System.out.println("puntaje: " + puntaje);
			jugadaNumero++;
		}
			System.out.println("  ");
			System.out.println("Felicitaciones " + nombre + ", tu puntaje fue de: " + puntaje + " puntos!");
			System.out.println("Fin del juego");
			
			guardarArchivo(nombre, puntaje);
	}
	
	
	
	private void guardarArchivo(String nombre, int puntaje) {
		
		String ruta = "C:\\Users\\Dario\\git\\Sprint1_Tasca3\\src\\n1_exercici3\\recursos\\resultado.txt";
		String contenidoArchivo = nombre + "," + puntaje;
		File file = new File(ruta);
		try {
			file.createNewFile();
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(contenidoArchivo);
			bufferedWriter.close();
			System.out.println("Archivo de puntaje guardado.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String capturarString(String mensaje) {
		Scanner teclado = new Scanner(System.in);
		String respuesta;
		System.out.println(mensaje);
		respuesta = teclado.nextLine();

		return respuesta;

	}
	
}
	





/*		
		Iterator<String> it = capitales.keySet().iterator();
		int contador = 0;
		while (it.hasNext() && contador < 10) {
			String clave = it.next();
			String valor = capitales.get(clave);
			System.out.println("Contador " + contador + "clave " + clave + " valor " + valor);

			contador++;
		}


//////////////////////////////////
/*
 * System.out.println(capitales.entrySet()); for (Map.Entry<String, String> dato
 * : capitales.entrySet()) { System.out.println("Dato: " + dato); String clave =
 * dato.getKey(); String valor = dato.getValue(); System.out.println("clave: " +
 * clave + " valor: " + valor);
 * 
 * }
 * 
 * Set<String> listaDeDatos = capitales.keySet();
 * 
 * for (String s : listaDeDatos) { System.out.println("lista de datos " + s); }
 * } }
 * 
 * 
 * 
 * 
 * 
 * System.out.println("----------");
 * 
 * //System.out.println(capitales.keySet());
 * 
 * System.out.println("----------"); int contador = 0;
 * 
 * while (contador < 10) {
 * 
 * for (Map.Entry<String, String> dato : capitales.entrySet()) {
 * System.out.println("contador " + contador + "Dato " + dato); contador++; }
 */
