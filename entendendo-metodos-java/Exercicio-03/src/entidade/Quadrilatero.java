package entidade;

//M�todos usando return.
public class Quadrilatero {

	//M�todo sendo double, n�o � mais void/vazio como no Exercicio-02, calculando a �rea do quadrado.
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
