package com.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class Estoque<Livros> implements Comparable<Estoque<Livros>>{
	
	private Livro livro;
	private int quantidade;
	
	public Estoque(Livro livro, int quantidade) {
		this.livro = livro;
		this.quantidade = quantidade;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivros(Livro livro) {
		this.livro = livro;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public int compareTo(Estoque<Livros> o) {
		// TODO Auto-generated method stub
		return this.getLivro().getNome().compareTo(o.getLivro().getNome());
	}

	@Override
	public String toString() {
		return "[Livro: " + livro.getNome() + " , Quantidade: " + quantidade + "]\n";
	}
	
}
