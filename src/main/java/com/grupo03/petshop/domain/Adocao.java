package com.grupo03.petshop.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.grupo03.petshop.domain.enuns.SituacaoCastrado;

@Entity
public class Adocao implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nomePet;
	private String especie;
	private Integer idade;
	private Integer castrado;
	
	public Adocao() {
		
	}

	public Adocao(Integer id, String nomePet, String especie, Integer idade, SituacaoCastrado castrado) {
		super();
		this.id = id;
		this.nomePet = nomePet;
		this.especie = especie;
		this.idade = idade;
		this.castrado = castrado.getCod();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Adocao other = (Adocao) obj;
		return Objects.equals(id, other.id);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomePet() {
		return nomePet;
	}

	public void setNomePet(String nomePet) {
		this.nomePet = nomePet;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public SituacaoCastrado getCastrado() {
		return SituacaoCastrado.toEnum(castrado);
	}

	public void setCastrado(SituacaoCastrado castrado) {
		this.castrado = castrado.getCod();
	}
	
}
