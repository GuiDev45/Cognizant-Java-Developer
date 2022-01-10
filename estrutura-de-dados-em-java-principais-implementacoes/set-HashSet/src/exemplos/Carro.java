package exemplos;

import java.util.Objects;

public class Carro implements Comparable<Carro> {

	private String marca;

	public Carro(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals(marca, other.marca);
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + "]";
	}

	//Esse m�todo est� comparando pelo tamanho da String, se for menor retorna -1,
	//Se for maior retorna 1, se forem iguais retorna 0.
	/*@Override
	public int compareTo(Carro o) {
		if (this.marca.length() < o.marca.length()) {
			return -1;
		}
		else if (this.marca.length() > o.marca.length()) {
			return 1;
		}
		return 0;
	}*/
	
	//Esse m�todo vai ordenar por ordem alfab�tica.
	@Override
	public int compareTo(Carro o) {
		return this.getMarca().compareTo(o.getMarca());
	}
	
}
