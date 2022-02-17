package exercicios;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {
		
		// EXERCICIOS RESOLVIDOS
		// Elvis Maicol
		
		Queue<String> filaNomes = new LinkedList<>();
		
		filaNomes.add("Juliana");
		filaNomes.add("Pedro");
		filaNomes.add("Carlos");
		filaNomes.add("Larissa");
		filaNomes.add("João");

		// Exibindo a fila
		System.out.println("Exibindo a fila");
		Iterator<String> iteratorNomes = filaNomes.iterator();
		while(iteratorNomes.hasNext()) {
			System.out.println(iteratorNomes.next());
		}
		System.out.println();
		
		// Retornar 1º item sem remove-lo
		System.out.println("1º item da fila, sem remoção: " + filaNomes.element());
		System.out.println();
		
		// Retornar 1º item removendio-o
		System.out.println("1º item da fila, com remoção: " + filaNomes.remove());
		System.out.println(filaNomes);
		System.out.println();
		
		//Adicionando o Daniel
		System.out.println("Adicionando o Daniel e vendo a posição");
		filaNomes.add("Daniel");
		System.out.println(filaNomes);
		System.out.println();
		
		//Tamanho da lista
		System.out.println("Tamanho da fila: " + filaNomes.size());
		System.out.println();
		
		// Verificar se a fila esta vazia
		System.out.println("A fila está vazia: " + filaNomes.isEmpty());
		System.out.println();
		
		
		//Verificando se o Carlos esta na fila
		System.out.println("O Carlos está na fila: " + filaNomes.contains("Carlos"));
	}
}
