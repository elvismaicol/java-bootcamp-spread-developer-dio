package exercicios;

public class Bandas implements Comparable<Bandas>{
	
	private String nome;
	private Integer discos;
	
	public Bandas() {
	}
	
	public Bandas(String nome, Integer discos) {
		this.nome = nome;
		this.discos = discos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getDiscos() {
		return discos;
	}

	public void setDiscos(Integer discos) {
		this.discos = discos;
	}
	
	@Override
	public String toString() {
		//return "[nome=" + nome + ", discos=" + discos + "]";
		return "[Banda: " + nome + ", Qtd discos: " + discos + "]";
	}

	@Override
	public int compareTo(Bandas o) {
		return this.getDiscos() - o.getDiscos();
	}
}
