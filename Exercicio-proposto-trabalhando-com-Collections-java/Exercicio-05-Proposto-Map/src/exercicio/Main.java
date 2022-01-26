package exercicio;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 Dada a população estimada de alguns estados do NE brasileiro, faça:
 Estado = PE - População = 9.616.621
 Estado = AL - População = 3.351.543
 Estado = CE - População = 9.187.103
 Estado = RN - População = 3.534.265
 
(A) - Crie um dicionário e relacione os estados e suas populações:
(B) - Substitua a população do estado do RN por 3.534.165:
(C) - Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277:
(D) - Exiba a população PE:
(E) - Exiba todos os estados e suas populações na ordem que foi informado:
(F) - Exiba os estados e suas populações em ordem alfabética:
(G) - Exiba o estado com o menor população e sua quantidade:
(H) - Exiba o estado com a maior população e sua quantidade:
(I) - Exiba a soma da população desses estados:
(J) - Exiba a média da população deste dicionário de estados:
(K) - Remova os estados com a população menor que 4.000.000:
(L) - Apague o dicionário de estados
(M) - Confira se o dicionário está vazio.
*/

public class Main {

	public static void main(String[] args) {

		// Questão (A).
		System.out.println("Crie um dicionário e relacione os estados e suas populações:");
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
		
		// Questão (B).
		System.out.println("Substitua a população do estado do RN por 3.534.165:");
		estados.put("RN", 3534165);
		
		for (Map.Entry<String, Integer> estado : estados.entrySet()) {
			System.out.println(estado.getKey() + " - " + estado.getValue());
		}
		
		System.out.println();
		// ---------------------------------------------------------------
		
		// Questão (C).
		System.out.println("Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277:");
		System.out.println(estados.containsKey("PB"));
		estados.put("PB", 4039277);
		
		for (Map.Entry<String, Integer> estado : estados.entrySet()) {
			System.out.println(estado.getKey() + " - " + estado.getValue());
		}
		
		System.out.println();
		// ---------------------------------------------------------------
		
		// Questão (D).
		System.out.println("Exiba a população PE");
		System.out.println(estados.get("PE"));
		
		System.out.println();
		// ---------------------------------------------------------------
		
		// Questão (E).
		System.out.println("Exiba todos os estados e suas populações na ordem que foi informado:");
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
		
		// Questão (F).
		System.out.println("Exiba os estados e suas populações em ordem alfabética:");
		Map<String, Integer> ordemAlfabetica = new TreeMap<>(estados);
		
		for (Map.Entry<String, Integer> estado : ordemAlfabetica.entrySet()) {
			System.out.println(estado.getKey() + " - " + estado.getValue());
		}
		
		System.out.println();
		// ---------------------------------------------------------------
		
		// Questão (G) e Questão(H).
		System.out.println("Exiba o estado com o menor população e sua quantidade:");
		
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
		
        System.out.printf("Exiba o estado com o menor população (%s) e seu respectivo valor (%d)\n", menorPopulacao, Collections.min(populacao));
        
        System.out.printf("Exiba o estado com a maior população (%s) e seu respectivo valor (%d)\n", maiorPopulacao, Collections.max(populacao));
		
        System.out.println();
		// ---------------------------------------------------------------
		
		// Questão (I).
        System.out.print("Exiba a soma da população desses estados: ");
        
        int soma = 0;
        Iterator<Integer> iterator = estados.values().iterator();
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println(soma);
        
        System.out.println();
		// ---------------------------------------------------------------
		
		// Questão (J).
        System.out.print("Exiba a média da população deste dicionário de estados: ");
        System.out.println(soma / estados.size());
        
        System.out.println();
		// ---------------------------------------------------------------
		
		// Questão (K).
        System.out.println("Remova os estados com a população menor que 4.000.000:");
        
        Iterator<Integer> iterator1 = estados.values().iterator();
        while(iterator1.hasNext()) {
        	if(iterator1.next() <= 4000000) {
        		iterator1.remove();
        		System.out.println(estados);
        	}
        }
        
        System.out.println();
		// ---------------------------------------------------------------
		
		// Questão (L).
        System.out.println("Apague o dicionário de estados");
        estados.clear();
        System.out.println(estados);
        
        System.out.println();
		// ---------------------------------------------------------------
		
		// Questão (M).
        System.out.println("Confira se o dicionário está vazio. " + estados.isEmpty());
		
	}

}
