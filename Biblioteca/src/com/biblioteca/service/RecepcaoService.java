package com.biblioteca.service;

import java.util.Set;

import com.biblioteca.model.Aluno;
import com.biblioteca.model.Atendente;
import com.biblioteca.model.Estoque;
import com.biblioteca.model.Livro;

public interface RecepcaoService {
	
	public void incluirLivro(Livro livro);
	public void emprestarLivro(Livro livro, Aluno aluno);
	public void receberLivro(Livro livro, Aluno aluno);
	public Set<Estoque<Livro>> verEstoque();

}
