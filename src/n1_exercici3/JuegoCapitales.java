package n1_exercici3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class JuegoCapitales {

	private Map<String, String> capitales = new HashMap<>();
	private Map<Integer, String> capitalesOrden = new HashMap<>();
	private Set<Integer> listaAleatoria;
	private String nombre;
	private File_Reader_Writer file_reader_writer = new File_Reader_Writer();	
	
		public void pedirListados() {
			capitales = file_reader_writer.crearMapDePaisesYCapitales();
			capitalesOrden = file_reader_writer.crearMapConOrdenNumerico();
		}

	// Creamos un HashSet para asegurarnos que ninguna pregunta se repita. 
	
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
			System.out.println("Jugada numero " + jugadaNumero + " pais: " + pais);
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

		generarArchivo(nombre, puntaje);
	}

	private void generarArchivo (String nombre, int puntaje) {
		String contenidoArchivo = nombre + "," + puntaje + "\n";
		file_reader_writer.guardarArchivo(contenidoArchivo);
	}

	public static String capturarString(String mensaje) {
		Scanner teclado = new Scanner(System.in);
		String respuesta;
		System.out.println(mensaje);
		respuesta = teclado.nextLine();

		return respuesta;
	}

}