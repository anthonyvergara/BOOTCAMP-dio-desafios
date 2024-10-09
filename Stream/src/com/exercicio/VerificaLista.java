package com.exercicio;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class VerificaLista {
	
	//	Desafio 3 - Verifique se todos os números da lista são positivos:
	//		Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.

	public boolean verificarTodosNumerosPositivos(List<Integer> numeros) {
		
		return numeros.stream().allMatch(numero -> numero % 2 == 0);
	}
	
	//	Desafio 6 - Verificar se a lista contém algum número maior que 10:
	//	Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
	public boolean verificarNumeroMaiorQue10(List<Integer> numeros) {
		
		return numeros.stream()
			.anyMatch(numero -> numero > 10);
	}
	
	//Desafio 7 - Encontrar o segundo número maior da lista:
	//	Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
	
	public int verificarSegundoNumeroMaior(List<Integer> numeros) {
		Optional<Integer> numero = numeros.stream()
			.distinct()
			.sorted((n1, n2) -> n2 - n1)
			.skip(1)
			.findFirst();
		
		return numero.get();
	}
	
	//	Desafio 13 - Filtrar os números que estão dentro de um intervalo:
	//		Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.
	
	public List<Integer> filtrarIntervaloNumeros(List<Integer>numeros, Integer intervalo1, Integer intervalo2){
		
		List<Integer> numerosIntervalos = numeros.stream()
			.distinct()
			.filter(numero -> numero > intervalo1 && numero < intervalo2)
			.toList();
		
		return numerosIntervalos;
	}
	
//	Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
//		Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.
	
	public boolean verificarNumeroNegativo(List<Integer> numeros) {
		
		return numeros.stream()
			.anyMatch(numero -> numero < 0);
		
	}
	
//	Desafio 16 - Agrupe os números em pares e ímpares:
//		Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares e outra contendo os números ímpares da lista original,
//	e exiba os resultados no console.

	public Map<Boolean,List<Integer>> separarNumeroParImpar(List<Integer> numeros){
		
		// Não realizei conforme o enunciado pois queria experimentar a manipulação pelo MAP.
		
		Map<Boolean,List<Integer>> numerosAgrupados = numeros.stream()
				.collect(Collectors.groupingBy(numero -> numero % 2 == 0));
		
		// IF FALSE == IMPAR, IF TRUE == PAR
		
		return numerosAgrupados;
	}
	
}
