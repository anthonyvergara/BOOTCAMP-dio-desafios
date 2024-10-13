package com.bootcamp.dio;


import java.time.LocalDate;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

import lombok.Getter;
import lombok.Setter;
/** 
 * A Exisência desta classe é para fins de estudos.
 * A classe seria implementada automaticamente no banco de dados para gerenciar o relacionamento MANY TO MANY entre as classes DEV E BOOTCAMP.
 * 
 * 
 * */
@Getter @Setter
public class BootcampDev {
	
	private Long id;
	private Bootcamp bootcamp;
	private Dev dev;
	private String status;

	public BootcampDev(Dev dev, Bootcamp bootcamp) {
		id = ThreadLocalRandom.current().nextLong(1111,9999);
		this.setBootcamp(bootcamp);
		this.setDev(dev);
		this.status(dev, bootcamp);
	}
	
	private void status(Dev dev, Bootcamp bootcamp) {
		boolean verificacao =  false;
		
		Set<Conteudo> cont = bootcamp.getConteudos();
		
		verificacao = bootcamp.getConteudos().stream()
				.allMatch(conteudo -> conteudo.getTitulo().equals(dev.getConteudosConcluidos().stream().map(conteudoDev -> conteudoDev.getTitulo())));
		
		if(verificacao == true) {
			this.setStatus("CONCLUIDO!");
		}else if(verificacao == false && bootcamp.getDataFinal().isAfter(LocalDate.now())){
			this.setStatus("EM ANDAMENTO!");
		}else {
			this.setStatus("NAO FINALIZADO!");
		}
	}

	@Override
	public String toString() {
		return "\nBootcampDev [id=" + id + ", bootcamp=" + bootcamp.getNome() + ", dev=" + dev.getNome() + ", status=" + status + "]\n";
	}
	
}
