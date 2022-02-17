package exercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class comparator {

	public static void main(String[] args) {
		
		List<Bandas> bandas = new ArrayList<>();
		
		bandas.add(new Bandas("AC/DC", 17));
		bandas.add(new Bandas("Scorpions", 18));
		bandas.add(new Bandas("The Rolling Stones", 29));
		bandas.add(new Bandas("The Cranberries", 8));
		bandas.add(new Bandas("Pearl Jam", 11));
		bandas.add(new Bandas("Legião Urbana", 8));
		bandas.add(new Bandas("Ramones", 14));
		
		System.out.println(bandas.toString());
		System.out.println();
		
		//Ordenando por número de discos
		System.out.println("Ordenando por número de discos");
		bandas.sort(Comparator.comparingInt(Bandas::getDiscos));
		System.out.println(bandas.toString());		
	}

}
