package com.biblioteca.service;

import java.util.List;

import com.biblioteca.model.Autor;

public interface AutorService {

	public List<Autor> getAllAutor();
	public Autor getAutor(String nome);
	public void addAutor(String nome, int idade, Long numeroRegistro);
	
}
