package com.bootcamp.dio;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Dev {
	
	private String nome;
	private double xpAcumulado;
	private Set<Bootcamp> listaBootcamp = new HashSet<>();
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	
	public Dev(String nome) {
		this.setNome(nome);
	}
	
	/**
	 *  Realiza a inscrição do Desenvolvedor no Bootcamp
	 * @param bootcamp 
	 * 			- recebe o Objeto bootcamp. {@link Bootcamp}
	 * 					
	*/
	public void inscreverNoBootcamp(Bootcamp bootcamp) {
		listaBootcamp.add(bootcamp);
		this.conteudosInscritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscritos().add(this);
	}
	
	/**
	 *  Realiza o progresso do Desenvolvedor quando ele finaliza algum conteudo do Bootcamp.
	 * 					
	*/
	public void progredir() {
		Optional<Conteudo> conteudos = conteudosInscritos.stream()
				.findFirst();
		if(conteudos.isPresent()) {
			this.conteudosConcluidos.add(conteudos.get());
			this.conteudosInscritos.remove(conteudos.get());
			this.calcularTotalXp(conteudos.get().calcularXp());
		}
	}
	
	/**
	 *  Realiza o calculo de XP por cada conteudo finalizado.
	 * @param xp 
	 * 			- recebe o valor de pontos (xp) obtidos por cada conteudo finalizado.
	 * 					
	*/
	private void calcularTotalXp(double xp) {
		this.setXpAcumulado(this.getXpAcumulado() + xp);
	}
	
	/**
	 *  Retorna todos os conteudos inscritos pelo Desenvolvedor
	 * @return {@code Set<Documento>} {@link Documento}
	 * 			
	 * 					
	*/
	public Set<Conteudo> exibirConteudos() {
		return conteudosInscritos;
	}
	
	/**
	 *  Retorna um Set de todos bootcamps inscritos pelo Desenvolvedor.
	 * @return {@code Set<Bootcamp>} {@link Bootcamp}
	 * 			
	 * 					
	*/
	public Set<Bootcamp> exibirBootcamps(){
		return listaBootcamp;
	}

	@Override
	public String toString() {
		return "\nDev [nome: " + nome + ", XP: " + xpAcumulado + "]\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(nome, other.nome);
	}
}
