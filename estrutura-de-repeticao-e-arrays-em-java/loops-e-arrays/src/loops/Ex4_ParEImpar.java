package loops;

import java.util.Scanner;

/************************************************
Fa�a um programa que pe�a N n�meros inteiros,
calcule e mostre a quantidade de n�meros pares
e a quantidade de n�meros impares.
*************************************************/

public class Ex4_ParEImpar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int quantNumeros = 0;
		int numero = 0;
		int quantPares = 0, quantImpares = 0;

		System.out.print("Quantidade de n�meros: ");
		quantNumeros = sc.nextInt();

		int count = 0;
		do {
			System.out.print("N�mero: ");
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
		System.out.println("Quantidade �mpar: " + quantImpares);
		
		sc.close();
		
	}

}
