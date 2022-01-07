package entidade;

//Métodos usando return.
public class Quadrilatero {

	//Método sendo double, não é mais void/vazio como no Exercicio-02, calculando a área do quadrado.
	public static double area(double lado) {
		return lado * lado;
	}
	
	public static double area(double lado1, double lado2) {
		return lado1 * lado2;
	}
	
	public static double area(double baseMaior, double baseMenor, double altura) {
		return ((baseMaior + baseMenor) * altura) / 2;
	}
	
}
