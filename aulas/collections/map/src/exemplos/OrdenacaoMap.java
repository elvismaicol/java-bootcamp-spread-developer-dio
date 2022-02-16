package exemplos;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class OrdenacaoMap {

	public static void main(String[] args) {
		System.out.println("--\tOrdem aleatória\t--");
		Map<String, Livro> meusLivros = new HashMap<>() {{
			put(" D'Eça, Othon", new Livro("Homens E Algas", 175));
			put(" Catmull, Ed", new Livro("Criatividade S.A", 413));
			put(" Hunter, James C.", new Livro("O monge e o executivo", 144));
		}};
		for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		System.out.println();

		System.out.println("--\tOrdem Inserção\t--");
		Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{
			put(" Hunter, James C.", new Livro("O monge e o executivo", 144));
			put(" Catmull, Ed", new Livro("Criatividade S.A", 413));
			put(" D'Eça, Othon", new Livro("Homens E Algas", 175));
		}};
		for (Map.Entry<String, Livro> livro : meusLivros1.entrySet())
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		System.out.println();
		
		System.out.println("--\tOrdem alfabética autores\t--");
		Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
		for (Map.Entry<String, Livro> livro : meusLivros2.entrySet())
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		System.out.println();

		System.out.println("--\tOrdem alfabética nomes dos livros\t--");
		Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
		meusLivros3.addAll(meusLivros.entrySet());
		for (Map.Entry<String, Livro> livro : meusLivros3)
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

		System.out.println("--\tOrdem número de página\t--"); //Pra você
		Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPag());
		meusLivros4.addAll(meusLivros.entrySet());
		for (Map.Entry<String, Livro> livro : meusLivros4)
			System.out.println(livro.getKey() + " - " + livro.getValue().getPaginas());
	}
}

class Livro {
	private String nome;
	private Integer paginas;

	public Livro(String nome, Integer paginas) {
		this.nome = nome;
		this.paginas = paginas;
	}

	public String getNome() {
		return nome;
	}

	public Integer getPaginas() {
		return paginas;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Livro livro = (Livro) o;
		return nome.equals(livro.nome) && paginas.equals(livro.paginas);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, paginas);
	}

	@Override
	public String toString() {
		return "Livro{" +
				"nome='" + nome + '\'' +
				", paginas=" + paginas +
				'}';
	}
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

	@Override
	public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
		return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
	}
}

class ComparatorPag implements Comparator<Map.Entry<String, Livro>>{

	@Override
	public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
		return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
	}
}

