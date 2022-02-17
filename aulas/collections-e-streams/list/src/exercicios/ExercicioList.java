package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExercicioList {
	public static void main(String[] args) {
		
		// EXERCICIOS RESOLVIDOS
		// Elvis Maicol


		// Criar lista
		List<String> pessoas = new ArrayList<>();

		// Adiciona 5 nomes
		pessoas.add("Juliana");
		pessoas.add("Pedro");
		pessoas.add("Carlos");
		pessoas.add("Larissa");
		pessoas.add("João");

		//Navegando a lista
		System.out.println("Navegando a lista");
		Iterator<String> iterator = pessoas.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(pessoas);
		System.out.println();
		
		//Substituindo o nome Carlos por Roberto
		System.out.println("Substituindo o nome Carlos por Roberto");
		pessoas.set(2, "Roberto");
		System.out.println(pessoas);
		System.out.println();

		//Retornar o nome da posição 1
		System.out.println("Retornar o nome da posição 1: " + pessoas.get(1));
		System.out.println();
		
		//Remover o nome da posição 4
		System.out.println("Remover o nome da posição 4: " + pessoas.remove(4));
		System.out.println(pessoas);
		System.out.println();
		
		//Remover o nome da João
		System.out.println("Remover o nome da João: " + pessoas.remove("Pedro"));
		System.out.println(pessoas);
		System.out.println();
		
		//Quantidade de itens na lista
		System.out.println("Quantidade de itens na lista: " + pessoas.size());
		System.out.println();
		
		//Verificando se o nome Juliano existe na lista
		System.out.println("erificando se o nome Juliano existe na lista: " + pessoas.contains("Juliano"));
		System.out.println();
		
		//Criar lista com Ismael e Rodrigo e adicionar a nova lista na primeira lista
		System.out.println("Criar lista com Ismael e Rodrigo e adicionar a nova lista na primeira lista");
		List<String> pessoas2 = new ArrayList<>();

		pessoas2.add("Ismael");
		pessoas2.add("Rodrigo");
		System.out.println(pessoas2);
		
		pessoas.addAll(pessoas2);
		System.out.println(pessoas);
		System.out.println();
		
		//Ordenar por ordem Alfabética
		System.out.println("Ordenar por ordem Alfabética");
		Collections.sort(pessoas);
		System.out.println(pessoas);
		System.out.println();
		
		//Verificando se a lista esta vazia
		System.out.println("A lista está vazia: " + pessoas.isEmpty());
	}
}

