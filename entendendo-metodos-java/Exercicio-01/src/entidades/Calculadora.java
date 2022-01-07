package entidades;

public class Calculadora {

	//Método que recebe 2 parâmetros double e faz o cálculo da soma.
	public static void soma (double num1, double num2) {
		double resultado = num1 + num2;
		System.out.println("A soma de " + num1 + " + " + num2 + " = " + resultado);
	}
	
	//Método que recebe 2 parâmetros double e faz o cálculo da subtração.
	public static void subtracao (double num1, double num2) {
		double resultado = num1 + num2;
		System.out.println("A subtração de " + num1 + " - " + num2 + " = " + resultado);
	}
	
	//Método que recebe 2 parâmetros double e faz o cálculo da multiplicação.
	public static void multiplicacao (double num1, double num2) {
		double resultado = num1 + num2;
		System.out.println("A multiplicação de " + num1 + " x " + num2 + " = " + resultado);
	}
	
	//Método que recebe 2 parâmetros double e faz o cálculo da divisão.
	public static void divisao (double num1, double num2) {
		double resultado = num1 + num2;
		System.out.println("A divisão de " + num1 + " / " + num2 + " = " + resultado);
	}
	
}
