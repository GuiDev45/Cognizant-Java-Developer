package exemplos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		Set<Carro> hashSetCarros = new HashSet<>();
		
		hashSetCarros.add(new Carro("Ford"));
		hashSetCarros.add(new Carro("Chevrolet"));
		hashSetCarros.add(new Carro("Fiat"));
		hashSetCarros.add(new Carro("Peugeot"));
		hashSetCarros.add(new Carro("Zip"));
		hashSetCarros.add(new Carro("Alfa Romeo"));
		
		//HashSet n�o preserva a ordem de inser��o, ent�o ao mandar imprimir vai vir "embaralhado".
		System.out.println(hashSetCarros);
		
		//Como � uma estrutura de �rvore, na classe carro � necess�rio o implements Comparable<Carro>,
		//essa implementa��o vai trazer o public int compareTo(Carro o)
		Set<Carro> treeSetCarros = new TreeSet<>();
		
		treeSetCarros.add(new Carro("Ford"));
		treeSetCarros.add(new Carro("Chevrolet"));
		treeSetCarros.add(new Carro("Fiat"));
		treeSetCarros.add(new Carro("Peugeot"));
		treeSetCarros.add(new Carro("Zip"));
		treeSetCarros.add(new Carro("Alfa Romeo"));
		
		System.out.println(treeSetCarros);
		
	}

}
