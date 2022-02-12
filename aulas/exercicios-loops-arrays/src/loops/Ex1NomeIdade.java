package loops;

import java.util.Scanner;

/*
Fa�a um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

public class Ex1NomeIdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		
		while(true) {
			System.out.println("Digite o nome: ");
			nome = sc.next();
			
			if (nome.equals("0")) break;
			
			System.out.println("Digite a Idade: ");
			idade = sc.nextInt();
		}
		
		System.out.println("Continua aqui...");
		
		sc.close();
	}
}
