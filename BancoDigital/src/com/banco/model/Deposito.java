package com.banco.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Deposito implements Comparable<Deposito>{
	
	@Setter
	private double valor;
	private LocalDate data;
	private Conta conta;

	public Deposito(double valor, Conta conta) {
		this.valor = valor;
		this.conta = conta;
		this.data = data.now();
	}
	
	
	@Override
	public int compareTo(Deposito deposito) {
		return data.compareTo(deposito.getData());
	}


	@Override
	public String toString() {
		return "\nDeposito [valor=" + valor + ", data=" + data + ", conta=" + conta.getCliente().getNome() + "]\n";
	}

}
