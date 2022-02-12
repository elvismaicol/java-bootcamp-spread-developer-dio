package loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Ex3MaiorEMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;
		int maior= 0;
		int soma = 0;

		int count = 0;
		do {
			System.out.println("Numero: ");
			numero = sc.nextInt();
			
			if (maior < numero) maior = numero;
			
			soma = soma + numero;
			
			count = count + 1;
		} while(count < 5);
		System.out.println("Maior nº: " + maior);
		System.out.println("Média: " + (soma / count));
		sc.close();
	} 
}
