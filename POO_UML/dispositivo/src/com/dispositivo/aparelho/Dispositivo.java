package com.dispositivo.aparelho;

import com.dispositivo.musical.ReprodutorMusical;
import com.dispositivo.navegador.NavegadorInternet;
import com.dispositivo.telefonico.AparelhoTelefonico;
import com.dispositivo.telefonico.IPhone;

public class Dispositivo {

	public static void main(String[] args) {
		
		IPhone iphone = new IPhone();
		
		AparelhoTelefonico aparelhoTelefonico = iphone;
		ReprodutorMusical reprodutorMusical = iphone;
		NavegadorInternet navegadorInternet = iphone;
		
		aparelhoTelefonico.ligar("30213012930");
		aparelhoTelefonico.atender();
		
		reprodutorMusical.selecionarMusica("OASIS");
		
		reprodutorMusical.tocar();
		
		navegadorInternet.exibirPagina("www.google.com");

	}

}
