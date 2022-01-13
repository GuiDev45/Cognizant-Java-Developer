package entidades;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	//Uma lista do tipo conta instanciando ArrayList.
	private List<Conta> contas = new ArrayList<>();

	public List<Conta> getContas() {
		return contas;
	}

	//Adiciona uma conta na lista de contas.
	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}

	//Remove uma conta na lista de contas.
	public void removerConta(Conta conta) {
		contas.remove(conta);
	}

	//Supondo que seja necessário depositar em todas as contas, esse método faz isso, um exemplo passando o valor 10.0.
	public void depositoTodasContas() {
		for (Conta acc : contas) {
			acc.deposito(10.0);
		}
	}

	//Soma todas as contas, corrente e poupança.
	public void somaTotalContas() {
		double soma = 0.0;
		for (Conta acc : contas) {
			soma += acc.getSaldo();
		}
		System.out.printf("Total de todas as contas somadas: %.2f%n", soma);
	}

	//Imprimi o saldo atualizado de cada conta que está na lista contas.
	public void atualizarTodoSaldo() {
		for (Conta acc : contas) {
			System.out.printf("Saldo Atualizado: conta %d: %.2f%n", acc.getNumero(), acc.getSaldo());
		}
	}

}
