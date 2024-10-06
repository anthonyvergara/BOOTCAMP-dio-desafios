package com.biblioteca.serviceimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import com.biblioteca.model.Autor;
import com.biblioteca.model.Estoque;
import com.biblioteca.model.Livro;
import com.biblioteca.service.LivroService;

public class LivroServiceImpl implements LivroService{
	
	private List<Livro> listaLivros;
	private final EstoqueServiceImpl ESTOQUE_SERVICE;
	
	public LivroServiceImpl() {
		this.ESTOQUE_SERVICE = new EstoqueServiceImpl();
		this.listaLivros = new ArrayList();
	}

	@Override
	public List<Livro> getAllLivros() {
		Collections.sort(listaLivros);
		return listaLivros;
	}

	@Override
	public void addLivro(String nome, String publicadora, Autor autor) {
		Livro livro = new Livro(nome,publicadora,autor);
		
		this.listaLivros.add(livro);
		this.ESTOQUE_SERVICE.addEstoque(livro, 1);
		
	}

	@Override
	public Livro getLivro(String nome) {
		
		for(Livro livro : listaLivros) {
			if(livro.getNome().equalsIgnoreCase(nome)) {
				return livro;
			}
		}
		
		return null;
	}
	
	public Set<Estoque<Livro>> getEstoqueLivros() {
		return this.ESTOQUE_SERVICE.getAllEstoque();
	}

	@Override
	public void removerLivro(String nome) {
		for(Livro livros : listaLivros) {
			if(livros.getNome().equalsIgnoreCase(nome)) {
				this.ESTOQUE_SERVICE.removeEstoque(livros);
				break;
			}
		}
	}

}
