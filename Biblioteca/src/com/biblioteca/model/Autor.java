package com.biblioteca.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.biblioteca.util.CompareIdade;

public class Autor extends Pessoa implements Comparable<Pessoa>{

	private Long numeroRegistro;
	private List<Livro> livros;
	
	public Autor(String nome, int idade, Long numeroRegistro) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setNumeroRegistro(numeroRegistro);
		this.livros = new ArrayList<>();
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public Long getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(Long numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroRegistro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		return Objects.equals(numeroRegistro, other.numeroRegistro);
	}

	@Override
	public int compareTo(Pessoa pessoa) {
		return this.getNome().compareTo(pessoa.getNome());
	}

}
