package com.exercicio;

import java.util.List;

public class SomaNumero {
	
//	Desafio 2 - Imprima a soma dos números pares da lista:
//		Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.


	
	public Integer somarNumerosPares(List<Integer> numeros) {
		
//		Integer soma = numeros.stream()
//				.mapToInt(numero -> numero.intValue())
//				.sum();
		
		Integer soma = numeros.stream()
			.filter(numero -> numero % 2 == 0)
			.reduce(0, (n1,n2) -> n1+n2);
		
		return soma;
		
	}
	
//	Somar os dígitos de todos os números da lista:
//		Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
	
	public Integer somarNumeros(List<Integer>numeros) {
		Integer soma = numeros.stream()
				.mapToInt(value -> value.intValue())
				.sum();
		
		return soma;
	}
	
//	Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
//		Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.
	
	public Integer verificarSomaQuadrada(List<Integer>numeros) {
		
		Integer soma = numeros.stream()
				.map(numero -> numero * numero)
				.reduce(0, (n1,n2) -> n1 + n2);
		
		return soma;
	}
	
	//	Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
	//	Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.
	
	public Integer somaDivisivelPor3E5(List<Integer> numeros) {
		
		Integer soma = numeros.stream()
				.filter(numero -> numero % 3 == 0 && numero % 5 == 0)
				.reduce(0, (n1,n2) -> n1+n2);
				
		return soma;
	}
	
}
