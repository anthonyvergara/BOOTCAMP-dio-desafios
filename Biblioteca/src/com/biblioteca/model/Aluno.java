package com.biblioteca.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno extends Pessoa implements Comparable<Pessoa>{
	
	private Long numeroMatricula;
	private String escola;
	private List<Livro> livros;
	
	public Aluno(String nome, int idade, Long numeroMatricula) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setNumeroMatricula(numeroMatricula);
		this.livros = new ArrayList();
	}
	
	public Long getNumeroMatricula() {
		return numeroMatricula;
	}
	public void setNumeroMatricula(Long numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	public String getEscola() {
		return escola;
	}
	public void setEscola(String escola) {
		this.escola = escola;
	}
	@Override
	public int hashCode() {
		return Objects.hash(numeroMatricula);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(numeroMatricula, other.numeroMatricula);
	}
	@Override
	public int compareTo(Pessoa pessoa) {
		return this.getNome().compareTo(pessoa.getNome());
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	
	
}
