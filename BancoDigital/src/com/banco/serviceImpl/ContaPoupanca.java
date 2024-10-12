package com.banco.serviceImpl;

import java.util.List;

import com.banco.model.Cliente;
import com.banco.model.Conta;
import com.banco.model.Deposito;
import com.banco.service.ContaService;

import lombok.Getter;
import lombok.Setter;

public class ContaPoupanca extends Conta{
	
	private static double TAXA_SELIC = 10.75;
	private static int DIAS_UTEIS = 252;
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public void extrato() {
		System.out.print("[CONTA POUPANÇA] ");
		super.extrato();
	}
	
	public List<Deposito> getAllDepositos() {
		return this.getDepositos();
	}
	
	protected void jurosDiario() {
		double juros = this.getSaldo() * (TAXA_SELIC/DIAS_UTEIS);
		this.saldo += juros;
	}
	
}
