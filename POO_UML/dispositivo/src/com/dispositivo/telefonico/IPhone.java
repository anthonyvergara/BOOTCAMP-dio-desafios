package com.dispositivo.telefonico;

import com.dispositivo.musical.ReprodutorMusical;
import com.dispositivo.navegador.NavegadorInternet;

public class IPhone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{

	@Override
	public void exibirPagina(String url) {
		System.out.println("Dispositivo IPHONE exibindo página do navegador: "+url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Dispositivo IPHONE adicionar aba no navegador.");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Dispositivo IPHONE atualizando página do navegador.");		
	}

	@Override
	public void tocar() {
		System.out.println("Dispositivo IPHONE tocando musica.");
		
	}

	@Override
	public void pausar() {
		System.out.println("Dispositivo IPHONE pausando musica.");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Dispositivo IPHONE selecionando musica: "+musica);
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Dispositivo IPHONE ligando para o número: "+numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Dispositivo IPHONE atendendo.");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Dispositivo IPHONE gravando correio de voz.");
		
	}

}
