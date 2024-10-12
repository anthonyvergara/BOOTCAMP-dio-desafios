package com.banco.serviceImpl;

import com.banco.model.Cliente;
import com.banco.model.Conta;

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void extrato() {
		System.out.print("[CONTA CORRENTE] ");
		super.extrato();
	}

}
