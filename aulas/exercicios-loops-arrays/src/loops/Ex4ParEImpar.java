package loops;

import java.util.Scanner;

/*
Fa�a um programa que pe�a N n�meros inteiros,
calcule e mostre a quantidade de n�meros pares
e a quantidade de n�meros impares.
*/

public class Ex4ParEImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int quantidadeNumeros;
		int numero;
		int quantidadePares = 0;
		int quantidadeImpares = 0;
		
		System.out.println("Quantidade de N�meros: ");
		quantidadeNumeros = sc.nextInt();
		
		int count = 0;
		do {
			System.out.println("N�mero: ");
			numero = sc.nextInt();
			
			if (numero % 2 == 0) quantidadePares++;
			else quantidadeImpares++;
			
			count++;
		}while(count < quantidadeNumeros);
		
		System.out.println("Quantidade de N�meros Pares: " + quantidadePares);
		System.out.println("Quantidade de N�meros �mpares: " + quantidadeImpares);
		sc.close();
	}
}
