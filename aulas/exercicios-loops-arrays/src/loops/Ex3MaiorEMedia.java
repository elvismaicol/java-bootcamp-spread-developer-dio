package loops;

import java.util.Scanner;

/*
Fa�a um programa que leia 5 n�meros
e informe o maior n�mero
e a m�dia desses n�meros.
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
		System.out.println("Maior n�: " + maior);
		System.out.println("M�dia: " + (soma / count));
		sc.close();
	} 
}
