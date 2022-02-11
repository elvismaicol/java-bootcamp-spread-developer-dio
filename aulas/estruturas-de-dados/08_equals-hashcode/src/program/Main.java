package program;

import java.util.ArrayList;
import java.util.List;

import entities.Carro;

public class Main {

	public static void main(String[] args) {
		
		List<Carro> listCarros = new ArrayList<>();
		
		listCarros.add(new Carro("Ford"));
		listCarros.add(new Carro("Chevrolet"));
		listCarros.add(new Carro("Volkswagen"));
		
		System.out.println(listCarros.contains(new Carro("Ford")));
		System.out.println(new Carro("Ford").hashCode());	
		System.out.println(new Carro("Ford1").hashCode());
		System.out.println();
		
		Carro carro1 = new Carro("Ford");
		Carro carro2 = new Carro("Chevrolet");
				
		System.out.println(carro1.equals(carro2));	
	}
}
