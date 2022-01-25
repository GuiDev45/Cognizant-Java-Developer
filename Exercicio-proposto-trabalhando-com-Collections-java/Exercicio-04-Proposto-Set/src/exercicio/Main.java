package exercicio;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/*
 Crie uma classe LinguagemFavorita que possua os atributos:
 nome, anoDeCriacao e ide. Em seguida, crie um conjunto com
 3 linguagens e faça um programa que ordene esse conjunto
 por:
 A. Ordem de Inserção
 B. Ordem Natural (nome)
 C. Ordem (IDE)
 D. Ordem Ano de criação e nome
 E. Ordem Nome, ano de criacao e IDE
 Ao final, exiba as linguagens no console, um abaixo da outra.
 */

public class Main {

	public static void main(String[] args) {

		// Crie um conjunto com 3 linguagens.
		System.out.println("Crie um conjunto com 3 linguagens.");
		Set<LinguagemFavorita> linguagens = new HashSet<>();
		linguagens.add(new LinguagemFavorita("Java", 1991, "Eclipse"));
		linguagens.add(new LinguagemFavorita("Python", 1990, "PyCharm"));
		linguagens.add(new LinguagemFavorita("C#", 1983, "Visual Studio"));

		for (LinguagemFavorita linguagem : linguagens) {
			System.out.println(linguagem);
		}

		System.out.println();
		// ---------------------------------------------------------------

		// Questão (A).
		System.out.println("Ordem de Inserção");
		Set<LinguagemFavorita> ordemDeInsercao = new LinkedHashSet<>();
		ordemDeInsercao.add(new LinguagemFavorita("Java", 1991, "Eclipse"));
		ordemDeInsercao.add(new LinguagemFavorita("Python", 1990, "PyCharm"));
		ordemDeInsercao.add(new LinguagemFavorita("C#", 1983, "Visual Studio"));

		for (LinguagemFavorita linguagem : ordemDeInsercao) {
			System.out.println(linguagem);
		}

		System.out.println();
		// ---------------------------------------------------------------

		// Questão (B).
		System.out.println("Ordem Natural (nome)");
		Set<LinguagemFavorita> ordemNaturalNome = new TreeSet<>(linguagens);

		for (LinguagemFavorita linguagem : ordemNaturalNome) {
			System.out.println(linguagem);
		}

		System.out.println();
		// ---------------------------------------------------------------

		// Questão (C).
		System.out.println("Ordem (IDE)");
		Set<LinguagemFavorita> ordemIde = new TreeSet<>(new ComparatorIde());
		ordemIde.addAll(linguagens);
		
		for (LinguagemFavorita linguagem : ordemIde) {
			System.out.println(linguagem);
		}
		
		System.out.println();
		// ---------------------------------------------------------------

		// Questão (D).
		System.out.println("Ordem Ano de criação e nome");
		Set<LinguagemFavorita> ordemAnoCriacaoNome = new TreeSet<>(new ComparatorAnoDeCriacaoENome());
		ordemAnoCriacaoNome.addAll(linguagens);
        
        for (LinguagemFavorita linguagem : ordemAnoCriacaoNome) {
        	System.out.println(linguagem);
        }

        System.out.println();
		// ---------------------------------------------------------------

		// Questão (D).
        System.out.println("Ordem Nome, ano de criacao e IDE");
        Set<LinguagemFavorita> ordemNomeAnoCriacaoIde = new TreeSet<>(new ComparatorNomeAnoDeCriacaoIde());
        ordemNomeAnoCriacaoIde.addAll(linguagens);
        
        for (LinguagemFavorita linguagem : ordemNomeAnoCriacaoIde) {
        	System.out.println(linguagem);
        }
        
	}

}

class LinguagemFavorita implements Comparable<LinguagemFavorita> {

	public String nome;
	public Integer anoDeCriacao;
	public String ide;

	public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
		this.nome = nome;
		this.anoDeCriacao = anoDeCriacao;
		this.ide = ide;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getAnoDeCriacao() {
		return anoDeCriacao;
	}

	public void setAnoDeCriacao(Integer anoDeCriacao) {
		this.anoDeCriacao = anoDeCriacao;
	}

	public String getIde() {
		return ide;
	}

	public void setIde(String ide) {
		this.ide = ide;
	}

	@Override
	public int hashCode() {
		return Objects.hash(anoDeCriacao, ide, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinguagemFavorita other = (LinguagemFavorita) obj;
		return Objects.equals(anoDeCriacao, other.anoDeCriacao) && Objects.equals(ide, other.ide)
				&& Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "LinguagemFavorita [nome = " + nome + ", anoDeCriacao = " + anoDeCriacao + ", ide = " + ide + "]";
	}

	@Override
	public int compareTo(LinguagemFavorita linguagem) {
		return this.nome.compareTo(linguagem.nome);
	}

}

class ComparatorIde implements Comparator<LinguagemFavorita> {
	@Override
	public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
		return lf1.ide.compareToIgnoreCase(lf2.ide);
	}

}

class ComparatorAnoDeCriacaoENome implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.nome.compareToIgnoreCase(lf2.nome);
    }
    
}

class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int nome = lf1.nome.compareToIgnoreCase(lf2.nome);
        int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
        if (nome != 0) return nome;
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.ide.compareToIgnoreCase(lf2.ide);
    }
    
}
