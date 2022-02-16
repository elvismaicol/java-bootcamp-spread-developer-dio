package exemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class lists {

	public static void main(String[] args) {
		// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//      List notas = new ArrayList(); //antes do java 5
//      ArrayList<Double> notas = new ArrayList<>();
//      List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        
		/*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(10d);
        System.out.println(notas);*/
        
		/*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
       //não permite add, Lista imutável
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);*/

        System.out.println("Crie uma lista e adicione as sete notas: ");
        
        //Melhor forma de iniciar uma lista
        List<Double> notas = new ArrayList<Double>(); //Generics(jdk 5) - Diamond Operator(jdk 7)
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        
        System.out.println(notas.toString());

        System.out.println("1-Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("2-Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("3-Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("4-Confira se a nota 5.0 estão na lista: " + notas.contains(5d));

        System.out.println("5-Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) System.out.println(nota);

        System.out.println("6-Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        //Usando a Classe Collections com o método min
        System.out.println("7-Exiba a menor nota: " + Collections.min(notas));

      //Usando a Classe Collections com o método max
        System.out.println("8-Exiba a maior nota: " + Collections.max(notas));

        //Usadoo método Iterator
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("9-Exiba a soma dos valores: " + soma);

        //size retorna a quantidade de elementos
        System.out.println("10-Exiba a média das notas: " + (soma/notas.size()));
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        
        //Usando o método remove()
        System.out.println("11-Remova a nota 0: ");
        // O d é para não identificar o número como inteiro
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("12-Remova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("13-Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        
        /*System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);
        */
        System.out.println("14-Confira se a lista está vazia: " + notas.isEmpty());

/*
Para você: Resolva esses exerccícios utilizando os métodos da implementaÃ§Ã£o LinkedList:

        System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list Arraylist nessa nova lista: ");

        System.out.println("Mostre a primeira nota da nova lista sem remvê-lo: ");

        System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
*/
        System.out.println();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        List<Double> notas2 = new ArrayList<Double>();
        notas2.add(5.0);
        notas2.add(7.3);
        notas2.add(5.0);
        notas2.add(8.0);
        notas2.add(9.5);
        notas2.add(0.0);
        notas2.add(3.6);
        
        System.out.println("Nova Lista");
        System.out.println(notas2.toString());
        System.out.println();
        
        System.out.println("Mostre a primeira nota da nova lista sem remvê-lo: " + notas2.get(0));
        System.out.println();
        
        System.out.println("Mostre a primeira nota da nova lista removendo-o: " + notas2.remove(0));
        
        System.out.println(notas2.toString());
	}

}
