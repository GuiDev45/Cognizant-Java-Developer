package entidades;

public class Calculadora {

	//M�todo que recebe 2 par�metros double e faz o c�lculo da soma.
	public static void soma (double num1, double num2) {
		double resultado = num1 + num2;
		System.out.println("A soma de " + num1 + " + " + num2 + " = " + resultado);
	}
	
	//M�todo que recebe 2 par�metros double e faz o c�lculo da subtra��o.
	public static void subtracao (double num1, double num2) {
		double resultado = num1 + num2;
		System.out.println("A subtra��o de " + num1 + " - " + num2 + " = " + resultado);
	}
	
	//M�todo que recebe 2 par�metros double e faz o c�lculo da multiplica��o.
	public static void multiplicacao (double num1, double num2) {
		double resultado = num1 + num2;
		System.out.println("A multiplica��o de " + num1 + " x " + num2 + " = " + resultado);
	}
	
	//M�todo que recebe 2 par�metros double e faz o c�lculo da divis�o.
	public static void divisao (double num1, double num2) {
		double resultado = num1 + num2;
		System.out.println("A divis�o de " + num1 + " / " + num2 + " = " + resultado);
	}
	
}
