package com.bootcamp.dio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Curso extends Conteudo{

	private double cargaHoraria;
	
	public Curso(String titulo, String descricao, double cargaHoraria, Bootcamp bootcamp) {
		this.setTitulo(titulo);
		this.setDescricao(descricao);
		this.setCargaHoraria(cargaHoraria);
		this.setBootcamp(bootcamp);
		bootcamp.getConteudos().add(this);
	}

	@Override
	public double calcularXp() {
		return cargaHoraria * VALOR_XP;
	}
	
}
