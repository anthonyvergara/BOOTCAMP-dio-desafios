package com.exercicio;

import java.util.List;

public class VerificaRepeticao {
	
//	Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
//		Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.
	
	public boolean verificarRepeticao(List<Integer>numeros) {
		
		return numeros.stream()
				.distinct()
				.count() == numeros.size(); // IF FALSE = CONTAINS REPEATED NUMBERS
	}
	
//	Desafio 18 - Verifique se todos os números da lista são iguais:
//		Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
	public boolean verificaSeSaoTodosIguais(List<Integer> numeros) {
		
		boolean saoTodosIguais = numeros.stream()
				.distinct()
				.count() == (numeros.size()/2);
		
		return saoTodosIguais;
	}

}
