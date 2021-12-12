package desafios;

import java.util.Scanner;

public class D2_TrigoNoTabuleiro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(), x;
		double qtd;

		while(n-- > 0) {
			x = sc.nextInt();
			qtd = 1;
			for (int i = 0; i < x; i++)
				qtd *= 2;
			qtd = Math.floor((qtd / 12) / 1000);
			System.out.printf("%.0f kg\n", qtd);
		}
		sc.close();		
	}

}