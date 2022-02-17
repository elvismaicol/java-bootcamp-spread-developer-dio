package exercicios;

import java.util.TreeMap;

public class Map {
	public static void main(String[] args) {
		
		TreeMap<String, String> estadosBr = new TreeMap<>();
		
		estadosBr.put("AC", "Acre");
		estadosBr.put("AL", "Alagoas");
		estadosBr.put("AP", "Amapá");
		estadosBr.put("AM", "Amazonas");
		estadosBr.put("BA", "Bahia");
		estadosBr.put("CE", "Ceará");
		estadosBr.put("ES", "Espírito Santo");
		estadosBr.put("GO", "Goiás");
		estadosBr.put("MA", "Maranhão");
		estadosBr.put("MT", "Mato Grosso");
		estadosBr.put("MS", "Mato Grosso do Sul");
		estadosBr.put("MG", "Minas Gerais");
		estadosBr.put("PA", "Pará");
		estadosBr.put("PB", "Paraíba");
		estadosBr.put("PR", "Paraná");
		estadosBr.put("PE", "Pernambuco");
		estadosBr.put("PI", "Piauí");
		estadosBr.put("RJ", "Rio de Janeiro");
		estadosBr.put("RN", "Rio Grande do Norte");
		estadosBr.put("RS", "Rio Grande do Sul");
		estadosBr.put("RO", "Rondônia");
		estadosBr.put("RR", "Roraima");
		estadosBr.put("SC", "Santa Catarina");
		estadosBr.put("SP", "São Paulo");
		estadosBr.put("SE", "Sergipe");
		estadosBr.put("TO", "Tocantins");
		
		System.out.println(estadosBr);
		System.out.println();

		//Remover o estado de Minas Gerais
		System.out.println("Removendo o estado de Minas Gerais");
		estadosBr.remove("MG");
		System.out.println(estadosBr);
		System.out.println();
		
		//Adicionar o Distrito Federal
		System.out.println("Adicionando o DF");
		estadosBr.put("DF", "Distrito Federal");
		System.out.println(estadosBr);
		System.out.println();
		
		//Verificando o tamanho do Map
		System.out.println("O tamanho do Map é: " + estadosBr.size());
		
		//Remover o estado de Mato Grosso do Sul pelo nome
		System.out.println("Removendo o estado de Minas Gerais");
		estadosBr.remove("MG");
		System.out.println(estadosBr);
		System.out.println();
		
		//Visualizando Nome (Sigla) 
		for(String sigla: estadosBr.keySet()) {
			System.out.println(estadosBr.get(sigla) + " (" + sigla + ")");
		}
		System.out.println();
		
		//Verificando se Existe SC no Map
		System.out.println("Há o estado de SC no Map: " + estadosBr.containsKey("SC"));
		System.out.println();
		
		//Verificando se o estado Maranhão no Map
		System.out.println("Há o estado de Maranhão no Map: " + estadosBr.containsValue("Maranhão"));				
	}
}
