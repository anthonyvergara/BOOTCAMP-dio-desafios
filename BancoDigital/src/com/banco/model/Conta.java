package com.banco.model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import com.banco.service.ContaService;

import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class Conta implements ContaService{
	
	private final int AGENCIA = 1122;
	private final int NUMERO_CONTA;
	@Setter
	private Cliente cliente;
	protected double saldo;
	private List<Deposito> depositos = new ArrayList<>();
	
	public Conta (Cliente cliente) {
		this.NUMERO_CONTA = ThreadLocalRandom.current().nextInt(1111,9999);
		this.setCliente(cliente);
	}
	
	@Override
	public double depositar(Deposito deposito) {
		this.saldo += deposito.getValor();
		this.depositos.add(deposito);
		return this.getSaldo();
	}

	@Override
	public double sacar(double valor) {
		this.saldo -= valor;
		return this.getSaldo();
	}

	@Override
	public double transferir(double valor, ContaService conta) {
		this.saldo -= valor;
		Deposito deposito = new Deposito(valor, cliente.getConta());
		conta.depositar(deposito);

		return this.getSaldo();
	}

	@Override
	public void extrato() {
		System.out.println(String.format("[CONTA %d]: Saldo: %.2f  Cliente: %s",this.getNUMERO_CONTA(), this.getSaldo(), this.getCliente().getNome()));
	}

	@Override
	public String toString() {
		return "\nConta [AGENCIA: " + AGENCIA + ", NUMERO_CONTA: " + NUMERO_CONTA + ", CLIENTE: " + cliente.getNome()+"]\n";
	}
	
	
}
