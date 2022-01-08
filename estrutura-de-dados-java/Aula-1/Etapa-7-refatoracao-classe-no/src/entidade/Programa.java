package entidade;

public class Programa {

	public static void main(String[] args) {
		
		No<String> no1 = new No<>("Conte�do no1");
		// Tentar setar o conte�do como string
		No<String> no2 = new No<>("Conte�do no2");
		no1.setProximoNo(no2);

		No<String> no3 = new No<>("Conte�do no3");
		no2.setProximoNo(no3);

		No<String> no4 = new No<>("Conte�do no4");
		no3.setProximoNo(no4);

		System.out.println(no1.toStringEncadeado());
		System.out.println(no2.toStringEncadeado());
		System.out.println(no3.toStringEncadeado());
		System.out.println(no4.toStringEncadeado());
	}

}
