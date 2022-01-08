package loops;

import java.util.Scanner;

/************************************************
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*************************************************/

public class Ex4_ParEImpar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int quantNumeros = 0;
		int numero = 0;
		int quantPares = 0, quantImpares = 0;

		System.out.print("Quantidade de números: ");
		quantNumeros = sc.nextInt();

		int count = 0;
		do {
			System.out.print("Número: ");
			numero = sc.nextInt();

			if (numero % 2 == 0) {
				quantPares++;
			} 
			else {
				quantImpares++;
			}

			count++;
		} while (count < quantNumeros);

		System.out.println("Quantidade Par: " + quantPares);
		System.out.println("Quantidade Ímpar: " + quantImpares);
		
		sc.close();
		
	}

}
