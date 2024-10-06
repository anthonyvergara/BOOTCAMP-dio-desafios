package com.biblioteca.serviceimpl;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.biblioteca.model.Estoque;
import com.biblioteca.model.Livro;
import com.biblioteca.service.EstoqueService;

public class EstoqueServiceImpl implements EstoqueService{

	Set<Estoque<Livro>> listaEstoque;
	
	public EstoqueServiceImpl() {
		this.listaEstoque = new TreeSet<>();
	}
	
	@Override
	public Set<Estoque<Livro>> getAllEstoque() {
		return listaEstoque;
	}

	@Override
	public Estoque getEstoque() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addEstoque(Livro livro, int quantidade) {
		for(Estoque e : listaEstoque) {
			if(e.getLivro().getNome().equalsIgnoreCase(livro.getNome())) {
				int quantidadeLivros = e.getQuantidade();
				e.setQuantidade(quantidadeLivros + quantidade);
			}
		}
		this.listaEstoque.add(new Estoque(livro, quantidade));
	}

	@Override
	public void removeEstoque(Livro livro) {
		for(Estoque<Livro> estoque : listaEstoque) {
			if(estoque.getLivro().equals(livro)) {
				if(estoque.getQuantidade() > 1) {
					estoque.setQuantidade(estoque.getQuantidade()-1);
					break;
				}else {
					listaEstoque.remove(estoque);
					break;
				}
			}
		}
	}

}
