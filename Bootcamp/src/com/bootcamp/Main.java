package com.bootcamp;

import java.util.ArrayList;
import java.util.List;

import com.bootcamp.dio.Bootcamp;
import com.bootcamp.dio.BootcampDev;
import com.bootcamp.dio.Conteudo;
import com.bootcamp.dio.Curso;
import com.bootcamp.dio.Dev;

public class Main {
	
	public static void main(String[] args) {
		
		Dev thony = new Dev("Thony");
		Dev jennifer = new Dev("Jennifer");
		Dev jennifer02 = new Dev("Jennifer"); 
		
		Bootcamp java = new Bootcamp("Java - CLARO", "Bootcamp JAVA BASICO AO AVANÇADO.");
		
		Conteudo logicaP = new Curso("Logica de Programação", "Conceitos básicos", 10, java);
		Conteudo poo = new Curso("Programação Orientado a Objetos", "Conceitos básicos", 20, java);
		
		System.out.println(java.getConteudos());
		
		thony.inscreverNoBootcamp(java);
		jennifer.inscreverNoBootcamp(java);
		jennifer02.inscreverNoBootcamp(java); // Não será incluido na lista.
		
		
		List<BootcampDev> listaManyToMany = new ArrayList<>(); // A Classe BootcampDev seria incluida pelo banco de dados por causa do RELACIONAMENTO N:N 
		listaManyToMany.add(new BootcampDev(thony,java));
		listaManyToMany.add(new BootcampDev(jennifer,java));
		
		listaManyToMany.forEach(System.out::println);
	}
}
