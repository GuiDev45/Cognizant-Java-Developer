package exercicio;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 Dada a popula��o estimada de alguns estados do NE brasileiro, fa�a:
 Estado = PE - Popula��o = 9.616.621
 Estado = AL - Popula��o = 3.351.543
 Estado = CE - Popula��o = 9.187.103
 Estado = RN - Popula��o = 3.534.265
 
(A) - Crie um dicion�rio e relacione os estados e suas popula��es:
(B) - Substitua a popula��o do estado do RN por 3.534.165:
(C) - Confira se o estado PB est� no dicion�rio, caso n�o adicione: PB - 4.039.277:
(D) - Exiba a popula��o PE:
(E) - Exiba todos os estados e suas popula��es na ordem que foi informado:
(F) - Exiba os estados e suas popula��es em ordem alfab�tica:
(G) - Exiba o estado com o menor popula��o e sua quantidade:
(H) - Exiba o estado com a maior popula��o e sua quantidade:
(I) - Exiba a soma da popula��o desses estados:
(J) - Exiba a m�dia da popula��o deste dicion�rio de estados:
(K) - Remova os estados com a popula��o menor que 4.000.000:
(L) - Apague o dicion�rio de estados
(M) - Confira se o dicion�rio est� vazio.
*/

public class Main {

	public static void main(String[] args) {

		// Quest�o (A).
		System.out.println("Crie um dicion�rio e relacione os estados e suas popula��es:");
		Map<String, Integer> estados = new HashMap<>();
		estados.put("PE", 9616621);
		estados.put("AL", 3351543);
		estados.put("CE", 9187103);
		estados.put("RN", 3534265);
		
		for (Map.Entry<String, Integer> estado : estados.entrySet()) {
			System.out.println(estado.getKey() + " - " + estado.getValue());
		}

		System.out.println();
		// ---------------------------------------------------------------
		
		// Quest�o (B).
		System.out.println("Substitua a popula��o do estado do RN por 3.534.165:");
		estados.put("RN", 3534165);
		
		for (Map.Entry<String, Integer> estado : estados.entrySet()) {
			System.out.println(estado.getKey() + " - " + estado.getValue());
		}
		
		System.out.println();
		// ---------------------------------------------------------------
		
		// Quest�o (C).
		System.out.println("Confira se o estado PB est� no dicion�rio, caso n�o adicione: PB - 4.039.277:");
		System.out.println(estados.containsKey("PB"));
		estados.put("PB", 4039277);
		
		for (Map.Entry<String, Integer> estado : estados.entrySet()) {
			System.out.println(estado.getKey() + " - " + estado.getValue());
		}
		
		System.out.println();
		// ---------------------------------------------------------------
		
		// Quest�o (D).
		System.out.println("Exiba a popula��o PE");
		System.out.println(estados.get("PE"));
		
		System.out.println();
		// ---------------------------------------------------------------
		
		// Quest�o (E).
		System.out.println("Exiba todos os estados e suas popula��es na ordem que foi informado:");
		Map<String, Integer> ordemInformado = new LinkedHashMap<>();
		ordemInformado.put("PE", 9616621);
		ordemInformado.put("AL", 3351543);
		ordemInformado.put("CE", 9187103);
		ordemInformado.put("RN", 3534265);
		
		for (Map.Entry<String, Integer> estado : ordemInformado.entrySet()) {
			System.out.println(estado.getKey() + " - " + estado.getValue());
		}
		
		System.out.println();
		// ---------------------------------------------------------------
		
		// Quest�o (F).
		System.out.println("Exiba os estados e suas popula��es em ordem alfab�tica:");
		Map<String, Integer> ordemAlfabetica = new TreeMap<>(estados);
		
		for (Map.Entry<String, Integer> estado : ordemAlfabetica.entrySet()) {
			System.out.println(estado.getKey() + " - " + estado.getValue());
		}
		
		System.out.println();
		// ---------------------------------------------------------------
		
		// Quest�o (G) e Quest�o(H).
		System.out.println("Exiba o estado com o menor popula��o e sua quantidade:");
		
		Collection<Integer> populacao = estados.values();
		String maiorPopulacao = "";
        String menorPopulacao = "";
        
        for (Map.Entry<String, Integer> entry : estados.entrySet()) {
            if (entry.getValue().equals(Collections.max(populacao))) { //Se o valor da populacao for maior, maiorPopulacao recebe a chave/nome do estado
            	maiorPopulacao = entry.getKey();
            }
            if (entry.getValue().equals(Collections.min(populacao))) { //Se o valor da populacao for menor, maiorPopulacao recebe a chave/nome do estado
            	menorPopulacao = entry.getKey();
            }
        }
		
        System.out.printf("Exiba o estado com o menor popula��o (%s) e seu respectivo valor (%d)\n", menorPopulacao, Collections.min(populacao));
        
        System.out.printf("Exiba o estado com a maior popula��o (%s) e seu respectivo valor (%d)\n", maiorPopulacao, Collections.max(populacao));
		
        System.out.println();
		// ---------------------------------------------------------------
		
		// Quest�o (I).
        System.out.print("Exiba a soma da popula��o desses estados: ");
        
        int soma = 0;
        Iterator<Integer> iterator = estados.values().iterator();
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println(soma);
        
        System.out.println();
		// ---------------------------------------------------------------
		
		// Quest�o (J).
        System.out.print("Exiba a m�dia da popula��o deste dicion�rio de estados: ");
        System.out.println(soma / estados.size());
        
        System.out.println();
		// ---------------------------------------------------------------
		
		// Quest�o (K).
        System.out.println("Remova os estados com a popula��o menor que 4.000.000:");
        
        Iterator<Integer> iterator1 = estados.values().iterator();
        while(iterator1.hasNext()) {
        	if(iterator1.next() <= 4000000) {
        		iterator1.remove();
        		System.out.println(estados);
        	}
        }
        
        System.out.println();
		// ---------------------------------------------------------------
		
		// Quest�o (L).
        System.out.println("Apague o dicion�rio de estados");
        estados.clear();
        System.out.println(estados);
        
        System.out.println();
		// ---------------------------------------------------------------
		
		// Quest�o (M).
        System.out.println("Confira se o dicion�rio est� vazio. " + estados.isEmpty());
		
	}

}
