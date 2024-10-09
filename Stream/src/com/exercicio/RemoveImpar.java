package com.exercicio;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveImpar {
	
//	Desafio 4 - Remova todos os valores ímpares:
//		Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
	
	public List<Integer> removerValoresImpares(List<Integer> numeros){
		
		List<Integer> numerosPares = numeros.stream()
			.filter(numero -> numero % 2 == 0)
			.collect(Collectors.toList());
		
		return numerosPares;
	}
	
}
