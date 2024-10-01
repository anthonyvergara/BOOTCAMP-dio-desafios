package com.dispositivo.navegador;

public class Safari implements NavegadorInternet{

	@Override
	public void exibirPagina(String url) {
		System.out.println("Navegador SAFARI exibindo página: "+url);
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Navegador SAFARI adicionando aba.");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Navegador SAFARI atualizando página.");		
	}

}
