package com.biblioteca.model;

public class Livro implements Comparable<Livro>{
	
	private String nome;
	private String publicadora;
	private int ano;
	private Autor autor;
	private Aluno aluno;
	
	public Livro() {
		
	}
	
	public Livro(String nome, String publicadora, Autor autor) {
		this.setNome(nome);
		this.setPublicadora(publicadora);
		this.setAutor(autor);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPublicadora() {
		return publicadora;
	}
	public void setPublicadora(String publicadora) {
		this.publicadora = publicadora;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Livro [nome: " + nome + " , " + publicadora + " , Autor: "+autor.getNome()+"]\n";
	}

	@Override
	public int compareTo(Livro o) {
		return this.getNome().compareTo(o.getNome());
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
}
