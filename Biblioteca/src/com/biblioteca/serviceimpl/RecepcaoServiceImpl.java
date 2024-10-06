package com.biblioteca.serviceimpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.biblioteca.model.Aluno;
import com.biblioteca.model.Atendente;
import com.biblioteca.model.Estoque;
import com.biblioteca.model.Livro;
import com.biblioteca.service.RecepcaoService;

public class RecepcaoServiceImpl implements RecepcaoService{
	
	private final LivroServiceImpl LIVRO_SERVICE;
	
	private Map<LocalDate,Livro> livrosEmprestados;
	
	public RecepcaoServiceImpl() {
		this.LIVRO_SERVICE = new LivroServiceImpl();
		this.livrosEmprestados = new TreeMap<>();
	}

	@Override
	public void incluirLivro(Livro livro) {
		this.LIVRO_SERVICE.addLivro(livro.getNome(), livro.getPublicadora(), livro.getAutor());
	}

	@Override
	public void emprestarLivro(Livro livro, Aluno aluno) {
		this.LIVRO_SERVICE.removerLivro(livro.getNome());
		livro.setAluno(aluno);
		this.livrosEmprestados.put(LocalDate.now(), livro);
	}

	@Override
	public void receberLivro(Livro livro, Aluno aluno) {
		this.LIVRO_SERVICE.addLivro(livro.getNome(), livro.getPublicadora(), livro.getAutor());
		for(Map.Entry<LocalDate,Livro> livroEmprestado : livrosEmprestados.entrySet()) {
			if(livroEmprestado.getValue().equals(livro)) {
				livrosEmprestados.remove(livroEmprestado.getKey());
				break;
			}
		}
		
	}

	@Override
	public Set<Estoque<Livro>> verEstoque() {
		return this.LIVRO_SERVICE.getEstoqueLivros();
	}
	
	public void verLivrosEmprestados(){
		for(Map.Entry<LocalDate,Livro> livro : livrosEmprestados.entrySet()) {
			System.out.println(livro.getKey() +" ["+ livro.getValue() +"],[Aluno ["+ livro.getValue().getAluno().getNome()+"]]");
		}
	}
}
