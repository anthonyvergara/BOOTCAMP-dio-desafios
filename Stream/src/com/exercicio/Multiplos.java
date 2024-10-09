package com.exercicio;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Multiplos {
	
//	Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
//		Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.

	public List<Integer> verificarMultiplos(List<Integer>numeros){
		List<Integer> multiplos = numeros.stream()
				.distinct()
				.filter(numero -> numero % 3 == 0 || numero % 5 == 0)
				.toList();
				
		return multiplos;
	}
	
	public void agruparImparesMultiplosDe3E5(List<Integer> numeros) {
		Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = numeros.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(collectNumerosMultiplosDe3E5);
	}

}
