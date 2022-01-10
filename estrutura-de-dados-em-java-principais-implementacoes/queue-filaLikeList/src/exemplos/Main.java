package exemplos;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {

		Queue<Carro> queueCarros = new LinkedList<>();
		
		queueCarros.add(new Carro("Ford"));
		queueCarros.add(new Carro("Chevrolet"));
		queueCarros.add(new Carro("Fiat"));
		
		System.out.println(queueCarros.add(new Carro("Peugeot")));//Adicionou um novo elemento na fila "Peugeot".
		System.out.println(queueCarros);
		
		System.out.println(queueCarros.offer(new Carro("Renault")));//Método .offer retorna false se ele não conseguir adicionar,
		System.out.println(queueCarros);                            //a diferença dele para o .add, é que ele retornar um booleano,
																	//se conseguiu ou não adicionar.
		
		System.out.println(queueCarros.peek());//Método .peek vai pegar o primeiro elemento da fila, que no caso é "Ford",
		System.out.println(queueCarros);       //caso a fial esteja vazia ele vai retornar null.
		                                       //OBS: o peek não remove, ele apenas mostra.
		
		System.out.println(queueCarros.poll());//Método .poll esse sim pega o primeiro elemento da fila, no caso "Ford",
		System.out.println(queueCarros);       //e remove ele da fila.
		
		System.out.println(queueCarros.isEmpty());//Ele diz se a fila está vazia ou não, false caos não estejava vazia, e true se estiver vazia.
		
		System.out.println(queueCarros.size());//Método .size, mostra o tamanho da fila.
		
	}

}
