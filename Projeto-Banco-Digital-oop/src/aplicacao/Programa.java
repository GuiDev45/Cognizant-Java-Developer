package aplicacao;

import entidades.Banco;
import entidades.ContaCorrente;
import entidades.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {

		Banco banco = new Banco();
		
		//Instâncias de conta corrent e conta poupança.
		ContaCorrente acc1 = new ContaCorrente(12345678, "Augusto Rocha", 500.0);
		ContaPoupanca acc2 = new ContaPoupanca(78945612, "Vanessa Pena", 300.0);
		ContaCorrente acc3 = new ContaCorrente(15935765, "Alfredo Barbosa", 800.0);
		ContaPoupanca acc4 = new ContaPoupanca(15975322, "Julia Alfena", 1500.0);
		
		//Depositando valor em uma das contas instanciadas, no caso acc2.
		acc2.deposito(350.0);
		System.out.println(acc2);
		
		//Saque de um valor em uma das contas instanciadas, no caso acc4.
		acc4.saque(500.0);
		System.out.println(acc4);
		
		//Adicionando as contas em uma lista.
		banco.adicionarConta(acc1);
		banco.adicionarConta(acc2);
		banco.adicionarConta(acc3);
		banco.adicionarConta(acc4);
		
		//Removendo uma conta da lista de contas.
		banco.removerConta(acc4);
		
		//Deposita um valor em todas as contas, (olhar a classe Banco).
		banco.depositoTodasContas();
		
		//Mostra o saldo de cada conta atualizado.
		banco.atualizarTodoSaldo();
		
		//Soma o saldo de todas as contas.
		banco.somaTotalContas();

	}

}
