package com.bootcamp.dio;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mentoria extends Conteudo{
	
	private LocalDate data;
	
	public Mentoria(String titulo, String descricao, Bootcamp bootcamp) {
		this.setTitulo(titulo);
		this.setDescricao(descricao);
		this.setBootcamp(bootcamp);
		bootcamp.getConteudos().add(this);
	}

	@Override
	public double calcularXp() {
		return VALOR_XP + 20;
	}

}
