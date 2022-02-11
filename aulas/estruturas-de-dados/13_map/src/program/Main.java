package program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Map<String, String> aluno = new HashMap<>();
		
		aluno.put("nome", "Jo�o");
		aluno.put("Idade", "17");
		aluno.put("M�dia", "8.5");
		aluno.put("Turma", "3a");
		
		System.out.println(aluno);
		System.out.println();
		
		System.out.println(aluno.keySet());
		System.out.println(aluno.values());
		System.out.println();
		
		List< Map<String, String> > listaAlunos = new ArrayList<>();
		
		listaAlunos.add(aluno);
		
		Map<String, String> aluno2 = new HashMap<>();
		
		aluno2.put("nome", "Maria");
		aluno2.put("Idade", "18");
		aluno2.put("M�dia", "8.9");
		aluno2.put("Turma", "3b");
		
		listaAlunos.add(aluno2);
		
		System.out.println(aluno2);
		System.out.println();
		
		System.out.println(listaAlunos);
		System.out.println();
		
		System.out.println(aluno.containsKey("Nome"));
	}
}
