package com.exercicio;

import java.util.List;

public class CalculoMedia {
	
	
//	Desafio 5 - Calcule a média dos números maiores que 5:
//		Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
	
	
	public Double calcularMedia(List<Integer> numeros) {
		
		double media = numeros.stream()
			.filter(numero -> numero > 5)
			.mapToInt(value -> value.intValue())
			.average()
			.orElse(0.0);
		
		
		return media;
	}

}
