package com.bootcamp.dio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import lombok.Getter;

import lombok.Setter;

@Getter @Setter
public class Bootcamp {
	
	private String nome;
	private String descricao;
	private LocalDate dataInicio;
	private LocalDate dataFinal;
	private Set<Dev> devsInscritos = new HashSet<>();
	private Set<Conteudo> conteudos = new LinkedHashSet<Conteudo>();
	
	public Bootcamp(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
		this.dataInicio = dataInicio.now();
		this.dataFinal = this.dataInicio.plusDays(45);
	}
	
	/** 
	 *  Realiza a verificação do status atual do Bootcamp com base nas variaveis DATA INICIO, DATA FINAL E DATA ATUAL.
	 * 
	 * */
	public String status() {
		if(LocalDate.now().isAfter(dataInicio) && LocalDate.now().isBefore(dataFinal)) {
			return "EM ANDAMENTO!";
		}
		else if(LocalDate.now().isAfter(dataFinal)) {
			return "FINALIZADO!";
		}else {
			return "AGUARDANDO LANÇAMENTO!";
		}
	}
	
	@Override
	public String toString() {
		return "\nBootcamp [nome=" + nome + ", descricao=" + descricao + ", dataInicio=" + dataInicio + ", dataFinal="
				+ dataFinal + "]\n";
	}
}
