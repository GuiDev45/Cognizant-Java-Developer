package entidades;

public class Emprestimo {

	//Método do tipo que retorna um int e seu parâmetro é vazio.
	public static int getDuasParcelas() {
		return 2;
	}
	
	//Método do tipo que retorna um int e seu parâmetro é vazio.
	public static int getTresParcelas() {
		return 3;
	}
	
	//Método do tipo que retorna um double e seu parâmetro é vazio.
	public static double getTaxaDuasParcelas() {
		return 0.3;
	}
	
	//Método do tipo que retorna um double e seu parâmetro é vazio.
	public static double getTaxaTresParcelas() {
		return 0.45;
	}
	
	//Método com 2 parâmetros diferentens e uma estrutura condicional para o cálculo.
	public static void calcular(double valor, int parcelas) {
		if (parcelas == 2) {
			double valorFinal = valor + (valor * getTaxaDuasParcelas());
			System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);
		}
		else if (parcelas == 3) {
			double valorFinal = valor + (valor * getTaxaTresParcelas());
			System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);
		}
		else {
			System.out.println("Quantidade de parcelas não aceita.");
		}
	}
	
}
