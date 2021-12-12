package desafios;

import java.util.Scanner;

public class D5_ParOuImpar {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
    	int N = leitor.nextInt();
    	
    	for (int i = 0; i < N; i++) {
    		int number = leitor.nextInt();
    		
    		if (number == 0) 
    			System.out.printf("The number " + number + " é NULL", number);
    		else if (number % 2 == 0) 
    			if (number > 0)
    				System.out.println("The number " + number + " is EVEN and POSITIVE");
    			else 
    				System.out.println("The number " + number + " is EVEN and NEGATIVE");
    		else 
    			if (number > 0)
    				System.out.println("The number " + number + " is ODD and POSITIVE");
    			else
    				System.out.println("The number " + number + " is ODD and NEGATIVE");
    	}	
    	leitor.close();
	}	
}
