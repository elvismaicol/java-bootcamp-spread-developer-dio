package arrays;

/*
Crie um vetor de 6 n�meros inteiros
e mostre-os na ordem inversa.
*/

public class Ex1OrdemInversa {

	public static void main(String[] args) {
		
		int[] vetor = {-5, -6, 15, 50, 8, 4};
		
		System.out.println("\nVetor: ");
		int count = 0;
		while(count < (vetor.length -1)) {
			System.out.print(vetor[count] + " ");
			count++;
		}
		
		System.out.println("\nVetor Invertido: ");
		for (int i = (vetor.length -1); i >= 0; i--) {
			System.out.print(vetor[i] + " ");
		}
	}
}
