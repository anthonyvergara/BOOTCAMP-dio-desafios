package com.dispositivo.musical;

public class IPad implements ReprodutorMusical{

	@Override
	public void tocar() {
		System.out.println("IPAD tocando música.");
	}

	@Override
	public void pausar() {
		System.out.println("IPAD pausando música.");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("IPAD selecionando música: "+musica);
	}

}
