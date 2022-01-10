package exemplos;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Stack<Carro> stackCarros = new Stack<>();
		
		stackCarros.push(new Carro("Ford"));
		stackCarros.push(new Carro("Chevrolet"));
		stackCarros.push(new Carro("Fiat"));
		
		System.out.println(stackCarros);
		System.out.println(stackCarros.pop());//Removeu o que estava no topo da pilha, no caso "Fiat"
		System.out.println(stackCarros);
		
		System.out.println(stackCarros.peek());//Mostro o que estava no topo da pilha, como "Fiat" saiu ficou "Chevrolet",
		System.out.println(stackCarros);	   //o peek apenas mostra o que está no topo, não faz outra ação.
		
		System.out.println(stackCarros.empty());//Testa se a pilha está vazia, caso esteja vai imprimir false.
		
	}

}
