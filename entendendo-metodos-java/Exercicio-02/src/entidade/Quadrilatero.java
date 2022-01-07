package entidade;

//Entendendo a sobrecarga, mantém o nome dos métodos porém os parâmetros são diferentes.
public class Quadrilatero {

	//Método que calcula a área do quadrado.
	public static void area(double lado) {
		System.out.println("Área do quadrado: " + lado * lado);
	}
	
	//Método que calcula a área do retângulo.
	public static void area(double lado1, double lado2) {
		System.out.println("Área do retângulo: " + lado1 * lado2);
	}
	
	//Método que calcula a área do trapézio.
	public static void area(double baseMaior, double baseMenor, double altura) {
		System.out.println("Área do trapézio: " + ((baseMaior + baseMenor) * altura) / 2);
	}
	
	//Método que calcula a área do losango.
	//O parâmetro recebeu float porque os parâmetros da area do reângulo, já possuí 2 double e ocorreria um conflito,
	//pelo fato de ter o mesmo nome do método e repetir os tipos de parâmetros, mesmo os parâmetros tendo outros nomes.
	//Só o nome do parâmetro sendo diferente, não é o suficiente para criar a sobrecarga.
	public static void area(float diagonal1, float diagonal2) {
		System.out.println("Área do losango: " + (diagonal1 * diagonal2) / 2);
	}
	
}
