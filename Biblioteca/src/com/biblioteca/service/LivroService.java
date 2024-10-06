package com.biblioteca.service;

import java.util.List;

import com.biblioteca.model.Autor;
import com.biblioteca.model.Livro;

public interface LivroService {
	
	public List<Livro> getAllLivros();
	public void addLivro(String nome, String publicadora, Autor autor);
	public Livro getLivro(String nome);
	public void removerLivro(String nome);
}
