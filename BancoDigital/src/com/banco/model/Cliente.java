package com.banco.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Cliente {
	
	private String nome;
	private int idade;
	private Banco banco;
	private Conta conta;
	
	public Cliente(String nome, Banco banco) {
		this.nome = nome;
		this.banco = banco;
	}

}
