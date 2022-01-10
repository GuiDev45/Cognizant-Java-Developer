package exemplos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Map<String, String> aluno = new HashMap<>();

		aluno.put("Nome", "João");
		aluno.put("Idade", "17");
		aluno.put("Media", "8.5");
		aluno.put("Turma", "3a");

		System.out.println(aluno);

		System.out.println(aluno.keySet());//Método.keySet(), retorna um set ou seja um grupo das chaves,
											//toda a estrutura que tem em aluno, [Turma, Idade, Media, Nome]

		System.out.println(aluno.values());//Método .values, retorna os valores que existem em aluno,
											//[3a, 17, 8.5, João]

		//É possível ter uma lista de alunos, uma lista de maps...
		List<Map<String, String>> listaAlunos = new ArrayList<>();

		listaAlunos.add(aluno);

		Map<String, String> aluno2 = new HashMap<>();

		aluno2.put("Nome", "Maria");
		aluno2.put("Idade", "18");
		aluno2.put("Media", "8.9");
		aluno2.put("Turma", "3b");
		
		listaAlunos.add(aluno2);
		
		System.out.println(listaAlunos);

		System.out.println(aluno.containsKey("Nome"));//Método que procura no map se tem uma chave chamada no caso "Nome",
													  //Se sim retorna true.	
		
	}

}
