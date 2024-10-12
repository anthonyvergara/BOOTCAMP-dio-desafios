package com.banco.service;

import com.banco.model.Deposito;

public interface ContaService {
	
	public double depositar(Deposito deposito);
	public double sacar(double valor);
	public double transferir(double valor, ContaService conta);
	public void extrato();
}
