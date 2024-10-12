package com.banco.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import lombok.Getter;

@Getter
public class Banco {
	
	private String nome;
	private List<Conta> conta = new ArrayList<>();
	
	public Banco(String nome) {
		this.nome = nome;
	}
	
	public List<Conta> getAllContas() {
		return conta;
	}
	
	public List<Conta> findByName(String nome) {
		Optional<String> findNome = Optional.ofNullable(nome);
		List<Conta> contas = null;
		
		if(findNome.isPresent()) {
			contas = conta.stream()
				.filter(conta -> conta.getCliente().getNome().toUpperCase().startsWith(nome.toUpperCase()))
				.toList();
		}else {
			findNome.orElseThrow(() -> new IllegalArgumentException());
		}
		return contas;
	}
	
	public void setConta(Conta conta) {
		this.conta.add(conta);
	}

}
