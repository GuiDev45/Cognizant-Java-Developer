package exemplos;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Carro> listCarros = new ArrayList<>();
		
		listCarros.add(new Carro("Ford"));
		listCarros.add(new Carro("Chevrolet"));
		listCarros.add(new Carro("Fiat"));
		listCarros.add(new Carro("Peugeot"));
		
		System.out.println(listCarros.contains(new Carro("Ford")));//Método .contains, pergunta pra lista se contêm um elemento, 
		                                                           //no caso o elemento "Ford", se tiver o elemento ele retorna true.
		
		System.out.println(listCarros.get(2));//Pegou o elemento no índice 2, no caso o "Fiat".
		
		System.out.println(listCarros.indexOf(new Carro("Fiat")));//Método que mostra qual índice que está o elemento "Fiat",
																  //no caso vai estar no índice 2.
		
		System.out.println(listCarros.remove(2));//Método .remove, vai remover um elemento "Fiat", no caso com o numero do índice passado 2.
		System.out.println(listCarros);
		
	}

}
