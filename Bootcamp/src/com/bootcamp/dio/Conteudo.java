package com.bootcamp.dio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conteudo {

	protected static final double VALOR_XP = 20;
	
	private String titulo;
	private String descricao;
	private Bootcamp bootcamp;
	
	public abstract double calcularXp();

	@Override
	public String toString() {
		return "\nConteudo [titulo: " + titulo + ", descricao: " + descricao + " Bootcamp:  "+ bootcamp.getNome() +"]\n";
	}
	
}
