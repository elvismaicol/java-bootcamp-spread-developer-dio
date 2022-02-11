package program;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import entities.Carro;

public class Main {

	public static void main(String[] args) {
		
		Set<Carro> hashSetCarros = new HashSet<>();
		
		hashSetCarros.add(new Carro("Ford"));
		hashSetCarros.add(new Carro("Chevrolet"));
		hashSetCarros.add(new Carro("Fiat"));
		hashSetCarros.add(new Carro("Peugeot"));
		hashSetCarros.add(new Carro("Zip"));
		hashSetCarros.add(new Carro("Alfa Romeo"));
		
		System.out.println(hashSetCarros);
		
		System.out.println();
		
		Set<Carro> treeSetCarros = new TreeSet<>();
		
		treeSetCarros.add(new Carro("Ford"));
		treeSetCarros.add(new Carro("Chevrolet"));
		treeSetCarros.add(new Carro("Fiat"));
		treeSetCarros.add(new Carro("Peugeot"));
		treeSetCarros.add(new Carro("Zip"));
		treeSetCarros.add(new Carro("Alfa Romeo"));
		
		System.out.println(treeSetCarros);
		
/*		
		System.out.println(hashSetCarros.contains(new Carro("Ford")));
		System.out.println(hashSetCarros.get(2));
		System.out.println();
		
		System.out.println(hashSetCarros.indexOf(new Carro("Fiat")));
		System.out.println();
		
		System.out.println(hashSetCarros.remove(2));
		System.out.println(hashSetCarros);
		
		System.out.println(hashSetCarros.size());*/
	}
}
