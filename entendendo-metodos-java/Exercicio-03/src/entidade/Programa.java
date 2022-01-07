package entidade;

public class Programa {

	public static void main(String[] args) {

		//Retornos
		System.out.println("Exercício quadrilátero\n");
		
		//Agora é possível guardar os métodos em variáveis, eles retornam valor. 
		double areaQuadrado = Quadrilatero.area(3);
		System.out.println("Área do quadrado: " + areaQuadrado);
		
		double areaRetangulo = Quadrilatero.area(5, 5);
		System.out.println("Área do retângulo: " + areaRetangulo);
		
		double areaTrapezio = Quadrilatero.area(7, 8, 9);
		System.out.println("Área do trapézio: " + areaTrapezio);

	}

}
