package com.biblioteca.service;

import java.util.List;
import java.util.Set;

import com.biblioteca.model.Estoque;
import com.biblioteca.model.Livro;

public interface EstoqueService {

	public Set<Estoque<Livro>> getAllEstoque();
	public Estoque getEstoque();
	public void addEstoque(Livro livro, int quantidade);
	public void removeEstoque(Livro livro);
}
