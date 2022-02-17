package exercicios;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set {

	public static void main(String[] args) {
		
		//EXERCICIOS RESOLVIDOS
		//Elvis Maicol
		
		LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
		
		numeros.add(3);
		numeros.add(20);
		numeros.add(44);
		numeros.add(3);
		
		//Exibindo os numeros
		Iterator<Integer> iteratorNumeros = numeros.iterator();
		while(iteratorNumeros.hasNext()) {
			System.out.println(iteratorNumeros.next());
		}
		for(Integer numero : numeros) {
			System.out.println(numero);
		}
		System.out.println(numeros);
		System.out.println();
		
		//Remover o 1º item do Set
		System.out.println("Removendo o 1º item do Set: ");
		numeros.remove(3);
		System.out.println(numeros);
		System.out.println();
		
		//Adicionar o númeor 23
		System.out.println("Adicionando o 23: ");
		numeros.add(23);
		System.out.println(numeros);
		System.out.println();
		
		//Verificando o tamanho do Set
		System.out.println("O tamanho do Set é: " + numeros.size());
		System.out.println();
		
		//Verificando se o Sete esta vazio
		System.out.println("O Set está vazio? " + numeros.isEmpty());
	}
}
