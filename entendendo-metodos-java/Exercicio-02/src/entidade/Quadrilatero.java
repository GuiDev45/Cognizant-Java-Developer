package entidade;

//Entendendo a sobrecarga, mant�m o nome dos m�todos por�m os par�metros s�o diferentes.
public class Quadrilatero {

	//M�todo que calcula a �rea do quadrado.
	public static void area(double lado) {
		System.out.println("�rea do quadrado: " + lado * lado);
	}
	
	//M�todo que calcula a �rea do ret�ngulo.
	public static void area(double lado1, double lado2) {
		System.out.println("�rea do ret�ngulo: " + lado1 * lado2);
	}
	
	//M�todo que calcula a �rea do trap�zio.
	public static void area(double baseMaior, double baseMenor, double altura) {
		System.out.println("�rea do trap�zio: " + ((baseMaior + baseMenor) * altura) / 2);
	}
	
	//M�todo que calcula a �rea do losango.
	//O par�metro recebeu float porque os par�metros da area do re�ngulo, j� possu� 2 double e ocorreria um conflito,
	//pelo fato de ter o mesmo nome do m�todo e repetir os tipos de par�metros, mesmo os par�metros tendo outros nomes.
	//S� o nome do par�metro sendo diferente, n�o � o suficiente para criar a sobrecarga.
	public static void area(float diagonal1, float diagonal2) {
		System.out.println("�rea do losango: " + (diagonal1 * diagonal2) / 2);
	}
	
}
