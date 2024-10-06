package com.biblioteca;

import java.util.Set;
import java.util.TreeSet;

import com.biblioteca.model.Aluno;
import com.biblioteca.model.Autor;
import com.biblioteca.model.Livro;
import com.biblioteca.serviceimpl.EstoqueServiceImpl;
import com.biblioteca.serviceimpl.LivroServiceImpl;
import com.biblioteca.serviceimpl.RecepcaoServiceImpl;

public class Biblioteca {

	public static void main(String[] args) {
		
		
		RecepcaoServiceImpl recepcao = new RecepcaoServiceImpl();
		
		Livro livro1 = new Livro("La Casa", "Casa Publicadora", new Autor("Filpo",28,123123L));
		recepcao.incluirLivro(livro1);
		Livro livro2 = new Livro("La Casa", "Casa Publicadora", new Autor("Filpo",28,123123L));
		recepcao.incluirLivro(livro2);
		
		recepcao.incluirLivro(new Livro("Querido John", "Casa Publicadora", new Autor("Anthony",28,112332L)));
		recepcao.incluirLivro(new Livro("Querido John", "Casa Publicadora", new Autor("John",22,112332L)));
		recepcao.incluirLivro(new Livro("As visoes", "Casa Publicadora", new Autor("Jennifer",27,112332L)));
		recepcao.incluirLivro(new Livro("Loucos por ela", "Casa Publicadora", new Autor("Michael",35,112332L)));
		recepcao.incluirLivro(new Livro("Cantoneira Arruda", "Casa Publicadora", new Autor("Richard",24,112332L)));
		
		Aluno anthony = new Aluno("Anthony Vergara",18,21313L);
		Aluno dubs = new Aluno("Jennifer Vergara",27,4444L);
		
		System.out.println(recepcao.verEstoque());
		
		recepcao.emprestarLivro(livro1, anthony);
		recepcao.emprestarLivro(livro2, dubs);
		
		recepcao.verLivrosEmprestados();
		
	}

}
