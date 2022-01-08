package loops;

import java.util.Scanner;

/********************************************************************************
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*********************************************************************************/

public class Ex1_NomeEIdade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Digite o nome do aluno: ");
			String nome = sc.next();
			if (nome.equals("0")) break;//equals() avalia a comparação de valores nos objetos.
			
			System.out.println("Digite a idade do aluno: ");
			int idade = sc.nextInt();
			
			System.out.println(nome);
			System.out.println(idade);//Saída de dados apenas para não ficar acusando que a variável não foi inicializada.
		}
		
		System.out.println("Continua aqui...");
		
		sc.close();

	}

}
