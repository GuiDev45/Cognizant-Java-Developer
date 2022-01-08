package loops;

import java.util.Scanner;

/**************************************
Fa�a um programa que leia 5 n�meros
e informe o maior n�mero
e a m�dia desses n�meros.
***************************************/

public class Ex3_MaiorEMedia {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		int maior = 0;
		int soma = 0;
		
		int count = 0;
		do {
			System.out.print("N�mero: ");
			numero = sc.nextInt();
			
			soma += numero;
			
			if (numero > maior) {
				maior = numero;
			}
			
			count ++;
		} while(count < 5);
		
		System.out.println("Maior: " + maior);
		System.out.println("M�dia: " + (soma / 5));
		
		sc.close();

	}

}