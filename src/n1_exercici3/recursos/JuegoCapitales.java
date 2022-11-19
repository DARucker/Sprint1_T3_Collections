package n1_exercici3.recursos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class JuegoCapitales {

	Map<String, String> capitales = new HashMap<>();
	FileReader fileReader;
	BufferedReader bufferedReader;
	String linea;
	String spliter = " ";

	public void LeerLinea() {

		try {
			// C:\Users\Dario\git\Sprint1_Tasca3\src\n1_exercici3\recursos
			fileReader = new FileReader(
					"C:\\Users\\Dario\\git\\Sprint1_Tasca3\\src\\n1_exercici3\\recursos\\countries.txt");
			bufferedReader = new BufferedReader(fileReader);

			while ((linea = bufferedReader.readLine()) != null) {
				System.out.println(linea + " ");
				if (!linea.isEmpty()) {
					String[] campo = linea.split(spliter);
					capitales.put(campo[0], campo[1]);
				}
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

		Iterator<String> it = capitales.keySet().iterator();
		int contador = 0;
		while (it.hasNext() && contador < 10) {
			String clave = it.next();
			String valor = capitales.get(clave);
			System.out.println("Contador " + contador + "clave " + clave + " valor " + valor);

			contador++;
		}
	}
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
