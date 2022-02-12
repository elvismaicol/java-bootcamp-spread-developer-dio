package loops;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer n�mero inteiro entre 1 a 10.
O usu�rio deve informar de qual numero ele deseja ver a tabuada.
A sa�da deve ser conforme o exemplo abaixo:
Tabuada do 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

public class Ex5Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tabuada;

		System.out.println("Tabuada: ");
		tabuada = sc.nextInt();

		System.out.println("Tabuada do: " + tabuada);
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
		}
		sc.close();	
	}

}
