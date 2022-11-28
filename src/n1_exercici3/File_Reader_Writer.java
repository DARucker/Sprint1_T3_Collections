package n1_exercici3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class File_Reader_Writer {
	
	private Map<String, String> capitales = new HashMap<>();
	private Map<Integer, String> capitalesOrden = new HashMap<>();
	private FileReader fileReader;
    private BufferedReader bufferedReader;
	private String linea;
	private String spliter = " ";
	private final String RUTA = "src\\n1_exercici3\\";
	
	public Map<String, String> crearMapDePaisesYCapitales() {
		
		try {
			fileReader = new FileReader(RUTA + "countries.txt");
			bufferedReader = new BufferedReader(fileReader);
			while ((linea = bufferedReader.readLine()) != null) {
				if (!linea.isEmpty()) {
					String[] campo = linea.split(spliter);
					capitales.put(campo[0], campo[1]);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			}
		return capitales;
	}

	public Map<Integer, String> crearMapConOrdenNumerico() {
		
		try {
			fileReader = new FileReader(RUTA + "countries.txt");
			bufferedReader = new BufferedReader(fileReader);
			int claveNumerica = 0;

			while ((linea = bufferedReader.readLine()) != null) {							
				if (!linea.isEmpty()) {
					String[] campo = linea.split(spliter);
					capitalesOrden.put(claveNumerica, campo[0]);
					claveNumerica++;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			}
		return capitalesOrden;
	}

	public void guardarArchivo(String contenidoArchivo) {
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
}