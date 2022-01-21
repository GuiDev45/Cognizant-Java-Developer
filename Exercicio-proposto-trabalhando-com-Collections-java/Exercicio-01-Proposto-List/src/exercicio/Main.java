package exercicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 *Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista
 *Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média, e em que mês,
 *elas ocrreram (mostrar o mês por extenso: 1 - Janeiro, 2 - Fevereiro e etc)
 */

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Double> temperatura = new ArrayList<>();

		
		int count = 0;
		while (count < 6) { //Enquanto count/contador for menor que 6 o loop continua.
			System.out.print("Digite a temperatura: ");
			double temp = sc.nextDouble(); //Entrando com os valores da temperatura.
			temperatura.add(temp); //Adicionando na lista temperatura cada temp que entrar.

			count++; //Aumentando o contator.
		}

		//Somando as temperaturas.
		Iterator<Double> iterator = temperatura.iterator(); //Usando o iterator recebendo a lista temperatura.
		double soma = 0.0;
		while (iterator.hasNext()) { //Enquanto tiver próximo elemento/hasNext().
			double next = iterator.next(); //double next recebe esse iterator.next()/próximo.
			soma += next; //Cálculo da soma dos valores.
		}

		//Fazendo a média das temperaturas.
		Double media = soma / temperatura.size(); //Cálculo da média das temperaturas, usando o método .size().
		System.out.printf("A média semestral das temperaturas é = %.2f%n", media);

		//Temperatura acima da média
		System.out.print("Temperaturas acima da média: ");
		for (Double temperaturas : temperatura) { //Laço for each para saber qual temperatura está acima da média e caso esteja, imprimir os valores.
			Double tempAcima = temperaturas;
			if (tempAcima > media) {
				System.out.printf("%.2f ", tempAcima);
			}
		}

		System.out.println();
		
		//Meses acima da média
		System.out.println("Meses das temperaturas acima da média:");
		
		Iterator<Double> iterator2 = temperatura.iterator();
		count = 0; //Contador
		while (iterator2.hasNext()) {
			Double tempAcima = iterator2.next();
			if (tempAcima > media) { //Se temperatura for acima da média, entra no witch e imprime o mês e a temperatura.
				switch (count) {
				case (0):
					System.out.printf("1 - Janeiro: %.1f%n ", tempAcima);
					break;
				case (1):
					System.out.printf("2 - Fevereiro: %.1f%n", tempAcima);
					break;
				case (2):
					System.out.printf("3 - Março: %.1f%n", tempAcima);
					break;
				case (3):
					System.out.printf("4 - Abril: %.1f%n", tempAcima);
					break;
				case (4):
					System.out.printf("5 - Maio: %.1f%n", tempAcima);
					break;
				case (5):
					System.out.printf("6 - Junho: %.1f%n", tempAcima);
					break;
				default:
					System.out.println("Não houve temperatura acima da média."); //Se não houver nenhum mês acima da média entra no default.
				}
			}
			count++;
		}

		sc.close();

	}

}
