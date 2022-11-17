package n1_exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Month {

	private String name="";
	List <String> months = new ArrayList<>();
	Set<String> hashset = new HashSet<>();
	Iterator<String> it = new Iterator
	
	public static void main(String[] args) {
		
		Month m = new Month();
		m.ManipularArray();
		
	}
	
	public void ManipularArray(){
		
		months.addAll(Arrays.asList("enero", "febrero", "marzo", "abril", "mayo", "Junio" ,"Julio" , "septiembre", "octubre", "noviembre", "diciembre"));
		months.add(7, "agosto");
		
		
		for (String month : months) {
			System.out.println(month);
		}
		
		System.out.println("    ");
		months.add(10, "octubre");
		months.add(11, "marzo");
		
		for (String month : months) {
			System.out.println(month);
		}
		System.out.println("    ");
		
		for (String month : months) {
			hashset.add(month);
		}
		
		for(String month : hashset)
		System.out.println(month);
		
		It
		
		
	public void ManipularConIterator() {
		
		months.addAll(Arrays.asList("enero", "febrero", "marzo", "abril", "mayo", "Junio" ,"Julio" , "septiembre", "octubre", "noviembre", "diciembre"));
		months.add(7, "agosto");
		
		
		for (String month : months) {
			System.out.println(month);
		}
		
	}
	
		
		
		
	}
	
	
	
}
