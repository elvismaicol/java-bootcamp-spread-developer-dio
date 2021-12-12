package desafios;

import java.util.Scanner;

public class D4_FusoHorario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int horasaida = sc.nextInt();
		int tempoviagem = sc.nextInt();
		int fuso = sc.nextInt();
		
		int tempoTotal = (horasaida + tempoviagem) + fuso;
		
		int ajuste = 0;
		if (tempoTotal == 24) 
			ajuste = 0;
		else if (tempoTotal > 24) 
			ajuste = tempoTotal - 24;
		else if (tempoTotal < 0) {
			if (horasaida == 0) 
				ajuste = 24 + tempoTotal;
			else
				ajuste = horasaida + tempoTotal;		
		}
		else
			ajuste = tempoTotal;
               	
		System.out.println(ajuste);
		
		sc.close();

	}

}
