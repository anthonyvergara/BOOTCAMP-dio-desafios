package com.exercicio;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class NumeroPrimo {
	
//	Desafio 14 - Encontre o maior número primo da lista:
//		Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
	
	public Integer maiorNumeroPrimo(List<Integer> numeros) {
		
		Optional<Integer> numeroPrimo  = numeros.stream()
				.filter(numero -> numero > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(numero))
				.noneMatch(value -> numero % value == 0))
				.max((n1,n2) -> n1.compareTo(n2));
				
		return numeroPrimo.get();
	}
	
	//	Desafio 17 - Filtrar os números primos da lista:
	//	Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
	
	public List<Integer> numerosPrimos(List<Integer> numeros) {
		
		List<Integer> numerosPrimos = numeros.stream()
				.distinct() // remove repetições - Operação Intermediária
				.filter(numero -> numero > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(numero))
				.noneMatch(valor -> numero % valor == 0))
				.toList();
				
		return numerosPrimos;
	}

}
