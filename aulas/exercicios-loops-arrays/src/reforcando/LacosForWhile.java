package reforcando;

public class LacosForWhile {

	public static void main(String[] args) {
		
		for (int i = 3; i <= 11; i += 2) {
			if (i != 7)
				System.out.println(i);
		}
		
		System.out.println("--------------------");
		
		int cont = 1;
		while (cont <= 5) {
			System.out.println(cont + "ª Frase Exercício While");
			cont++;
		}
	}
}
