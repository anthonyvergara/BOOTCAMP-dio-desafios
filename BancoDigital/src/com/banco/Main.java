package com.banco;

import com.banco.model.Banco;
import com.banco.model.Cliente;
import com.banco.model.Conta;
import com.banco.model.Deposito;
import com.banco.serviceImpl.ContaCorrente;
import com.banco.serviceImpl.ContaPoupanca;

public class Main {
	
	public static void main(String[] args) {
		
		Banco bradesco = new Banco("Bradesco");
		
		Cliente anthony = new Cliente("Anthony Vergara", bradesco);
		
		Cliente jennifer = new Cliente("Jennifer", bradesco);
		
		Conta contaPoupancaAnthony = new ContaPoupanca(anthony);
		
		Conta contaCorrenteJennifer = new ContaCorrente(jennifer);
		
		anthony.setConta(contaPoupancaAnthony);
		anthony.setBanco(bradesco);
		
		jennifer.setConta(contaCorrenteJennifer);
		jennifer.setBanco(bradesco);
		
		
		bradesco.setConta(contaPoupancaAnthony);
		bradesco.setConta(contaCorrenteJennifer);
		
		contaPoupancaAnthony.depositar(new Deposito(100, contaPoupancaAnthony));
		contaPoupancaAnthony.sacar(10);
		contaPoupancaAnthony.transferir(10, contaCorrenteJennifer);
		
		//System.out.println(bradesco.getAllContas());
		
		contaCorrenteJennifer.extrato();
		contaPoupancaAnthony.extrato();
		
		ContaPoupanca cp = (ContaPoupanca) contaPoupancaAnthony;
		System.out.println(cp.getAllDepositos());

	}

}
