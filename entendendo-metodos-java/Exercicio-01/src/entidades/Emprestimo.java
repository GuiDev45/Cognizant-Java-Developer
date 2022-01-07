package entidades;

public class Emprestimo {

	//M�todo do tipo que retorna um int e seu par�metro � vazio.
	public static int getDuasParcelas() {
		return 2;
	}
	
	//M�todo do tipo que retorna um int e seu par�metro � vazio.
	public static int getTresParcelas() {
		return 3;
	}
	
	//M�todo do tipo que retorna um double e seu par�metro � vazio.
	public static double getTaxaDuasParcelas() {
		return 0.3;
	}
	
	//M�todo do tipo que retorna um double e seu par�metro � vazio.
	public static double getTaxaTresParcelas() {
		return 0.45;
	}
	
	//M�todo com 2 par�metros diferentens e uma estrutura condicional para o c�lculo.
	public static void calcular(double valor, int parcelas) {
		if (parcelas == 2) {
			double valorFinal = valor + (valor * getTaxaDuasParcelas());
			System.out.println("Valor final do empr�stimo para 2 parcelas: R$ " + valorFinal);
		}
		else if (parcelas == 3) {
			double valorFinal = valor + (valor * getTaxaTresParcelas());
			System.out.println("Valor final do empr�stimo para 3 parcelas: R$ " + valorFinal);
		}
		else {
			System.out.println("Quantidade de parcelas n�o aceita.");
		}
	}
	
}
