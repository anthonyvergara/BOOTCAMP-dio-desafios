package com.biblioteca.util;

import java.util.Comparator;

import com.biblioteca.model.Pessoa;

public class CompareIdade implements Comparator<Pessoa>{

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		
		return Integer.compare(o1.getIdade(), o2.getIdade());
	}

	
}
