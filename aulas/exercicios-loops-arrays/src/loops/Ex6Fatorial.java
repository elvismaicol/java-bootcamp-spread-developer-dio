package loops;

import java.util.Scanner;

/*
Fa�a um programa que calcule o fatorial de um n�mero inteiro fornecido pelo usu�rio.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

public class Ex6Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Fatorial: ");
		int fatorial = sc.nextInt();

		int multiplicacao = 1;
		System.out.println(fatorial + "! = ");
		for (int i = fatorial; i >= 1 ; i--) {
			multiplicacao = multiplicacao * i;
		}
		System.err.println(multiplicacao);
		sc.close();
	}
}
