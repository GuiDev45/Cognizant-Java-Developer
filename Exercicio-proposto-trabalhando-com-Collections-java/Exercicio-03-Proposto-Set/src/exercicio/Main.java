package exercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 Crie um conjunto contendo as cores do arco-�ris e: 
 A. Exiba todas as cores uma abaixo da outra 
 B. A quantidade de cores que o arco-�ris tem 
 C. Exiba as cores em ordem alfab�tica 
 D. Exiba as cores na ordem inversa da que foi informada 
 E. Exiba todas as cores que come�am com a letra �v� 
 F. Remova todas as cores que n�o come�am com a letra �v� 
 G. Limpe o conjunto
 H. Confira se o conjunto est� vazio
 */

public class Main {

	public static void main(String[] args) {

		// Crie um conjunto contendo as cores do arco-�ris e:
		Set<String> arcoIris = new LinkedHashSet<>();
		
		arcoIris.add("vermelho");
		arcoIris.add("laranja");
		arcoIris.add("amarelo");
		arcoIris.add("verde");
		arcoIris.add("azul");
		arcoIris.add("anil");
		arcoIris.add("violeta");
		System.out.println(arcoIris);
		
		System.out.println();
		//---------------------------------------------------------------
		
		// Quest�o (A).
		System.out.println("Exiba todas as cores uma abaixo da outra:");
		for (String cor : arcoIris) {
			System.out.println(cor);
		}
		
		System.out.println();
		//---------------------------------------------------------------
		
		// Quest�o (B).
		System.out.print("A quantidade de cores que o arco-�ris tem: " + arcoIris.size() + " cores.\n");
		
		System.out.println();
		//---------------------------------------------------------------

		// Quest�o (C).
		System.out.println("Exiba as cores em ordem alfab�tica:");
		Set<String> ordemAlfabetica = new TreeSet<>(arcoIris);
		System.out.println(ordemAlfabetica);
		
		System.out.println();
		//---------------------------------------------------------------
		
		// Quest�o (D).
		System.out.println("Exiba as cores na ordem inversa da que foi informada:");
		List<String> ordemInversa = new ArrayList<>(arcoIris);
		Collections.reverse(ordemInversa);
		System.out.println(ordemInversa);
		
		System.out.println();
		//---------------------------------------------------------------
		
		// Quest�o (E).
		System.out.println("Exiba todas as cores que come�am com a letra �v�");
		for (String cor : arcoIris) {
			if (cor.startsWith("v")) {
				System.out.println(cor);
			}
		}
		
		System.out.println();
		//---------------------------------------------------------------
		
		// Quest�o (F).
		System.out.println("Remova todas as cores que n�o come�am com a letra �v�:");
        Iterator<String> iterator = arcoIris.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().startsWith("v")) {
            	iterator.remove();
            }
        }
		System.out.println(arcoIris);
		
		System.out.println();
		//---------------------------------------------------------------
		
		// Quest�o (G).
		System.out.println("Limpe o conjunto");
		arcoIris.clear();
		System.out.println(arcoIris);
		
		System.out.println();
		//---------------------------------------------------------------
		
		// Quest�o (H).
		System.out.println("Confira se o conjunto est� vazio: " + arcoIris.isEmpty());
		
	}

}
