package exercicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 *Fa�a um programa que receba a temperatura m�dia dos 6 primeiros meses do ano e armazene-as em uma lista
 *Ap�s isto, calcule a m�dia semestral das temperaturas e mostre todas as temperaturas acima desta m�dia, e em que m�s,
 *elas ocrreram (mostrar o m�s por extenso: 1 - Janeiro, 2 - Fevereiro e etc)
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
		while (iterator.hasNext()) { //Enquanto tiver pr�ximo elemento/hasNext().
			double next = iterator.next(); //double next recebe esse iterator.next()/pr�ximo.
			soma += next; //C�lculo da soma dos valores.
		}

		//Fazendo a m�dia das temperaturas.
		Double media = soma / temperatura.size(); //C�lculo da m�dia das temperaturas, usando o m�todo .size().
		System.out.printf("A m�dia semestral das temperaturas � = %.2f%n", media);

		//Temperatura acima da m�dia
		System.out.print("Temperaturas acima da m�dia: ");
		for (Double temperaturas : temperatura) { //La�o for each para saber qual temperatura est� acima da m�dia e caso esteja, imprimir os valores.
			Double tempAcima = temperaturas;
			if (tempAcima > media) {
				System.out.printf("%.2f ", tempAcima);
			}
		}

		System.out.println();
		
		//Meses acima da m�dia
		System.out.println("Meses das temperaturas acima da m�dia:");
		
		Iterator<Double> iterator2 = temperatura.iterator();
		count = 0; //Contador
		while (iterator2.hasNext()) {
			Double tempAcima = iterator2.next();
			if (tempAcima > media) { //Se temperatura for acima da m�dia, entra no witch e imprime o m�s e a temperatura.
				switch (count) {
				case (0):
					System.out.printf("1 - Janeiro: %.1f%n ", tempAcima);
					break;
				case (1):
					System.out.printf("2 - Fevereiro: %.1f%n", tempAcima);
					break;
				case (2):
					System.out.printf("3 - Mar�o: %.1f%n", tempAcima);
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
					System.out.println("N�o houve temperatura acima da m�dia."); //Se n�o houver nenhum m�s acima da m�dia entra no default.
				}
			}
			count++;
		}

		sc.close();

	}

}
