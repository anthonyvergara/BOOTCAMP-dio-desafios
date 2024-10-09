package com.exercicio;

import java.util.List;
import java.util.Optional;

public class CalculaProduto {
	
//	Encontre o produto de todos os números da lista:
//		Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.
	
	public Integer calcularProduto(List<Integer> numeros) {
		Optional<Integer> produto = numeros.stream()
		.reduce((n1,n2) -> n1 * n2);
		
		return produto.get();
	}

}
