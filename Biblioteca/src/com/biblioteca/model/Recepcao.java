package com.biblioteca.model;

public class Recepcao {
	
	private Atendente atendente;
	
	public Recepcao(Atendente atendente) {
		this.atendente = atendente;
	}

	public Atendente getAtendente() {
		return atendente;
	}

	public void setAtendente(Atendente atendente) {
		this.atendente = atendente;
	}

}
